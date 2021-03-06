# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetAppSecExportConfigurationResult',
    'AwaitableGetAppSecExportConfigurationResult',
    'get_app_sec_export_configuration',
]

@pulumi.output_type
class GetAppSecExportConfigurationResult:
    """
    A collection of values returned by getAppSecExportConfiguration.
    """
    def __init__(__self__, config_id=None, id=None, json=None, output_text=None, searches=None, version=None):
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
        if searches and not isinstance(searches, list):
            raise TypeError("Expected argument 'searches' to be a list")
        pulumi.set(__self__, "searches", searches)
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
        The complete set of information about the specified security configuration version, in JSON format. This includes the types available for the `search` parameter, plus several additional fields such as createDate and createdBy.
        """
        return pulumi.get(self, "json")

    @property
    @pulumi.getter(name="outputText")
    def output_text(self) -> str:
        """
        A tabular display showing the types of data specified in the `search` parameter. Included only if the `search` parameter specifies at least one type.
        """
        return pulumi.get(self, "output_text")

    @property
    @pulumi.getter
    def searches(self) -> Optional[Sequence[str]]:
        return pulumi.get(self, "searches")

    @property
    @pulumi.getter
    def version(self) -> int:
        return pulumi.get(self, "version")


class AwaitableGetAppSecExportConfigurationResult(GetAppSecExportConfigurationResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAppSecExportConfigurationResult(
            config_id=self.config_id,
            id=self.id,
            json=self.json,
            output_text=self.output_text,
            searches=self.searches,
            version=self.version)


def get_app_sec_export_configuration(config_id: Optional[int] = None,
                                     searches: Optional[Sequence[str]] = None,
                                     version: Optional[int] = None,
                                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAppSecExportConfigurationResult:
    """
    Use the `getAppSecExportConfiguration` data source to retrieve comprehensive details about a security configuration version, including rate and security policies, rules, hostnames, and other settings. You can retrieve the entire set of information in JSON format, or a subset of the information in tabular format.

    ## Example Usage

    Basic usage:

    ```python
    import pulumi
    import pulumi_akamai as akamai

    configuration = akamai.get_app_sec_configuration(name="Akamai Tools")
    export = akamai.get_app_sec_export_configuration(config_id=configuration.config_id,
        version=configuration.latest_version,
        searches=[
            "securityPolicies",
            "selectedHosts",
        ])
    pulumi.export("json", export.json)
    pulumi.export("text", export.output_text)
    ```


    :param int config_id: The ID of the security configuration to use.
    :param Sequence[str] searches: A bracket-delimited list of quoted strings specifying the types of information to be retrieved and made available for display in the `output_text` format. The following types are available:
           * customRules
           * matchTargets
           * ratePolicies
           * reputationProfiles
           * rulesets
           * securityPolicies
           * selectableHosts
           * selectedHosts
    :param int version: The version number of the security configuration to use.
    """
    __args__ = dict()
    __args__['configId'] = config_id
    __args__['searches'] = searches
    __args__['version'] = version
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('akamai:index/getAppSecExportConfiguration:getAppSecExportConfiguration', __args__, opts=opts, typ=GetAppSecExportConfigurationResult).value

    return AwaitableGetAppSecExportConfigurationResult(
        config_id=__ret__.config_id,
        id=__ret__.id,
        json=__ret__.json,
        output_text=__ret__.output_text,
        searches=__ret__.searches,
        version=__ret__.version)
