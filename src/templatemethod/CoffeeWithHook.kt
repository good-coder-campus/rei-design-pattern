package templatemethod

import java.util.*

class CoffeeWithHook : CaffeineBeverageWithHook() {
    override fun brew() {
        println("Dripping Coffee through filter")
    }

    override fun addCondiments() {
        println("Adding Sugar and Milk")
    }

    override fun customerWantsCondiments(): Boolean {
        val answer = getUserInput()
        return answer.lowercase(Locale.getDefault()).startsWith("y")
    }


    private fun getUserInput(): String {
        val input = Scanner(System.`in`)
        print("Would you like milk and sugar with your coffee (y/n)? ")
        runCatching {
            return input.nextLine()
        }.onFailure {
            println("IO error trying to read your answer")
        }
        return "no"

    }
}