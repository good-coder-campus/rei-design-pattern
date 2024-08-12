package adapter

class TurkeyAdapter(
    private val turkey: Turkey
) : Duck {

    override fun quack() {
        turkey.gobble()
    }

    override fun fly() {
        (1..5).forEach { _ ->
            // The turkey can only fly short distances
            turkey.fly()
        }
    }
}