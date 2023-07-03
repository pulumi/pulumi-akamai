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
	"fmt"
	// embed is used to store bridge-metadata.json in the compiled binary
	_ "embed"
	"path/filepath"
	"unicode"

	"github.com/akamai/terraform-provider-akamai/v4/pkg/akamai"

	// The list of akamai subproviders we are using. We load in each provider manually
	// because it requires build flags to configure automatic loading.
	appSecProvider "github.com/akamai/terraform-provider-akamai/v4/pkg/providers/appsec"
	botmanProvider "github.com/akamai/terraform-provider-akamai/v4/pkg/providers/botman"
	cloudletsProvider "github.com/akamai/terraform-provider-akamai/v4/pkg/providers/cloudlets"
	cpsProvider "github.com/akamai/terraform-provider-akamai/v4/pkg/providers/cps"
	datastreamProvider "github.com/akamai/terraform-provider-akamai/v4/pkg/providers/datastream"
	dnsProvider "github.com/akamai/terraform-provider-akamai/v4/pkg/providers/dns"
	edgeworksProvider "github.com/akamai/terraform-provider-akamai/v4/pkg/providers/edgeworkers"
	gtmProvider "github.com/akamai/terraform-provider-akamai/v4/pkg/providers/gtm"
	iamProvider "github.com/akamai/terraform-provider-akamai/v4/pkg/providers/iam"
	imagingProvider "github.com/akamai/terraform-provider-akamai/v4/pkg/providers/imaging"
	networkListsProvider "github.com/akamai/terraform-provider-akamai/v4/pkg/providers/networklists"
	propertyProvider "github.com/akamai/terraform-provider-akamai/v4/pkg/providers/property"

	"github.com/pulumi/pulumi-akamai/provider/v5/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/x"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
	"github.com/pulumi/pulumi/sdk/v3/go/common/util/contract"
)

// all of the token components used below.
const (
	// packages:
	mainPkg = "akamai"
	// modules:
	mainMod = "index"
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
		appSecProvider.Subprovider(),
		cloudletsProvider.Subprovider(),
		cpsProvider.Subprovider(),
		datastreamProvider.Subprovider(),
		dnsProvider.Subprovider(),
		edgeworksProvider.Subprovider(),
		gtmProvider.Subprovider(),
		networkListsProvider.Subprovider(),
		propertyProvider.Subprovider(),
		iamProvider.Subprovider(),
		botmanProvider.Subprovider(),
		imagingProvider.Subprovider(),
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
		TFProviderModuleVersion: "v4",
		Version:                 version.Version,
		UpstreamRepoPath:        "./upstream",
		Config: map[string]*tfbridge.SchemaInfo{
			"config": {
				CSharpName: "ConfigDetails",
			},
		},
		IgnoreMappings: []string{
			// Executing this resource's code in the upstream provider yields an error message saying it's no longer
			// supported:
			"akamai_property_variables",
			// This provides a DotNet codegen class as follows:
			// GetIamGroupsGroupSubGroupSubGroupSubGroupSubGroupSubGroupSubGroupSubGroupSubGroupSubGroupSubGrou....
			"akamai_iam_groups",
		},
		Resources: map[string]*tfbridge.ResourceInfo{
			"akamai_appsec_activations":                          {Tok: makeResource(mainMod, "AppSecActivations")},
			"akamai_appsec_custom_rule":                          {Tok: makeResource(mainMod, "AppSecCustomRule")},
			"akamai_appsec_custom_rule_action":                   {Tok: makeResource(mainMod, "AppSecCustomRuleAction")},
			"akamai_appsec_match_target":                         {Tok: makeResource(mainMod, "AppSecMatchTarget")},
			"akamai_appsec_match_target_sequence":                {Tok: makeResource(mainMod, "AppSecMatchTargetSequence")},
			"akamai_appsec_selected_hostnames":                   {Tok: makeResource(mainMod, "AppSecSelectedHostnames")},
			"akamai_appsec_advanced_settings_logging":            {Tok: makeResource(mainMod, "AppSecAdvancedSettingsLogging")},
			"akamai_appsec_advanced_settings_prefetch":           {Tok: makeResource(mainMod, "AppSecAdvancedSettingsPrefetch")},
			"akamai_appsec_api_request_constraints":              {Tok: makeResource(mainMod, "AppSecApiRequestConstraints")},
			"akamai_appsec_bypass_network_lists":                 {Tok: makeResource(mainMod, "AppSecByPassNetworkList")},
			"akamai_appsec_configuration":                        {Tok: makeResource(mainMod, "AppSecConfiguration")},
			"akamai_appsec_configuration_rename":                 {Tok: makeResource(mainMod, "AppSecConfigurationRename")},
			"akamai_appsec_custom_deny":                          {Tok: makeResource(mainMod, "AppSecCustomDeny")},
			"akamai_appsec_eval":                                 {Tok: makeResource(mainMod, "AppSecEval")},
			"akamai_appsec_ip_geo":                               {Tok: makeResource(mainMod, "AppSecIPGeo")},
			"akamai_appsec_penalty_box":                          {Tok: makeResource(mainMod, "AppSecPenaltyBox")},
			"akamai_appsec_eval_penalty_box":                     {Tok: makeResource(mainMod, "AppSecEvalPenaltyBox")},
			"akamai_appsec_rate_policy":                          {Tok: makeResource(mainMod, "AppSecRatePolicy")},
			"akamai_appsec_rate_policy_action":                   {Tok: makeResource(mainMod, "AppSecRatePolicyAction")},
			"akamai_appsec_rate_protection":                      {Tok: makeResource(mainMod, "AppSecRateProtection")},
			"akamai_appsec_reputation_profile":                   {Tok: makeResource(mainMod, "AppSecReputationProfile")},
			"akamai_appsec_reputation_profile_action":            {Tok: makeResource(mainMod, "AppSecReputationProfileAction")},
			"akamai_appsec_reputation_profile_analysis":          {Tok: makeResource(mainMod, "AppSecReputationProfileAnalysis")},
			"akamai_appsec_reputation_protection":                {Tok: makeResource(mainMod, "AppSecReputationProtection")},
			"akamai_appsec_rule_upgrade":                         {Tok: makeResource(mainMod, "AppSecRuleUpgrade")},
			"akamai_appsec_security_policy":                      {Tok: makeResource(mainMod, "AppSecSecurityPolicy")},
			"akamai_appsec_security_policy_rename":               {Tok: makeResource(mainMod, "AppSecSecurityPolicyRename")},
			"akamai_appsec_siem_settings":                        {Tok: makeResource(mainMod, "AppSecSiemSettings")},
			"akamai_appsec_slow_post":                            {Tok: makeResource(mainMod, "AppSecSlowPost")},
			"akamai_appsec_slowpost_protection":                  {Tok: makeResource(mainMod, "AppSecSlowPostProtection")},
			"akamai_appsec_version_notes":                        {Tok: makeResource(mainMod, "AppSecVersionNodes")},
			"akamai_appsec_waf_mode":                             {Tok: makeResource(mainMod, "AppSecWafMode")},
			"akamai_appsec_waf_protection":                       {Tok: makeResource(mainMod, "AppSecWafProtection")},
			"akamai_appsec_advanced_settings_pragma_header":      {Tok: makeResource(mainMod, "AppSecAdvancedSettingsPragmaHeader")},
			"akamai_appsec_api_constraints_protection":           {Tok: makeResource(mainMod, "AppSecApiConstraintsProtection")},
			"akamai_appsec_attack_group":                         {Tok: makeResource(mainMod, "AppSecAttackGroup")},
			"akamai_appsec_eval_rule":                            {Tok: makeResource(mainMod, "AppSecEvalRule")},
			"akamai_appsec_eval_group":                           {Tok: makeResource(mainMod, "AppSecEvalGroup")},
			"akamai_appsec_ip_geo_protection":                    {Tok: makeResource(mainMod, "AppSecIPGeoProtection")},
			"akamai_appsec_malware_policy":                       {Tok: makeResource(mainMod, "AppSecMalwarePolicy")},
			"akamai_appsec_malware_policy_action":                {Tok: makeResource(mainMod, "AppSecMalwarePolicyAction")},
			"akamai_appsec_malware_policy_actions":               {Tok: makeResource(mainMod, "AppSecMalwarePolicyActions")},
			"akamai_appsec_malware_protection":                   {Tok: makeResource(mainMod, "AppSecMalwareProtection")},
			"akamai_appsec_rule":                                 {Tok: makeResource(mainMod, "AppSecRule")},
			"akamai_appsec_threat_intel":                         {Tok: makeResource(mainMod, "AppSecThreatIntel")},
			"akamai_appsec_wap_selected_hostnames":               {Tok: makeResource(mainMod, "AppSecWapSelectedHostnames")},
			"akamai_appsec_advanced_settings_evasive_path_match": {Tok: makeResource(mainMod, "AppSecAdvancedSettingsEvasivePathMatch")},

			"akamai_cps_dv_enrollment":          {Tok: makeResource(mainMod, "CpsDvEnrollment")},
			"akamai_cps_dv_validation":          {Tok: makeResource(mainMod, "CpsDvValidation")},
			"akamai_cps_third_party_enrollment": {Tok: makeResource(mainMod, "CpsThirdPartyEnrollment")},
			"akamai_cps_upload_certificate":     {Tok: makeResource(mainMod, "CpsUploadCertificate")},

			"akamai_cloudlets_application_load_balancer":            {Tok: makeResource(mainMod, "CloudletsApplicationLoadBalancer")},
			"akamai_cloudlets_application_load_balancer_activation": {Tok: makeResource(mainMod, "CloudletsApplicationLoadBalancerActivation")},
			"akamai_cloudlets_policy":                               {Tok: makeResource(mainMod, "CloudletsPolicy")},
			"akamai_cloudlets_policy_activation":                    {Tok: makeResource(mainMod, "CloudletsPolicyActivation")},

			"akamai_datastream": {Tok: makeResource(mainMod, "Datastream")},

			"akamai_edgekv": {Tok: makeResource(mainMod, "EdgeKv")},
			"akamai_edgeworker": {
				Tok: makeResource(mainMod, "EdgeWorker"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"group_id": {
						Type: "integer",
					},
				},
				Docs: &tfbridge.DocInfo{
					Source: "edgeworkers.md",
				},
			},
			"akamai_edgeworkers_activation": {Tok: makeResource(mainMod, "EdgeWorkersActivation")},
			"akamai_edge_hostname":          {Tok: makeResource(mainMod, "EdgeHostName")},

			"akamai_networklist_activations":  {Tok: makeResource(mainMod, "NetworkListActivations")},
			"akamai_networklist_description":  {Tok: makeResource(mainMod, "NetworkListDescription")},
			"akamai_networklist_network_list": {Tok: makeResource(mainMod, "NetworkList")},
			"akamai_networklist_subscription": {Tok: makeResource(mainMod, "NetworkListSubscription")},

			"akamai_iam_blocked_user_properties": {Tok: makeResource(mainMod, "IamBlockedUserProperties")},
			"akamai_iam_group":                   {Tok: makeResource(mainMod, "IamGroup")},
			"akamai_iam_role":                    {Tok: makeResource(mainMod, "IamRole")},
			"akamai_iam_user":                    {Tok: makeResource(mainMod, "IamUser")},

			"akamai_property": {
				Tok: makeResource(mainMod, "Property"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"read_version": {
						Transform: func(v resource.PropertyValue) (resource.PropertyValue, error) {
							// Read version needs to be populated and non-zero on updates, but
							// for some reason isn't. See
							// https://github.com/pulumi/pulumi-akamai/issues/107
							if v.IsNull() || (v.IsNumber() && v.NumberValue() == 0) {
								v = resource.NewNumberProperty(1)
							}
							return v, nil
						},
					},
				},
			},
			"akamai_property_include":            {Tok: makeResource(mainMod, "PropertyInclude")},
			"akamai_property_include_activation": {Tok: makeResource(mainMod, "PropertyIncludeActivation")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"akamai_contract":  {Tok: makeDataSource(mainMod, "getContract")},
			"akamai_contracts": {Tok: makeDataSource(mainMod, "getContracts")},
			"akamai_group":     {Tok: makeDataSource(mainMod, "getGroup")},
			"akamai_groups":    {Tok: makeDataSource(mainMod, "getGroups")},

			"akamai_appsec_configuration":                        {Tok: makeDataSource(mainMod, "getAppSecConfiguration")},
			"akamai_appsec_configuration_version":                {Tok: makeDataSource(mainMod, "getAppSecConfigurationVersion")},
			"akamai_appsec_custom_rule_actions":                  {Tok: makeDataSource(mainMod, "getAppSecCustomRuleActions")},
			"akamai_appsec_custom_rules":                         {Tok: makeDataSource(mainMod, "getAppSecCustomRules")},
			"akamai_appsec_export_configuration":                 {Tok: makeDataSource(mainMod, "getAppSecExportConfiguration")},
			"akamai_appsec_match_targets":                        {Tok: makeDataSource(mainMod, "getAppSecMatchTargets")},
			"akamai_appsec_security_policy":                      {Tok: makeDataSource(mainMod, "getAppSecSecurityPolicy")},
			"akamai_appsec_selectable_hostnames":                 {Tok: makeDataSource(mainMod, "getAppSecSelectableHostnames")},
			"akamai_appsec_selected_hostnames":                   {Tok: makeDataSource(mainMod, "getAppSecSelectedHostnames")},
			"akamai_appsec_advanced_settings_logging":            {Tok: makeDataSource(mainMod, "getAppSecAdvancedSettingsLogging")},
			"akamai_appsec_advanced_settings_prefetch":           {Tok: makeDataSource(mainMod, "getAppSecAdvancedSettingsPrefetch")},
			"akamai_appsec_api_endpoints":                        {Tok: makeDataSource(mainMod, "getAppSecApiEndpoints")},
			"akamai_appsec_api_request_constraints":              {Tok: makeDataSource(mainMod, "getAppSecApiRequestConstraints")},
			"akamai_appsec_bypass_network_lists":                 {Tok: makeDataSource(mainMod, "getAppSecBypassNetworkLists")},
			"akamai_appsec_contracts_groups":                     {Tok: makeDataSource(mainMod, "getAppSecContractsGroups")},
			"akamai_appsec_custom_deny":                          {Tok: makeDataSource(mainMod, "getAppSecCustomDeny")},
			"akamai_appsec_eval":                                 {Tok: makeDataSource(mainMod, "getAppSecEval")},
			"akamai_appsec_failover_hostnames":                   {Tok: makeDataSource(mainMod, "getAppSecFailoverHostnames")},
			"akamai_appsec_hostname_coverage":                    {Tok: makeDataSource(mainMod, "getAppSecHostnameCoverage")},
			"akamai_appsec_hostname_coverage_match_targets":      {Tok: makeDataSource(mainMod, "getAppSecHostnameCoverageMatchTargets")},
			"akamai_appsec_hostname_coverage_overlapping":        {Tok: makeDataSource(mainMod, "getAppSecHostnameCoverageOverlapping")},
			"akamai_appsec_ip_geo":                               {Tok: makeDataSource(mainMod, "getAppSecIPGeo")},
			"akamai_appsec_malware_content_types":                {Tok: makeDataSource(mainMod, "getAppSecMalwareContentTypes")},
			"akamai_appsec_malware_policies":                     {Tok: makeDataSource(mainMod, "getAppSecMalwarePolicies")},
			"akamai_appsec_malware_policy_actions":               {Tok: makeDataSource(mainMod, "getAppSecMalwarePolicyActions")},
			"akamai_appsec_penalty_box":                          {Tok: makeDataSource(mainMod, "getAppSecPenaltyBox")},
			"akamai_appsec_eval_penalty_box":                     {Tok: makeDataSource(mainMod, "getAppSecEvalPenaltyBox")},
			"akamai_appsec_rate_policies":                        {Tok: makeDataSource(mainMod, "getAppSecRatePolicies")},
			"akamai_appsec_rate_policy_actions":                  {Tok: makeDataSource(mainMod, "getAppSecRatePolicyActions")},
			"akamai_appsec_reputation_profile_actions":           {Tok: makeDataSource(mainMod, "getAppSecReputationProfileActions")},
			"akamai_appsec_reputation_profile_analysis":          {Tok: makeDataSource(mainMod, "getAppSecReputationProfileAnalysis")},
			"akamai_appsec_reputation_profiles":                  {Tok: makeDataSource(mainMod, "getAppSecReputationProfiles")},
			"akamai_appsec_rule_upgrade_details":                 {Tok: makeDataSource(mainMod, "getAppSecRuleUpgradeDetails")},
			"akamai_appsec_security_policy_protections":          {Tok: makeDataSource(mainMod, "getAppSecSecurityPolicyProtections")},
			"akamai_appsec_siem_definitions":                     {Tok: makeDataSource(mainMod, "getAppSecSiemDefinitions")},
			"akamai_appsec_siem_settings":                        {Tok: makeDataSource(mainMod, "getAppSecSiemSettings")},
			"akamai_appsec_slow_post":                            {Tok: makeDataSource(mainMod, "getAppSecSlowPost")},
			"akamai_appsec_version_notes":                        {Tok: makeDataSource(mainMod, "getAppSecVersionNotes")},
			"akamai_appsec_waf_mode":                             {Tok: makeDataSource(mainMod, "getAppSecWafMode")},
			"akamai_appsec_advanced_settings_pragma_header":      {Tok: makeDataSource(mainMod, "getAppSecAdvancedSettingsPragmaHeader")},
			"akamai_appsec_attack_groups":                        {Tok: makeDataSource(mainMod, "getAppSecAttackGroups")},
			"akamai_appsec_eval_rules":                           {Tok: makeDataSource(mainMod, "getAppSecEvalRules")},
			"akamai_appsec_rules":                                {Tok: makeDataSource(mainMod, "getAppSecRules")},
			"akamai_appsec_eval_groups":                          {Tok: makeDataSource(mainMod, "getAppSecEvalGroups")},
			"akamai_appsec_threat_intel":                         {Tok: makeDataSource(mainMod, "getAppSecThreatIntel")},
			"akamai_appsec_wap_selected_hostnames":               {Tok: makeDataSource(mainMod, "getAppSecWapSelectedHostnames")},
			"akamai_appsec_advanced_settings_evasive_path_match": {Tok: makeDataSource(mainMod, "getAppSecAdvancedSettingsEvasivePathMatch")},
			"akamai_appsec_tuning_recommendations":               {Tok: makeDataSource(mainMod, "getAppSecTuningRecommendations")},
			"akamai_cps_enrollment":                              {Tok: makeDataSource(mainMod, "getCPSEnrollment")},
			"akamai_cps_enrollments":                             {Tok: makeDataSource(mainMod, "getCPSEnrollments")},
			"akamai_cps_csr":                                     {Tok: makeDataSource(mainMod, "getCpsCsr")},
			"akamai_cps_deployments":                             {Tok: makeDataSource(mainMod, "getCpsDeployments")},
			"akamai_cps_warnings":                                {Tok: makeDataSource(mainMod, "getCpsWarnings")},

			"akamai_cloudlets_api_prioritization_match_rule":        {Tok: makeDataSource(mainMod, "getCloudletsApiPrioritizationMatchRule")},
			"akamai_cloudlets_application_load_balancer":            {Tok: makeDataSource(mainMod, "getCloudletsApplicationLoadBalancer")},
			"akamai_cloudlets_application_load_balancer_match_rule": {Tok: makeDataSource(mainMod, "getCloudletsApplicationLoadBalancerMatchRule")},
			"akamai_cloudlets_audience_segmentation_match_rule":     {Tok: makeDataSource(mainMod, "getCloudletsAudienceSegmentationMatchRule")},
			"akamai_cloudlets_edge_redirector_match_rule":           {Tok: makeDataSource(mainMod, "getCloudletsEdgeRedirectorMatchRule")},
			"akamai_cloudlets_forward_rewrite_match_rule":           {Tok: makeDataSource(mainMod, "getCloudletsForwardRewriteMatchRule")},
			"akamai_cloudlets_phased_release_match_rule":            {Tok: makeDataSource(mainMod, "getCloudletsPhasedReleaseMatchRule")},
			"akamai_cloudlets_policy":                               {Tok: makeDataSource(mainMod, "getCloudletsPolicy")},
			"akamai_cloudlets_visitor_prioritization_match_rule":    {Tok: makeDataSource(mainMod, "getCloudletsVisitorPrioritizationMatchRule")},

			"akamai_datastream_activation_history": {Tok: makeDataSource(mainMod, "getDatastreamActivationHistory")},
			"akamai_datastream_dataset_fields":     {Tok: makeDataSource(mainMod, "getDatastreamDatasetFields")},
			"akamai_datastreams":                   {Tok: makeDataSource(mainMod, "getDatastreams")},

			"akamai_edgeworker":                 {Tok: makeDataSource(mainMod, "getEdgeWorker")},
			"akamai_edgeworker_activation":      {Tok: makeDataSource(mainMod, "getEdgeWorkerActivation")},
			"akamai_edgeworkers_property_rules": {Tok: makeDataSource(mainMod, "getEdgeWorkersPropertyRules")},
			"akamai_edgeworkers_resource_tier":  {Tok: makeDataSource(mainMod, "getEdgeWorkersResourceTier")},

			"akamai_properties":                  {Tok: makeDataSource(mainMod, "getProperties")},
			"akamai_property_products":           {Tok: makeDataSource(mainMod, "getPropertyProducts")},
			"akamai_property_rule_formats":       {Tok: makeDataSource(mainMod, "getPropertyRuleFormats")},
			"akamai_property_rules_template":     {Tok: makeDataSource(mainMod, "getPropertyRulesTemplate")},
			"akamai_property_hostnames":          {Tok: makeDataSource(mainMod, "getPropertyHostnames")},
			"akamai_property_include":            {Tok: makeDataSource(mainMod, "getPropertyInclude")},
			"akamai_property_includes":           {Tok: makeDataSource(mainMod, "getPropertyIncludes")},
			"akamai_property_include_activation": {Tok: makeDataSource(mainMod, "getPropertyIncludeActivation")},
			"akamai_property_include_parents":    {Tok: makeDataSource(mainMod, "getPropertyIncludeParents")},
			"akamai_property_include_rules":      {Tok: makeDataSource(mainMod, "getPropertyIncludeRules")},

			"akamai_networklist_network_lists":            {Tok: makeDataSource(mainMod, "getNetworkLists")},
			"akamai_cloudlets_request_control_match_rule": {Tok: makeDataSource(mainMod, "getCloudletsRequestControlMatchRule")},
			"akamai_properties_search":                    {Tok: makeDataSource(mainMod, "getPropertiesSearch")},

			"akamai_iam_contact_types":    {Tok: makeDataSource(mainMod, "getIamContactTypes")},
			"akamai_iam_countries":        {Tok: makeDataSource(mainMod, "getIamCountries")},
			"akamai_iam_grantable_roles":  {Tok: makeDataSource(mainMod, "getIamGrantableRoles")},
			"akamai_iam_roles":            {Tok: makeDataSource(mainMod, "getIamRoles")},
			"akamai_iam_states":           {Tok: makeDataSource(mainMod, "getIamStates")},
			"akamai_iam_supported_langs":  {Tok: makeDataSource(mainMod, "getIamSupportedLangs")},
			"akamai_iam_timeout_policies": {Tok: makeDataSource(mainMod, "getIamTimeoutPolicies")},
			"akamai_iam_timezones":        {Tok: makeDataSource(mainMod, "getIamTimezones")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			// List any npm dependencies and their versions
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
		},
		Python: &tfbridge.PythonInfo{
			// List any Python dependencies and their version ranges
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
			Namespaces: map[string]string{
				mainPkg: "Akamai",
			},
		},
		MetadataInfo: tfbridge.NewProviderMetadata(metadata),
	}

	err := x.ComputeDefaults(&prov, x.TokensSingleModule("akamai_", mainMod, x.MakeStandardToken(mainPkg)))
	contract.AssertNoError(err)

	// The upstream provider decided to move all documentation to their own website,
	// so we no longer have access to the TF styled markdown.
	for _, r := range prov.Resources {
		r.Docs = noUpstreamDocs()
	}
	for _, d := range prov.DataSources {
		d.Docs = noUpstreamDocs()
	}
	err = x.AutoAliasing(&prov, prov.GetMetadata())
	contract.AssertNoErrorf(err, "auto aliasing apply failed")

	prov.SetAutonaming(255, "-")

	return prov
}

func noUpstreamDocs() *tfbridge.DocInfo {
	return &tfbridge.DocInfo{
		Markdown: []byte(" "),
	}
}

//go:embed cmd/pulumi-resource-akamai/bridge-metadata.json
var metadata []byte
