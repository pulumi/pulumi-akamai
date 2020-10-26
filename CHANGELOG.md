CHANGELOG
=========

## HEAD (Unreleased)
_(none)_

---

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
