# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['AppSecSlowPostProtectionArgs', 'AppSecSlowPostProtection']

@pulumi.input_type
class AppSecSlowPostProtectionArgs:
    def __init__(__self__, *,
                 config_id: pulumi.Input[int],
                 enabled: pulumi.Input[bool],
                 security_policy_id: pulumi.Input[str],
                 version: pulumi.Input[int]):
        """
        The set of arguments for constructing a AppSecSlowPostProtection resource.
        :param pulumi.Input[int] config_id: The ID of the security configuration to use.
        :param pulumi.Input[bool] enabled: Whether to enable slowpost controls: either `true` or `false`.
        :param pulumi.Input[str] security_policy_id: The ID of the security policy to use.
        :param pulumi.Input[int] version: The version number of the security configuration to use.
        """
        pulumi.set(__self__, "config_id", config_id)
        pulumi.set(__self__, "enabled", enabled)
        pulumi.set(__self__, "security_policy_id", security_policy_id)
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
    def enabled(self) -> pulumi.Input[bool]:
        """
        Whether to enable slowpost controls: either `true` or `false`.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: pulumi.Input[bool]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="securityPolicyId")
    def security_policy_id(self) -> pulumi.Input[str]:
        """
        The ID of the security policy to use.
        """
        return pulumi.get(self, "security_policy_id")

    @security_policy_id.setter
    def security_policy_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "security_policy_id", value)

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
class _AppSecSlowPostProtectionState:
    def __init__(__self__, *,
                 config_id: Optional[pulumi.Input[int]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 output_text: Optional[pulumi.Input[str]] = None,
                 security_policy_id: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering AppSecSlowPostProtection resources.
        :param pulumi.Input[int] config_id: The ID of the security configuration to use.
        :param pulumi.Input[bool] enabled: Whether to enable slowpost controls: either `true` or `false`.
        :param pulumi.Input[str] output_text: A tabular display showing the current protection settings.
        :param pulumi.Input[str] security_policy_id: The ID of the security policy to use.
        :param pulumi.Input[int] version: The version number of the security configuration to use.
        """
        if config_id is not None:
            pulumi.set(__self__, "config_id", config_id)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if output_text is not None:
            pulumi.set(__self__, "output_text", output_text)
        if security_policy_id is not None:
            pulumi.set(__self__, "security_policy_id", security_policy_id)
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
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to enable slowpost controls: either `true` or `false`.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="outputText")
    def output_text(self) -> Optional[pulumi.Input[str]]:
        """
        A tabular display showing the current protection settings.
        """
        return pulumi.get(self, "output_text")

    @output_text.setter
    def output_text(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "output_text", value)

    @property
    @pulumi.getter(name="securityPolicyId")
    def security_policy_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the security policy to use.
        """
        return pulumi.get(self, "security_policy_id")

    @security_policy_id.setter
    def security_policy_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "security_policy_id", value)

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


class AppSecSlowPostProtection(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config_id: Optional[pulumi.Input[int]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 security_policy_id: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Use the `AppSecSlowPostProtection` resource to enable or disable slowpost protection for a given configuration version and security policy.

        ## Example Usage

        Basic usage:

        ```python
        import pulumi
        import pulumi_akamai as akamai

        configuration = akamai.get_app_sec_configuration(name=var["security_configuration"])
        protection = akamai.AppSecSlowPostProtection("protection",
            config_id=configuration.config_id,
            version=configuration.latest_version,
            security_policy_id=var["security_policy_id"],
            enabled=var["enabled"])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] config_id: The ID of the security configuration to use.
        :param pulumi.Input[bool] enabled: Whether to enable slowpost controls: either `true` or `false`.
        :param pulumi.Input[str] security_policy_id: The ID of the security policy to use.
        :param pulumi.Input[int] version: The version number of the security configuration to use.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AppSecSlowPostProtectionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Use the `AppSecSlowPostProtection` resource to enable or disable slowpost protection for a given configuration version and security policy.

        ## Example Usage

        Basic usage:

        ```python
        import pulumi
        import pulumi_akamai as akamai

        configuration = akamai.get_app_sec_configuration(name=var["security_configuration"])
        protection = akamai.AppSecSlowPostProtection("protection",
            config_id=configuration.config_id,
            version=configuration.latest_version,
            security_policy_id=var["security_policy_id"],
            enabled=var["enabled"])
        ```

        :param str resource_name: The name of the resource.
        :param AppSecSlowPostProtectionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AppSecSlowPostProtectionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config_id: Optional[pulumi.Input[int]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 security_policy_id: Optional[pulumi.Input[str]] = None,
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
            __props__ = AppSecSlowPostProtectionArgs.__new__(AppSecSlowPostProtectionArgs)

            if config_id is None and not opts.urn:
                raise TypeError("Missing required property 'config_id'")
            __props__.__dict__["config_id"] = config_id
            if enabled is None and not opts.urn:
                raise TypeError("Missing required property 'enabled'")
            __props__.__dict__["enabled"] = enabled
            if security_policy_id is None and not opts.urn:
                raise TypeError("Missing required property 'security_policy_id'")
            __props__.__dict__["security_policy_id"] = security_policy_id
            if version is None and not opts.urn:
                raise TypeError("Missing required property 'version'")
            __props__.__dict__["version"] = version
            __props__.__dict__["output_text"] = None
        super(AppSecSlowPostProtection, __self__).__init__(
            'akamai:index/appSecSlowPostProtection:AppSecSlowPostProtection',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            config_id: Optional[pulumi.Input[int]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            output_text: Optional[pulumi.Input[str]] = None,
            security_policy_id: Optional[pulumi.Input[str]] = None,
            version: Optional[pulumi.Input[int]] = None) -> 'AppSecSlowPostProtection':
        """
        Get an existing AppSecSlowPostProtection resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] config_id: The ID of the security configuration to use.
        :param pulumi.Input[bool] enabled: Whether to enable slowpost controls: either `true` or `false`.
        :param pulumi.Input[str] output_text: A tabular display showing the current protection settings.
        :param pulumi.Input[str] security_policy_id: The ID of the security policy to use.
        :param pulumi.Input[int] version: The version number of the security configuration to use.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AppSecSlowPostProtectionState.__new__(_AppSecSlowPostProtectionState)

        __props__.__dict__["config_id"] = config_id
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["output_text"] = output_text
        __props__.__dict__["security_policy_id"] = security_policy_id
        __props__.__dict__["version"] = version
        return AppSecSlowPostProtection(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> pulumi.Output[int]:
        """
        The ID of the security configuration to use.
        """
        return pulumi.get(self, "config_id")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[bool]:
        """
        Whether to enable slowpost controls: either `true` or `false`.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="outputText")
    def output_text(self) -> pulumi.Output[str]:
        """
        A tabular display showing the current protection settings.
        """
        return pulumi.get(self, "output_text")

    @property
    @pulumi.getter(name="securityPolicyId")
    def security_policy_id(self) -> pulumi.Output[str]:
        """
        The ID of the security policy to use.
        """
        return pulumi.get(self, "security_policy_id")

    @property
    @pulumi.getter
    def version(self) -> pulumi.Output[int]:
        """
        The version number of the security configuration to use.
        """
        return pulumi.get(self, "version")

