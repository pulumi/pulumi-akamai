module github.com/pulumi/pulumi-akamai

go 1.13

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/terraform-providers/terraform-provider-akamai => github.com/pulumi/terraform-provider-akamai v0.5.1-0.20200410192915-0bd32da98aef
)

require (
	github.com/hashicorp/terraform-plugin-sdk v1.7.0
	github.com/pulumi/pulumi v1.13.1
	github.com/pulumi/pulumi-terraform-bridge v1.8.4
	github.com/terraform-providers/terraform-provider-akamai v0.5.0
)
