module github.com/pulumi/pulumi-akamai/provider

go 1.15

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/akamai/terraform-provider-akamai/v2 => github.com/pulumi/terraform-provider-akamai/v2 v2.0.0-20201230152346-7950a81711af
	github.com/hashicorp/go-getter v1.5.0 => github.com/hashicorp/go-getter v1.4.0
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20201218231525-9cca98608a5e
)

require (
	github.com/akamai/terraform-provider-akamai/v2 v2.0.0-20201210190102-1d221ddd12c3
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.21.0
	github.com/pulumi/pulumi/sdk/v2 v2.22.1-0.20210310211618-1f16423ede4c
)
