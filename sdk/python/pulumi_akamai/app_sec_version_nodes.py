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

__all__ = ['AppSecVersionNodesArgs', 'AppSecVersionNodes']

@pulumi.input_type
class AppSecVersionNodesArgs:
    def __init__(__self__, *,
                 config_id: pulumi.Input[builtins.int],
                 version_notes: pulumi.Input[builtins.str]):
        """
        The set of arguments for constructing a AppSecVersionNodes resource.
        :param pulumi.Input[builtins.int] config_id: Unique identifier of the security configuration
        :param pulumi.Input[builtins.str] version_notes: Brief description of the security configuration version
        """
        pulumi.set(__self__, "config_id", config_id)
        pulumi.set(__self__, "version_notes", version_notes)

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> pulumi.Input[builtins.int]:
        """
        Unique identifier of the security configuration
        """
        return pulumi.get(self, "config_id")

    @config_id.setter
    def config_id(self, value: pulumi.Input[builtins.int]):
        pulumi.set(self, "config_id", value)

    @property
    @pulumi.getter(name="versionNotes")
    def version_notes(self) -> pulumi.Input[builtins.str]:
        """
        Brief description of the security configuration version
        """
        return pulumi.get(self, "version_notes")

    @version_notes.setter
    def version_notes(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "version_notes", value)


@pulumi.input_type
class _AppSecVersionNodesState:
    def __init__(__self__, *,
                 config_id: Optional[pulumi.Input[builtins.int]] = None,
                 output_text: Optional[pulumi.Input[builtins.str]] = None,
                 version_notes: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering AppSecVersionNodes resources.
        :param pulumi.Input[builtins.int] config_id: Unique identifier of the security configuration
        :param pulumi.Input[builtins.str] output_text: Text representation
        :param pulumi.Input[builtins.str] version_notes: Brief description of the security configuration version
        """
        if config_id is not None:
            pulumi.set(__self__, "config_id", config_id)
        if output_text is not None:
            pulumi.set(__self__, "output_text", output_text)
        if version_notes is not None:
            pulumi.set(__self__, "version_notes", version_notes)

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        Unique identifier of the security configuration
        """
        return pulumi.get(self, "config_id")

    @config_id.setter
    def config_id(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "config_id", value)

    @property
    @pulumi.getter(name="outputText")
    def output_text(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Text representation
        """
        return pulumi.get(self, "output_text")

    @output_text.setter
    def output_text(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "output_text", value)

    @property
    @pulumi.getter(name="versionNotes")
    def version_notes(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Brief description of the security configuration version
        """
        return pulumi.get(self, "version_notes")

    @version_notes.setter
    def version_notes(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "version_notes", value)


@pulumi.type_token("akamai:index/appSecVersionNodes:AppSecVersionNodes")
class AppSecVersionNodes(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config_id: Optional[pulumi.Input[builtins.int]] = None,
                 version_notes: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        Create a AppSecVersionNodes resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.int] config_id: Unique identifier of the security configuration
        :param pulumi.Input[builtins.str] version_notes: Brief description of the security configuration version
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AppSecVersionNodesArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a AppSecVersionNodes resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param AppSecVersionNodesArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AppSecVersionNodesArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config_id: Optional[pulumi.Input[builtins.int]] = None,
                 version_notes: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AppSecVersionNodesArgs.__new__(AppSecVersionNodesArgs)

            if config_id is None and not opts.urn:
                raise TypeError("Missing required property 'config_id'")
            __props__.__dict__["config_id"] = config_id
            if version_notes is None and not opts.urn:
                raise TypeError("Missing required property 'version_notes'")
            __props__.__dict__["version_notes"] = version_notes
            __props__.__dict__["output_text"] = None
        super(AppSecVersionNodes, __self__).__init__(
            'akamai:index/appSecVersionNodes:AppSecVersionNodes',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            config_id: Optional[pulumi.Input[builtins.int]] = None,
            output_text: Optional[pulumi.Input[builtins.str]] = None,
            version_notes: Optional[pulumi.Input[builtins.str]] = None) -> 'AppSecVersionNodes':
        """
        Get an existing AppSecVersionNodes resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.int] config_id: Unique identifier of the security configuration
        :param pulumi.Input[builtins.str] output_text: Text representation
        :param pulumi.Input[builtins.str] version_notes: Brief description of the security configuration version
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AppSecVersionNodesState.__new__(_AppSecVersionNodesState)

        __props__.__dict__["config_id"] = config_id
        __props__.__dict__["output_text"] = output_text
        __props__.__dict__["version_notes"] = version_notes
        return AppSecVersionNodes(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> pulumi.Output[builtins.int]:
        """
        Unique identifier of the security configuration
        """
        return pulumi.get(self, "config_id")

    @property
    @pulumi.getter(name="outputText")
    def output_text(self) -> pulumi.Output[builtins.str]:
        """
        Text representation
        """
        return pulumi.get(self, "output_text")

    @property
    @pulumi.getter(name="versionNotes")
    def version_notes(self) -> pulumi.Output[builtins.str]:
        """
        Brief description of the security configuration version
        """
        return pulumi.get(self, "version_notes")

