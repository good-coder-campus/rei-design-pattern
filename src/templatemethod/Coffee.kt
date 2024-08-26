package templatemethod

class Coffee : CaffeineBeverage(){

    override fun brew() {
        brewCoffeeGrinds()
    }
    override fun addCondiments() {
        addSugarAndMilk()
    }


    fun brewCoffeeGrinds() {
        println("Dripping Coffee through filter")
    }

    fun addSugarAndMilk() {
        println("Adding Sugar and Milk")
    }
}