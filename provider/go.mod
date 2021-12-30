module github.com/pulumi/pulumi-akamai/provider/v2

go 1.16

replace (
	github.com/akamai/terraform-provider-akamai/v2 => github.com/pulumi/terraform-provider-akamai/v2 v2.0.0-20211229175952-f694d05c6b46
	github.com/hashicorp/go-getter v1.5.0 => github.com/hashicorp/go-getter v1.4.0
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20211019194827-62530c6537a4
)

require (
	github.com/akamai/terraform-provider-akamai/v2 v2.0.0-20201210190102-1d221ddd12c3
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.11.0
	github.com/pulumi/pulumi/sdk/v3 v3.17.0
)
