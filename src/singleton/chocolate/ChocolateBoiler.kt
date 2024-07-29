package singleton.chocolate

class ChocolateBoiler private constructor() {

    private var empty: Boolean = true
    private var boiled: Boolean = false

    companion object {
        private var instance: ChocolateBoiler = ChocolateBoiler()

        @Synchronized
         fun getInstance(): ChocolateBoiler {
            return instance
        }
    }

    fun fill() {
        if (isEmpty()) {
            empty = false
            boiled = false
            // fill the boiler with a milk/chocolate mixture
        }
    }

    fun drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true
        }
    }

    fun isEmpty(): Boolean {
        return empty
    }

    fun isBoiled(): Boolean {
        return boiled
    }
}

