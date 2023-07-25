package akamai

import (
	"testing"

	"github.com/pulumi/pulumi/pkg/v3/codegen/schema"
	"github.com/stretchr/testify/assert"
)

func TestRecursiveReplacement(t *testing.T) {
	actual := schema.PackageSpec{
		Types: map[string]schema.ComplexTypeSpec{
			"akamai:index/root:root": {
				ObjectTypeSpec: schema.ObjectTypeSpec{
					Type: "object",
					Properties: map[string]schema.PropertySpec{
						"foo": {
							TypeSpec: schema.TypeSpec{
								Ref: "#/types/akamai:index/rootChild:rootChild",
							},
						},
					},
				},
			},
			"akamai:index/rootChild:rootChild": {
				ObjectTypeSpec: schema.ObjectTypeSpec{
					Type: "object",
					Properties: map[string]schema.PropertySpec{
						"bar": {
							TypeSpec: schema.TypeSpec{
								Ref: "#/types/akamai:index/rootChildRoot:rootChildRoot",
							},
						},
					},
				},
			},
			"akamai:index/rootChildRoot:rootChildRoot": {
				ObjectTypeSpec: schema.ObjectTypeSpec{
					Type: "object",
					Properties: map[string]schema.PropertySpec{
						"foo": {
							TypeSpec: schema.TypeSpec{
								Ref: "#/types/akamai:index/rootChildRootChild:rootChildRootChild",
							},
						},
					},
				},
			},
			"akamai:index/rootChildRootChild:rootChildRootChild": {
				ObjectTypeSpec: schema.ObjectTypeSpec{
					Type: "object",
					Properties: map[string]schema.PropertySpec{
						"bar": {},
					},
				},
			},
		},
	}

	ReplaceImagePolicyImageRecursiveTypes(&actual, "root")

	expected := schema.PackageSpec{
		Types: map[string]schema.ComplexTypeSpec{
			"akamai:index/root:root": {
				ObjectTypeSpec: schema.ObjectTypeSpec{
					Type: "object",
					Properties: map[string]schema.PropertySpec{
						"foo": {
							TypeSpec: schema.TypeSpec{
								Ref: "#/types/akamai:index/rootChild:rootChild",
							},
						},
					},
				},
			},
			"akamai:index/rootChild:rootChild": {
				ObjectTypeSpec: schema.ObjectTypeSpec{
					Type: "object",
					Properties: map[string]schema.PropertySpec{
						"bar": {
							TypeSpec: schema.TypeSpec{
								Ref: "#/types/akamai:index/root:root",
							},
						},
					},
				},
			},
		},
	}

	assert.Equal(t, expected, actual)
}

func TestShapeCompare(t *testing.T) {
	t.Run("same types", func(t *testing.T) {
		a := schema.ComplexTypeSpec{
			ObjectTypeSpec: schema.ObjectTypeSpec{
				Type: "object",
				Properties: map[string]schema.PropertySpec{
					"foo": {
						TypeSpec: schema.TypeSpec{
							Type: "string",
						},
					},
				},
			},
		}
		b := schema.ComplexTypeSpec{
			ObjectTypeSpec: schema.ObjectTypeSpec{
				Type: "object",
				Properties: map[string]schema.PropertySpec{
					"foo": {
						TypeSpec: schema.TypeSpec{
							Type: "string",
						},
					},
				},
			},
		}
		if !isSameShape(a, b) {
			t.Errorf("expected same shape")
		}
	})
	t.Run("different refs are ignored", func(t *testing.T) {
		a := schema.ComplexTypeSpec{
			ObjectTypeSpec: schema.ObjectTypeSpec{
				Type: "object",
				Properties: map[string]schema.PropertySpec{
					"foo": {
						TypeSpec: schema.TypeSpec{
							Ref: "#/types/foo",
						},
					},
				},
			},
		}
		b := schema.ComplexTypeSpec{
			ObjectTypeSpec: schema.ObjectTypeSpec{
				Type: "object",
				Properties: map[string]schema.PropertySpec{
					"foo": {
						TypeSpec: schema.TypeSpec{
							Ref: "#/types/bar",
						},
					},
				},
			},
		}
		if !isSameShape(a, b) {
			t.Errorf("expected same shape")
		}
	})

	t.Run("different properties", func(t *testing.T) {
		a := schema.ComplexTypeSpec{
			ObjectTypeSpec: schema.ObjectTypeSpec{
				Type: "object",
				Properties: map[string]schema.PropertySpec{
					"foo": {
						TypeSpec: schema.TypeSpec{
							Type: "string",
						},
					},
				},
			},
		}
		b := schema.ComplexTypeSpec{
			ObjectTypeSpec: schema.ObjectTypeSpec{
				Type: "object",
				Properties: map[string]schema.PropertySpec{
					"bar": {
						TypeSpec: schema.TypeSpec{
							Type: "string",
						},
					},
				},
			},
		}
		if isSameShape(a, b) {
			t.Errorf("expected different shape")
		}
	})

	t.Run("different requiredness", func(t *testing.T) {
		a := schema.ComplexTypeSpec{
			ObjectTypeSpec: schema.ObjectTypeSpec{
				Type: "object",
				Properties: map[string]schema.PropertySpec{
					"foo": {
						TypeSpec: schema.TypeSpec{
							Type: "string",
						},
					},
				},
				Required: []string{"foo"},
			},
		}
		b := schema.ComplexTypeSpec{
			ObjectTypeSpec: schema.ObjectTypeSpec{
				Type: "object",
				Properties: map[string]schema.PropertySpec{
					"foo": {
						TypeSpec: schema.TypeSpec{
							Type: "string",
						},
					},
				},
			},
		}
		if isSameShape(a, b) {
			t.Errorf("expected different shape")
		}
	})
	t.Run("different types", func(t *testing.T) {
		a := schema.ComplexTypeSpec{
			ObjectTypeSpec: schema.ObjectTypeSpec{
				Type: "object",
				Properties: map[string]schema.PropertySpec{
					"foo": {
						TypeSpec: schema.TypeSpec{
							Type: "string",
						},
					},
				},
			},
		}
		b := schema.ComplexTypeSpec{
			ObjectTypeSpec: schema.ObjectTypeSpec{
				Type: "object",
				Properties: map[string]schema.PropertySpec{
					"foo": {
						TypeSpec: schema.TypeSpec{
							Type: "number",
						},
					},
				},
			},
		}
		if isSameShape(a, b) {
			t.Errorf("expected different shape")
		}
	})
}
