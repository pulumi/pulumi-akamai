// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package akamai

import (
	"unicode"

	"github.com/hashicorp/terraform-plugin-sdk/helper/schema"
	"github.com/pulumi/pulumi-terraform-bridge/v2/pkg/tfbridge"
	shim "github.com/pulumi/pulumi-terraform-bridge/v2/pkg/tfshim"
	shimv1 "github.com/pulumi/pulumi-terraform-bridge/v2/pkg/tfshim/sdk-v1"
	"github.com/pulumi/pulumi/sdk/v2/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v2/go/common/tokens"
	"github.com/terraform-providers/terraform-provider-akamai/akamai"
)

// all of the token components used below.
const (
	// packages:
	mainPkg = "akamai"
	// modules:
	mainMod              = "index"
	edgeDNSMod           = "edgedns"
	propertiesMod        = "properties"
	trafficManagementMod = "trafficmanagement"
)

// makeMember manufactures a type token for the package and the given module and type.
func makeMember(mod string, mem string) tokens.ModuleMember {
	return tokens.ModuleMember(mainPkg + ":" + mod + ":" + mem)
}

// makeType manufactures a type token for the package and the given module and type.
func makeType(mod string, typ string) tokens.Type {
	return tokens.Type(makeMember(mod, typ))
}

// makeDataSource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the data source's
// first character.
func makeDataSource(mod string, res string) tokens.ModuleMember {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeMember(mod+"/"+fn, res)
}

// makeResource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the resource's
// first character.
func makeResource(mod string, res string) tokens.Type {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeType(mod+"/"+fn, res)
}

// preConfigureCallback is called before the providerConfigure function of the underlying provider.
// It should validate that the provider can be configured, and provide actionable errors in the case
// it cannot be. Configuration variables can be read from `vars` using the `stringValue` function -
// for example `stringValue(vars, "accessKey")`.
func preConfigureCallback(vars resource.PropertyMap, c shim.ResourceConfig) error {
	return nil
}

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := shimv1.NewProvider(akamai.Provider().(*schema.Provider))

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:                    p,
		Name:                 "akamai",
		Description:          "A Pulumi package for creating and managing akamai cloud resources.",
		Keywords:             []string{"pulumi", "akamai"},
		License:              "Apache-2.0",
		Homepage:             "https://pulumi.io",
		Repository:           "https://github.com/pulumi/pulumi-akamai",
		PreConfigureCallback: preConfigureCallback,
		Resources: map[string]*tfbridge.ResourceInfo{
			// Edge DNS
			"akamai_dns_record": {Tok: makeResource(edgeDNSMod, "DnsRecord")},
			"akamai_dns_zone":   {Tok: makeResource(edgeDNSMod, "DnsZone")},

			// Properties
			"akamai_cp_code":             {Tok: makeResource(propertiesMod, "CpCode")},
			"akamai_edge_hostname":       {Tok: makeResource(propertiesMod, "EdgeHostName")},
			"akamai_property":            {Tok: makeResource(propertiesMod, "Property")},
			"akamai_property_activation": {Tok: makeResource(propertiesMod, "PropertyActivation")},
			"akamai_property_rules":      {Tok: makeResource(propertiesMod, "PropertyRules")},
			"akamai_property_variables":  {Tok: makeResource(propertiesMod, "PropertyVariables")},

			// Traffic Management
			"akamai_gtm_domain":     {Tok: makeResource(trafficManagementMod, "GtmDomain")},
			"akamai_gtm_datacenter": {Tok: makeResource(trafficManagementMod, "GtmDatacenter")},
			"akamai_gtm_property":   {Tok: makeResource(trafficManagementMod, "GtmProperty")},
			"akamai_gtm_resource":   {Tok: makeResource(trafficManagementMod, "GtmResource")},
			"akamai_gtm_cidrmap":    {Tok: makeResource(trafficManagementMod, "GtmCidrmap")},
			"akamai_gtm_asmap":      {Tok: makeResource(trafficManagementMod, "GtmASmap")},
			"akamai_gtm_geomap":     {Tok: makeResource(trafficManagementMod, "GtmGeomap")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"akamai_contract": {Tok: makeDataSource(mainMod, "getContract")},
			"akamai_group":    {Tok: makeDataSource(mainMod, "getGroup")},

			// Edge DNS
			"akamai_authorities_set": {Tok: makeDataSource(edgeDNSMod, "getAuthoritiesSet")},
			"akamai_dns_record_set":  {Tok: makeDataSource(edgeDNSMod, "getDnsRecordSet")},

			// Properties
			"akamai_cp_code":        {Tok: makeDataSource(propertiesMod, "getCpCode")},
			"akamai_property":       {Tok: makeDataSource(propertiesMod, "getProperty")},
			"akamai_property_rules": {Tok: makeDataSource(propertiesMod, "getPropertyRules")},

			// Traffic Management
			"akamai_gtm_default_datacenter": {Tok: makeDataSource(trafficManagementMod, "getGtmDefaultDatacenter")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			// List any npm dependencies and their versions
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^2.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^8.0.25", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
		},
		Python: &tfbridge.PythonInfo{
			// List any Python dependencies and their version ranges
			Requires: map[string]string{
				"pulumi": ">=2.9.0,<3.0.0",
			},
			UsesIOClasses: true,
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi":                       "2.*",
				"System.Collections.Immutable": "1.6.0",
			},
			Namespaces: map[string]string{
				mainPkg: "Akamai",
			},
		},
	}

	prov.SetAutonaming(255, "-")

	return prov
}
