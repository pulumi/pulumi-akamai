# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities

__all__ = ['AppSecAdvancedSettingsPragmaHeaderArgs', 'AppSecAdvancedSettingsPragmaHeader']

@pulumi.input_type
class AppSecAdvancedSettingsPragmaHeaderArgs:
    def __init__(__self__, *,
                 config_id: pulumi.Input[builtins.int],
                 pragma_header: pulumi.Input[builtins.str],
                 security_policy_id: Optional[pulumi.Input[builtins.str]] = None):
        """
        The set of arguments for constructing a AppSecAdvancedSettingsPragmaHeader resource.
        :param pulumi.Input[builtins.int] config_id: Unique identifier of the security configuration
        :param pulumi.Input[builtins.str] pragma_header: JSON-formatted information describing the conditions to exclude from the default remove action
        :param pulumi.Input[builtins.str] security_policy_id: Unique identifier of the security policy
        """
        pulumi.set(__self__, "config_id", config_id)
        pulumi.set(__self__, "pragma_header", pragma_header)
        if security_policy_id is not None:
            pulumi.set(__self__, "security_policy_id", security_policy_id)

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> pulumi.Input[builtins.int]:
        """
        Unique identifier of the security configuration
        """
        return pulumi.get(self, "config_id")

    @config_id.setter
    def config_id(self, value: pulumi.Input[builtins.int]):
        pulumi.set(self, "config_id", value)

    @property
    @pulumi.getter(name="pragmaHeader")
    def pragma_header(self) -> pulumi.Input[builtins.str]:
        """
        JSON-formatted information describing the conditions to exclude from the default remove action
        """
        return pulumi.get(self, "pragma_header")

    @pragma_header.setter
    def pragma_header(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "pragma_header", value)

    @property
    @pulumi.getter(name="securityPolicyId")
    def security_policy_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Unique identifier of the security policy
        """
        return pulumi.get(self, "security_policy_id")

    @security_policy_id.setter
    def security_policy_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "security_policy_id", value)


@pulumi.input_type
class _AppSecAdvancedSettingsPragmaHeaderState:
    def __init__(__self__, *,
                 config_id: Optional[pulumi.Input[builtins.int]] = None,
                 pragma_header: Optional[pulumi.Input[builtins.str]] = None,
                 security_policy_id: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering AppSecAdvancedSettingsPragmaHeader resources.
        :param pulumi.Input[builtins.int] config_id: Unique identifier of the security configuration
        :param pulumi.Input[builtins.str] pragma_header: JSON-formatted information describing the conditions to exclude from the default remove action
        :param pulumi.Input[builtins.str] security_policy_id: Unique identifier of the security policy
        """
        if config_id is not None:
            pulumi.set(__self__, "config_id", config_id)
        if pragma_header is not None:
            pulumi.set(__self__, "pragma_header", pragma_header)
        if security_policy_id is not None:
            pulumi.set(__self__, "security_policy_id", security_policy_id)

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        Unique identifier of the security configuration
        """
        return pulumi.get(self, "config_id")

    @config_id.setter
    def config_id(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "config_id", value)

    @property
    @pulumi.getter(name="pragmaHeader")
    def pragma_header(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        JSON-formatted information describing the conditions to exclude from the default remove action
        """
        return pulumi.get(self, "pragma_header")

    @pragma_header.setter
    def pragma_header(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "pragma_header", value)

    @property
    @pulumi.getter(name="securityPolicyId")
    def security_policy_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Unique identifier of the security policy
        """
        return pulumi.get(self, "security_policy_id")

    @security_policy_id.setter
    def security_policy_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "security_policy_id", value)


@pulumi.type_token("akamai:index/appSecAdvancedSettingsPragmaHeader:AppSecAdvancedSettingsPragmaHeader")
class AppSecAdvancedSettingsPragmaHeader(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config_id: Optional[pulumi.Input[builtins.int]] = None,
                 pragma_header: Optional[pulumi.Input[builtins.str]] = None,
                 security_policy_id: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        Create a AppSecAdvancedSettingsPragmaHeader resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.int] config_id: Unique identifier of the security configuration
        :param pulumi.Input[builtins.str] pragma_header: JSON-formatted information describing the conditions to exclude from the default remove action
        :param pulumi.Input[builtins.str] security_policy_id: Unique identifier of the security policy
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AppSecAdvancedSettingsPragmaHeaderArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a AppSecAdvancedSettingsPragmaHeader resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param AppSecAdvancedSettingsPragmaHeaderArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AppSecAdvancedSettingsPragmaHeaderArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config_id: Optional[pulumi.Input[builtins.int]] = None,
                 pragma_header: Optional[pulumi.Input[builtins.str]] = None,
                 security_policy_id: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AppSecAdvancedSettingsPragmaHeaderArgs.__new__(AppSecAdvancedSettingsPragmaHeaderArgs)

            if config_id is None and not opts.urn:
                raise TypeError("Missing required property 'config_id'")
            __props__.__dict__["config_id"] = config_id
            if pragma_header is None and not opts.urn:
                raise TypeError("Missing required property 'pragma_header'")
            __props__.__dict__["pragma_header"] = pragma_header
            __props__.__dict__["security_policy_id"] = security_policy_id
        super(AppSecAdvancedSettingsPragmaHeader, __self__).__init__(
            'akamai:index/appSecAdvancedSettingsPragmaHeader:AppSecAdvancedSettingsPragmaHeader',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            config_id: Optional[pulumi.Input[builtins.int]] = None,
            pragma_header: Optional[pulumi.Input[builtins.str]] = None,
            security_policy_id: Optional[pulumi.Input[builtins.str]] = None) -> 'AppSecAdvancedSettingsPragmaHeader':
        """
        Get an existing AppSecAdvancedSettingsPragmaHeader resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.int] config_id: Unique identifier of the security configuration
        :param pulumi.Input[builtins.str] pragma_header: JSON-formatted information describing the conditions to exclude from the default remove action
        :param pulumi.Input[builtins.str] security_policy_id: Unique identifier of the security policy
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AppSecAdvancedSettingsPragmaHeaderState.__new__(_AppSecAdvancedSettingsPragmaHeaderState)

        __props__.__dict__["config_id"] = config_id
        __props__.__dict__["pragma_header"] = pragma_header
        __props__.__dict__["security_policy_id"] = security_policy_id
        return AppSecAdvancedSettingsPragmaHeader(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> pulumi.Output[builtins.int]:
        """
        Unique identifier of the security configuration
        """
        return pulumi.get(self, "config_id")

    @property
    @pulumi.getter(name="pragmaHeader")
    def pragma_header(self) -> pulumi.Output[builtins.str]:
        """
        JSON-formatted information describing the conditions to exclude from the default remove action
        """
        return pulumi.get(self, "pragma_header")

    @property
    @pulumi.getter(name="securityPolicyId")
    def security_policy_id(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        Unique identifier of the security policy
        """
        return pulumi.get(self, "security_policy_id")

