CHANGELOG
=========

## HEAD (Unreleased)
_(none)_

---

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
