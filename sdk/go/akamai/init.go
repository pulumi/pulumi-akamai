// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi-akamai/sdk/v9/go/akamai/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "akamai:index/appSecActivations:AppSecActivations":
		r = &AppSecActivations{}
	case "akamai:index/appSecAdvancedSettingsEvasivePathMatch:AppSecAdvancedSettingsEvasivePathMatch":
		r = &AppSecAdvancedSettingsEvasivePathMatch{}
	case "akamai:index/appSecAdvancedSettingsLogging:AppSecAdvancedSettingsLogging":
		r = &AppSecAdvancedSettingsLogging{}
	case "akamai:index/appSecAdvancedSettingsPragmaHeader:AppSecAdvancedSettingsPragmaHeader":
		r = &AppSecAdvancedSettingsPragmaHeader{}
	case "akamai:index/appSecAdvancedSettingsPrefetch:AppSecAdvancedSettingsPrefetch":
		r = &AppSecAdvancedSettingsPrefetch{}
	case "akamai:index/appSecApiConstraintsProtection:AppSecApiConstraintsProtection":
		r = &AppSecApiConstraintsProtection{}
	case "akamai:index/appSecApiRequestConstraints:AppSecApiRequestConstraints":
		r = &AppSecApiRequestConstraints{}
	case "akamai:index/appSecAttackGroup:AppSecAttackGroup":
		r = &AppSecAttackGroup{}
	case "akamai:index/appSecByPassNetworkList:AppSecByPassNetworkList":
		r = &AppSecByPassNetworkList{}
	case "akamai:index/appSecConfiguration:AppSecConfiguration":
		r = &AppSecConfiguration{}
	case "akamai:index/appSecConfigurationRename:AppSecConfigurationRename":
		r = &AppSecConfigurationRename{}
	case "akamai:index/appSecCustomDeny:AppSecCustomDeny":
		r = &AppSecCustomDeny{}
	case "akamai:index/appSecCustomRule:AppSecCustomRule":
		r = &AppSecCustomRule{}
	case "akamai:index/appSecCustomRuleAction:AppSecCustomRuleAction":
		r = &AppSecCustomRuleAction{}
	case "akamai:index/appSecEval:AppSecEval":
		r = &AppSecEval{}
	case "akamai:index/appSecEvalGroup:AppSecEvalGroup":
		r = &AppSecEvalGroup{}
	case "akamai:index/appSecEvalPenaltyBox:AppSecEvalPenaltyBox":
		r = &AppSecEvalPenaltyBox{}
	case "akamai:index/appSecEvalRule:AppSecEvalRule":
		r = &AppSecEvalRule{}
	case "akamai:index/appSecIPGeo:AppSecIPGeo":
		r = &AppSecIPGeo{}
	case "akamai:index/appSecIPGeoProtection:AppSecIPGeoProtection":
		r = &AppSecIPGeoProtection{}
	case "akamai:index/appSecMalwarePolicy:AppSecMalwarePolicy":
		r = &AppSecMalwarePolicy{}
	case "akamai:index/appSecMalwarePolicyAction:AppSecMalwarePolicyAction":
		r = &AppSecMalwarePolicyAction{}
	case "akamai:index/appSecMalwarePolicyActions:AppSecMalwarePolicyActions":
		r = &AppSecMalwarePolicyActions{}
	case "akamai:index/appSecMalwareProtection:AppSecMalwareProtection":
		r = &AppSecMalwareProtection{}
	case "akamai:index/appSecMatchTarget:AppSecMatchTarget":
		r = &AppSecMatchTarget{}
	case "akamai:index/appSecMatchTargetSequence:AppSecMatchTargetSequence":
		r = &AppSecMatchTargetSequence{}
	case "akamai:index/appSecPenaltyBox:AppSecPenaltyBox":
		r = &AppSecPenaltyBox{}
	case "akamai:index/appSecRatePolicy:AppSecRatePolicy":
		r = &AppSecRatePolicy{}
	case "akamai:index/appSecRatePolicyAction:AppSecRatePolicyAction":
		r = &AppSecRatePolicyAction{}
	case "akamai:index/appSecRateProtection:AppSecRateProtection":
		r = &AppSecRateProtection{}
	case "akamai:index/appSecReputationProfile:AppSecReputationProfile":
		r = &AppSecReputationProfile{}
	case "akamai:index/appSecReputationProfileAction:AppSecReputationProfileAction":
		r = &AppSecReputationProfileAction{}
	case "akamai:index/appSecReputationProfileAnalysis:AppSecReputationProfileAnalysis":
		r = &AppSecReputationProfileAnalysis{}
	case "akamai:index/appSecReputationProtection:AppSecReputationProtection":
		r = &AppSecReputationProtection{}
	case "akamai:index/appSecRule:AppSecRule":
		r = &AppSecRule{}
	case "akamai:index/appSecRuleUpgrade:AppSecRuleUpgrade":
		r = &AppSecRuleUpgrade{}
	case "akamai:index/appSecSecurityPolicy:AppSecSecurityPolicy":
		r = &AppSecSecurityPolicy{}
	case "akamai:index/appSecSecurityPolicyRename:AppSecSecurityPolicyRename":
		r = &AppSecSecurityPolicyRename{}
	case "akamai:index/appSecSiemSettings:AppSecSiemSettings":
		r = &AppSecSiemSettings{}
	case "akamai:index/appSecSlowPost:AppSecSlowPost":
		r = &AppSecSlowPost{}
	case "akamai:index/appSecSlowPostProtection:AppSecSlowPostProtection":
		r = &AppSecSlowPostProtection{}
	case "akamai:index/appSecThreatIntel:AppSecThreatIntel":
		r = &AppSecThreatIntel{}
	case "akamai:index/appSecVersionNodes:AppSecVersionNodes":
		r = &AppSecVersionNodes{}
	case "akamai:index/appSecWafMode:AppSecWafMode":
		r = &AppSecWafMode{}
	case "akamai:index/appSecWafProtection:AppSecWafProtection":
		r = &AppSecWafProtection{}
	case "akamai:index/appsecAapSelectedHostnames:AppsecAapSelectedHostnames":
		r = &AppsecAapSelectedHostnames{}
	case "akamai:index/appsecAdvancedSettingsAttackPayloadLogging:AppsecAdvancedSettingsAttackPayloadLogging":
		r = &AppsecAdvancedSettingsAttackPayloadLogging{}
	case "akamai:index/appsecAdvancedSettingsPiiLearning:AppsecAdvancedSettingsPiiLearning":
		r = &AppsecAdvancedSettingsPiiLearning{}
	case "akamai:index/appsecAdvancedSettingsRequestBody:AppsecAdvancedSettingsRequestBody":
		r = &AppsecAdvancedSettingsRequestBody{}
	case "akamai:index/appsecEvalPenaltyBoxConditions:AppsecEvalPenaltyBoxConditions":
		r = &AppsecEvalPenaltyBoxConditions{}
	case "akamai:index/appsecPenaltyBoxConditions:AppsecPenaltyBoxConditions":
		r = &AppsecPenaltyBoxConditions{}
	case "akamai:index/appsecRapidRules:AppsecRapidRules":
		r = &AppsecRapidRules{}
	case "akamai:index/appsecSecurityPolicyDefaultProtections:AppsecSecurityPolicyDefaultProtections":
		r = &AppsecSecurityPolicyDefaultProtections{}
	case "akamai:index/botmanAkamaiBotCategoryAction:BotmanAkamaiBotCategoryAction":
		r = &BotmanAkamaiBotCategoryAction{}
	case "akamai:index/botmanBotAnalyticsCookie:BotmanBotAnalyticsCookie":
		r = &BotmanBotAnalyticsCookie{}
	case "akamai:index/botmanBotCategoryException:BotmanBotCategoryException":
		r = &BotmanBotCategoryException{}
	case "akamai:index/botmanBotDetectionAction:BotmanBotDetectionAction":
		r = &BotmanBotDetectionAction{}
	case "akamai:index/botmanBotManagementSettings:BotmanBotManagementSettings":
		r = &BotmanBotManagementSettings{}
	case "akamai:index/botmanChallengeAction:BotmanChallengeAction":
		r = &BotmanChallengeAction{}
	case "akamai:index/botmanChallengeInjectionRules:BotmanChallengeInjectionRules":
		r = &BotmanChallengeInjectionRules{}
	case "akamai:index/botmanClientSideSecurity:BotmanClientSideSecurity":
		r = &BotmanClientSideSecurity{}
	case "akamai:index/botmanConditionalAction:BotmanConditionalAction":
		r = &BotmanConditionalAction{}
	case "akamai:index/botmanContentProtectionJavascriptInjectionRule:BotmanContentProtectionJavascriptInjectionRule":
		r = &BotmanContentProtectionJavascriptInjectionRule{}
	case "akamai:index/botmanContentProtectionRule:BotmanContentProtectionRule":
		r = &BotmanContentProtectionRule{}
	case "akamai:index/botmanContentProtectionRuleSequence:BotmanContentProtectionRuleSequence":
		r = &BotmanContentProtectionRuleSequence{}
	case "akamai:index/botmanCustomBotCategory:BotmanCustomBotCategory":
		r = &BotmanCustomBotCategory{}
	case "akamai:index/botmanCustomBotCategoryAction:BotmanCustomBotCategoryAction":
		r = &BotmanCustomBotCategoryAction{}
	case "akamai:index/botmanCustomBotCategoryItemSequence:BotmanCustomBotCategoryItemSequence":
		r = &BotmanCustomBotCategoryItemSequence{}
	case "akamai:index/botmanCustomBotCategorySequence:BotmanCustomBotCategorySequence":
		r = &BotmanCustomBotCategorySequence{}
	case "akamai:index/botmanCustomClient:BotmanCustomClient":
		r = &BotmanCustomClient{}
	case "akamai:index/botmanCustomClientSequence:BotmanCustomClientSequence":
		r = &BotmanCustomClientSequence{}
	case "akamai:index/botmanCustomCode:BotmanCustomCode":
		r = &BotmanCustomCode{}
	case "akamai:index/botmanCustomDefinedBot:BotmanCustomDefinedBot":
		r = &BotmanCustomDefinedBot{}
	case "akamai:index/botmanCustomDenyAction:BotmanCustomDenyAction":
		r = &BotmanCustomDenyAction{}
	case "akamai:index/botmanJavascriptInjection:BotmanJavascriptInjection":
		r = &BotmanJavascriptInjection{}
	case "akamai:index/botmanRecategorizedAkamaiDefinedBot:BotmanRecategorizedAkamaiDefinedBot":
		r = &BotmanRecategorizedAkamaiDefinedBot{}
	case "akamai:index/botmanServeAlternateAction:BotmanServeAlternateAction":
		r = &BotmanServeAlternateAction{}
	case "akamai:index/botmanTransactionalEndpoint:BotmanTransactionalEndpoint":
		r = &BotmanTransactionalEndpoint{}
	case "akamai:index/botmanTransactionalEndpointProtection:BotmanTransactionalEndpointProtection":
		r = &BotmanTransactionalEndpointProtection{}
	case "akamai:index/clientlistActivation:ClientlistActivation":
		r = &ClientlistActivation{}
	case "akamai:index/clientlistList:ClientlistList":
		r = &ClientlistList{}
	case "akamai:index/cloudAccessKey:CloudAccessKey":
		r = &CloudAccessKey{}
	case "akamai:index/cloudletsApplicationLoadBalancer:CloudletsApplicationLoadBalancer":
		r = &CloudletsApplicationLoadBalancer{}
	case "akamai:index/cloudletsApplicationLoadBalancerActivation:CloudletsApplicationLoadBalancerActivation":
		r = &CloudletsApplicationLoadBalancerActivation{}
	case "akamai:index/cloudletsPolicy:CloudletsPolicy":
		r = &CloudletsPolicy{}
	case "akamai:index/cloudletsPolicyActivation:CloudletsPolicyActivation":
		r = &CloudletsPolicyActivation{}
	case "akamai:index/cloudwrapperActivation:CloudwrapperActivation":
		r = &CloudwrapperActivation{}
	case "akamai:index/cloudwrapperConfiguration:CloudwrapperConfiguration":
		r = &CloudwrapperConfiguration{}
	case "akamai:index/cpCode:CpCode":
		r = &CpCode{}
	case "akamai:index/cpsDvEnrollment:CpsDvEnrollment":
		r = &CpsDvEnrollment{}
	case "akamai:index/cpsDvValidation:CpsDvValidation":
		r = &CpsDvValidation{}
	case "akamai:index/cpsThirdPartyEnrollment:CpsThirdPartyEnrollment":
		r = &CpsThirdPartyEnrollment{}
	case "akamai:index/cpsUploadCertificate:CpsUploadCertificate":
		r = &CpsUploadCertificate{}
	case "akamai:index/datastream:Datastream":
		r = &Datastream{}
	case "akamai:index/dnsRecord:DnsRecord":
		r = &DnsRecord{}
	case "akamai:index/dnsZone:DnsZone":
		r = &DnsZone{}
	case "akamai:index/edgeHostName:EdgeHostName":
		r = &EdgeHostName{}
	case "akamai:index/edgeKv:EdgeKv":
		r = &EdgeKv{}
	case "akamai:index/edgeWorker:EdgeWorker":
		r = &EdgeWorker{}
	case "akamai:index/edgeWorkersActivation:EdgeWorkersActivation":
		r = &EdgeWorkersActivation{}
	case "akamai:index/edgekvGroupItems:EdgekvGroupItems":
		r = &EdgekvGroupItems{}
	case "akamai:index/gtmAsmap:GtmAsmap":
		r = &GtmAsmap{}
	case "akamai:index/gtmCidrmap:GtmCidrmap":
		r = &GtmCidrmap{}
	case "akamai:index/gtmDatacenter:GtmDatacenter":
		r = &GtmDatacenter{}
	case "akamai:index/gtmDomain:GtmDomain":
		r = &GtmDomain{}
	case "akamai:index/gtmGeomap:GtmGeomap":
		r = &GtmGeomap{}
	case "akamai:index/gtmProperty:GtmProperty":
		r = &GtmProperty{}
	case "akamai:index/gtmResource:GtmResource":
		r = &GtmResource{}
	case "akamai:index/iamApiClient:IamApiClient":
		r = &IamApiClient{}
	case "akamai:index/iamBlockedUserProperties:IamBlockedUserProperties":
		r = &IamBlockedUserProperties{}
	case "akamai:index/iamCidrBlock:IamCidrBlock":
		r = &IamCidrBlock{}
	case "akamai:index/iamGroup:IamGroup":
		r = &IamGroup{}
	case "akamai:index/iamIpAllowlist:IamIpAllowlist":
		r = &IamIpAllowlist{}
	case "akamai:index/iamRole:IamRole":
		r = &IamRole{}
	case "akamai:index/iamUser:IamUser":
		r = &IamUser{}
	case "akamai:index/imagingPolicyImage:ImagingPolicyImage":
		r = &ImagingPolicyImage{}
	case "akamai:index/imagingPolicySet:ImagingPolicySet":
		r = &ImagingPolicySet{}
	case "akamai:index/imagingPolicyVideo:ImagingPolicyVideo":
		r = &ImagingPolicyVideo{}
	case "akamai:index/networkList:NetworkList":
		r = &NetworkList{}
	case "akamai:index/networkListActivations:NetworkListActivations":
		r = &NetworkListActivations{}
	case "akamai:index/networkListDescription:NetworkListDescription":
		r = &NetworkListDescription{}
	case "akamai:index/networkListSubscription:NetworkListSubscription":
		r = &NetworkListSubscription{}
	case "akamai:index/property:Property":
		r = &Property{}
	case "akamai:index/propertyActivation:PropertyActivation":
		r = &PropertyActivation{}
	case "akamai:index/propertyBootstrap:PropertyBootstrap":
		r = &PropertyBootstrap{}
	case "akamai:index/propertyHostnameBucket:PropertyHostnameBucket":
		r = &PropertyHostnameBucket{}
	case "akamai:index/propertyInclude:PropertyInclude":
		r = &PropertyInclude{}
	case "akamai:index/propertyIncludeActivation:PropertyIncludeActivation":
		r = &PropertyIncludeActivation{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

type pkg struct {
	version semver.Version
}

func (p *pkg) Version() semver.Version {
	return p.version
}

func (p *pkg) ConstructProvider(ctx *pulumi.Context, name, typ, urn string) (pulumi.ProviderResource, error) {
	if typ != "pulumi:providers:akamai" {
		return nil, fmt.Errorf("unknown provider type: %s", typ)
	}

	r := &Provider{}
	err := ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return r, err
}

func init() {
	version, err := internal.PkgVersion()
	if err != nil {
		version = semver.Version{Major: 1}
	}
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecActivations",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecAdvancedSettingsEvasivePathMatch",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecAdvancedSettingsLogging",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecAdvancedSettingsPragmaHeader",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecAdvancedSettingsPrefetch",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecApiConstraintsProtection",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecApiRequestConstraints",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecAttackGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecByPassNetworkList",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecConfiguration",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecConfigurationRename",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecCustomDeny",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecCustomRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecCustomRuleAction",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecEval",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecEvalGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecEvalPenaltyBox",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecEvalRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecIPGeo",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecIPGeoProtection",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecMalwarePolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecMalwarePolicyAction",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecMalwarePolicyActions",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecMalwareProtection",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecMatchTarget",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecMatchTargetSequence",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecPenaltyBox",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecRatePolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecRatePolicyAction",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecRateProtection",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecReputationProfile",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecReputationProfileAction",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecReputationProfileAnalysis",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecReputationProtection",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecRuleUpgrade",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecSecurityPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecSecurityPolicyRename",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecSiemSettings",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecSlowPost",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecSlowPostProtection",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecThreatIntel",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecVersionNodes",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecWafMode",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appSecWafProtection",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appsecAapSelectedHostnames",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appsecAdvancedSettingsAttackPayloadLogging",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appsecAdvancedSettingsPiiLearning",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appsecAdvancedSettingsRequestBody",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appsecEvalPenaltyBoxConditions",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appsecPenaltyBoxConditions",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appsecRapidRules",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/appsecSecurityPolicyDefaultProtections",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/botmanAkamaiBotCategoryAction",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/botmanBotAnalyticsCookie",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/botmanBotCategoryException",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/botmanBotDetectionAction",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/botmanBotManagementSettings",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/botmanChallengeAction",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/botmanChallengeInjectionRules",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/botmanClientSideSecurity",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/botmanConditionalAction",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/botmanContentProtectionJavascriptInjectionRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/botmanContentProtectionRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/botmanContentProtectionRuleSequence",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/botmanCustomBotCategory",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/botmanCustomBotCategoryAction",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/botmanCustomBotCategoryItemSequence",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/botmanCustomBotCategorySequence",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/botmanCustomClient",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/botmanCustomClientSequence",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/botmanCustomCode",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/botmanCustomDefinedBot",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/botmanCustomDenyAction",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/botmanJavascriptInjection",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/botmanRecategorizedAkamaiDefinedBot",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/botmanServeAlternateAction",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/botmanTransactionalEndpoint",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/botmanTransactionalEndpointProtection",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/clientlistActivation",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/clientlistList",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/cloudAccessKey",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/cloudletsApplicationLoadBalancer",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/cloudletsApplicationLoadBalancerActivation",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/cloudletsPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/cloudletsPolicyActivation",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/cloudwrapperActivation",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/cloudwrapperConfiguration",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/cpCode",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/cpsDvEnrollment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/cpsDvValidation",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/cpsThirdPartyEnrollment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/cpsUploadCertificate",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/datastream",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/dnsRecord",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/dnsZone",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/edgeHostName",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/edgeKv",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/edgeWorker",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/edgeWorkersActivation",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/edgekvGroupItems",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/gtmAsmap",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/gtmCidrmap",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/gtmDatacenter",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/gtmDomain",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/gtmGeomap",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/gtmProperty",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/gtmResource",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/iamApiClient",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/iamBlockedUserProperties",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/iamCidrBlock",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/iamGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/iamIpAllowlist",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/iamRole",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/iamUser",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/imagingPolicyImage",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/imagingPolicySet",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/imagingPolicyVideo",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/networkList",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/networkListActivations",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/networkListDescription",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/networkListSubscription",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/property",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/propertyActivation",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/propertyBootstrap",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/propertyHostnameBucket",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/propertyInclude",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"akamai",
		"index/propertyIncludeActivation",
		&module{version},
	)
	pulumi.RegisterResourcePackage(
		"akamai",
		&pkg{version},
	)
}
