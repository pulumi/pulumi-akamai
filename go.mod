module github.com/pulumi/pulumi-akamai

go 1.13

replace github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible

require (
	github.com/frankban/quicktest v1.4.1 // indirect
	github.com/hashicorp/golang-lru v0.5.3 // indirect
	github.com/hashicorp/terraform v0.12.9 // indirect
	github.com/hashicorp/terraform-plugin-sdk v1.4.1
	github.com/hashicorp/vault/api v1.0.5-0.20190909201928-35325e2c3262 // indirect
	github.com/pierrec/lz4 v2.2.6+incompatible // indirect
	github.com/pulumi/pulumi v1.8.0
	github.com/pulumi/pulumi-terraform-bridge v1.5.2
	github.com/stretchr/testify v1.4.1-0.20191106224347-f1bd0923b832
	github.com/terraform-providers/terraform-provider-akamai v0.5.0
	golang.org/x/sys v0.0.0-20190813064441-fde4db37ae7a // indirect
)
