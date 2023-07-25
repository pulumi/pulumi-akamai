package akamai

import (
	"strings"

	"github.com/pulumi/pulumi/pkg/v3/codegen"
	"github.com/pulumi/pulumi/pkg/v3/codegen/schema"
	"github.com/pulumi/pulumi/sdk/v3/go/common/util/contract"
)

func ReplaceImagePolicyImageRecursiveTypes(spec *schema.PackageSpec, rootTypeName string) {
	removedTypes := []string{}
	rootTypeTokenPrefix := "akamai:index/" + rootTypeName
	rootTypeToken := rootTypeTokenPrefix + ":" + rootTypeName
	rootTypeRef := "#/types/" + rootTypeToken
	rootTypeSpec, ok := spec.Types[rootTypeToken]
	contract.Assertf(ok, "root type %s not found in spec.Types", rootTypeRef)

	checkRefForRemoval := func(ref string) bool {
		token := strings.TrimPrefix(ref, "#/types/")
		typeSpec, ok := spec.Types[token]
		if !ok {
			return false
		}
		if isSameShape(rootTypeSpec, typeSpec) {
			// E.g. #/types/akamai:index/getImagingPolicyImagePolicyTransformation:getImagingPolicyImagePolicyTransformation
			tokenParts := strings.Split(token, ":")
			contract.Assertf(len(tokenParts) == 3, "expected token to have 3 parts: %v", token)
			typeName := tokenParts[2]
			removedTypes = append(removedTypes, typeName)
			return true
		}
		return false
	}

	for tok, typeSpec := range spec.Types {
		if !strings.HasPrefix(tok, rootTypeTokenPrefix) {
			continue
		}

		for propName, prop := range typeSpec.Properties {
			if prop.Ref != "" {
				if checkRefForRemoval(prop.Ref) {
					prop.Ref = rootTypeRef
				}
			} else if prop.Type == "array" && prop.Items != nil && prop.Items.Ref != "" {
				if checkRefForRemoval(prop.Items.Ref) {
					prop.Items.Ref = rootTypeRef
				}
			} else {
				continue
			}
			typeSpec.Properties[propName] = prop
		}
	}

	var elidedTypeTokens []string
	for tok := range spec.Types {
		if !strings.HasPrefix(tok, rootTypeTokenPrefix) {
			continue
		}
		for _, removedType := range removedTypes {
			if strings.Contains(tok, removedType) {
				elidedTypeTokens = append(elidedTypeTokens, tok)
			}
		}
	}

	for _, removedType := range elidedTypeTokens {
		delete(spec.Types, removedType)
	}
}

// Basic comparison of type by name and type only (we ignore refs because they will never match)
func isSameShape(a, b schema.ComplexTypeSpec) bool {
	if len(a.Required) != len(b.Required) {
		return false
	}
	aRequiredProps := codegen.NewStringSet(a.Required...)
	bRequiredProps := codegen.NewStringSet(b.Required...)
	for propName, rootProp := range a.Properties {
		compProp, ok := b.Properties[propName]
		if !ok {
			return false
		}
		if rootProp.Type != compProp.Type {
			return false
		}
		if aRequiredProps.Has(propName) != bRequiredProps.Has(propName) {
			return false
		}
	}
	for propName := range b.Properties {
		if _, ok := a.Properties[propName]; !ok {
			return false
		}
	}
	return true
}
