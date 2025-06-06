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
    'GetAppSecIPGeoResult',
    'AwaitableGetAppSecIPGeoResult',
    'get_app_sec_ip_geo',
    'get_app_sec_ip_geo_output',
]

@pulumi.output_type
class GetAppSecIPGeoResult:
    """
    A collection of values returned by getAppSecIPGeo.
    """
    def __init__(__self__, asn_network_lists=None, config_id=None, exception_ip_network_lists=None, geo_network_lists=None, id=None, ip_network_lists=None, mode=None, output_text=None, security_policy_id=None, ukraine_geo_control_action=None):
        if asn_network_lists and not isinstance(asn_network_lists, list):
            raise TypeError("Expected argument 'asn_network_lists' to be a list")
        pulumi.set(__self__, "asn_network_lists", asn_network_lists)
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
        if ukraine_geo_control_action and not isinstance(ukraine_geo_control_action, str):
            raise TypeError("Expected argument 'ukraine_geo_control_action' to be a str")
        pulumi.set(__self__, "ukraine_geo_control_action", ukraine_geo_control_action)

    @property
    @pulumi.getter(name="asnNetworkLists")
    def asn_network_lists(self) -> Sequence[builtins.str]:
        return pulumi.get(self, "asn_network_lists")

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> builtins.int:
        return pulumi.get(self, "config_id")

    @property
    @pulumi.getter(name="exceptionIpNetworkLists")
    def exception_ip_network_lists(self) -> Sequence[builtins.str]:
        return pulumi.get(self, "exception_ip_network_lists")

    @property
    @pulumi.getter(name="geoNetworkLists")
    def geo_network_lists(self) -> Sequence[builtins.str]:
        return pulumi.get(self, "geo_network_lists")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="ipNetworkLists")
    def ip_network_lists(self) -> Sequence[builtins.str]:
        return pulumi.get(self, "ip_network_lists")

    @property
    @pulumi.getter
    def mode(self) -> builtins.str:
        return pulumi.get(self, "mode")

    @property
    @pulumi.getter(name="outputText")
    def output_text(self) -> builtins.str:
        return pulumi.get(self, "output_text")

    @property
    @pulumi.getter(name="securityPolicyId")
    def security_policy_id(self) -> builtins.str:
        return pulumi.get(self, "security_policy_id")

    @property
    @pulumi.getter(name="ukraineGeoControlAction")
    def ukraine_geo_control_action(self) -> builtins.str:
        return pulumi.get(self, "ukraine_geo_control_action")


class AwaitableGetAppSecIPGeoResult(GetAppSecIPGeoResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAppSecIPGeoResult(
            asn_network_lists=self.asn_network_lists,
            config_id=self.config_id,
            exception_ip_network_lists=self.exception_ip_network_lists,
            geo_network_lists=self.geo_network_lists,
            id=self.id,
            ip_network_lists=self.ip_network_lists,
            mode=self.mode,
            output_text=self.output_text,
            security_policy_id=self.security_policy_id,
            ukraine_geo_control_action=self.ukraine_geo_control_action)


def get_app_sec_ip_geo(config_id: Optional[builtins.int] = None,
                       security_policy_id: Optional[builtins.str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAppSecIPGeoResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['configId'] = config_id
    __args__['securityPolicyId'] = security_policy_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('akamai:index/getAppSecIPGeo:getAppSecIPGeo', __args__, opts=opts, typ=GetAppSecIPGeoResult).value

    return AwaitableGetAppSecIPGeoResult(
        asn_network_lists=pulumi.get(__ret__, 'asn_network_lists'),
        config_id=pulumi.get(__ret__, 'config_id'),
        exception_ip_network_lists=pulumi.get(__ret__, 'exception_ip_network_lists'),
        geo_network_lists=pulumi.get(__ret__, 'geo_network_lists'),
        id=pulumi.get(__ret__, 'id'),
        ip_network_lists=pulumi.get(__ret__, 'ip_network_lists'),
        mode=pulumi.get(__ret__, 'mode'),
        output_text=pulumi.get(__ret__, 'output_text'),
        security_policy_id=pulumi.get(__ret__, 'security_policy_id'),
        ukraine_geo_control_action=pulumi.get(__ret__, 'ukraine_geo_control_action'))
def get_app_sec_ip_geo_output(config_id: Optional[pulumi.Input[builtins.int]] = None,
                              security_policy_id: Optional[pulumi.Input[builtins.str]] = None,
                              opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetAppSecIPGeoResult]:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['configId'] = config_id
    __args__['securityPolicyId'] = security_policy_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('akamai:index/getAppSecIPGeo:getAppSecIPGeo', __args__, opts=opts, typ=GetAppSecIPGeoResult)
    return __ret__.apply(lambda __response__: GetAppSecIPGeoResult(
        asn_network_lists=pulumi.get(__response__, 'asn_network_lists'),
        config_id=pulumi.get(__response__, 'config_id'),
        exception_ip_network_lists=pulumi.get(__response__, 'exception_ip_network_lists'),
        geo_network_lists=pulumi.get(__response__, 'geo_network_lists'),
        id=pulumi.get(__response__, 'id'),
        ip_network_lists=pulumi.get(__response__, 'ip_network_lists'),
        mode=pulumi.get(__response__, 'mode'),
        output_text=pulumi.get(__response__, 'output_text'),
        security_policy_id=pulumi.get(__response__, 'security_policy_id'),
        ukraine_geo_control_action=pulumi.get(__response__, 'ukraine_geo_control_action')))
