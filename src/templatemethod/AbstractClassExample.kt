package templatemethod

abstract class AbstractClassExample {
    final fun templateMethod() {
        primitiveOperation1()
        primitiveOperation2()
        concreteOperation()
        hook()
    }

    abstract fun primitiveOperation1()

    abstract fun primitiveOperation2()

    final fun concreteOperation() {
        println("Concrete operation")
    }

    fun hook() {}
}