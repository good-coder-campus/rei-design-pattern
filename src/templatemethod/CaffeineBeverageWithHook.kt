package templatemethod

abstract class CaffeineBeverageWithHook {
    fun prepareRecipe() {
        boilWater()
        brew()
        pourInCup()
        if (customerWantsCondiments()) addCondiments()
    }

    fun boilWater() {
        println("Boiling water")
    }

    fun pourInCup() {
        println("Pouring into cup")
    }

    abstract fun brew()

    abstract fun addCondiments()

    open fun customerWantsCondiments(): Boolean {
        return true
    }
}