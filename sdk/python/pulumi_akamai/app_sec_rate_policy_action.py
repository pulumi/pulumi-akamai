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

__all__ = ['AppSecRatePolicyActionArgs', 'AppSecRatePolicyAction']

@pulumi.input_type
class AppSecRatePolicyActionArgs:
    def __init__(__self__, *,
                 config_id: pulumi.Input[builtins.int],
                 ipv4_action: pulumi.Input[builtins.str],
                 ipv6_action: pulumi.Input[builtins.str],
                 rate_policy_id: pulumi.Input[builtins.int],
                 security_policy_id: pulumi.Input[builtins.str]):
        """
        The set of arguments for constructing a AppSecRatePolicyAction resource.
        :param pulumi.Input[builtins.int] config_id: Unique identifier of the security configuration
        :param pulumi.Input[builtins.str] ipv4_action: Action to be taken for requests coming from an IPv4 address
        :param pulumi.Input[builtins.str] ipv6_action: Action to be taken for requests coming from an IPv6 address
        :param pulumi.Input[builtins.int] rate_policy_id: Unique identifier of the rate policy
        :param pulumi.Input[builtins.str] security_policy_id: Unique identifier of the security policy
        """
        pulumi.set(__self__, "config_id", config_id)
        pulumi.set(__self__, "ipv4_action", ipv4_action)
        pulumi.set(__self__, "ipv6_action", ipv6_action)
        pulumi.set(__self__, "rate_policy_id", rate_policy_id)
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
    @pulumi.getter(name="ipv4Action")
    def ipv4_action(self) -> pulumi.Input[builtins.str]:
        """
        Action to be taken for requests coming from an IPv4 address
        """
        return pulumi.get(self, "ipv4_action")

    @ipv4_action.setter
    def ipv4_action(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "ipv4_action", value)

    @property
    @pulumi.getter(name="ipv6Action")
    def ipv6_action(self) -> pulumi.Input[builtins.str]:
        """
        Action to be taken for requests coming from an IPv6 address
        """
        return pulumi.get(self, "ipv6_action")

    @ipv6_action.setter
    def ipv6_action(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "ipv6_action", value)

    @property
    @pulumi.getter(name="ratePolicyId")
    def rate_policy_id(self) -> pulumi.Input[builtins.int]:
        """
        Unique identifier of the rate policy
        """
        return pulumi.get(self, "rate_policy_id")

    @rate_policy_id.setter
    def rate_policy_id(self, value: pulumi.Input[builtins.int]):
        pulumi.set(self, "rate_policy_id", value)

    @property
    @pulumi.getter(name="securityPolicyId")
    def security_policy_id(self) -> pulumi.Input[builtins.str]:
        """
        Unique identifier of the security policy
        """
        return pulumi.get(self, "security_policy_id")

    @security_policy_id.setter
    def security_policy_id(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "security_policy_id", value)


@pulumi.input_type
class _AppSecRatePolicyActionState:
    def __init__(__self__, *,
                 config_id: Optional[pulumi.Input[builtins.int]] = None,
                 ipv4_action: Optional[pulumi.Input[builtins.str]] = None,
                 ipv6_action: Optional[pulumi.Input[builtins.str]] = None,
                 rate_policy_id: Optional[pulumi.Input[builtins.int]] = None,
                 security_policy_id: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering AppSecRatePolicyAction resources.
        :param pulumi.Input[builtins.int] config_id: Unique identifier of the security configuration
        :param pulumi.Input[builtins.str] ipv4_action: Action to be taken for requests coming from an IPv4 address
        :param pulumi.Input[builtins.str] ipv6_action: Action to be taken for requests coming from an IPv6 address
        :param pulumi.Input[builtins.int] rate_policy_id: Unique identifier of the rate policy
        :param pulumi.Input[builtins.str] security_policy_id: Unique identifier of the security policy
        """
        if config_id is not None:
            pulumi.set(__self__, "config_id", config_id)
        if ipv4_action is not None:
            pulumi.set(__self__, "ipv4_action", ipv4_action)
        if ipv6_action is not None:
            pulumi.set(__self__, "ipv6_action", ipv6_action)
        if rate_policy_id is not None:
            pulumi.set(__self__, "rate_policy_id", rate_policy_id)
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
    @pulumi.getter(name="ipv4Action")
    def ipv4_action(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Action to be taken for requests coming from an IPv4 address
        """
        return pulumi.get(self, "ipv4_action")

    @ipv4_action.setter
    def ipv4_action(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "ipv4_action", value)

    @property
    @pulumi.getter(name="ipv6Action")
    def ipv6_action(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Action to be taken for requests coming from an IPv6 address
        """
        return pulumi.get(self, "ipv6_action")

    @ipv6_action.setter
    def ipv6_action(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "ipv6_action", value)

    @property
    @pulumi.getter(name="ratePolicyId")
    def rate_policy_id(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        Unique identifier of the rate policy
        """
        return pulumi.get(self, "rate_policy_id")

    @rate_policy_id.setter
    def rate_policy_id(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "rate_policy_id", value)

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


@pulumi.type_token("akamai:index/appSecRatePolicyAction:AppSecRatePolicyAction")
class AppSecRatePolicyAction(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config_id: Optional[pulumi.Input[builtins.int]] = None,
                 ipv4_action: Optional[pulumi.Input[builtins.str]] = None,
                 ipv6_action: Optional[pulumi.Input[builtins.str]] = None,
                 rate_policy_id: Optional[pulumi.Input[builtins.int]] = None,
                 security_policy_id: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        Create a AppSecRatePolicyAction resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.int] config_id: Unique identifier of the security configuration
        :param pulumi.Input[builtins.str] ipv4_action: Action to be taken for requests coming from an IPv4 address
        :param pulumi.Input[builtins.str] ipv6_action: Action to be taken for requests coming from an IPv6 address
        :param pulumi.Input[builtins.int] rate_policy_id: Unique identifier of the rate policy
        :param pulumi.Input[builtins.str] security_policy_id: Unique identifier of the security policy
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AppSecRatePolicyActionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a AppSecRatePolicyAction resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param AppSecRatePolicyActionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AppSecRatePolicyActionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config_id: Optional[pulumi.Input[builtins.int]] = None,
                 ipv4_action: Optional[pulumi.Input[builtins.str]] = None,
                 ipv6_action: Optional[pulumi.Input[builtins.str]] = None,
                 rate_policy_id: Optional[pulumi.Input[builtins.int]] = None,
                 security_policy_id: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AppSecRatePolicyActionArgs.__new__(AppSecRatePolicyActionArgs)

            if config_id is None and not opts.urn:
                raise TypeError("Missing required property 'config_id'")
            __props__.__dict__["config_id"] = config_id
            if ipv4_action is None and not opts.urn:
                raise TypeError("Missing required property 'ipv4_action'")
            __props__.__dict__["ipv4_action"] = ipv4_action
            if ipv6_action is None and not opts.urn:
                raise TypeError("Missing required property 'ipv6_action'")
            __props__.__dict__["ipv6_action"] = ipv6_action
            if rate_policy_id is None and not opts.urn:
                raise TypeError("Missing required property 'rate_policy_id'")
            __props__.__dict__["rate_policy_id"] = rate_policy_id
            if security_policy_id is None and not opts.urn:
                raise TypeError("Missing required property 'security_policy_id'")
            __props__.__dict__["security_policy_id"] = security_policy_id
        super(AppSecRatePolicyAction, __self__).__init__(
            'akamai:index/appSecRatePolicyAction:AppSecRatePolicyAction',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            config_id: Optional[pulumi.Input[builtins.int]] = None,
            ipv4_action: Optional[pulumi.Input[builtins.str]] = None,
            ipv6_action: Optional[pulumi.Input[builtins.str]] = None,
            rate_policy_id: Optional[pulumi.Input[builtins.int]] = None,
            security_policy_id: Optional[pulumi.Input[builtins.str]] = None) -> 'AppSecRatePolicyAction':
        """
        Get an existing AppSecRatePolicyAction resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.int] config_id: Unique identifier of the security configuration
        :param pulumi.Input[builtins.str] ipv4_action: Action to be taken for requests coming from an IPv4 address
        :param pulumi.Input[builtins.str] ipv6_action: Action to be taken for requests coming from an IPv6 address
        :param pulumi.Input[builtins.int] rate_policy_id: Unique identifier of the rate policy
        :param pulumi.Input[builtins.str] security_policy_id: Unique identifier of the security policy
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AppSecRatePolicyActionState.__new__(_AppSecRatePolicyActionState)

        __props__.__dict__["config_id"] = config_id
        __props__.__dict__["ipv4_action"] = ipv4_action
        __props__.__dict__["ipv6_action"] = ipv6_action
        __props__.__dict__["rate_policy_id"] = rate_policy_id
        __props__.__dict__["security_policy_id"] = security_policy_id
        return AppSecRatePolicyAction(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> pulumi.Output[builtins.int]:
        """
        Unique identifier of the security configuration
        """
        return pulumi.get(self, "config_id")

    @property
    @pulumi.getter(name="ipv4Action")
    def ipv4_action(self) -> pulumi.Output[builtins.str]:
        """
        Action to be taken for requests coming from an IPv4 address
        """
        return pulumi.get(self, "ipv4_action")

    @property
    @pulumi.getter(name="ipv6Action")
    def ipv6_action(self) -> pulumi.Output[builtins.str]:
        """
        Action to be taken for requests coming from an IPv6 address
        """
        return pulumi.get(self, "ipv6_action")

    @property
    @pulumi.getter(name="ratePolicyId")
    def rate_policy_id(self) -> pulumi.Output[builtins.int]:
        """
        Unique identifier of the rate policy
        """
        return pulumi.get(self, "rate_policy_id")

    @property
    @pulumi.getter(name="securityPolicyId")
    def security_policy_id(self) -> pulumi.Output[builtins.str]:
        """
        Unique identifier of the security policy
        """
        return pulumi.get(self, "security_policy_id")

