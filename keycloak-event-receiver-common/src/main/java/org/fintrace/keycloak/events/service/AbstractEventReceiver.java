package org.fintrace.keycloak.events.service;

import lombok.extern.slf4j.Slf4j;
import org.keycloak.events.Event;
import org.keycloak.events.admin.AdminEvent;

@Slf4j
public abstract class AbstractEventReceiver implements EventReceiver {

    public void onEvent(Event event) {
        log.info("{} : {}", event.getRealmId(), event.getType().name());
    }

    public void onAdminEvent(AdminEvent adminEvent) {
        log.info("{} : {} : {}", adminEvent.getRealmId(), adminEvent.getOperationType().name(), adminEvent.getRepresentation());
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
