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

	"github.com/akamai/terraform-provider-akamai/v2/pkg/akamai"
	appSecProvider "github.com/akamai/terraform-provider-akamai/v2/pkg/providers/appsec"
	dnsProvider "github.com/akamai/terraform-provider-akamai/v2/pkg/providers/dns"
	gtmProvider "github.com/akamai/terraform-provider-akamai/v2/pkg/providers/gtm"
	propertyProvider "github.com/akamai/terraform-provider-akamai/v2/pkg/providers/property"
	"github.com/pulumi/pulumi-terraform-bridge/v2/pkg/tfbridge"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v2/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v2/go/common/tokens"
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

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {

	providerFunc := akamai.Provider(
		gtmProvider.Subprovider(),
		appSecProvider.Subprovider(),
		dnsProvider.Subprovider(),
		propertyProvider.Subprovider(),
	)

	// Instantiate the Terraform provider
	p := shimv2.NewProvider(providerFunc())

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:                       p,
		Name:                    "akamai",
		Description:             "A Pulumi package for creating and managing akamai cloud resources.",
		Keywords:                []string{"pulumi", "akamai"},
		License:                 "Apache-2.0",
		Homepage:                "https://pulumi.io",
		Repository:              "https://github.com/pulumi/pulumi-akamai",
		GitHubOrg:               "akamai",
		TFProviderModuleVersion: "v2",
		Config: map[string]*tfbridge.SchemaInfo{
			"config": {
				CSharpName: "ConfigDetails",
			},
		},
		Resources: map[string]*tfbridge.ResourceInfo{
			"akamai_appsec_activations":                 {Tok: makeResource(mainMod, "AppSecActivations")},
			"akamai_appsec_configuration_version_clone": {Tok: makeResource(mainMod, "AppSecConfigurationVersionClone")},
			"akamai_appsec_custom_rule":                 {Tok: makeResource(mainMod, "AppSecCustomRule")},
			"akamai_appsec_custom_rule_action":          {Tok: makeResource(mainMod, "AppSecCustomRuleAction")},
			"akamai_appsec_match_target":                {Tok: makeResource(mainMod, "AppSecMatchTarget")},
			"akamai_appsec_match_target_sequence":       {Tok: makeResource(mainMod, "AppSecMatchTargetSequence")},
			"akamai_appsec_security_policy_clone":       {Tok: makeResource(mainMod, "AppSecSecurityPolicyClone")},
			"akamai_appsec_selected_hostnames":          {Tok: makeResource(mainMod, "AppSecSelectedHostnames")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"akamai_contract":  {Tok: makeDataSource(mainMod, "getContract")},
			"akamai_contracts": {Tok: makeDataSource(mainMod, "getContracts")},
			"akamai_group":     {Tok: makeDataSource(mainMod, "getGroup")},
			"akamai_groups":    {Tok: makeDataSource(mainMod, "getGroups")},

			"akamai_appsec_configuration":         {Tok: makeDataSource(mainMod, "getAppSecConfiguration")},
			"akamai_appsec_configuration_version": {Tok: makeDataSource(mainMod, "getAppSecConfigurationVersion")},
			"akamai_appsec_custom_rule_actions":   {Tok: makeDataSource(mainMod, "getAppSecCustomRuleActions")},
			"akamai_appsec_custom_rules":          {Tok: makeDataSource(mainMod, "getAppSecCustomRules")},
			"akamai_appsec_export_configuration":  {Tok: makeDataSource(mainMod, "getAppSecExportConfiguration")},
			"akamai_appsec_match_targets":         {Tok: makeDataSource(mainMod, "getAppSecMatchTargets")},
			"akamai_appsec_security_policy":       {Tok: makeDataSource(mainMod, "getAppSecSecurityPolicy")},
			"akamai_appsec_selectable_hostnames":  {Tok: makeDataSource(mainMod, "getAppSecSelectableHostnames")},
			"akamai_appsec_selected_hostnames":    {Tok: makeDataSource(mainMod, "getAppSecSelectedHostnames")},

			"akamai_properties":              {Tok: makeDataSource(mainMod, "getProperties")},
			"akamai_property_products":       {Tok: makeDataSource(mainMod, "getPropertyProducts")},
			"akamai_property_rule_formats":   {Tok: makeDataSource(mainMod, "getPropertyRuleFormats")},
			"akamai_property_rules_template": {Tok: makeDataSource(mainMod, "getPropertyRulesTemplate")},
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

	// edgeDns -> mainMod
	prov.RenameResourceWithAlias("akamai_dns_record", makeResource(edgeDNSMod, "DnsRecord"),
		makeResource(mainMod, "DnsRecord"), edgeDNSMod, mainMod, nil)
	prov.RenameResourceWithAlias("akamai_dns_zone", makeResource(edgeDNSMod, "DnsZone"),
		makeResource(mainMod, "DnsZone"), edgeDNSMod, mainMod, nil)
	prov.RenameDataSource("akamai_authorities_set", makeDataSource(edgeDNSMod, "getAuthoritiesSet"),
		makeDataSource(mainMod, "getAuthoritiesSet"), edgeDNSMod, mainMod, nil)
	prov.RenameDataSource("akamai_dns_record_set", makeDataSource(edgeDNSMod, "getDnsRecordSet"),
		makeDataSource(mainMod, "getDnsRecordSet"), edgeDNSMod, mainMod, nil)

	// trafficManagement -> mainMod
	prov.RenameResourceWithAlias("akamai_gtm_domain", makeResource(trafficManagementMod, "GtmDomain"),
		makeResource(mainMod, "GtmDomain"), trafficManagementMod, mainMod, nil)
	prov.RenameResourceWithAlias("akamai_gtm_datacenter", makeResource(trafficManagementMod, "GtmDatacenter"),
		makeResource(mainMod, "GtmDatacenter"), trafficManagementMod, mainMod, nil)
	prov.RenameResourceWithAlias("akamai_gtm_property", makeResource(trafficManagementMod, "GtmProperty"),
		makeResource(mainMod, "GtmProperty"), trafficManagementMod, mainMod, nil)
	prov.RenameResourceWithAlias("akamai_gtm_resource", makeResource(trafficManagementMod, "GtmResource"),
		makeResource(mainMod, "GtmResource"), trafficManagementMod, mainMod, nil)
	prov.RenameResourceWithAlias("akamai_gtm_cidrmap", makeResource(trafficManagementMod, "GtmCidrmap"),
		makeResource(mainMod, "GtmCidrmap"), trafficManagementMod, mainMod, nil)
	prov.RenameResourceWithAlias("akamai_gtm_asmap", makeResource(trafficManagementMod, "GtmASmap"),
		makeResource(mainMod, "GtmAsmap"), trafficManagementMod, mainMod, nil)
	prov.RenameResourceWithAlias("akamai_gtm_geomap", makeResource(trafficManagementMod, "GtmGeomap"),
		makeResource(mainMod, "GtmGeomap"), trafficManagementMod, mainMod, nil)
	prov.RenameDataSource("akamai_gtm_default_datacenter", makeDataSource(trafficManagementMod, "getGtmDefaultDatacenter"),
		makeDataSource(mainMod, "getGtmDefaultDatacenter"), trafficManagementMod, mainMod, nil)

	// properties -> mainMod
	prov.RenameResourceWithAlias("akamai_cp_code", makeResource(propertiesMod, "CpCode"),
		makeResource(mainMod, "CpCode"), propertiesMod, mainMod, nil)
	prov.RenameResourceWithAlias("akamai_edge_hostname", makeResource(propertiesMod, "EdgeHostName"),
		makeResource(mainMod, "EdgeHostName"), propertiesMod, mainMod, nil)
	prov.RenameResourceWithAlias("akamai_property", makeResource(propertiesMod, "Property"),
		makeResource(mainMod, "Property"), propertiesMod, mainMod, nil)
	prov.RenameResourceWithAlias("akamai_property_activation", makeResource(propertiesMod, "PropertyActivation"),
		makeResource(mainMod, "PropertyActivation"), propertiesMod, mainMod, nil)
	prov.RenameResourceWithAlias("akamai_property_variables", makeResource(propertiesMod, "PropertyVariables"),
		makeResource(mainMod, "PropertyVariables"), propertiesMod, mainMod, nil)
	prov.RenameDataSource("akamai_cp_code", makeDataSource(propertiesMod, "getCpCode"),
		makeDataSource(mainMod, "getCpCode"), propertiesMod, mainMod, nil)
	prov.RenameDataSource("akamai_property", makeDataSource(propertiesMod, "getProperty"),
		makeDataSource(mainMod, "getProperty"), propertiesMod, mainMod, nil)
	prov.RenameDataSource("akamai_property_rules", makeDataSource(propertiesMod, "getPropertyRules"),
		makeDataSource(mainMod, "getPropertyRules"), propertiesMod, mainMod, nil)

	prov.SetAutonaming(255, "-")

	return prov
}
