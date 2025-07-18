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

__all__ = [
    'GetIamApiClientResult',
    'AwaitableGetIamApiClientResult',
    'get_iam_api_client',
    'get_iam_api_client_output',
]

@pulumi.output_type
class GetIamApiClientResult:
    """
    A collection of values returned by getIamApiClient.
    """
    def __init__(__self__, access_token=None, actions=None, active_credential_count=None, allow_account_switch=None, api_access=None, authorized_users=None, base_url=None, can_auto_create_credential=None, client_description=None, client_id=None, client_name=None, client_type=None, created_by=None, created_date=None, credentials=None, group_access=None, id=None, ip_acl=None, is_locked=None, notification_emails=None, purge_options=None):
        if access_token and not isinstance(access_token, str):
            raise TypeError("Expected argument 'access_token' to be a str")
        pulumi.set(__self__, "access_token", access_token)
        if actions and not isinstance(actions, dict):
            raise TypeError("Expected argument 'actions' to be a dict")
        pulumi.set(__self__, "actions", actions)
        if active_credential_count and not isinstance(active_credential_count, int):
            raise TypeError("Expected argument 'active_credential_count' to be a int")
        pulumi.set(__self__, "active_credential_count", active_credential_count)
        if allow_account_switch and not isinstance(allow_account_switch, bool):
            raise TypeError("Expected argument 'allow_account_switch' to be a bool")
        pulumi.set(__self__, "allow_account_switch", allow_account_switch)
        if api_access and not isinstance(api_access, dict):
            raise TypeError("Expected argument 'api_access' to be a dict")
        pulumi.set(__self__, "api_access", api_access)
        if authorized_users and not isinstance(authorized_users, list):
            raise TypeError("Expected argument 'authorized_users' to be a list")
        pulumi.set(__self__, "authorized_users", authorized_users)
        if base_url and not isinstance(base_url, str):
            raise TypeError("Expected argument 'base_url' to be a str")
        pulumi.set(__self__, "base_url", base_url)
        if can_auto_create_credential and not isinstance(can_auto_create_credential, bool):
            raise TypeError("Expected argument 'can_auto_create_credential' to be a bool")
        pulumi.set(__self__, "can_auto_create_credential", can_auto_create_credential)
        if client_description and not isinstance(client_description, str):
            raise TypeError("Expected argument 'client_description' to be a str")
        pulumi.set(__self__, "client_description", client_description)
        if client_id and not isinstance(client_id, str):
            raise TypeError("Expected argument 'client_id' to be a str")
        pulumi.set(__self__, "client_id", client_id)
        if client_name and not isinstance(client_name, str):
            raise TypeError("Expected argument 'client_name' to be a str")
        pulumi.set(__self__, "client_name", client_name)
        if client_type and not isinstance(client_type, str):
            raise TypeError("Expected argument 'client_type' to be a str")
        pulumi.set(__self__, "client_type", client_type)
        if created_by and not isinstance(created_by, str):
            raise TypeError("Expected argument 'created_by' to be a str")
        pulumi.set(__self__, "created_by", created_by)
        if created_date and not isinstance(created_date, str):
            raise TypeError("Expected argument 'created_date' to be a str")
        pulumi.set(__self__, "created_date", created_date)
        if credentials and not isinstance(credentials, list):
            raise TypeError("Expected argument 'credentials' to be a list")
        pulumi.set(__self__, "credentials", credentials)
        if group_access and not isinstance(group_access, dict):
            raise TypeError("Expected argument 'group_access' to be a dict")
        pulumi.set(__self__, "group_access", group_access)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ip_acl and not isinstance(ip_acl, dict):
            raise TypeError("Expected argument 'ip_acl' to be a dict")
        pulumi.set(__self__, "ip_acl", ip_acl)
        if is_locked and not isinstance(is_locked, bool):
            raise TypeError("Expected argument 'is_locked' to be a bool")
        pulumi.set(__self__, "is_locked", is_locked)
        if notification_emails and not isinstance(notification_emails, list):
            raise TypeError("Expected argument 'notification_emails' to be a list")
        pulumi.set(__self__, "notification_emails", notification_emails)
        if purge_options and not isinstance(purge_options, dict):
            raise TypeError("Expected argument 'purge_options' to be a dict")
        pulumi.set(__self__, "purge_options", purge_options)

    @property
    @pulumi.getter(name="accessToken")
    def access_token(self) -> builtins.str:
        return pulumi.get(self, "access_token")

    @property
    @pulumi.getter
    def actions(self) -> 'outputs.GetIamApiClientActionsResult':
        return pulumi.get(self, "actions")

    @property
    @pulumi.getter(name="activeCredentialCount")
    def active_credential_count(self) -> builtins.int:
        return pulumi.get(self, "active_credential_count")

    @property
    @pulumi.getter(name="allowAccountSwitch")
    def allow_account_switch(self) -> builtins.bool:
        return pulumi.get(self, "allow_account_switch")

    @property
    @pulumi.getter(name="apiAccess")
    def api_access(self) -> 'outputs.GetIamApiClientApiAccessResult':
        return pulumi.get(self, "api_access")

    @property
    @pulumi.getter(name="authorizedUsers")
    def authorized_users(self) -> Sequence[builtins.str]:
        return pulumi.get(self, "authorized_users")

    @property
    @pulumi.getter(name="baseUrl")
    def base_url(self) -> builtins.str:
        return pulumi.get(self, "base_url")

    @property
    @pulumi.getter(name="canAutoCreateCredential")
    def can_auto_create_credential(self) -> builtins.bool:
        return pulumi.get(self, "can_auto_create_credential")

    @property
    @pulumi.getter(name="clientDescription")
    def client_description(self) -> builtins.str:
        return pulumi.get(self, "client_description")

    @property
    @pulumi.getter(name="clientId")
    def client_id(self) -> Optional[builtins.str]:
        return pulumi.get(self, "client_id")

    @property
    @pulumi.getter(name="clientName")
    def client_name(self) -> builtins.str:
        return pulumi.get(self, "client_name")

    @property
    @pulumi.getter(name="clientType")
    def client_type(self) -> builtins.str:
        return pulumi.get(self, "client_type")

    @property
    @pulumi.getter(name="createdBy")
    def created_by(self) -> builtins.str:
        return pulumi.get(self, "created_by")

    @property
    @pulumi.getter(name="createdDate")
    def created_date(self) -> builtins.str:
        return pulumi.get(self, "created_date")

    @property
    @pulumi.getter
    def credentials(self) -> Sequence['outputs.GetIamApiClientCredentialResult']:
        return pulumi.get(self, "credentials")

    @property
    @pulumi.getter(name="groupAccess")
    def group_access(self) -> 'outputs.GetIamApiClientGroupAccessResult':
        return pulumi.get(self, "group_access")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="ipAcl")
    def ip_acl(self) -> 'outputs.GetIamApiClientIpAclResult':
        return pulumi.get(self, "ip_acl")

    @property
    @pulumi.getter(name="isLocked")
    def is_locked(self) -> builtins.bool:
        return pulumi.get(self, "is_locked")

    @property
    @pulumi.getter(name="notificationEmails")
    def notification_emails(self) -> Sequence[builtins.str]:
        return pulumi.get(self, "notification_emails")

    @property
    @pulumi.getter(name="purgeOptions")
    def purge_options(self) -> 'outputs.GetIamApiClientPurgeOptionsResult':
        return pulumi.get(self, "purge_options")


class AwaitableGetIamApiClientResult(GetIamApiClientResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetIamApiClientResult(
            access_token=self.access_token,
            actions=self.actions,
            active_credential_count=self.active_credential_count,
            allow_account_switch=self.allow_account_switch,
            api_access=self.api_access,
            authorized_users=self.authorized_users,
            base_url=self.base_url,
            can_auto_create_credential=self.can_auto_create_credential,
            client_description=self.client_description,
            client_id=self.client_id,
            client_name=self.client_name,
            client_type=self.client_type,
            created_by=self.created_by,
            created_date=self.created_date,
            credentials=self.credentials,
            group_access=self.group_access,
            id=self.id,
            ip_acl=self.ip_acl,
            is_locked=self.is_locked,
            notification_emails=self.notification_emails,
            purge_options=self.purge_options)


def get_iam_api_client(client_id: Optional[builtins.str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetIamApiClientResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['clientId'] = client_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('akamai:index/getIamApiClient:getIamApiClient', __args__, opts=opts, typ=GetIamApiClientResult).value

    return AwaitableGetIamApiClientResult(
        access_token=pulumi.get(__ret__, 'access_token'),
        actions=pulumi.get(__ret__, 'actions'),
        active_credential_count=pulumi.get(__ret__, 'active_credential_count'),
        allow_account_switch=pulumi.get(__ret__, 'allow_account_switch'),
        api_access=pulumi.get(__ret__, 'api_access'),
        authorized_users=pulumi.get(__ret__, 'authorized_users'),
        base_url=pulumi.get(__ret__, 'base_url'),
        can_auto_create_credential=pulumi.get(__ret__, 'can_auto_create_credential'),
        client_description=pulumi.get(__ret__, 'client_description'),
        client_id=pulumi.get(__ret__, 'client_id'),
        client_name=pulumi.get(__ret__, 'client_name'),
        client_type=pulumi.get(__ret__, 'client_type'),
        created_by=pulumi.get(__ret__, 'created_by'),
        created_date=pulumi.get(__ret__, 'created_date'),
        credentials=pulumi.get(__ret__, 'credentials'),
        group_access=pulumi.get(__ret__, 'group_access'),
        id=pulumi.get(__ret__, 'id'),
        ip_acl=pulumi.get(__ret__, 'ip_acl'),
        is_locked=pulumi.get(__ret__, 'is_locked'),
        notification_emails=pulumi.get(__ret__, 'notification_emails'),
        purge_options=pulumi.get(__ret__, 'purge_options'))
def get_iam_api_client_output(client_id: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                              opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetIamApiClientResult]:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['clientId'] = client_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('akamai:index/getIamApiClient:getIamApiClient', __args__, opts=opts, typ=GetIamApiClientResult)
    return __ret__.apply(lambda __response__: GetIamApiClientResult(
        access_token=pulumi.get(__response__, 'access_token'),
        actions=pulumi.get(__response__, 'actions'),
        active_credential_count=pulumi.get(__response__, 'active_credential_count'),
        allow_account_switch=pulumi.get(__response__, 'allow_account_switch'),
        api_access=pulumi.get(__response__, 'api_access'),
        authorized_users=pulumi.get(__response__, 'authorized_users'),
        base_url=pulumi.get(__response__, 'base_url'),
        can_auto_create_credential=pulumi.get(__response__, 'can_auto_create_credential'),
        client_description=pulumi.get(__response__, 'client_description'),
        client_id=pulumi.get(__response__, 'client_id'),
        client_name=pulumi.get(__response__, 'client_name'),
        client_type=pulumi.get(__response__, 'client_type'),
        created_by=pulumi.get(__response__, 'created_by'),
        created_date=pulumi.get(__response__, 'created_date'),
        credentials=pulumi.get(__response__, 'credentials'),
        group_access=pulumi.get(__response__, 'group_access'),
        id=pulumi.get(__response__, 'id'),
        ip_acl=pulumi.get(__response__, 'ip_acl'),
        is_locked=pulumi.get(__response__, 'is_locked'),
        notification_emails=pulumi.get(__response__, 'notification_emails'),
        purge_options=pulumi.get(__response__, 'purge_options')))
