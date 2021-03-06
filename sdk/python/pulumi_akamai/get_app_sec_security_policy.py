# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetAppSecSecurityPolicyResult',
    'AwaitableGetAppSecSecurityPolicyResult',
    'get_app_sec_security_policy',
]

@pulumi.output_type
class GetAppSecSecurityPolicyResult:
    """
    A collection of values returned by getAppSecSecurityPolicy.
    """
    def __init__(__self__, config_id=None, id=None, name=None, output_text=None, policy_id=None, policy_lists=None, version=None):
        if config_id and not isinstance(config_id, int):
            raise TypeError("Expected argument 'config_id' to be a int")
        pulumi.set(__self__, "config_id", config_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if output_text and not isinstance(output_text, str):
            raise TypeError("Expected argument 'output_text' to be a str")
        pulumi.set(__self__, "output_text", output_text)
        if policy_id and not isinstance(policy_id, str):
            raise TypeError("Expected argument 'policy_id' to be a str")
        pulumi.set(__self__, "policy_id", policy_id)
        if policy_lists and not isinstance(policy_lists, list):
            raise TypeError("Expected argument 'policy_lists' to be a list")
        pulumi.set(__self__, "policy_lists", policy_lists)
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
    def name(self) -> Optional[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="outputText")
    def output_text(self) -> str:
        """
        A tabular display showing the ID and name of all security policies.
        """
        return pulumi.get(self, "output_text")

    @property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> str:
        """
        The ID of the security policy. Included only if `name` was specified.
        """
        return pulumi.get(self, "policy_id")

    @property
    @pulumi.getter(name="policyLists")
    def policy_lists(self) -> Sequence[str]:
        """
        A list of the IDs of all security policies.
        """
        return pulumi.get(self, "policy_lists")

    @property
    @pulumi.getter
    def version(self) -> int:
        return pulumi.get(self, "version")


class AwaitableGetAppSecSecurityPolicyResult(GetAppSecSecurityPolicyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAppSecSecurityPolicyResult(
            config_id=self.config_id,
            id=self.id,
            name=self.name,
            output_text=self.output_text,
            policy_id=self.policy_id,
            policy_lists=self.policy_lists,
            version=self.version)


def get_app_sec_security_policy(config_id: Optional[int] = None,
                                name: Optional[str] = None,
                                version: Optional[int] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAppSecSecurityPolicyResult:
    """
    Use the `AppSecSecurityPolicy` data source to retrieve information about the security policies associated with a specific security configuration version, or about a specific security policy.

    ## Example Usage

    Basic usage:

    ```python
    import pulumi
    import pulumi_akamai as akamai

    configuration = akamai.get_app_sec_configuration(name="Akamai Tools")
    security_policies = akamai.get_app_sec_security_policy(config_id=configuration.config_id,
        version=configuration.latest_version)
    pulumi.export("securityPoliciesList", security_policies.policy_lists)
    pulumi.export("securityPoliciesText", security_policies.output_text)
    specific_security_policy = akamai.get_app_sec_security_policy(config_id=configuration.config_id,
        version=configuration.latest_version,
        name="APIs")
    pulumi.export("specificSecurityPolicyId", specific_security_policy.policy_id)
    ```


    :param int config_id: The ID of the security configuration to use.
    :param str name: The name of the security policy to use. If not supplied, information about all security policies is returned.
    :param int version: The version number of the security configuration to use.
    """
    __args__ = dict()
    __args__['configId'] = config_id
    __args__['name'] = name
    __args__['version'] = version
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('akamai:index/getAppSecSecurityPolicy:getAppSecSecurityPolicy', __args__, opts=opts, typ=GetAppSecSecurityPolicyResult).value

    return AwaitableGetAppSecSecurityPolicyResult(
        config_id=__ret__.config_id,
        id=__ret__.id,
        name=__ret__.name,
        output_text=__ret__.output_text,
        policy_id=__ret__.policy_id,
        policy_lists=__ret__.policy_lists,
        version=__ret__.version)
