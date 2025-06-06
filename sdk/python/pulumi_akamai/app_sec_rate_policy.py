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

__all__ = ['AppSecRatePolicyArgs', 'AppSecRatePolicy']

@pulumi.input_type
class AppSecRatePolicyArgs:
    def __init__(__self__, *,
                 config_id: pulumi.Input[builtins.int],
                 rate_policy: pulumi.Input[builtins.str]):
        """
        The set of arguments for constructing a AppSecRatePolicy resource.
        :param pulumi.Input[builtins.int] config_id: Unique identifier of the security configuration
        :param pulumi.Input[builtins.str] rate_policy: JSON-formatted definition of the rate policy
        """
        pulumi.set(__self__, "config_id", config_id)
        pulumi.set(__self__, "rate_policy", rate_policy)

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
    @pulumi.getter(name="ratePolicy")
    def rate_policy(self) -> pulumi.Input[builtins.str]:
        """
        JSON-formatted definition of the rate policy
        """
        return pulumi.get(self, "rate_policy")

    @rate_policy.setter
    def rate_policy(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "rate_policy", value)


@pulumi.input_type
class _AppSecRatePolicyState:
    def __init__(__self__, *,
                 config_id: Optional[pulumi.Input[builtins.int]] = None,
                 rate_policy: Optional[pulumi.Input[builtins.str]] = None,
                 rate_policy_id: Optional[pulumi.Input[builtins.int]] = None):
        """
        Input properties used for looking up and filtering AppSecRatePolicy resources.
        :param pulumi.Input[builtins.int] config_id: Unique identifier of the security configuration
        :param pulumi.Input[builtins.str] rate_policy: JSON-formatted definition of the rate policy
        :param pulumi.Input[builtins.int] rate_policy_id: Unique identifier of the rate policy
        """
        if config_id is not None:
            pulumi.set(__self__, "config_id", config_id)
        if rate_policy is not None:
            pulumi.set(__self__, "rate_policy", rate_policy)
        if rate_policy_id is not None:
            pulumi.set(__self__, "rate_policy_id", rate_policy_id)

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
    @pulumi.getter(name="ratePolicy")
    def rate_policy(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        JSON-formatted definition of the rate policy
        """
        return pulumi.get(self, "rate_policy")

    @rate_policy.setter
    def rate_policy(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "rate_policy", value)

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


@pulumi.type_token("akamai:index/appSecRatePolicy:AppSecRatePolicy")
class AppSecRatePolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config_id: Optional[pulumi.Input[builtins.int]] = None,
                 rate_policy: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        Create a AppSecRatePolicy resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.int] config_id: Unique identifier of the security configuration
        :param pulumi.Input[builtins.str] rate_policy: JSON-formatted definition of the rate policy
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AppSecRatePolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a AppSecRatePolicy resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param AppSecRatePolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AppSecRatePolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config_id: Optional[pulumi.Input[builtins.int]] = None,
                 rate_policy: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AppSecRatePolicyArgs.__new__(AppSecRatePolicyArgs)

            if config_id is None and not opts.urn:
                raise TypeError("Missing required property 'config_id'")
            __props__.__dict__["config_id"] = config_id
            if rate_policy is None and not opts.urn:
                raise TypeError("Missing required property 'rate_policy'")
            __props__.__dict__["rate_policy"] = rate_policy
            __props__.__dict__["rate_policy_id"] = None
        super(AppSecRatePolicy, __self__).__init__(
            'akamai:index/appSecRatePolicy:AppSecRatePolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            config_id: Optional[pulumi.Input[builtins.int]] = None,
            rate_policy: Optional[pulumi.Input[builtins.str]] = None,
            rate_policy_id: Optional[pulumi.Input[builtins.int]] = None) -> 'AppSecRatePolicy':
        """
        Get an existing AppSecRatePolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.int] config_id: Unique identifier of the security configuration
        :param pulumi.Input[builtins.str] rate_policy: JSON-formatted definition of the rate policy
        :param pulumi.Input[builtins.int] rate_policy_id: Unique identifier of the rate policy
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AppSecRatePolicyState.__new__(_AppSecRatePolicyState)

        __props__.__dict__["config_id"] = config_id
        __props__.__dict__["rate_policy"] = rate_policy
        __props__.__dict__["rate_policy_id"] = rate_policy_id
        return AppSecRatePolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> pulumi.Output[builtins.int]:
        """
        Unique identifier of the security configuration
        """
        return pulumi.get(self, "config_id")

    @property
    @pulumi.getter(name="ratePolicy")
    def rate_policy(self) -> pulumi.Output[builtins.str]:
        """
        JSON-formatted definition of the rate policy
        """
        return pulumi.get(self, "rate_policy")

    @property
    @pulumi.getter(name="ratePolicyId")
    def rate_policy_id(self) -> pulumi.Output[builtins.int]:
        """
        Unique identifier of the rate policy
        """
        return pulumi.get(self, "rate_policy_id")

