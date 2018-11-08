package com.mycompany.myapp

import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class TestingServiceSpec extends Specification implements ServiceUnitTest<TestingService>{

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == true
    }
}
