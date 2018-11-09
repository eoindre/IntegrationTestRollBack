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
        Factory factoryOne = new Factory(name: "first").save(flush: true)
        Factory factoryTwo = new Factory(name: "second").save(flush: true)
        List<Factory> factories = [factoryOne, factoryTwo]
        testingService.testServiceMethod(factories)

        then:
        def ex = thrown(Exception)
        factoryOne.testField == null
        factoryTwo.testField == null
    }
}
