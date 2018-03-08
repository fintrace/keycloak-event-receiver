package org.fintrace.keycloak.events.service;

import org.keycloak.events.Event;
import org.keycloak.events.admin.AdminEvent;

public abstract class AbstractEventReceiver implements EventReceiver {

    public void onEvent(Event event) {

    }

    public void onAdminEvent(AdminEvent adminEvent) {

    }

    protected abstract void onNewRealm();
    protected abstract void onRealmUpdate();
    protected abstract void onNewRole();
    protected abstract void onRoleUpdate();
    protected abstract void onNewGroup();
    protected abstract void onGroupUpdate();
    protected abstract void onNewUser();
    protected abstract void onUserUpdate();
    protected abstract void onUserAddedToRole();
    protected abstract void onUserAddedToGroup();
    protected abstract void onUserRemovedFromRole();
    protected abstract void onUserRemovedFromGroup();
    protected abstract void onUserLogin();
    protected abstract void onUserLoginFailed();
    protected abstract void onUserChangePassword();
}
