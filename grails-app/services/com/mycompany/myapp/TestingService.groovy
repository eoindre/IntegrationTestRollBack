package com.mycompany.myapp

import grails.gorm.transactions.Transactional

@Transactional(rollbackFor = Exception.class)
class TestingService {

    void testServiceMethod(List<Factory> factories) {
        factories.each {
            if (it.name == 'second') {
                throw new Exception('second')
            }
            it.testField = 'Edited'
            it.save()
            println(it.name + ' saved')
        }
    }
}
