package grails.websocket.example

import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo

class ExampleController {

    def index() { }

    @MessageMapping("/hello")
    @SendTo("/topic/hello")
    protected String hello(String text) {
        return "${text}"
    }
}
