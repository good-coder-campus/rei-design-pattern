package templatemethod

import java.util.*

class TeaWithHook : CaffeineBeverageWithHook() {
    override fun brew() {
        println("Steeping the tea")
    }

    override fun addCondiments() {
        println("Adding Lemon")
    }

    override fun customerWantsCondiments(): Boolean {
        val answer = getUserInput()
        return answer.lowercase(Locale.getDefault()).startsWith("y")
    }

    private fun getUserInput(): String {
        val input = Scanner(System.`in`)
        print("Would you like lemon with your tea (y/n)? ")
        runCatching {
            return input.nextLine()
        }.onFailure {
            println("IO error trying to read your answer")
        }
        return "no"
    }
}