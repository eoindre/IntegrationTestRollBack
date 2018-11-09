package com.mycompany.myapp

import grails.testing.mixin.integration.Integration
import grails.transaction.Rollback
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification

@Integration
@Rollback
class TestServiceIntSpec extends Specification {

    @Autowired
    TestingService testingService

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        when:
        List<Factory> factories = []
        Factory.withNewTransaction {
            factories.add(new Factory(name: "first"))
            factories.add(new Factory(name: "second"))
            factories*.save(flush: true, failOnError: true)
        }
        testingService.testServiceMethod(factories)

        then:
        def ex = thrown(Exception)

        when:
        Factory factory
        Factory.withNewSession {
            factory = Factory.findByName("first")
        }

        then:
        factory.testField == null
    }
}
