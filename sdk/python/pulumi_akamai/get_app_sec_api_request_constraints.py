# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetAppSecApiRequestConstraintsResult',
    'AwaitableGetAppSecApiRequestConstraintsResult',
    'get_app_sec_api_request_constraints',
]

@pulumi.output_type
class GetAppSecApiRequestConstraintsResult:
    """
    A collection of values returned by getAppSecApiRequestConstraints.
    """
    def __init__(__self__, api_id=None, config_id=None, id=None, json=None, output_text=None, security_policy_id=None, version=None):
        if api_id and not isinstance(api_id, int):
            raise TypeError("Expected argument 'api_id' to be a int")
        pulumi.set(__self__, "api_id", api_id)
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
        if version and not isinstance(version, int):
            raise TypeError("Expected argument 'version' to be a int")
        pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter(name="apiId")
    def api_id(self) -> Optional[int]:
        return pulumi.get(self, "api_id")

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
        A JSON-formatted list of information about the APIs and their constraints and actions.
        """
        return pulumi.get(self, "json")

    @property
    @pulumi.getter(name="outputText")
    def output_text(self) -> str:
        """
        A tabular display showing the APIs and their constraints and actions.
        """
        return pulumi.get(self, "output_text")

    @property
    @pulumi.getter(name="securityPolicyId")
    def security_policy_id(self) -> str:
        return pulumi.get(self, "security_policy_id")

    @property
    @pulumi.getter
    def version(self) -> int:
        return pulumi.get(self, "version")


class AwaitableGetAppSecApiRequestConstraintsResult(GetAppSecApiRequestConstraintsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAppSecApiRequestConstraintsResult(
            api_id=self.api_id,
            config_id=self.config_id,
            id=self.id,
            json=self.json,
            output_text=self.output_text,
            security_policy_id=self.security_policy_id,
            version=self.version)


def get_app_sec_api_request_constraints(api_id: Optional[int] = None,
                                        config_id: Optional[int] = None,
                                        security_policy_id: Optional[str] = None,
                                        version: Optional[int] = None,
                                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAppSecApiRequestConstraintsResult:
    """
    Use the `AppSecApiRequestConstraints` data source to retrieve a list of APIs with their constraints and associated actions, or the constraints and actions for a particular API. The information available is described [here](https://developer.akamai.com/api/cloud_security/application_security/v1.html#getapirequestconstraints).

    ## Example Usage

    Basic usage:

    ```python
    import pulumi
    import pulumi_akamai as akamai

    configuration = akamai.get_app_sec_configuration(name=var["security_configuration"])
    apis_request_constraints = akamai.get_app_sec_api_request_constraints(config_id=configuration.config_id,
        version=configuration.latest_version,
        security_policy_id=var["security_policy_id"])
    pulumi.export("apisConstraintsText", apis_request_constraints.output_text)
    pulumi.export("apisConstraintsJson", apis_request_constraints.json)
    api_request_constraints = akamai.get_app_sec_api_request_constraints(config_id=configuration.config_id,
        version=configuration.latest_version,
        security_policy_id=var["security_policy_id"],
        api_id=var["api_id"])
    pulumi.export("apiConstraintsText", api_request_constraints.output_text)
    pulumi.export("apiConstraintsJson", api_request_constraints.json)
    ```


    :param int api_id: The ID of a specific API for which to retrieve constraint information.
    :param int config_id: The configuration ID to use.
    :param str security_policy_id: The ID of the security policy to use.
    :param int version: The version number of the configuration to use.
    """
    __args__ = dict()
    __args__['apiId'] = api_id
    __args__['configId'] = config_id
    __args__['securityPolicyId'] = security_policy_id
    __args__['version'] = version
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('akamai:index/getAppSecApiRequestConstraints:getAppSecApiRequestConstraints', __args__, opts=opts, typ=GetAppSecApiRequestConstraintsResult).value

    return AwaitableGetAppSecApiRequestConstraintsResult(
        api_id=__ret__.api_id,
        config_id=__ret__.config_id,
        id=__ret__.id,
        json=__ret__.json,
        output_text=__ret__.output_text,
        security_policy_id=__ret__.security_policy_id,
        version=__ret__.version)
