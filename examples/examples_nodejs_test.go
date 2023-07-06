// Copyright 2016-2020, Pulumi Corporation.  All rights reserved.
//go:build nodejs || all
// +build nodejs all

package examples

import (
	"path"
	"testing"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
)

func TestAccEdgeHostnameTs(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: path.Join(getCwd(t), "edge-hostname", "ts"),
		})

	integration.ProgramTest(t, &test)
}

func TestPropertyUpdate(t *testing.T) {
	dir := path.Join(getCwd(t), "property", "ts")
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: dir,
		})
	integration.ProgramTest(t, &test)
}

func getJSBaseOptions(t *testing.T) integration.ProgramTestOptions {
	base := getBaseOptions(t)
	baseJS := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			"@pulumi/akamai",
		},
	})

	return baseJS
}
