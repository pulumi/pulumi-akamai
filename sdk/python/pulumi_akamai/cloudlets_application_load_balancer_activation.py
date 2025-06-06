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
from . import outputs
from ._inputs import *

__all__ = ['CloudletsApplicationLoadBalancerActivationArgs', 'CloudletsApplicationLoadBalancerActivation']

@pulumi.input_type
class CloudletsApplicationLoadBalancerActivationArgs:
    def __init__(__self__, *,
                 network: pulumi.Input[builtins.str],
                 origin_id: pulumi.Input[builtins.str],
                 version: pulumi.Input[builtins.int],
                 timeouts: Optional[pulumi.Input['CloudletsApplicationLoadBalancerActivationTimeoutsArgs']] = None):
        """
        The set of arguments for constructing a CloudletsApplicationLoadBalancerActivation resource.
        :param pulumi.Input[builtins.str] network: The network you want to activate the application load balancer version on (options are Staging and Production)
        :param pulumi.Input[builtins.str] origin_id: The conditional origin’s unique identifier
        :param pulumi.Input[builtins.int] version: Cloudlets application load balancer version you want to activate
        :param pulumi.Input['CloudletsApplicationLoadBalancerActivationTimeoutsArgs'] timeouts: Enables to set timeout for processing
        """
        pulumi.set(__self__, "network", network)
        pulumi.set(__self__, "origin_id", origin_id)
        pulumi.set(__self__, "version", version)
        if timeouts is not None:
            pulumi.set(__self__, "timeouts", timeouts)

    @property
    @pulumi.getter
    def network(self) -> pulumi.Input[builtins.str]:
        """
        The network you want to activate the application load balancer version on (options are Staging and Production)
        """
        return pulumi.get(self, "network")

    @network.setter
    def network(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "network", value)

    @property
    @pulumi.getter(name="originId")
    def origin_id(self) -> pulumi.Input[builtins.str]:
        """
        The conditional origin’s unique identifier
        """
        return pulumi.get(self, "origin_id")

    @origin_id.setter
    def origin_id(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "origin_id", value)

    @property
    @pulumi.getter
    def version(self) -> pulumi.Input[builtins.int]:
        """
        Cloudlets application load balancer version you want to activate
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: pulumi.Input[builtins.int]):
        pulumi.set(self, "version", value)

    @property
    @pulumi.getter
    def timeouts(self) -> Optional[pulumi.Input['CloudletsApplicationLoadBalancerActivationTimeoutsArgs']]:
        """
        Enables to set timeout for processing
        """
        return pulumi.get(self, "timeouts")

    @timeouts.setter
    def timeouts(self, value: Optional[pulumi.Input['CloudletsApplicationLoadBalancerActivationTimeoutsArgs']]):
        pulumi.set(self, "timeouts", value)


@pulumi.input_type
class _CloudletsApplicationLoadBalancerActivationState:
    def __init__(__self__, *,
                 network: Optional[pulumi.Input[builtins.str]] = None,
                 origin_id: Optional[pulumi.Input[builtins.str]] = None,
                 status: Optional[pulumi.Input[builtins.str]] = None,
                 timeouts: Optional[pulumi.Input['CloudletsApplicationLoadBalancerActivationTimeoutsArgs']] = None,
                 version: Optional[pulumi.Input[builtins.int]] = None):
        """
        Input properties used for looking up and filtering CloudletsApplicationLoadBalancerActivation resources.
        :param pulumi.Input[builtins.str] network: The network you want to activate the application load balancer version on (options are Staging and Production)
        :param pulumi.Input[builtins.str] origin_id: The conditional origin’s unique identifier
        :param pulumi.Input[builtins.str] status: Activation status for this application load balancer
        :param pulumi.Input['CloudletsApplicationLoadBalancerActivationTimeoutsArgs'] timeouts: Enables to set timeout for processing
        :param pulumi.Input[builtins.int] version: Cloudlets application load balancer version you want to activate
        """
        if network is not None:
            pulumi.set(__self__, "network", network)
        if origin_id is not None:
            pulumi.set(__self__, "origin_id", origin_id)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if timeouts is not None:
            pulumi.set(__self__, "timeouts", timeouts)
        if version is not None:
            pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter
    def network(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The network you want to activate the application load balancer version on (options are Staging and Production)
        """
        return pulumi.get(self, "network")

    @network.setter
    def network(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "network", value)

    @property
    @pulumi.getter(name="originId")
    def origin_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The conditional origin’s unique identifier
        """
        return pulumi.get(self, "origin_id")

    @origin_id.setter
    def origin_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "origin_id", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Activation status for this application load balancer
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def timeouts(self) -> Optional[pulumi.Input['CloudletsApplicationLoadBalancerActivationTimeoutsArgs']]:
        """
        Enables to set timeout for processing
        """
        return pulumi.get(self, "timeouts")

    @timeouts.setter
    def timeouts(self, value: Optional[pulumi.Input['CloudletsApplicationLoadBalancerActivationTimeoutsArgs']]):
        pulumi.set(self, "timeouts", value)

    @property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        Cloudlets application load balancer version you want to activate
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "version", value)


@pulumi.type_token("akamai:index/cloudletsApplicationLoadBalancerActivation:CloudletsApplicationLoadBalancerActivation")
class CloudletsApplicationLoadBalancerActivation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 network: Optional[pulumi.Input[builtins.str]] = None,
                 origin_id: Optional[pulumi.Input[builtins.str]] = None,
                 timeouts: Optional[pulumi.Input[Union['CloudletsApplicationLoadBalancerActivationTimeoutsArgs', 'CloudletsApplicationLoadBalancerActivationTimeoutsArgsDict']]] = None,
                 version: Optional[pulumi.Input[builtins.int]] = None,
                 __props__=None):
        """
        Create a CloudletsApplicationLoadBalancerActivation resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] network: The network you want to activate the application load balancer version on (options are Staging and Production)
        :param pulumi.Input[builtins.str] origin_id: The conditional origin’s unique identifier
        :param pulumi.Input[Union['CloudletsApplicationLoadBalancerActivationTimeoutsArgs', 'CloudletsApplicationLoadBalancerActivationTimeoutsArgsDict']] timeouts: Enables to set timeout for processing
        :param pulumi.Input[builtins.int] version: Cloudlets application load balancer version you want to activate
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CloudletsApplicationLoadBalancerActivationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a CloudletsApplicationLoadBalancerActivation resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param CloudletsApplicationLoadBalancerActivationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CloudletsApplicationLoadBalancerActivationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 network: Optional[pulumi.Input[builtins.str]] = None,
                 origin_id: Optional[pulumi.Input[builtins.str]] = None,
                 timeouts: Optional[pulumi.Input[Union['CloudletsApplicationLoadBalancerActivationTimeoutsArgs', 'CloudletsApplicationLoadBalancerActivationTimeoutsArgsDict']]] = None,
                 version: Optional[pulumi.Input[builtins.int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CloudletsApplicationLoadBalancerActivationArgs.__new__(CloudletsApplicationLoadBalancerActivationArgs)

            if network is None and not opts.urn:
                raise TypeError("Missing required property 'network'")
            __props__.__dict__["network"] = network
            if origin_id is None and not opts.urn:
                raise TypeError("Missing required property 'origin_id'")
            __props__.__dict__["origin_id"] = origin_id
            __props__.__dict__["timeouts"] = timeouts
            if version is None and not opts.urn:
                raise TypeError("Missing required property 'version'")
            __props__.__dict__["version"] = version
            __props__.__dict__["status"] = None
        super(CloudletsApplicationLoadBalancerActivation, __self__).__init__(
            'akamai:index/cloudletsApplicationLoadBalancerActivation:CloudletsApplicationLoadBalancerActivation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            network: Optional[pulumi.Input[builtins.str]] = None,
            origin_id: Optional[pulumi.Input[builtins.str]] = None,
            status: Optional[pulumi.Input[builtins.str]] = None,
            timeouts: Optional[pulumi.Input[Union['CloudletsApplicationLoadBalancerActivationTimeoutsArgs', 'CloudletsApplicationLoadBalancerActivationTimeoutsArgsDict']]] = None,
            version: Optional[pulumi.Input[builtins.int]] = None) -> 'CloudletsApplicationLoadBalancerActivation':
        """
        Get an existing CloudletsApplicationLoadBalancerActivation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] network: The network you want to activate the application load balancer version on (options are Staging and Production)
        :param pulumi.Input[builtins.str] origin_id: The conditional origin’s unique identifier
        :param pulumi.Input[builtins.str] status: Activation status for this application load balancer
        :param pulumi.Input[Union['CloudletsApplicationLoadBalancerActivationTimeoutsArgs', 'CloudletsApplicationLoadBalancerActivationTimeoutsArgsDict']] timeouts: Enables to set timeout for processing
        :param pulumi.Input[builtins.int] version: Cloudlets application load balancer version you want to activate
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CloudletsApplicationLoadBalancerActivationState.__new__(_CloudletsApplicationLoadBalancerActivationState)

        __props__.__dict__["network"] = network
        __props__.__dict__["origin_id"] = origin_id
        __props__.__dict__["status"] = status
        __props__.__dict__["timeouts"] = timeouts
        __props__.__dict__["version"] = version
        return CloudletsApplicationLoadBalancerActivation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def network(self) -> pulumi.Output[builtins.str]:
        """
        The network you want to activate the application load balancer version on (options are Staging and Production)
        """
        return pulumi.get(self, "network")

    @property
    @pulumi.getter(name="originId")
    def origin_id(self) -> pulumi.Output[builtins.str]:
        """
        The conditional origin’s unique identifier
        """
        return pulumi.get(self, "origin_id")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[builtins.str]:
        """
        Activation status for this application load balancer
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def timeouts(self) -> pulumi.Output[Optional['outputs.CloudletsApplicationLoadBalancerActivationTimeouts']]:
        """
        Enables to set timeout for processing
        """
        return pulumi.get(self, "timeouts")

    @property
    @pulumi.getter
    def version(self) -> pulumi.Output[builtins.int]:
        """
        Cloudlets application load balancer version you want to activate
        """
        return pulumi.get(self, "version")

