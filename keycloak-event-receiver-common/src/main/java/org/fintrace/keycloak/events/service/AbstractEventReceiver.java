/*
 *  (C) Copyright 2018 fintrace (https://fintrace.org/) and others.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

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
