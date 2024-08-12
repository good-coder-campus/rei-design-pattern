package adapter

class DuckTestDrive {
    fun main() {
        val duck = MallardDuck()
        val turkey = WildTurkey()
        val turkeyAdapter = TurkeyAdapter(turkey)

        println("The Turkey says...")
        turkey.gobble()
        turkey.fly()

        println("\nThe Duck says...")
        duck.quack()
        duck.fly()

        println("\nThe TurkeyAdapter says...")
        turkeyAdapter.quack()
        turkeyAdapter.fly()
    }
}

fun main() {
    DuckTestDrive().main()
}