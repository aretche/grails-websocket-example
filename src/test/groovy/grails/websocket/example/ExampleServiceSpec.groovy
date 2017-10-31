package grails.websocket.example

import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class ExampleServiceSpec extends Specification implements ServiceUnitTest<ExampleService>{

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
