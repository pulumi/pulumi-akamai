# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetAppSecIPGeoResult',
    'AwaitableGetAppSecIPGeoResult',
    'get_app_sec_ip_geo',
]

@pulumi.output_type
class GetAppSecIPGeoResult:
    """
    A collection of values returned by getAppSecIPGeo.
    """
    def __init__(__self__, config_id=None, exception_ip_network_lists=None, geo_network_lists=None, id=None, ip_network_lists=None, mode=None, output_text=None, security_policy_id=None, version=None):
        if config_id and not isinstance(config_id, int):
            raise TypeError("Expected argument 'config_id' to be a int")
        pulumi.set(__self__, "config_id", config_id)
        if exception_ip_network_lists and not isinstance(exception_ip_network_lists, list):
            raise TypeError("Expected argument 'exception_ip_network_lists' to be a list")
        pulumi.set(__self__, "exception_ip_network_lists", exception_ip_network_lists)
        if geo_network_lists and not isinstance(geo_network_lists, list):
            raise TypeError("Expected argument 'geo_network_lists' to be a list")
        pulumi.set(__self__, "geo_network_lists", geo_network_lists)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ip_network_lists and not isinstance(ip_network_lists, list):
            raise TypeError("Expected argument 'ip_network_lists' to be a list")
        pulumi.set(__self__, "ip_network_lists", ip_network_lists)
        if mode and not isinstance(mode, str):
            raise TypeError("Expected argument 'mode' to be a str")
        pulumi.set(__self__, "mode", mode)
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
    @pulumi.getter(name="configId")
    def config_id(self) -> int:
        return pulumi.get(self, "config_id")

    @property
    @pulumi.getter(name="exceptionIpNetworkLists")
    def exception_ip_network_lists(self) -> Sequence[str]:
        """
        The network lists to be allowed regardless of `mode`, `geo_network_lists`, and `ip_network_lists` parameters.
        """
        return pulumi.get(self, "exception_ip_network_lists")

    @property
    @pulumi.getter(name="geoNetworkLists")
    def geo_network_lists(self) -> Sequence[str]:
        """
        The network lists to be blocked or allowed geographically.
        """
        return pulumi.get(self, "geo_network_lists")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="ipNetworkLists")
    def ip_network_lists(self) -> Sequence[str]:
        """
        The network lists to be blocked or allowd by IP address.
        """
        return pulumi.get(self, "ip_network_lists")

    @property
    @pulumi.getter
    def mode(self) -> str:
        """
        The mode used for IP/Geo firewall blocking: `block` to block specific IPs, geographies or network lists, or `allow` to allow specific IPs or geographies to be let through while blocking the rest.
        """
        return pulumi.get(self, "mode")

    @property
    @pulumi.getter(name="outputText")
    def output_text(self) -> str:
        """
        A tabular display of the IP/Geo firewall settings.
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


class AwaitableGetAppSecIPGeoResult(GetAppSecIPGeoResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAppSecIPGeoResult(
            config_id=self.config_id,
            exception_ip_network_lists=self.exception_ip_network_lists,
            geo_network_lists=self.geo_network_lists,
            id=self.id,
            ip_network_lists=self.ip_network_lists,
            mode=self.mode,
            output_text=self.output_text,
            security_policy_id=self.security_policy_id,
            version=self.version)


def get_app_sec_ip_geo(config_id: Optional[int] = None,
                       security_policy_id: Optional[str] = None,
                       version: Optional[int] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAppSecIPGeoResult:
    """
    Use the `AppSecIPGeo` data source to retrieve information about which network lists are used in the IP/Geo Firewall settings.

    ## Example Usage

    Basic usage:

    ```python
    import pulumi
    import pulumi_akamai as akamai

    configuration = akamai.get_app_sec_configuration(name=var["security_configuration"])
    ip_geo = akamai.get_app_sec_ip_geo(config_id=configuration.config_id,
        version=configuration.latest_version,
        security_policy_id=var["security_policy_id"])
    pulumi.export("ipGeoMode", ip_geo.mode)
    pulumi.export("geoNetworkLists", ip_geo.geo_network_lists)
    pulumi.export("ipNetworkLists", ip_geo.ip_network_lists)
    pulumi.export("exceptionIpNetworkLists", ip_geo.exception_ip_network_lists)
    ```


    :param int config_id: The ID of the security configuration to use.
    :param str security_policy_id: The ID of the security policy to use.
    :param int version: The version number of the security configuration to use.
    """
    __args__ = dict()
    __args__['configId'] = config_id
    __args__['securityPolicyId'] = security_policy_id
    __args__['version'] = version
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('akamai:index/getAppSecIPGeo:getAppSecIPGeo', __args__, opts=opts, typ=GetAppSecIPGeoResult).value

    return AwaitableGetAppSecIPGeoResult(
        config_id=__ret__.config_id,
        exception_ip_network_lists=__ret__.exception_ip_network_lists,
        geo_network_lists=__ret__.geo_network_lists,
        id=__ret__.id,
        ip_network_lists=__ret__.ip_network_lists,
        mode=__ret__.mode,
        output_text=__ret__.output_text,
        security_policy_id=__ret__.security_policy_id,
        version=__ret__.version)
