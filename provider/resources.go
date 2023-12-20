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
	"context"
	_ "embed"
	"path"

	"github.com/akamai/terraform-provider-akamai/v5/pkg/akamai"
	"github.com/akamai/terraform-provider-akamai/v5/pkg/providers/registry"

	// Load the providers
	_ "github.com/akamai/terraform-provider-akamai/v5/pkg/providers"

	"github.com/pulumi/pulumi-akamai/provider/v6/pkg/version"
	pf "github.com/pulumi/pulumi-terraform-bridge/pf/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	tks "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
)

// all of the token components used below.
const (
	// packages:
	mainPkg = "akamai"
	// modules:
	mainMod = "index"
)

//go:embed cmd/pulumi-resource-akamai/bridge-metadata.json
var metadata []byte

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := pf.MuxShimWithPF(context.Background(),
		shimv2.NewProvider(
			akamai.NewPluginProvider(registry.PluginSubproviders()...)()),
		akamai.NewFrameworkProvider(registry.FrameworkSubproviders()...)(),
	)

	makeResource := func(res string) tokens.Type {
		return tfbridge.MakeResource(mainPkg, mainMod, res)
	}

	makeDataSource := func(res string) tokens.ModuleMember {
		return tfbridge.MakeDataSource(mainPkg, mainMod, res)
	}

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
		TFProviderModuleVersion: "v5",
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
			"akamai_appsec_activations":                          {Tok: makeResource("AppSecActivations")},
			"akamai_appsec_custom_rule":                          {Tok: makeResource("AppSecCustomRule")},
			"akamai_appsec_custom_rule_action":                   {Tok: makeResource("AppSecCustomRuleAction")},
			"akamai_appsec_match_target":                         {Tok: makeResource("AppSecMatchTarget")},
			"akamai_appsec_match_target_sequence":                {Tok: makeResource("AppSecMatchTargetSequence")},
			"akamai_appsec_selected_hostnames":                   {Tok: makeResource("AppSecSelectedHostnames")},
			"akamai_appsec_advanced_settings_logging":            {Tok: makeResource("AppSecAdvancedSettingsLogging")},
			"akamai_appsec_advanced_settings_prefetch":           {Tok: makeResource("AppSecAdvancedSettingsPrefetch")},
			"akamai_appsec_api_request_constraints":              {Tok: makeResource("AppSecApiRequestConstraints")},
			"akamai_appsec_bypass_network_lists":                 {Tok: makeResource("AppSecByPassNetworkList")},
			"akamai_appsec_configuration":                        {Tok: makeResource("AppSecConfiguration")},
			"akamai_appsec_configuration_rename":                 {Tok: makeResource("AppSecConfigurationRename")},
			"akamai_appsec_custom_deny":                          {Tok: makeResource("AppSecCustomDeny")},
			"akamai_appsec_eval":                                 {Tok: makeResource("AppSecEval")},
			"akamai_appsec_ip_geo":                               {Tok: makeResource("AppSecIPGeo")},
			"akamai_appsec_penalty_box":                          {Tok: makeResource("AppSecPenaltyBox")},
			"akamai_appsec_eval_penalty_box":                     {Tok: makeResource("AppSecEvalPenaltyBox")},
			"akamai_appsec_rate_policy":                          {Tok: makeResource("AppSecRatePolicy")},
			"akamai_appsec_rate_policy_action":                   {Tok: makeResource("AppSecRatePolicyAction")},
			"akamai_appsec_rate_protection":                      {Tok: makeResource("AppSecRateProtection")},
			"akamai_appsec_reputation_profile":                   {Tok: makeResource("AppSecReputationProfile")},
			"akamai_appsec_reputation_profile_action":            {Tok: makeResource("AppSecReputationProfileAction")},
			"akamai_appsec_reputation_profile_analysis":          {Tok: makeResource("AppSecReputationProfileAnalysis")},
			"akamai_appsec_reputation_protection":                {Tok: makeResource("AppSecReputationProtection")},
			"akamai_appsec_rule_upgrade":                         {Tok: makeResource("AppSecRuleUpgrade")},
			"akamai_appsec_security_policy":                      {Tok: makeResource("AppSecSecurityPolicy")},
			"akamai_appsec_security_policy_rename":               {Tok: makeResource("AppSecSecurityPolicyRename")},
			"akamai_appsec_siem_settings":                        {Tok: makeResource("AppSecSiemSettings")},
			"akamai_appsec_slow_post":                            {Tok: makeResource("AppSecSlowPost")},
			"akamai_appsec_slowpost_protection":                  {Tok: makeResource("AppSecSlowPostProtection")},
			"akamai_appsec_version_notes":                        {Tok: makeResource("AppSecVersionNodes")},
			"akamai_appsec_waf_mode":                             {Tok: makeResource("AppSecWafMode")},
			"akamai_appsec_waf_protection":                       {Tok: makeResource("AppSecWafProtection")},
			"akamai_appsec_advanced_settings_pragma_header":      {Tok: makeResource("AppSecAdvancedSettingsPragmaHeader")},
			"akamai_appsec_api_constraints_protection":           {Tok: makeResource("AppSecApiConstraintsProtection")},
			"akamai_appsec_attack_group":                         {Tok: makeResource("AppSecAttackGroup")},
			"akamai_appsec_eval_rule":                            {Tok: makeResource("AppSecEvalRule")},
			"akamai_appsec_eval_group":                           {Tok: makeResource("AppSecEvalGroup")},
			"akamai_appsec_ip_geo_protection":                    {Tok: makeResource("AppSecIPGeoProtection")},
			"akamai_appsec_malware_policy":                       {Tok: makeResource("AppSecMalwarePolicy")},
			"akamai_appsec_malware_policy_action":                {Tok: makeResource("AppSecMalwarePolicyAction")},
			"akamai_appsec_malware_policy_actions":               {Tok: makeResource("AppSecMalwarePolicyActions")},
			"akamai_appsec_malware_protection":                   {Tok: makeResource("AppSecMalwareProtection")},
			"akamai_appsec_rule":                                 {Tok: makeResource("AppSecRule")},
			"akamai_appsec_threat_intel":                         {Tok: makeResource("AppSecThreatIntel")},
			"akamai_appsec_wap_selected_hostnames":               {Tok: makeResource("AppSecWapSelectedHostnames")},
			"akamai_appsec_advanced_settings_evasive_path_match": {Tok: makeResource("AppSecAdvancedSettingsEvasivePathMatch")},

			"akamai_cps_dv_enrollment":          {Tok: makeResource("CpsDvEnrollment")},
			"akamai_cps_dv_validation":          {Tok: makeResource("CpsDvValidation")},
			"akamai_cps_third_party_enrollment": {Tok: makeResource("CpsThirdPartyEnrollment")},
			"akamai_cps_upload_certificate":     {Tok: makeResource("CpsUploadCertificate")},

			"akamai_cloudlets_application_load_balancer":            {Tok: makeResource("CloudletsApplicationLoadBalancer")},
			"akamai_cloudlets_application_load_balancer_activation": {Tok: makeResource("CloudletsApplicationLoadBalancerActivation")},
			"akamai_cloudlets_policy":                               {Tok: makeResource("CloudletsPolicy")},
			"akamai_cloudlets_policy_activation":                    {Tok: makeResource("CloudletsPolicyActivation")},

			"akamai_datastream": {Tok: makeResource("Datastream")},

			"akamai_edgekv": {Tok: makeResource("EdgeKv")},
			"akamai_edgeworker": {
				Tok: makeResource("EdgeWorker"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"group_id": {
						Type: "integer",
					},
				},
				Docs: &tfbridge.DocInfo{
					Source: "edgeworkers.md",
				},
			},
			"akamai_edgeworkers_activation": {Tok: makeResource("EdgeWorkersActivation")},
			"akamai_edge_hostname":          {Tok: makeResource("EdgeHostName")},

			"akamai_networklist_activations":  {Tok: makeResource("NetworkListActivations")},
			"akamai_networklist_description":  {Tok: makeResource("NetworkListDescription")},
			"akamai_networklist_network_list": {Tok: makeResource("NetworkList")},
			"akamai_networklist_subscription": {Tok: makeResource("NetworkListSubscription")},

			"akamai_iam_blocked_user_properties": {Tok: makeResource("IamBlockedUserProperties")},
			"akamai_iam_group":                   {Tok: makeResource("IamGroup")},
			"akamai_iam_role":                    {Tok: makeResource("IamRole")},
			"akamai_iam_user":                    {Tok: makeResource("IamUser")},

			"akamai_property": {
				Tok: makeResource("Property"),
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
			"akamai_property_include":            {Tok: makeResource("PropertyInclude")},
			"akamai_property_include_activation": {Tok: makeResource("PropertyIncludeActivation")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"akamai_contract":  {Tok: makeDataSource("getContract")},
			"akamai_contracts": {Tok: makeDataSource("getContracts")},
			"akamai_group":     {Tok: makeDataSource("getGroup")},
			"akamai_groups":    {Tok: makeDataSource("getGroups")},

			"akamai_appsec_configuration":                        {Tok: makeDataSource("getAppSecConfiguration")},
			"akamai_appsec_configuration_version":                {Tok: makeDataSource("getAppSecConfigurationVersion")},
			"akamai_appsec_custom_rule_actions":                  {Tok: makeDataSource("getAppSecCustomRuleActions")},
			"akamai_appsec_custom_rules":                         {Tok: makeDataSource("getAppSecCustomRules")},
			"akamai_appsec_export_configuration":                 {Tok: makeDataSource("getAppSecExportConfiguration")},
			"akamai_appsec_match_targets":                        {Tok: makeDataSource("getAppSecMatchTargets")},
			"akamai_appsec_security_policy":                      {Tok: makeDataSource("getAppSecSecurityPolicy")},
			"akamai_appsec_selectable_hostnames":                 {Tok: makeDataSource("getAppSecSelectableHostnames")},
			"akamai_appsec_selected_hostnames":                   {Tok: makeDataSource("getAppSecSelectedHostnames")},
			"akamai_appsec_advanced_settings_logging":            {Tok: makeDataSource("getAppSecAdvancedSettingsLogging")},
			"akamai_appsec_advanced_settings_prefetch":           {Tok: makeDataSource("getAppSecAdvancedSettingsPrefetch")},
			"akamai_appsec_api_endpoints":                        {Tok: makeDataSource("getAppSecApiEndpoints")},
			"akamai_appsec_api_request_constraints":              {Tok: makeDataSource("getAppSecApiRequestConstraints")},
			"akamai_appsec_bypass_network_lists":                 {Tok: makeDataSource("getAppSecBypassNetworkLists")},
			"akamai_appsec_contracts_groups":                     {Tok: makeDataSource("getAppSecContractsGroups")},
			"akamai_appsec_custom_deny":                          {Tok: makeDataSource("getAppSecCustomDeny")},
			"akamai_appsec_eval":                                 {Tok: makeDataSource("getAppSecEval")},
			"akamai_appsec_failover_hostnames":                   {Tok: makeDataSource("getAppSecFailoverHostnames")},
			"akamai_appsec_hostname_coverage":                    {Tok: makeDataSource("getAppSecHostnameCoverage")},
			"akamai_appsec_hostname_coverage_match_targets":      {Tok: makeDataSource("getAppSecHostnameCoverageMatchTargets")},
			"akamai_appsec_hostname_coverage_overlapping":        {Tok: makeDataSource("getAppSecHostnameCoverageOverlapping")},
			"akamai_appsec_ip_geo":                               {Tok: makeDataSource("getAppSecIPGeo")},
			"akamai_appsec_malware_content_types":                {Tok: makeDataSource("getAppSecMalwareContentTypes")},
			"akamai_appsec_malware_policies":                     {Tok: makeDataSource("getAppSecMalwarePolicies")},
			"akamai_appsec_malware_policy_actions":               {Tok: makeDataSource("getAppSecMalwarePolicyActions")},
			"akamai_appsec_penalty_box":                          {Tok: makeDataSource("getAppSecPenaltyBox")},
			"akamai_appsec_eval_penalty_box":                     {Tok: makeDataSource("getAppSecEvalPenaltyBox")},
			"akamai_appsec_rate_policies":                        {Tok: makeDataSource("getAppSecRatePolicies")},
			"akamai_appsec_rate_policy_actions":                  {Tok: makeDataSource("getAppSecRatePolicyActions")},
			"akamai_appsec_reputation_profile_actions":           {Tok: makeDataSource("getAppSecReputationProfileActions")},
			"akamai_appsec_reputation_profile_analysis":          {Tok: makeDataSource("getAppSecReputationProfileAnalysis")},
			"akamai_appsec_reputation_profiles":                  {Tok: makeDataSource("getAppSecReputationProfiles")},
			"akamai_appsec_rule_upgrade_details":                 {Tok: makeDataSource("getAppSecRuleUpgradeDetails")},
			"akamai_appsec_security_policy_protections":          {Tok: makeDataSource("getAppSecSecurityPolicyProtections")},
			"akamai_appsec_siem_definitions":                     {Tok: makeDataSource("getAppSecSiemDefinitions")},
			"akamai_appsec_siem_settings":                        {Tok: makeDataSource("getAppSecSiemSettings")},
			"akamai_appsec_slow_post":                            {Tok: makeDataSource("getAppSecSlowPost")},
			"akamai_appsec_version_notes":                        {Tok: makeDataSource("getAppSecVersionNotes")},
			"akamai_appsec_waf_mode":                             {Tok: makeDataSource("getAppSecWafMode")},
			"akamai_appsec_advanced_settings_pragma_header":      {Tok: makeDataSource("getAppSecAdvancedSettingsPragmaHeader")},
			"akamai_appsec_attack_groups":                        {Tok: makeDataSource("getAppSecAttackGroups")},
			"akamai_appsec_eval_rules":                           {Tok: makeDataSource("getAppSecEvalRules")},
			"akamai_appsec_rules":                                {Tok: makeDataSource("getAppSecRules")},
			"akamai_appsec_eval_groups":                          {Tok: makeDataSource("getAppSecEvalGroups")},
			"akamai_appsec_threat_intel":                         {Tok: makeDataSource("getAppSecThreatIntel")},
			"akamai_appsec_wap_selected_hostnames":               {Tok: makeDataSource("getAppSecWapSelectedHostnames")},
			"akamai_appsec_advanced_settings_evasive_path_match": {Tok: makeDataSource("getAppSecAdvancedSettingsEvasivePathMatch")},
			"akamai_appsec_tuning_recommendations":               {Tok: makeDataSource("getAppSecTuningRecommendations")},
			"akamai_cps_enrollment":                              {Tok: makeDataSource("getCPSEnrollment")},
			"akamai_cps_enrollments":                             {Tok: makeDataSource("getCPSEnrollments")},
			"akamai_cps_csr":                                     {Tok: makeDataSource("getCpsCsr")},
			"akamai_cps_deployments":                             {Tok: makeDataSource("getCpsDeployments")},
			"akamai_cps_warnings":                                {Tok: makeDataSource("getCpsWarnings")},

			"akamai_cloudlets_api_prioritization_match_rule":        {Tok: makeDataSource("getCloudletsApiPrioritizationMatchRule")},
			"akamai_cloudlets_application_load_balancer":            {Tok: makeDataSource("getCloudletsApplicationLoadBalancer")},
			"akamai_cloudlets_application_load_balancer_match_rule": {Tok: makeDataSource("getCloudletsApplicationLoadBalancerMatchRule")},
			"akamai_cloudlets_audience_segmentation_match_rule":     {Tok: makeDataSource("getCloudletsAudienceSegmentationMatchRule")},
			"akamai_cloudlets_edge_redirector_match_rule":           {Tok: makeDataSource("getCloudletsEdgeRedirectorMatchRule")},
			"akamai_cloudlets_forward_rewrite_match_rule":           {Tok: makeDataSource("getCloudletsForwardRewriteMatchRule")},
			"akamai_cloudlets_phased_release_match_rule":            {Tok: makeDataSource("getCloudletsPhasedReleaseMatchRule")},
			"akamai_cloudlets_policy":                               {Tok: makeDataSource("getCloudletsPolicy")},
			"akamai_cloudlets_visitor_prioritization_match_rule":    {Tok: makeDataSource("getCloudletsVisitorPrioritizationMatchRule")},

			"akamai_datastream_activation_history": {Tok: makeDataSource("getDatastreamActivationHistory")},
			"akamai_datastream_dataset_fields":     {Tok: makeDataSource("getDatastreamDatasetFields")},
			"akamai_datastreams":                   {Tok: makeDataSource("getDatastreams")},

			"akamai_edgeworker":                 {Tok: makeDataSource("getEdgeWorker")},
			"akamai_edgeworker_activation":      {Tok: makeDataSource("getEdgeWorkerActivation")},
			"akamai_edgeworkers_property_rules": {Tok: makeDataSource("getEdgeWorkersPropertyRules")},
			"akamai_edgeworkers_resource_tier":  {Tok: makeDataSource("getEdgeWorkersResourceTier")},

			"akamai_properties":                  {Tok: makeDataSource("getProperties")},
			"akamai_property_products":           {Tok: makeDataSource("getPropertyProducts")},
			"akamai_property_rule_formats":       {Tok: makeDataSource("getPropertyRuleFormats")},
			"akamai_property_rules_template":     {Tok: makeDataSource("getPropertyRulesTemplate")},
			"akamai_property_hostnames":          {Tok: makeDataSource("getPropertyHostnames")},
			"akamai_property_include":            {Tok: makeDataSource("getPropertyInclude")},
			"akamai_property_includes":           {Tok: makeDataSource("getPropertyIncludes")},
			"akamai_property_include_activation": {Tok: makeDataSource("getPropertyIncludeActivation")},
			"akamai_property_include_parents":    {Tok: makeDataSource("getPropertyIncludeParents")},
			"akamai_property_include_rules":      {Tok: makeDataSource("getPropertyIncludeRules")},

			"akamai_networklist_network_lists":            {Tok: makeDataSource("getNetworkLists")},
			"akamai_cloudlets_request_control_match_rule": {Tok: makeDataSource("getCloudletsRequestControlMatchRule")},
			"akamai_properties_search":                    {Tok: makeDataSource("getPropertiesSearch")},

			"akamai_iam_contact_types":    {Tok: makeDataSource("getIamContactTypes")},
			"akamai_iam_countries":        {Tok: makeDataSource("getIamCountries")},
			"akamai_iam_grantable_roles":  {Tok: makeDataSource("getIamGrantableRoles")},
			"akamai_iam_roles":            {Tok: makeDataSource("getIamRoles")},
			"akamai_iam_states":           {Tok: makeDataSource("getIamStates")},
			"akamai_iam_supported_langs":  {Tok: makeDataSource("getIamSupportedLangs")},
			"akamai_iam_timeout_policies": {Tok: makeDataSource("getIamTimeoutPolicies")},
			"akamai_iam_timezones":        {Tok: makeDataSource("getIamTimezones")},
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

			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
			PyProject: struct{ Enabled bool }{true},
		},

		Golang: &tfbridge.GolangInfo{
			ImportBasePath: path.Join(
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

	prov.MustComputeTokens(tks.SingleModule("akamai_", mainMod, tks.MakeStandard(mainPkg)))

	// The upstream provider decided to move all documentation to their own website,
	// so we no longer have access to the TF styled markdown.
	for _, r := range prov.Resources {
		r.Docs = noUpstreamDocs
	}
	for _, d := range prov.DataSources {
		d.Docs = noUpstreamDocs
	}
	prov.MustApplyAutoAliases()

	prov.SetAutonaming(255, "-")

	return prov
}

var noUpstreamDocs = &tfbridge.DocInfo{AllowMissing: true}
