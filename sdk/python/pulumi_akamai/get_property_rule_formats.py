# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetPropertyRuleFormatsResult',
    'AwaitableGetPropertyRuleFormatsResult',
    'get_property_rule_formats',
]

@pulumi.output_type
class GetPropertyRuleFormatsResult:
    """
    A collection of values returned by getPropertyRuleFormats.
    """
    def __init__(__self__, id=None, rule_formats=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if rule_formats and not isinstance(rule_formats, list):
            raise TypeError("Expected argument 'rule_formats' to be a list")
        pulumi.set(__self__, "rule_formats", rule_formats)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="ruleFormats")
    def rule_formats(self) -> Sequence[str]:
        return pulumi.get(self, "rule_formats")


class AwaitableGetPropertyRuleFormatsResult(GetPropertyRuleFormatsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPropertyRuleFormatsResult(
            id=self.id,
            rule_formats=self.rule_formats)


def get_property_rule_formats(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPropertyRuleFormatsResult:
    """
    Use the `getPropertyRuleFormats` data source to query the list of
    known rule formats.
    You use rule formats to [freeze](https://developer.akamai.com/api/core_features/property_manager/v1.html#freezerf) or
    [update](https://developer.akamai.com/api/core_features/property_manager/v1.html#updaterf) the versioned set of behaviors
    and criteria a rule tree invokes. Without this mechanism, behaviors and criteria
    would update automatically and generate unexpected errors.

    ## Example Usage

    Use this example to list available property rule formats:

    ```python
    import pulumi

    pulumi.export("propertyMatch", data["akamai_property_rule_formats"]["my-example"])
    ```
    ## Argument reference

    There are no arguments available for this data source.
    """
    __args__ = dict()
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('akamai:index/getPropertyRuleFormats:getPropertyRuleFormats', __args__, opts=opts, typ=GetPropertyRuleFormatsResult).value

    return AwaitableGetPropertyRuleFormatsResult(
        id=__ret__.id,
        rule_formats=__ret__.rule_formats)
