package templatemethod

class BeverageTestDrive {
}

fun main() {
    val coffeeHook = CoffeeWithHook()
    val teaHook = TeaWithHook()

    println("\nMaking tea...")
    teaHook.prepareRecipe()

    println("\nMaking coffee...")
    coffeeHook.prepareRecipe()
}