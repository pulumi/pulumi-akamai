module github.com/pulumi/pulumi-akamai/provider

go 1.15

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/akamai/terraform-provider-akamai/v2 => github.com/pulumi/terraform-provider-akamai/v2 v2.0.0-20201230152346-7950a81711af
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20200910230100-328eb4ff41df
)

require (
	github.com/akamai/terraform-provider-akamai/v2 v2.0.0-20201210190102-1d221ddd12c3
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.17.0
	github.com/pulumi/pulumi/sdk/v2 v2.16.1
)
