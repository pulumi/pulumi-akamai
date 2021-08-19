CHANGELOG
=========

## HEAD (Unreleased)
* Upgrade to v1.6.1 of the Akamai Terraform Provider
  ** PLEASE NOTE:**  
  There are a number of breaking changes to this provider due to removal of the following services upstream:
  * `akamai.AppSecAttackGroupAction`
  * `akamai.AppSecAttackGroupConditionException`
  * `akamai.AppSecConfigurationClone`
  * `akamai.AppSecConfigurationVersionClone`
  * `akamai.AppSecEvalRuleAction`
  * `akamai.AppSecEvalRuleConditionException`
  * `akamai.AppSecRuleAction`
  * `akamai.AppSecRuleConditionException`
  * `akamai.AppSecSecurityPolicyClone`
  * `akamai.AppSecSecurityPolicyProtections`
  * `akamai.getAppSecAttackGroupActions`
  * `akamai.getAppSecAttackGroupConditionException`
  * `akamai.getAppSecEvalRuleActions`
  * `akamai.getAppSecEvalRuleConditionException`
  * `akamai.getAppSecRuleActions`
  * `akamai.getAppSecRuleConditionException`
  * Configuration version numbers are no longer supported for most data sources and resources

---

## 2.2.0 (2021-05-27)
* Upgrade to v3.2.1 of the pulumi-terraform-bridge

## 2.1.0 (2021-04-30)
* Upgrade to v1.5.1 of the Akamai Terraform Provider

## 2.0.1 (2021-04-20)
* Fix ldflags problem when building in release pipeline

## 2.0.0 (2021-04-19)
* Depend on Pulumi 3.0, which includes improvements to Python resource arguments and key translation, Go SDK performance,
  Node SDK performance, general availability of Automation API, and more.

## 1.3.0 (2021-04-12)
* Upgrade to pulumi-terraform-bridge v2.23.0

## 1.2.1 (2021-03-23)
* Upgrade to pulumi-terraform-bridge v2.22.1  
  **Please Note:** This includes a bug fix to the refresh operation regarding arrays

## 1.2.0 (2021-03-15)
* Upgrade to pulumi-terraform-bridge v2.21.0
* Release macOS arm64 binary

## 1.1.1 (2021-02-16)
* Upgrade to pulumi-terraform-bridge v2.19.0  
  **Please Note:** This includes a bug fix that stops mutating resources options in the nodejs provider

## 1.1.0 (2021-02-01)
* Update to pulumi-terraform-bridge v2.18.1

## 1.0.0 (2020-12-30)
* Upgrade to v1.0.0 of the Akamai Terraform Provider  
  ** PLEASE NOTE:**  
  There are a number of breaking changes to this provider:
  * `akamai.PropertyActivation` `activate` has been removed and `version` is now required
  * `akamai.PropertyRules` has been removed.
  * `akamai.CpCode` no longer auto-imports on create if an existing code has been found.
  * `akamai.EdgeHostName` `ipv4` and `ipv6` have been removed. This has been replaced by `ipBehavior`.
  * `akamai.Property` `cpCode`, `origin` `variables`, `isSecure` and `contact` have been deprecated. 
  You can find the full migration guide [here](https://github.com/akamai/terraform-provider-akamai/blob/master/docs/guides/1.0_migration.md)

## 0.2.0 (2020-10-26)
* Upgrade to Pulumi v2.12.0 and pulumi-terraform-bridge v2.11.0
* Improving the accuracy of previews leading to a more accurate understanding of what will actually change rather than assuming all output properties will change.  
  ** PLEASE NOTE:**  
  This new preview functionality can be disabled by setting `PULUMI_DISABLE_PROVIDER_PREVIEW` to `1` or `false`.

## 0.1.0 (2020-08-31)
* Upgrade to pulumi-terraform-bridge v2.7.3
* Upgrade to Pulumi v2.9.0, which adds type annotations and input/output classes to Python

## 0.0.2 (2020-08-13)
* Ensure package names are consistent across the SDKs

## 0.0.1 (2020-08-13)
* Initial creation of the provider against v0.8.1 of the Akamai Terraform Provider
