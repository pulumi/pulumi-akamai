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

__all__ = ['AppSecWafModeArgs', 'AppSecWafMode']

@pulumi.input_type
class AppSecWafModeArgs:
    def __init__(__self__, *,
                 config_id: pulumi.Input[builtins.int],
                 mode: pulumi.Input[builtins.str],
                 security_policy_id: pulumi.Input[builtins.str]):
        """
        The set of arguments for constructing a AppSecWafMode resource.
        :param pulumi.Input[builtins.int] config_id: Unique identifier of the security configuration
        :param pulumi.Input[builtins.str] mode: How Kona Rule Set rules should be upgraded (KRS, AAG, ASE_MANUAL or ASE_AUTO)
        :param pulumi.Input[builtins.str] security_policy_id: Unique identifier of the security policy
        """
        pulumi.set(__self__, "config_id", config_id)
        pulumi.set(__self__, "mode", mode)
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
    @pulumi.getter
    def mode(self) -> pulumi.Input[builtins.str]:
        """
        How Kona Rule Set rules should be upgraded (KRS, AAG, ASE_MANUAL or ASE_AUTO)
        """
        return pulumi.get(self, "mode")

    @mode.setter
    def mode(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "mode", value)

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
class _AppSecWafModeState:
    def __init__(__self__, *,
                 config_id: Optional[pulumi.Input[builtins.int]] = None,
                 current_ruleset: Optional[pulumi.Input[builtins.str]] = None,
                 eval_expiration_date: Optional[pulumi.Input[builtins.str]] = None,
                 eval_ruleset: Optional[pulumi.Input[builtins.str]] = None,
                 eval_status: Optional[pulumi.Input[builtins.str]] = None,
                 mode: Optional[pulumi.Input[builtins.str]] = None,
                 output_text: Optional[pulumi.Input[builtins.str]] = None,
                 security_policy_id: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering AppSecWafMode resources.
        :param pulumi.Input[builtins.int] config_id: Unique identifier of the security configuration
        :param pulumi.Input[builtins.str] current_ruleset: Versioning information for the current Kona Rule Set
        :param pulumi.Input[builtins.str] eval_expiration_date: Date on which the evaluation period ends, if applicable
        :param pulumi.Input[builtins.str] eval_ruleset: Versioning information for the Kona Rule Set being evaluated, if applicable
        :param pulumi.Input[builtins.str] eval_status: Whether an evaluation is currently in progress
        :param pulumi.Input[builtins.str] mode: How Kona Rule Set rules should be upgraded (KRS, AAG, ASE_MANUAL or ASE_AUTO)
        :param pulumi.Input[builtins.str] output_text: Text representation
        :param pulumi.Input[builtins.str] security_policy_id: Unique identifier of the security policy
        """
        if config_id is not None:
            pulumi.set(__self__, "config_id", config_id)
        if current_ruleset is not None:
            pulumi.set(__self__, "current_ruleset", current_ruleset)
        if eval_expiration_date is not None:
            pulumi.set(__self__, "eval_expiration_date", eval_expiration_date)
        if eval_ruleset is not None:
            pulumi.set(__self__, "eval_ruleset", eval_ruleset)
        if eval_status is not None:
            pulumi.set(__self__, "eval_status", eval_status)
        if mode is not None:
            pulumi.set(__self__, "mode", mode)
        if output_text is not None:
            pulumi.set(__self__, "output_text", output_text)
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
    @pulumi.getter(name="currentRuleset")
    def current_ruleset(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Versioning information for the current Kona Rule Set
        """
        return pulumi.get(self, "current_ruleset")

    @current_ruleset.setter
    def current_ruleset(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "current_ruleset", value)

    @property
    @pulumi.getter(name="evalExpirationDate")
    def eval_expiration_date(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Date on which the evaluation period ends, if applicable
        """
        return pulumi.get(self, "eval_expiration_date")

    @eval_expiration_date.setter
    def eval_expiration_date(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "eval_expiration_date", value)

    @property
    @pulumi.getter(name="evalRuleset")
    def eval_ruleset(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Versioning information for the Kona Rule Set being evaluated, if applicable
        """
        return pulumi.get(self, "eval_ruleset")

    @eval_ruleset.setter
    def eval_ruleset(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "eval_ruleset", value)

    @property
    @pulumi.getter(name="evalStatus")
    def eval_status(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Whether an evaluation is currently in progress
        """
        return pulumi.get(self, "eval_status")

    @eval_status.setter
    def eval_status(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "eval_status", value)

    @property
    @pulumi.getter
    def mode(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        How Kona Rule Set rules should be upgraded (KRS, AAG, ASE_MANUAL or ASE_AUTO)
        """
        return pulumi.get(self, "mode")

    @mode.setter
    def mode(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "mode", value)

    @property
    @pulumi.getter(name="outputText")
    def output_text(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Text representation
        """
        return pulumi.get(self, "output_text")

    @output_text.setter
    def output_text(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "output_text", value)

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


@pulumi.type_token("akamai:index/appSecWafMode:AppSecWafMode")
class AppSecWafMode(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config_id: Optional[pulumi.Input[builtins.int]] = None,
                 mode: Optional[pulumi.Input[builtins.str]] = None,
                 security_policy_id: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        Create a AppSecWafMode resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.int] config_id: Unique identifier of the security configuration
        :param pulumi.Input[builtins.str] mode: How Kona Rule Set rules should be upgraded (KRS, AAG, ASE_MANUAL or ASE_AUTO)
        :param pulumi.Input[builtins.str] security_policy_id: Unique identifier of the security policy
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AppSecWafModeArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a AppSecWafMode resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param AppSecWafModeArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AppSecWafModeArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config_id: Optional[pulumi.Input[builtins.int]] = None,
                 mode: Optional[pulumi.Input[builtins.str]] = None,
                 security_policy_id: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AppSecWafModeArgs.__new__(AppSecWafModeArgs)

            if config_id is None and not opts.urn:
                raise TypeError("Missing required property 'config_id'")
            __props__.__dict__["config_id"] = config_id
            if mode is None and not opts.urn:
                raise TypeError("Missing required property 'mode'")
            __props__.__dict__["mode"] = mode
            if security_policy_id is None and not opts.urn:
                raise TypeError("Missing required property 'security_policy_id'")
            __props__.__dict__["security_policy_id"] = security_policy_id
            __props__.__dict__["current_ruleset"] = None
            __props__.__dict__["eval_expiration_date"] = None
            __props__.__dict__["eval_ruleset"] = None
            __props__.__dict__["eval_status"] = None
            __props__.__dict__["output_text"] = None
        super(AppSecWafMode, __self__).__init__(
            'akamai:index/appSecWafMode:AppSecWafMode',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            config_id: Optional[pulumi.Input[builtins.int]] = None,
            current_ruleset: Optional[pulumi.Input[builtins.str]] = None,
            eval_expiration_date: Optional[pulumi.Input[builtins.str]] = None,
            eval_ruleset: Optional[pulumi.Input[builtins.str]] = None,
            eval_status: Optional[pulumi.Input[builtins.str]] = None,
            mode: Optional[pulumi.Input[builtins.str]] = None,
            output_text: Optional[pulumi.Input[builtins.str]] = None,
            security_policy_id: Optional[pulumi.Input[builtins.str]] = None) -> 'AppSecWafMode':
        """
        Get an existing AppSecWafMode resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.int] config_id: Unique identifier of the security configuration
        :param pulumi.Input[builtins.str] current_ruleset: Versioning information for the current Kona Rule Set
        :param pulumi.Input[builtins.str] eval_expiration_date: Date on which the evaluation period ends, if applicable
        :param pulumi.Input[builtins.str] eval_ruleset: Versioning information for the Kona Rule Set being evaluated, if applicable
        :param pulumi.Input[builtins.str] eval_status: Whether an evaluation is currently in progress
        :param pulumi.Input[builtins.str] mode: How Kona Rule Set rules should be upgraded (KRS, AAG, ASE_MANUAL or ASE_AUTO)
        :param pulumi.Input[builtins.str] output_text: Text representation
        :param pulumi.Input[builtins.str] security_policy_id: Unique identifier of the security policy
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AppSecWafModeState.__new__(_AppSecWafModeState)

        __props__.__dict__["config_id"] = config_id
        __props__.__dict__["current_ruleset"] = current_ruleset
        __props__.__dict__["eval_expiration_date"] = eval_expiration_date
        __props__.__dict__["eval_ruleset"] = eval_ruleset
        __props__.__dict__["eval_status"] = eval_status
        __props__.__dict__["mode"] = mode
        __props__.__dict__["output_text"] = output_text
        __props__.__dict__["security_policy_id"] = security_policy_id
        return AppSecWafMode(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> pulumi.Output[builtins.int]:
        """
        Unique identifier of the security configuration
        """
        return pulumi.get(self, "config_id")

    @property
    @pulumi.getter(name="currentRuleset")
    def current_ruleset(self) -> pulumi.Output[builtins.str]:
        """
        Versioning information for the current Kona Rule Set
        """
        return pulumi.get(self, "current_ruleset")

    @property
    @pulumi.getter(name="evalExpirationDate")
    def eval_expiration_date(self) -> pulumi.Output[builtins.str]:
        """
        Date on which the evaluation period ends, if applicable
        """
        return pulumi.get(self, "eval_expiration_date")

    @property
    @pulumi.getter(name="evalRuleset")
    def eval_ruleset(self) -> pulumi.Output[builtins.str]:
        """
        Versioning information for the Kona Rule Set being evaluated, if applicable
        """
        return pulumi.get(self, "eval_ruleset")

    @property
    @pulumi.getter(name="evalStatus")
    def eval_status(self) -> pulumi.Output[builtins.str]:
        """
        Whether an evaluation is currently in progress
        """
        return pulumi.get(self, "eval_status")

    @property
    @pulumi.getter
    def mode(self) -> pulumi.Output[builtins.str]:
        """
        How Kona Rule Set rules should be upgraded (KRS, AAG, ASE_MANUAL or ASE_AUTO)
        """
        return pulumi.get(self, "mode")

    @property
    @pulumi.getter(name="outputText")
    def output_text(self) -> pulumi.Output[builtins.str]:
        """
        Text representation
        """
        return pulumi.get(self, "output_text")

    @property
    @pulumi.getter(name="securityPolicyId")
    def security_policy_id(self) -> pulumi.Output[builtins.str]:
        """
        Unique identifier of the security policy
        """
        return pulumi.get(self, "security_policy_id")

