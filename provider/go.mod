module github.com/pulumi/pulumi-akamai/provider

go 1.14

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/terraform-providers/terraform-provider-akamai => github.com/pulumi/terraform-provider-akamai v0.5.1-0.20200812184902-9e3306933a24
)

require (
	github.com/hashicorp/terraform-plugin-sdk v1.11.0
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.7.4
	github.com/pulumi/pulumi/sdk/v2 v2.9.2-0.20200828155502-7eb99fe7bb15
	github.com/terraform-providers/terraform-provider-akamai v0.8.1
)
