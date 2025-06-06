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

__all__ = ['AppSecRuleUpgradeArgs', 'AppSecRuleUpgrade']

@pulumi.input_type
class AppSecRuleUpgradeArgs:
    def __init__(__self__, *,
                 config_id: pulumi.Input[builtins.int],
                 security_policy_id: pulumi.Input[builtins.str],
                 upgrade_mode: Optional[pulumi.Input[builtins.str]] = None):
        """
        The set of arguments for constructing a AppSecRuleUpgrade resource.
        :param pulumi.Input[builtins.int] config_id: Unique identifier of the security configuration
        :param pulumi.Input[builtins.str] security_policy_id: Unique identifier of the security policy
        :param pulumi.Input[builtins.str] upgrade_mode: Modifies the upgrade type for organizations running the ASE beta (ASE_AUTO or ASE_MANUAL)
        """
        pulumi.set(__self__, "config_id", config_id)
        pulumi.set(__self__, "security_policy_id", security_policy_id)
        if upgrade_mode is not None:
            pulumi.set(__self__, "upgrade_mode", upgrade_mode)

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
    @pulumi.getter(name="securityPolicyId")
    def security_policy_id(self) -> pulumi.Input[builtins.str]:
        """
        Unique identifier of the security policy
        """
        return pulumi.get(self, "security_policy_id")

    @security_policy_id.setter
    def security_policy_id(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "security_policy_id", value)

    @property
    @pulumi.getter(name="upgradeMode")
    def upgrade_mode(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Modifies the upgrade type for organizations running the ASE beta (ASE_AUTO or ASE_MANUAL)
        """
        return pulumi.get(self, "upgrade_mode")

    @upgrade_mode.setter
    def upgrade_mode(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "upgrade_mode", value)


@pulumi.input_type
class _AppSecRuleUpgradeState:
    def __init__(__self__, *,
                 config_id: Optional[pulumi.Input[builtins.int]] = None,
                 current_ruleset: Optional[pulumi.Input[builtins.str]] = None,
                 eval_status: Optional[pulumi.Input[builtins.str]] = None,
                 mode: Optional[pulumi.Input[builtins.str]] = None,
                 security_policy_id: Optional[pulumi.Input[builtins.str]] = None,
                 upgrade_mode: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering AppSecRuleUpgrade resources.
        :param pulumi.Input[builtins.int] config_id: Unique identifier of the security configuration
        :param pulumi.Input[builtins.str] current_ruleset: Versioning information for the current KRS rule set
        :param pulumi.Input[builtins.str] eval_status: Whether an evaluation is currently in progress
        :param pulumi.Input[builtins.str] mode: Upgrade mode (KRS, AAG, ASE_MANUAL or ASE_AUTO)
        :param pulumi.Input[builtins.str] security_policy_id: Unique identifier of the security policy
        :param pulumi.Input[builtins.str] upgrade_mode: Modifies the upgrade type for organizations running the ASE beta (ASE_AUTO or ASE_MANUAL)
        """
        if config_id is not None:
            pulumi.set(__self__, "config_id", config_id)
        if current_ruleset is not None:
            pulumi.set(__self__, "current_ruleset", current_ruleset)
        if eval_status is not None:
            pulumi.set(__self__, "eval_status", eval_status)
        if mode is not None:
            pulumi.set(__self__, "mode", mode)
        if security_policy_id is not None:
            pulumi.set(__self__, "security_policy_id", security_policy_id)
        if upgrade_mode is not None:
            pulumi.set(__self__, "upgrade_mode", upgrade_mode)

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
        Versioning information for the current KRS rule set
        """
        return pulumi.get(self, "current_ruleset")

    @current_ruleset.setter
    def current_ruleset(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "current_ruleset", value)

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
        Upgrade mode (KRS, AAG, ASE_MANUAL or ASE_AUTO)
        """
        return pulumi.get(self, "mode")

    @mode.setter
    def mode(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "mode", value)

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

    @property
    @pulumi.getter(name="upgradeMode")
    def upgrade_mode(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Modifies the upgrade type for organizations running the ASE beta (ASE_AUTO or ASE_MANUAL)
        """
        return pulumi.get(self, "upgrade_mode")

    @upgrade_mode.setter
    def upgrade_mode(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "upgrade_mode", value)


@pulumi.type_token("akamai:index/appSecRuleUpgrade:AppSecRuleUpgrade")
class AppSecRuleUpgrade(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config_id: Optional[pulumi.Input[builtins.int]] = None,
                 security_policy_id: Optional[pulumi.Input[builtins.str]] = None,
                 upgrade_mode: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        Create a AppSecRuleUpgrade resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.int] config_id: Unique identifier of the security configuration
        :param pulumi.Input[builtins.str] security_policy_id: Unique identifier of the security policy
        :param pulumi.Input[builtins.str] upgrade_mode: Modifies the upgrade type for organizations running the ASE beta (ASE_AUTO or ASE_MANUAL)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AppSecRuleUpgradeArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a AppSecRuleUpgrade resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param AppSecRuleUpgradeArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AppSecRuleUpgradeArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config_id: Optional[pulumi.Input[builtins.int]] = None,
                 security_policy_id: Optional[pulumi.Input[builtins.str]] = None,
                 upgrade_mode: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AppSecRuleUpgradeArgs.__new__(AppSecRuleUpgradeArgs)

            if config_id is None and not opts.urn:
                raise TypeError("Missing required property 'config_id'")
            __props__.__dict__["config_id"] = config_id
            if security_policy_id is None and not opts.urn:
                raise TypeError("Missing required property 'security_policy_id'")
            __props__.__dict__["security_policy_id"] = security_policy_id
            __props__.__dict__["upgrade_mode"] = upgrade_mode
            __props__.__dict__["current_ruleset"] = None
            __props__.__dict__["eval_status"] = None
            __props__.__dict__["mode"] = None
        super(AppSecRuleUpgrade, __self__).__init__(
            'akamai:index/appSecRuleUpgrade:AppSecRuleUpgrade',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            config_id: Optional[pulumi.Input[builtins.int]] = None,
            current_ruleset: Optional[pulumi.Input[builtins.str]] = None,
            eval_status: Optional[pulumi.Input[builtins.str]] = None,
            mode: Optional[pulumi.Input[builtins.str]] = None,
            security_policy_id: Optional[pulumi.Input[builtins.str]] = None,
            upgrade_mode: Optional[pulumi.Input[builtins.str]] = None) -> 'AppSecRuleUpgrade':
        """
        Get an existing AppSecRuleUpgrade resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.int] config_id: Unique identifier of the security configuration
        :param pulumi.Input[builtins.str] current_ruleset: Versioning information for the current KRS rule set
        :param pulumi.Input[builtins.str] eval_status: Whether an evaluation is currently in progress
        :param pulumi.Input[builtins.str] mode: Upgrade mode (KRS, AAG, ASE_MANUAL or ASE_AUTO)
        :param pulumi.Input[builtins.str] security_policy_id: Unique identifier of the security policy
        :param pulumi.Input[builtins.str] upgrade_mode: Modifies the upgrade type for organizations running the ASE beta (ASE_AUTO or ASE_MANUAL)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AppSecRuleUpgradeState.__new__(_AppSecRuleUpgradeState)

        __props__.__dict__["config_id"] = config_id
        __props__.__dict__["current_ruleset"] = current_ruleset
        __props__.__dict__["eval_status"] = eval_status
        __props__.__dict__["mode"] = mode
        __props__.__dict__["security_policy_id"] = security_policy_id
        __props__.__dict__["upgrade_mode"] = upgrade_mode
        return AppSecRuleUpgrade(resource_name, opts=opts, __props__=__props__)

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
        Versioning information for the current KRS rule set
        """
        return pulumi.get(self, "current_ruleset")

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
        Upgrade mode (KRS, AAG, ASE_MANUAL or ASE_AUTO)
        """
        return pulumi.get(self, "mode")

    @property
    @pulumi.getter(name="securityPolicyId")
    def security_policy_id(self) -> pulumi.Output[builtins.str]:
        """
        Unique identifier of the security policy
        """
        return pulumi.get(self, "security_policy_id")

    @property
    @pulumi.getter(name="upgradeMode")
    def upgrade_mode(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        Modifies the upgrade type for organizations running the ASE beta (ASE_AUTO or ASE_MANUAL)
        """
        return pulumi.get(self, "upgrade_mode")

