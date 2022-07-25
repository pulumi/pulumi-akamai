# Akamai Resource Provider

The Akamai Resource Provider lets you manage Akamai resources.

## Installing

This package is available in many languages in the standard packaging formats.

### Node.js (Java/TypeScript)

To use from JavaScript or TypeScript in Node.js, install using either `npm`:

    $ npm install @pulumi/akamai

or `yarn`:

    $ yarn add @pulumi/akamai

### Python

To use from Python, install using `pip`:

    $ pip install pulumi_akamai

### Go

To use from Go, use `go get` to grab the latest version of the library

    $ go get github.com/pulumi/pulumi-akamai/sdk/v3

### .NET

To use from .NET, install using `dotnet add package`:

    $ dotnet add package Pulumi.Akamai

## Configuration

The following configuration options are available

* `akamai:edgerc` - (Optional) The location of the `.edgerc` file containing credentials. Default: `$HOME/.edgerc`.
* `akamai:propertySection` - (Optional) The credential section to use for the Property Manager API (PAPI). Default `default`.
* `akamai:dnsSection` - (Optional) The credential section to use for the Config DNS API. Default `default`.
* `akamai:gtmSection` - (Optional) The credential section to use for the Config GTM API. Default `default`.

You can also specify credential values using environment variables. Environment variables take precedence over the contents of the `.edgerc` file.

Create environment variables in the format:

`AKAMAI{_SECTION_NAME}_*`

For example, if you specify `akamak:propertySection papi` you would set the following ENV variables:

* AKAMAI_PAPI_HOST
* AKAMAI_PAPI_ACCESS_TOKEN
* AKAMAI_PAPI_CLIENT_TOKEN
* AKAMAI_PAPI_CLIENT_SECRET
* AKAMAI_PAPI_MAX_BODY (optional)

If the section name is `default`, you can omit it, instead using:

* AKAMAI_HOST
* AKAMAI_ACCESS_TOKEN
* AKAMAI_CLIENT_TOKEN
* AKAMAI_CLIENT_SECRET
* AKAMAI_MAX_BODY (optional)

## Reference

For further information, please visit [the Akamai provider docs](https://www.pulumi.com/docs/intro/cloud-providers/akamai)
or for detailed reference documentation, please visit [the API docs](https://www.pulumi.com/docs/reference/pkg/akamai).
