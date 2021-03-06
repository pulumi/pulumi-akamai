# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetAppSecRatePoliciesResult',
    'AwaitableGetAppSecRatePoliciesResult',
    'get_app_sec_rate_policies',
]

@pulumi.output_type
class GetAppSecRatePoliciesResult:
    """
    A collection of values returned by getAppSecRatePolicies.
    """
    def __init__(__self__, config_id=None, id=None, json=None, output_text=None, rate_policy_id=None, version=None):
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
        if rate_policy_id and not isinstance(rate_policy_id, int):
            raise TypeError("Expected argument 'rate_policy_id' to be a int")
        pulumi.set(__self__, "rate_policy_id", rate_policy_id)
        if version and not isinstance(version, int):
            raise TypeError("Expected argument 'version' to be a int")
        pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> int:
        return pulumi.get(self, "config_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def json(self) -> str:
        """
        A JSON-formatted list of the rate policy information.
        """
        return pulumi.get(self, "json")

    @property
    @pulumi.getter(name="outputText")
    def output_text(self) -> str:
        """
        A tabular display showing the ID and name of all rate policies associated with the specified security configuration version.
        """
        return pulumi.get(self, "output_text")

    @property
    @pulumi.getter(name="ratePolicyId")
    def rate_policy_id(self) -> Optional[int]:
        return pulumi.get(self, "rate_policy_id")

    @property
    @pulumi.getter
    def version(self) -> int:
        return pulumi.get(self, "version")


class AwaitableGetAppSecRatePoliciesResult(GetAppSecRatePoliciesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAppSecRatePoliciesResult(
            config_id=self.config_id,
            id=self.id,
            json=self.json,
            output_text=self.output_text,
            rate_policy_id=self.rate_policy_id,
            version=self.version)


def get_app_sec_rate_policies(config_id: Optional[int] = None,
                              rate_policy_id: Optional[int] = None,
                              version: Optional[int] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAppSecRatePoliciesResult:
    """
    Use the `getAppSecRatePolicies` data source to retrieve the rate policies for a specific security configuration version, or a single rate policy.

    ## Example Usage

    Basic usage:

    ```python
    import pulumi
    import pulumi_akamai as akamai

    configuration = akamai.get_app_sec_configuration(name=var["security_configuration"])
    rate_policies = akamai.get_app_sec_rate_policies(config_id=configuration.config_id,
        version=configuration.latest_version)
    pulumi.export("ratePoliciesOutput", rate_policies.output_text)
    pulumi.export("ratePoliciesJson", rate_policies.json)
    rate_policy = akamai.get_app_sec_rate_policies(config_id=configuration.config_id,
        version=configuration.latest_version,
        rate_policy_id=var["rate_policy_id"])
    pulumi.export("ratePolicyJson", rate_policy.json)
    pulumi.export("ratePolicyOutput", rate_policy.output_text)
    ```


    :param int config_id: The ID of the security configuration to use.
    :param int rate_policy_id: The ID of the rate policy to use. If this parameter is not supplied, information about all rate policies will be returned.
    :param int version: The version number of the security configuration to use.
    """
    __args__ = dict()
    __args__['configId'] = config_id
    __args__['ratePolicyId'] = rate_policy_id
    __args__['version'] = version
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('akamai:index/getAppSecRatePolicies:getAppSecRatePolicies', __args__, opts=opts, typ=GetAppSecRatePoliciesResult).value

    return AwaitableGetAppSecRatePoliciesResult(
        config_id=__ret__.config_id,
        id=__ret__.id,
        json=__ret__.json,
        output_text=__ret__.output_text,
        rate_policy_id=__ret__.rate_policy_id,
        version=__ret__.version)
