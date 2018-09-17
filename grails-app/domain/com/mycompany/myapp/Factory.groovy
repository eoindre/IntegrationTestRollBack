package com.mycompany.myapp

class Factory {

    String name
    Factory primaryFactory

    static constraints = {
        primaryFactory nullable: true
    }

    Factory getPrimaryFactory() {
        primaryFactory ?: this
    }
}
