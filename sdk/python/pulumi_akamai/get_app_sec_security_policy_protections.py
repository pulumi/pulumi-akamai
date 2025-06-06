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

__all__ = [
    'GetAppSecSecurityPolicyProtectionsResult',
    'AwaitableGetAppSecSecurityPolicyProtectionsResult',
    'get_app_sec_security_policy_protections',
    'get_app_sec_security_policy_protections_output',
]

@pulumi.output_type
class GetAppSecSecurityPolicyProtectionsResult:
    """
    A collection of values returned by getAppSecSecurityPolicyProtections.
    """
    def __init__(__self__, apply_api_constraints=None, apply_application_layer_controls=None, apply_botman_controls=None, apply_malware_controls=None, apply_network_layer_controls=None, apply_rate_controls=None, apply_reputation_controls=None, apply_slow_post_controls=None, config_id=None, id=None, json=None, output_text=None, security_policy_id=None):
        if apply_api_constraints and not isinstance(apply_api_constraints, bool):
            raise TypeError("Expected argument 'apply_api_constraints' to be a bool")
        pulumi.set(__self__, "apply_api_constraints", apply_api_constraints)
        if apply_application_layer_controls and not isinstance(apply_application_layer_controls, bool):
            raise TypeError("Expected argument 'apply_application_layer_controls' to be a bool")
        pulumi.set(__self__, "apply_application_layer_controls", apply_application_layer_controls)
        if apply_botman_controls and not isinstance(apply_botman_controls, bool):
            raise TypeError("Expected argument 'apply_botman_controls' to be a bool")
        pulumi.set(__self__, "apply_botman_controls", apply_botman_controls)
        if apply_malware_controls and not isinstance(apply_malware_controls, bool):
            raise TypeError("Expected argument 'apply_malware_controls' to be a bool")
        pulumi.set(__self__, "apply_malware_controls", apply_malware_controls)
        if apply_network_layer_controls and not isinstance(apply_network_layer_controls, bool):
            raise TypeError("Expected argument 'apply_network_layer_controls' to be a bool")
        pulumi.set(__self__, "apply_network_layer_controls", apply_network_layer_controls)
        if apply_rate_controls and not isinstance(apply_rate_controls, bool):
            raise TypeError("Expected argument 'apply_rate_controls' to be a bool")
        pulumi.set(__self__, "apply_rate_controls", apply_rate_controls)
        if apply_reputation_controls and not isinstance(apply_reputation_controls, bool):
            raise TypeError("Expected argument 'apply_reputation_controls' to be a bool")
        pulumi.set(__self__, "apply_reputation_controls", apply_reputation_controls)
        if apply_slow_post_controls and not isinstance(apply_slow_post_controls, bool):
            raise TypeError("Expected argument 'apply_slow_post_controls' to be a bool")
        pulumi.set(__self__, "apply_slow_post_controls", apply_slow_post_controls)
        if config_id and not isinstance(config_id, int):
            raise TypeError("Expected argument 'config_id' to be a int")
        pulumi.set(__self__, "config_id", config_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if json and not isinstance(json, str):
            raise TypeError("Expected argument 'json' to be a str")
        pulumi.set(__self__, "json", json)
        if output_text and not isinstance(output_text, str):
            raise TypeError("Expected argument 'output_text' to be a str")
        pulumi.set(__self__, "output_text", output_text)
        if security_policy_id and not isinstance(security_policy_id, str):
            raise TypeError("Expected argument 'security_policy_id' to be a str")
        pulumi.set(__self__, "security_policy_id", security_policy_id)

    @property
    @pulumi.getter(name="applyApiConstraints")
    def apply_api_constraints(self) -> builtins.bool:
        return pulumi.get(self, "apply_api_constraints")

    @property
    @pulumi.getter(name="applyApplicationLayerControls")
    def apply_application_layer_controls(self) -> builtins.bool:
        return pulumi.get(self, "apply_application_layer_controls")

    @property
    @pulumi.getter(name="applyBotmanControls")
    def apply_botman_controls(self) -> builtins.bool:
        return pulumi.get(self, "apply_botman_controls")

    @property
    @pulumi.getter(name="applyMalwareControls")
    def apply_malware_controls(self) -> builtins.bool:
        return pulumi.get(self, "apply_malware_controls")

    @property
    @pulumi.getter(name="applyNetworkLayerControls")
    def apply_network_layer_controls(self) -> builtins.bool:
        return pulumi.get(self, "apply_network_layer_controls")

    @property
    @pulumi.getter(name="applyRateControls")
    def apply_rate_controls(self) -> builtins.bool:
        return pulumi.get(self, "apply_rate_controls")

    @property
    @pulumi.getter(name="applyReputationControls")
    def apply_reputation_controls(self) -> builtins.bool:
        return pulumi.get(self, "apply_reputation_controls")

    @property
    @pulumi.getter(name="applySlowPostControls")
    def apply_slow_post_controls(self) -> builtins.bool:
        return pulumi.get(self, "apply_slow_post_controls")

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> builtins.int:
        return pulumi.get(self, "config_id")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def json(self) -> builtins.str:
        return pulumi.get(self, "json")

    @property
    @pulumi.getter(name="outputText")
    def output_text(self) -> builtins.str:
        return pulumi.get(self, "output_text")

    @property
    @pulumi.getter(name="securityPolicyId")
    def security_policy_id(self) -> builtins.str:
        return pulumi.get(self, "security_policy_id")


class AwaitableGetAppSecSecurityPolicyProtectionsResult(GetAppSecSecurityPolicyProtectionsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAppSecSecurityPolicyProtectionsResult(
            apply_api_constraints=self.apply_api_constraints,
            apply_application_layer_controls=self.apply_application_layer_controls,
            apply_botman_controls=self.apply_botman_controls,
            apply_malware_controls=self.apply_malware_controls,
            apply_network_layer_controls=self.apply_network_layer_controls,
            apply_rate_controls=self.apply_rate_controls,
            apply_reputation_controls=self.apply_reputation_controls,
            apply_slow_post_controls=self.apply_slow_post_controls,
            config_id=self.config_id,
            id=self.id,
            json=self.json,
            output_text=self.output_text,
            security_policy_id=self.security_policy_id)


def get_app_sec_security_policy_protections(config_id: Optional[builtins.int] = None,
                                            security_policy_id: Optional[builtins.str] = None,
                                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAppSecSecurityPolicyProtectionsResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['configId'] = config_id
    __args__['securityPolicyId'] = security_policy_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('akamai:index/getAppSecSecurityPolicyProtections:getAppSecSecurityPolicyProtections', __args__, opts=opts, typ=GetAppSecSecurityPolicyProtectionsResult).value

    return AwaitableGetAppSecSecurityPolicyProtectionsResult(
        apply_api_constraints=pulumi.get(__ret__, 'apply_api_constraints'),
        apply_application_layer_controls=pulumi.get(__ret__, 'apply_application_layer_controls'),
        apply_botman_controls=pulumi.get(__ret__, 'apply_botman_controls'),
        apply_malware_controls=pulumi.get(__ret__, 'apply_malware_controls'),
        apply_network_layer_controls=pulumi.get(__ret__, 'apply_network_layer_controls'),
        apply_rate_controls=pulumi.get(__ret__, 'apply_rate_controls'),
        apply_reputation_controls=pulumi.get(__ret__, 'apply_reputation_controls'),
        apply_slow_post_controls=pulumi.get(__ret__, 'apply_slow_post_controls'),
        config_id=pulumi.get(__ret__, 'config_id'),
        id=pulumi.get(__ret__, 'id'),
        json=pulumi.get(__ret__, 'json'),
        output_text=pulumi.get(__ret__, 'output_text'),
        security_policy_id=pulumi.get(__ret__, 'security_policy_id'))
def get_app_sec_security_policy_protections_output(config_id: Optional[pulumi.Input[builtins.int]] = None,
                                                   security_policy_id: Optional[pulumi.Input[builtins.str]] = None,
                                                   opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetAppSecSecurityPolicyProtectionsResult]:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['configId'] = config_id
    __args__['securityPolicyId'] = security_policy_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('akamai:index/getAppSecSecurityPolicyProtections:getAppSecSecurityPolicyProtections', __args__, opts=opts, typ=GetAppSecSecurityPolicyProtectionsResult)
    return __ret__.apply(lambda __response__: GetAppSecSecurityPolicyProtectionsResult(
        apply_api_constraints=pulumi.get(__response__, 'apply_api_constraints'),
        apply_application_layer_controls=pulumi.get(__response__, 'apply_application_layer_controls'),
        apply_botman_controls=pulumi.get(__response__, 'apply_botman_controls'),
        apply_malware_controls=pulumi.get(__response__, 'apply_malware_controls'),
        apply_network_layer_controls=pulumi.get(__response__, 'apply_network_layer_controls'),
        apply_rate_controls=pulumi.get(__response__, 'apply_rate_controls'),
        apply_reputation_controls=pulumi.get(__response__, 'apply_reputation_controls'),
        apply_slow_post_controls=pulumi.get(__response__, 'apply_slow_post_controls'),
        config_id=pulumi.get(__response__, 'config_id'),
        id=pulumi.get(__response__, 'id'),
        json=pulumi.get(__response__, 'json'),
        output_text=pulumi.get(__response__, 'output_text'),
        security_policy_id=pulumi.get(__response__, 'security_policy_id')))
