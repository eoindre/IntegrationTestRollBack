package com.mycompany.myapp

class TestController {

    def index() {
        Factory testFactory = Factory.findByName('Test Factory')
        println "Primary Factory: $testFactory.primaryFactory.name"
        render 'Check Console'
    }
}
