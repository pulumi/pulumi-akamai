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

__all__ = ['AppSecAdvancedSettingsEvasivePathMatchArgs', 'AppSecAdvancedSettingsEvasivePathMatch']

@pulumi.input_type
class AppSecAdvancedSettingsEvasivePathMatchArgs:
    def __init__(__self__, *,
                 config_id: pulumi.Input[builtins.int],
                 enable_path_match: pulumi.Input[builtins.bool],
                 security_policy_id: Optional[pulumi.Input[builtins.str]] = None):
        """
        The set of arguments for constructing a AppSecAdvancedSettingsEvasivePathMatch resource.
        :param pulumi.Input[builtins.int] config_id: Unique identifier of the security configuration
        :param pulumi.Input[builtins.bool] enable_path_match: Whether to enable the evasive path match setting
        :param pulumi.Input[builtins.str] security_policy_id: Unique identifier of the security policy
        """
        pulumi.set(__self__, "config_id", config_id)
        pulumi.set(__self__, "enable_path_match", enable_path_match)
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
    @pulumi.getter(name="enablePathMatch")
    def enable_path_match(self) -> pulumi.Input[builtins.bool]:
        """
        Whether to enable the evasive path match setting
        """
        return pulumi.get(self, "enable_path_match")

    @enable_path_match.setter
    def enable_path_match(self, value: pulumi.Input[builtins.bool]):
        pulumi.set(self, "enable_path_match", value)

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
class _AppSecAdvancedSettingsEvasivePathMatchState:
    def __init__(__self__, *,
                 config_id: Optional[pulumi.Input[builtins.int]] = None,
                 enable_path_match: Optional[pulumi.Input[builtins.bool]] = None,
                 security_policy_id: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering AppSecAdvancedSettingsEvasivePathMatch resources.
        :param pulumi.Input[builtins.int] config_id: Unique identifier of the security configuration
        :param pulumi.Input[builtins.bool] enable_path_match: Whether to enable the evasive path match setting
        :param pulumi.Input[builtins.str] security_policy_id: Unique identifier of the security policy
        """
        if config_id is not None:
            pulumi.set(__self__, "config_id", config_id)
        if enable_path_match is not None:
            pulumi.set(__self__, "enable_path_match", enable_path_match)
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
    @pulumi.getter(name="enablePathMatch")
    def enable_path_match(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        Whether to enable the evasive path match setting
        """
        return pulumi.get(self, "enable_path_match")

    @enable_path_match.setter
    def enable_path_match(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "enable_path_match", value)

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


@pulumi.type_token("akamai:index/appSecAdvancedSettingsEvasivePathMatch:AppSecAdvancedSettingsEvasivePathMatch")
class AppSecAdvancedSettingsEvasivePathMatch(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config_id: Optional[pulumi.Input[builtins.int]] = None,
                 enable_path_match: Optional[pulumi.Input[builtins.bool]] = None,
                 security_policy_id: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        Create a AppSecAdvancedSettingsEvasivePathMatch resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.int] config_id: Unique identifier of the security configuration
        :param pulumi.Input[builtins.bool] enable_path_match: Whether to enable the evasive path match setting
        :param pulumi.Input[builtins.str] security_policy_id: Unique identifier of the security policy
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AppSecAdvancedSettingsEvasivePathMatchArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a AppSecAdvancedSettingsEvasivePathMatch resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param AppSecAdvancedSettingsEvasivePathMatchArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AppSecAdvancedSettingsEvasivePathMatchArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config_id: Optional[pulumi.Input[builtins.int]] = None,
                 enable_path_match: Optional[pulumi.Input[builtins.bool]] = None,
                 security_policy_id: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AppSecAdvancedSettingsEvasivePathMatchArgs.__new__(AppSecAdvancedSettingsEvasivePathMatchArgs)

            if config_id is None and not opts.urn:
                raise TypeError("Missing required property 'config_id'")
            __props__.__dict__["config_id"] = config_id
            if enable_path_match is None and not opts.urn:
                raise TypeError("Missing required property 'enable_path_match'")
            __props__.__dict__["enable_path_match"] = enable_path_match
            __props__.__dict__["security_policy_id"] = security_policy_id
        super(AppSecAdvancedSettingsEvasivePathMatch, __self__).__init__(
            'akamai:index/appSecAdvancedSettingsEvasivePathMatch:AppSecAdvancedSettingsEvasivePathMatch',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            config_id: Optional[pulumi.Input[builtins.int]] = None,
            enable_path_match: Optional[pulumi.Input[builtins.bool]] = None,
            security_policy_id: Optional[pulumi.Input[builtins.str]] = None) -> 'AppSecAdvancedSettingsEvasivePathMatch':
        """
        Get an existing AppSecAdvancedSettingsEvasivePathMatch resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.int] config_id: Unique identifier of the security configuration
        :param pulumi.Input[builtins.bool] enable_path_match: Whether to enable the evasive path match setting
        :param pulumi.Input[builtins.str] security_policy_id: Unique identifier of the security policy
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AppSecAdvancedSettingsEvasivePathMatchState.__new__(_AppSecAdvancedSettingsEvasivePathMatchState)

        __props__.__dict__["config_id"] = config_id
        __props__.__dict__["enable_path_match"] = enable_path_match
        __props__.__dict__["security_policy_id"] = security_policy_id
        return AppSecAdvancedSettingsEvasivePathMatch(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> pulumi.Output[builtins.int]:
        """
        Unique identifier of the security configuration
        """
        return pulumi.get(self, "config_id")

    @property
    @pulumi.getter(name="enablePathMatch")
    def enable_path_match(self) -> pulumi.Output[builtins.bool]:
        """
        Whether to enable the evasive path match setting
        """
        return pulumi.get(self, "enable_path_match")

    @property
    @pulumi.getter(name="securityPolicyId")
    def security_policy_id(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        Unique identifier of the security policy
        """
        return pulumi.get(self, "security_policy_id")

