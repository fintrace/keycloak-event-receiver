package org.fintrace.keycloak.events.service;

import org.keycloak.events.Event;
import org.keycloak.events.admin.AdminEvent;

public interface EventReceiver {
    void onEvent(Event event);

    void onAdminEvent(AdminEvent adminEvent);
}
