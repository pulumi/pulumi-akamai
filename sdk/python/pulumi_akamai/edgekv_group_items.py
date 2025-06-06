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

__all__ = ['EdgekvGroupItemsArgs', 'EdgekvGroupItems']

@pulumi.input_type
class EdgekvGroupItemsArgs:
    def __init__(__self__, *,
                 group_name: pulumi.Input[builtins.str],
                 items: pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]],
                 namespace_name: pulumi.Input[builtins.str],
                 network: pulumi.Input[builtins.str],
                 timeouts: Optional[pulumi.Input['EdgekvGroupItemsTimeoutsArgs']] = None):
        """
        The set of arguments for constructing a EdgekvGroupItems resource.
        :param pulumi.Input[builtins.str] group_name: The name of the EdgeKV group.
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] items: A map of items within the specified group. Each item consists of an item key and a value.
        :param pulumi.Input[builtins.str] namespace_name: The name for the EdgeKV namespace.
        :param pulumi.Input[builtins.str] network: The network against which to execute the API request.
        :param pulumi.Input['EdgekvGroupItemsTimeoutsArgs'] timeouts: Enables to set timeout for processing
        """
        pulumi.set(__self__, "group_name", group_name)
        pulumi.set(__self__, "items", items)
        pulumi.set(__self__, "namespace_name", namespace_name)
        pulumi.set(__self__, "network", network)
        if timeouts is not None:
            pulumi.set(__self__, "timeouts", timeouts)

    @property
    @pulumi.getter(name="groupName")
    def group_name(self) -> pulumi.Input[builtins.str]:
        """
        The name of the EdgeKV group.
        """
        return pulumi.get(self, "group_name")

    @group_name.setter
    def group_name(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "group_name", value)

    @property
    @pulumi.getter
    def items(self) -> pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]:
        """
        A map of items within the specified group. Each item consists of an item key and a value.
        """
        return pulumi.get(self, "items")

    @items.setter
    def items(self, value: pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]):
        pulumi.set(self, "items", value)

    @property
    @pulumi.getter(name="namespaceName")
    def namespace_name(self) -> pulumi.Input[builtins.str]:
        """
        The name for the EdgeKV namespace.
        """
        return pulumi.get(self, "namespace_name")

    @namespace_name.setter
    def namespace_name(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "namespace_name", value)

    @property
    @pulumi.getter
    def network(self) -> pulumi.Input[builtins.str]:
        """
        The network against which to execute the API request.
        """
        return pulumi.get(self, "network")

    @network.setter
    def network(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "network", value)

    @property
    @pulumi.getter
    def timeouts(self) -> Optional[pulumi.Input['EdgekvGroupItemsTimeoutsArgs']]:
        """
        Enables to set timeout for processing
        """
        return pulumi.get(self, "timeouts")

    @timeouts.setter
    def timeouts(self, value: Optional[pulumi.Input['EdgekvGroupItemsTimeoutsArgs']]):
        pulumi.set(self, "timeouts", value)


@pulumi.input_type
class _EdgekvGroupItemsState:
    def __init__(__self__, *,
                 group_name: Optional[pulumi.Input[builtins.str]] = None,
                 items: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
                 namespace_name: Optional[pulumi.Input[builtins.str]] = None,
                 network: Optional[pulumi.Input[builtins.str]] = None,
                 timeouts: Optional[pulumi.Input['EdgekvGroupItemsTimeoutsArgs']] = None):
        """
        Input properties used for looking up and filtering EdgekvGroupItems resources.
        :param pulumi.Input[builtins.str] group_name: The name of the EdgeKV group.
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] items: A map of items within the specified group. Each item consists of an item key and a value.
        :param pulumi.Input[builtins.str] namespace_name: The name for the EdgeKV namespace.
        :param pulumi.Input[builtins.str] network: The network against which to execute the API request.
        :param pulumi.Input['EdgekvGroupItemsTimeoutsArgs'] timeouts: Enables to set timeout for processing
        """
        if group_name is not None:
            pulumi.set(__self__, "group_name", group_name)
        if items is not None:
            pulumi.set(__self__, "items", items)
        if namespace_name is not None:
            pulumi.set(__self__, "namespace_name", namespace_name)
        if network is not None:
            pulumi.set(__self__, "network", network)
        if timeouts is not None:
            pulumi.set(__self__, "timeouts", timeouts)

    @property
    @pulumi.getter(name="groupName")
    def group_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the EdgeKV group.
        """
        return pulumi.get(self, "group_name")

    @group_name.setter
    def group_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "group_name", value)

    @property
    @pulumi.getter
    def items(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]]:
        """
        A map of items within the specified group. Each item consists of an item key and a value.
        """
        return pulumi.get(self, "items")

    @items.setter
    def items(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "items", value)

    @property
    @pulumi.getter(name="namespaceName")
    def namespace_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name for the EdgeKV namespace.
        """
        return pulumi.get(self, "namespace_name")

    @namespace_name.setter
    def namespace_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "namespace_name", value)

    @property
    @pulumi.getter
    def network(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The network against which to execute the API request.
        """
        return pulumi.get(self, "network")

    @network.setter
    def network(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "network", value)

    @property
    @pulumi.getter
    def timeouts(self) -> Optional[pulumi.Input['EdgekvGroupItemsTimeoutsArgs']]:
        """
        Enables to set timeout for processing
        """
        return pulumi.get(self, "timeouts")

    @timeouts.setter
    def timeouts(self, value: Optional[pulumi.Input['EdgekvGroupItemsTimeoutsArgs']]):
        pulumi.set(self, "timeouts", value)


@pulumi.type_token("akamai:index/edgekvGroupItems:EdgekvGroupItems")
class EdgekvGroupItems(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 group_name: Optional[pulumi.Input[builtins.str]] = None,
                 items: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
                 namespace_name: Optional[pulumi.Input[builtins.str]] = None,
                 network: Optional[pulumi.Input[builtins.str]] = None,
                 timeouts: Optional[pulumi.Input[Union['EdgekvGroupItemsTimeoutsArgs', 'EdgekvGroupItemsTimeoutsArgsDict']]] = None,
                 __props__=None):
        """
        Create a EdgekvGroupItems resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] group_name: The name of the EdgeKV group.
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] items: A map of items within the specified group. Each item consists of an item key and a value.
        :param pulumi.Input[builtins.str] namespace_name: The name for the EdgeKV namespace.
        :param pulumi.Input[builtins.str] network: The network against which to execute the API request.
        :param pulumi.Input[Union['EdgekvGroupItemsTimeoutsArgs', 'EdgekvGroupItemsTimeoutsArgsDict']] timeouts: Enables to set timeout for processing
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EdgekvGroupItemsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a EdgekvGroupItems resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param EdgekvGroupItemsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EdgekvGroupItemsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 group_name: Optional[pulumi.Input[builtins.str]] = None,
                 items: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
                 namespace_name: Optional[pulumi.Input[builtins.str]] = None,
                 network: Optional[pulumi.Input[builtins.str]] = None,
                 timeouts: Optional[pulumi.Input[Union['EdgekvGroupItemsTimeoutsArgs', 'EdgekvGroupItemsTimeoutsArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EdgekvGroupItemsArgs.__new__(EdgekvGroupItemsArgs)

            if group_name is None and not opts.urn:
                raise TypeError("Missing required property 'group_name'")
            __props__.__dict__["group_name"] = group_name
            if items is None and not opts.urn:
                raise TypeError("Missing required property 'items'")
            __props__.__dict__["items"] = items
            if namespace_name is None and not opts.urn:
                raise TypeError("Missing required property 'namespace_name'")
            __props__.__dict__["namespace_name"] = namespace_name
            if network is None and not opts.urn:
                raise TypeError("Missing required property 'network'")
            __props__.__dict__["network"] = network
            __props__.__dict__["timeouts"] = timeouts
        super(EdgekvGroupItems, __self__).__init__(
            'akamai:index/edgekvGroupItems:EdgekvGroupItems',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            group_name: Optional[pulumi.Input[builtins.str]] = None,
            items: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
            namespace_name: Optional[pulumi.Input[builtins.str]] = None,
            network: Optional[pulumi.Input[builtins.str]] = None,
            timeouts: Optional[pulumi.Input[Union['EdgekvGroupItemsTimeoutsArgs', 'EdgekvGroupItemsTimeoutsArgsDict']]] = None) -> 'EdgekvGroupItems':
        """
        Get an existing EdgekvGroupItems resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] group_name: The name of the EdgeKV group.
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] items: A map of items within the specified group. Each item consists of an item key and a value.
        :param pulumi.Input[builtins.str] namespace_name: The name for the EdgeKV namespace.
        :param pulumi.Input[builtins.str] network: The network against which to execute the API request.
        :param pulumi.Input[Union['EdgekvGroupItemsTimeoutsArgs', 'EdgekvGroupItemsTimeoutsArgsDict']] timeouts: Enables to set timeout for processing
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EdgekvGroupItemsState.__new__(_EdgekvGroupItemsState)

        __props__.__dict__["group_name"] = group_name
        __props__.__dict__["items"] = items
        __props__.__dict__["namespace_name"] = namespace_name
        __props__.__dict__["network"] = network
        __props__.__dict__["timeouts"] = timeouts
        return EdgekvGroupItems(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="groupName")
    def group_name(self) -> pulumi.Output[builtins.str]:
        """
        The name of the EdgeKV group.
        """
        return pulumi.get(self, "group_name")

    @property
    @pulumi.getter
    def items(self) -> pulumi.Output[Mapping[str, builtins.str]]:
        """
        A map of items within the specified group. Each item consists of an item key and a value.
        """
        return pulumi.get(self, "items")

    @property
    @pulumi.getter(name="namespaceName")
    def namespace_name(self) -> pulumi.Output[builtins.str]:
        """
        The name for the EdgeKV namespace.
        """
        return pulumi.get(self, "namespace_name")

    @property
    @pulumi.getter
    def network(self) -> pulumi.Output[builtins.str]:
        """
        The network against which to execute the API request.
        """
        return pulumi.get(self, "network")

    @property
    @pulumi.getter
    def timeouts(self) -> pulumi.Output[Optional['outputs.EdgekvGroupItemsTimeouts']]:
        """
        Enables to set timeout for processing
        """
        return pulumi.get(self, "timeouts")

