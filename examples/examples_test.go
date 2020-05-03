// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

package examples

import (
	"testing"

	"github.com/pulumi/pulumi/pkg/v2/testing/integration"
)

func getBaseOptions() integration.ProgramTestOptions {
	return integration.ProgramTestOptions{
		ExpectRefreshChanges: true,
	}
}

func getJSBaseOptions(t *testing.T) integration.ProgramTestOptions {
	base := getBaseOptions()
	baseJS := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			"@pulumi/akamai",
		},
	})

	return baseJS
}

func TestExamples(t *testing.T) {
	// Ensure we have any required configuration points
	// region := os.Getenv("AWS_REGION")
	// if region == "" {
	// 	t.Skipf("Skipping test due to missing AWS_REGION environment variable")
	// }
	// cwd, err := os.Getwd()
	// if !assert.NoError(t, err, "expected a valid working directory: %v", err) {
	// 	return
	// }

	//test := getJSBaseOptions(t).
	//	With(integration.ProgramTestOptions{
	// List each test
	// baseJS.With(integration.ProgramTestOptions{
	// 	Dir: path.Join(cwd, "api"),
	// 	ExtraRuntimeValidation: validateAPITest(func(body string) {
	// 		assert.Equal(t, "Hello, world!", body)
	// 	}),
	// 	EditDirs: []integration.EditDir{{
	// 		Dir:      "./api/step2",
	// 		Additive: true,
	// 		ExtraRuntimeValidation: validateAPITest(func(body string) {
	// 			assert.Equal(t, "<h1>Hello world!</h1>", body)
	// 		}),
	// 	}},
	// 	ExpectRefreshChanges: true,
	// }),
	//})

	//integration.ProgramTest(t, &test)
}
