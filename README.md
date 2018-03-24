# keycloak-event-receiver
Library to receive Keycloak events pusblished by [keycloak-event-publisher](https://github.com/fintrace/keycloak-event-publisher)
 
[![Build Status](https://travis-ci.org/fintrace/keycloak-event-receiver.svg?branch=master)](https://travis-ci.org/fintrace/keycloak-event-receiver)

## How to use
### Spring REST Receiver
Add dependency in your pom

  	  
```xml

<dependency>
    <groupId>org.fintrace</groupId>
    <artifactId>keycloak-event-receiver-http</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</dependency>
```
After adding dependency, 
* Implement [EventReceiver.java](keycloak-event-receiver-common/src/main/java/org/fintrace/keycloak/events/service/EventReceiver.java) or extend [AbstractEventReceiver.java](keycloak-event-receiver-common/src/main/java/org/fintrace/keycloak/events/service/AbstractEventReceiver.java) service
* Add implemented service as a spring bean 

Exposed REST API
* `POST` `keycloak/event` 
* `POST` `keycloak/adminevent`

(Optional)
* Add authorization checks via spring security to the above URI.

### JMS Receiver
TODO 
