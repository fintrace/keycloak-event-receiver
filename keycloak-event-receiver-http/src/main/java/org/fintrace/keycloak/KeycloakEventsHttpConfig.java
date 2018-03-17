package org.fintrace.keycloak;

import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Venkaiah Chowdary Koneru
 */
@Configuration
@ConditionalOnWebApplication
@ComponentScan("org.fintrace.keycloak")
public class KeycloakEventsHttpConfig {
}
