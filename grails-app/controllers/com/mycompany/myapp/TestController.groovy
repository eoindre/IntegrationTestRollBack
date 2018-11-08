package com.mycompany.myapp

class TestController {

    TestingService testingService

    def index() {
        Factory factoryOne = new Factory(name: "first").save(flush: true)
        Factory factoryTwo = new Factory(name: "second").save(flush: true)
        List<Factory> factories = [factoryOne, factoryTwo]
        testingService.testServiceMethod(factories)
        println "First Factory: $factoryOne.testField"
        println "First Factory: $factoryTwo.testField"
        render 'Check Console'
    }
}
