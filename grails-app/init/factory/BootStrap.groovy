package factory

import com.mycompany.myapp.Factory

class BootStrap {

    def init = {

        def testFactory = new Factory(name: 'Test Factory').save()

        assert Factory.count() == 1
    }
    def destroy = {
    }
}
