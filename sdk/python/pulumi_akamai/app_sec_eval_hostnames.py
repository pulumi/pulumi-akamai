# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['AppSecEvalHostnamesArgs', 'AppSecEvalHostnames']

@pulumi.input_type
class AppSecEvalHostnamesArgs:
    def __init__(__self__, *,
                 config_id: pulumi.Input[int],
                 hostnames: pulumi.Input[Sequence[pulumi.Input[str]]],
                 version: pulumi.Input[int]):
        """
        The set of arguments for constructing a AppSecEvalHostnames resource.
        :param pulumi.Input[int] config_id: The ID of the security configuration to use.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] hostnames: A list of evaluation hostnames to be used for the specified configuration version.
        :param pulumi.Input[int] version: The version number of the security configuration to use.
        """
        pulumi.set(__self__, "config_id", config_id)
        pulumi.set(__self__, "hostnames", hostnames)
        pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> pulumi.Input[int]:
        """
        The ID of the security configuration to use.
        """
        return pulumi.get(self, "config_id")

    @config_id.setter
    def config_id(self, value: pulumi.Input[int]):
        pulumi.set(self, "config_id", value)

    @property
    @pulumi.getter
    def hostnames(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        A list of evaluation hostnames to be used for the specified configuration version.
        """
        return pulumi.get(self, "hostnames")

    @hostnames.setter
    def hostnames(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "hostnames", value)

    @property
    @pulumi.getter
    def version(self) -> pulumi.Input[int]:
        """
        The version number of the security configuration to use.
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: pulumi.Input[int]):
        pulumi.set(self, "version", value)


@pulumi.input_type
class _AppSecEvalHostnamesState:
    def __init__(__self__, *,
                 config_id: Optional[pulumi.Input[int]] = None,
                 hostnames: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 version: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering AppSecEvalHostnames resources.
        :param pulumi.Input[int] config_id: The ID of the security configuration to use.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] hostnames: A list of evaluation hostnames to be used for the specified configuration version.
        :param pulumi.Input[int] version: The version number of the security configuration to use.
        """
        if config_id is not None:
            pulumi.set(__self__, "config_id", config_id)
        if hostnames is not None:
            pulumi.set(__self__, "hostnames", hostnames)
        if version is not None:
            pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> Optional[pulumi.Input[int]]:
        """
        The ID of the security configuration to use.
        """
        return pulumi.get(self, "config_id")

    @config_id.setter
    def config_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "config_id", value)

    @property
    @pulumi.getter
    def hostnames(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of evaluation hostnames to be used for the specified configuration version.
        """
        return pulumi.get(self, "hostnames")

    @hostnames.setter
    def hostnames(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "hostnames", value)

    @property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[int]]:
        """
        The version number of the security configuration to use.
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "version", value)


class AppSecEvalHostnames(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config_id: Optional[pulumi.Input[int]] = None,
                 hostnames: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 version: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        The `resource_akamai_appsec_eval_hostnames` resource allows you to update the list of hostnames you want to evaluate for a configuration version.

        ## Example Usage

        Basic usage:

        ```python
        import pulumi
        import pulumi_akamai as akamai

        configuration = akamai.get_app_sec_configuration(name=var["security_configuration"])
        # USE CASE: user wants to specify the hostnames to evaluate
        eval_hostnames = akamai.AppSecEvalHostnames("evalHostnames",
            config_id=configuration.config_id,
            version=configuration.latest_version,
            hostnames=var["hostnames"])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] config_id: The ID of the security configuration to use.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] hostnames: A list of evaluation hostnames to be used for the specified configuration version.
        :param pulumi.Input[int] version: The version number of the security configuration to use.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AppSecEvalHostnamesArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        The `resource_akamai_appsec_eval_hostnames` resource allows you to update the list of hostnames you want to evaluate for a configuration version.

        ## Example Usage

        Basic usage:

        ```python
        import pulumi
        import pulumi_akamai as akamai

        configuration = akamai.get_app_sec_configuration(name=var["security_configuration"])
        # USE CASE: user wants to specify the hostnames to evaluate
        eval_hostnames = akamai.AppSecEvalHostnames("evalHostnames",
            config_id=configuration.config_id,
            version=configuration.latest_version,
            hostnames=var["hostnames"])
        ```

        :param str resource_name: The name of the resource.
        :param AppSecEvalHostnamesArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AppSecEvalHostnamesArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config_id: Optional[pulumi.Input[int]] = None,
                 hostnames: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 version: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AppSecEvalHostnamesArgs.__new__(AppSecEvalHostnamesArgs)

            if config_id is None and not opts.urn:
                raise TypeError("Missing required property 'config_id'")
            __props__.__dict__["config_id"] = config_id
            if hostnames is None and not opts.urn:
                raise TypeError("Missing required property 'hostnames'")
            __props__.__dict__["hostnames"] = hostnames
            if version is None and not opts.urn:
                raise TypeError("Missing required property 'version'")
            __props__.__dict__["version"] = version
        super(AppSecEvalHostnames, __self__).__init__(
            'akamai:index/appSecEvalHostnames:AppSecEvalHostnames',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            config_id: Optional[pulumi.Input[int]] = None,
            hostnames: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            version: Optional[pulumi.Input[int]] = None) -> 'AppSecEvalHostnames':
        """
        Get an existing AppSecEvalHostnames resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] config_id: The ID of the security configuration to use.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] hostnames: A list of evaluation hostnames to be used for the specified configuration version.
        :param pulumi.Input[int] version: The version number of the security configuration to use.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AppSecEvalHostnamesState.__new__(_AppSecEvalHostnamesState)

        __props__.__dict__["config_id"] = config_id
        __props__.__dict__["hostnames"] = hostnames
        __props__.__dict__["version"] = version
        return AppSecEvalHostnames(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> pulumi.Output[int]:
        """
        The ID of the security configuration to use.
        """
        return pulumi.get(self, "config_id")

    @property
    @pulumi.getter
    def hostnames(self) -> pulumi.Output[Sequence[str]]:
        """
        A list of evaluation hostnames to be used for the specified configuration version.
        """
        return pulumi.get(self, "hostnames")

    @property
    @pulumi.getter
    def version(self) -> pulumi.Output[int]:
        """
        The version number of the security configuration to use.
        """
        return pulumi.get(self, "version")

