package grails.websocket.example

import org.springframework.messaging.simp.SimpMessagingTemplate

class ExampleService {

    SimpMessagingTemplate brokerMessagingTemplate

    void hello() {
        brokerMessagingTemplate.convertAndSend "/topic/hello", "hello from service!"
    }
}
