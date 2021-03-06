# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetAppSecSelectedHostnamesResult',
    'AwaitableGetAppSecSelectedHostnamesResult',
    'get_app_sec_selected_hostnames',
]

@pulumi.output_type
class GetAppSecSelectedHostnamesResult:
    """
    A collection of values returned by getAppSecSelectedHostnames.
    """
    def __init__(__self__, config_id=None, hostnames=None, hostnames_json=None, id=None, output_text=None, version=None):
        if config_id and not isinstance(config_id, int):
            raise TypeError("Expected argument 'config_id' to be a int")
        pulumi.set(__self__, "config_id", config_id)
        if hostnames and not isinstance(hostnames, list):
            raise TypeError("Expected argument 'hostnames' to be a list")
        pulumi.set(__self__, "hostnames", hostnames)
        if hostnames_json and not isinstance(hostnames_json, str):
            raise TypeError("Expected argument 'hostnames_json' to be a str")
        pulumi.set(__self__, "hostnames_json", hostnames_json)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if output_text and not isinstance(output_text, str):
            raise TypeError("Expected argument 'output_text' to be a str")
        pulumi.set(__self__, "output_text", output_text)
        if version and not isinstance(version, int):
            raise TypeError("Expected argument 'version' to be a int")
        pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> int:
        return pulumi.get(self, "config_id")

    @property
    @pulumi.getter
    def hostnames(self) -> Sequence[str]:
        """
        The list of selected hostnames.
        """
        return pulumi.get(self, "hostnames")

    @property
    @pulumi.getter(name="hostnamesJson")
    def hostnames_json(self) -> str:
        """
        The list of selected hostnames in JSON format.
        """
        return pulumi.get(self, "hostnames_json")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="outputText")
    def output_text(self) -> str:
        """
        A tabular display of the selected hostnames.
        """
        return pulumi.get(self, "output_text")

    @property
    @pulumi.getter
    def version(self) -> int:
        return pulumi.get(self, "version")


class AwaitableGetAppSecSelectedHostnamesResult(GetAppSecSelectedHostnamesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAppSecSelectedHostnamesResult(
            config_id=self.config_id,
            hostnames=self.hostnames,
            hostnames_json=self.hostnames_json,
            id=self.id,
            output_text=self.output_text,
            version=self.version)


def get_app_sec_selected_hostnames(config_id: Optional[int] = None,
                                   version: Optional[int] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAppSecSelectedHostnamesResult:
    """
    Use the `AppSecSelectedHostnames` data source to retrieve a list of the hostnames that are currently protected under a given security configuration version.

    ## Example Usage

    Basic usage:

    ```python
    import pulumi
    import pulumi_akamai as akamai

    configuration = akamai.get_app_sec_configuration(name="Akamai Tools")
    selected_hostnames_app_sec_selected_hostnames = akamai.get_app_sec_selected_hostnames(config_id=configuration.config_id,
        version=configuration.latest_version)
    pulumi.export("selectedHostnames", selected_hostnames_app_sec_selected_hostnames.hostnames)
    pulumi.export("selectedHostnamesJson", selected_hostnames_app_sec_selected_hostnames.hostnames_json)
    pulumi.export("selectedHostnamesOutputText", selected_hostnames_app_sec_selected_hostnames.output_text)
    ```


    :param int config_id: The ID of the security configuration to use.
    :param int version: The version number of the security configuration to use.
    """
    __args__ = dict()
    __args__['configId'] = config_id
    __args__['version'] = version
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('akamai:index/getAppSecSelectedHostnames:getAppSecSelectedHostnames', __args__, opts=opts, typ=GetAppSecSelectedHostnamesResult).value

    return AwaitableGetAppSecSelectedHostnamesResult(
        config_id=__ret__.config_id,
        hostnames=__ret__.hostnames,
        hostnames_json=__ret__.hostnames_json,
        id=__ret__.id,
        output_text=__ret__.output_text,
        version=__ret__.version)
