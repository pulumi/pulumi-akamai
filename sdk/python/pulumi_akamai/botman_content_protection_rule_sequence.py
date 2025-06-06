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

__all__ = ['BotmanContentProtectionRuleSequenceArgs', 'BotmanContentProtectionRuleSequence']

@pulumi.input_type
class BotmanContentProtectionRuleSequenceArgs:
    def __init__(__self__, *,
                 config_id: pulumi.Input[builtins.int],
                 content_protection_rule_ids: pulumi.Input[Sequence[pulumi.Input[builtins.str]]],
                 security_policy_id: pulumi.Input[builtins.str]):
        """
        The set of arguments for constructing a BotmanContentProtectionRuleSequence resource.
        :param pulumi.Input[builtins.int] config_id: Unique identifier of the security configuration
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] content_protection_rule_ids: Unique identifiers of content protection rules, listed in the order of their evaluation
        :param pulumi.Input[builtins.str] security_policy_id: Unique identifier of the security policy
        """
        pulumi.set(__self__, "config_id", config_id)
        pulumi.set(__self__, "content_protection_rule_ids", content_protection_rule_ids)
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
    @pulumi.getter(name="contentProtectionRuleIds")
    def content_protection_rule_ids(self) -> pulumi.Input[Sequence[pulumi.Input[builtins.str]]]:
        """
        Unique identifiers of content protection rules, listed in the order of their evaluation
        """
        return pulumi.get(self, "content_protection_rule_ids")

    @content_protection_rule_ids.setter
    def content_protection_rule_ids(self, value: pulumi.Input[Sequence[pulumi.Input[builtins.str]]]):
        pulumi.set(self, "content_protection_rule_ids", value)

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
class _BotmanContentProtectionRuleSequenceState:
    def __init__(__self__, *,
                 config_id: Optional[pulumi.Input[builtins.int]] = None,
                 content_protection_rule_ids: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 security_policy_id: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering BotmanContentProtectionRuleSequence resources.
        :param pulumi.Input[builtins.int] config_id: Unique identifier of the security configuration
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] content_protection_rule_ids: Unique identifiers of content protection rules, listed in the order of their evaluation
        :param pulumi.Input[builtins.str] security_policy_id: Unique identifier of the security policy
        """
        if config_id is not None:
            pulumi.set(__self__, "config_id", config_id)
        if content_protection_rule_ids is not None:
            pulumi.set(__self__, "content_protection_rule_ids", content_protection_rule_ids)
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
    @pulumi.getter(name="contentProtectionRuleIds")
    def content_protection_rule_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]:
        """
        Unique identifiers of content protection rules, listed in the order of their evaluation
        """
        return pulumi.get(self, "content_protection_rule_ids")

    @content_protection_rule_ids.setter
    def content_protection_rule_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "content_protection_rule_ids", value)

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


@pulumi.type_token("akamai:index/botmanContentProtectionRuleSequence:BotmanContentProtectionRuleSequence")
class BotmanContentProtectionRuleSequence(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config_id: Optional[pulumi.Input[builtins.int]] = None,
                 content_protection_rule_ids: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 security_policy_id: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        Create a BotmanContentProtectionRuleSequence resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.int] config_id: Unique identifier of the security configuration
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] content_protection_rule_ids: Unique identifiers of content protection rules, listed in the order of their evaluation
        :param pulumi.Input[builtins.str] security_policy_id: Unique identifier of the security policy
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BotmanContentProtectionRuleSequenceArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a BotmanContentProtectionRuleSequence resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param BotmanContentProtectionRuleSequenceArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BotmanContentProtectionRuleSequenceArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config_id: Optional[pulumi.Input[builtins.int]] = None,
                 content_protection_rule_ids: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 security_policy_id: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BotmanContentProtectionRuleSequenceArgs.__new__(BotmanContentProtectionRuleSequenceArgs)

            if config_id is None and not opts.urn:
                raise TypeError("Missing required property 'config_id'")
            __props__.__dict__["config_id"] = config_id
            if content_protection_rule_ids is None and not opts.urn:
                raise TypeError("Missing required property 'content_protection_rule_ids'")
            __props__.__dict__["content_protection_rule_ids"] = content_protection_rule_ids
            if security_policy_id is None and not opts.urn:
                raise TypeError("Missing required property 'security_policy_id'")
            __props__.__dict__["security_policy_id"] = security_policy_id
        super(BotmanContentProtectionRuleSequence, __self__).__init__(
            'akamai:index/botmanContentProtectionRuleSequence:BotmanContentProtectionRuleSequence',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            config_id: Optional[pulumi.Input[builtins.int]] = None,
            content_protection_rule_ids: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
            security_policy_id: Optional[pulumi.Input[builtins.str]] = None) -> 'BotmanContentProtectionRuleSequence':
        """
        Get an existing BotmanContentProtectionRuleSequence resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.int] config_id: Unique identifier of the security configuration
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] content_protection_rule_ids: Unique identifiers of content protection rules, listed in the order of their evaluation
        :param pulumi.Input[builtins.str] security_policy_id: Unique identifier of the security policy
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BotmanContentProtectionRuleSequenceState.__new__(_BotmanContentProtectionRuleSequenceState)

        __props__.__dict__["config_id"] = config_id
        __props__.__dict__["content_protection_rule_ids"] = content_protection_rule_ids
        __props__.__dict__["security_policy_id"] = security_policy_id
        return BotmanContentProtectionRuleSequence(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> pulumi.Output[builtins.int]:
        """
        Unique identifier of the security configuration
        """
        return pulumi.get(self, "config_id")

    @property
    @pulumi.getter(name="contentProtectionRuleIds")
    def content_protection_rule_ids(self) -> pulumi.Output[Sequence[builtins.str]]:
        """
        Unique identifiers of content protection rules, listed in the order of their evaluation
        """
        return pulumi.get(self, "content_protection_rule_ids")

    @property
    @pulumi.getter(name="securityPolicyId")
    def security_policy_id(self) -> pulumi.Output[builtins.str]:
        """
        Unique identifier of the security policy
        """
        return pulumi.get(self, "security_policy_id")

