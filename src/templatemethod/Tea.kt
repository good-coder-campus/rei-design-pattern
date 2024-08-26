package templatemethod

class Tea : CaffeineBeverage() {

    override fun brew() {
        steepTeaBag()
    }

    override fun addCondiments() {
        addLemon()
    }

    fun steepTeaBag() {
        println("Steeping the tea")
    }

    fun addLemon() {
        println("Adding Lemon")
    }
}