package com.mycompany.myapp

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class FactorySpec extends Specification implements DomainUnitTest<Factory> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
