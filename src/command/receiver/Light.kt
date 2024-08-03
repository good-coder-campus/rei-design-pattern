package command.receiver

class Light(
    private val name: String
) {
    fun on() {
        println("Light is on, $name")
    }

    fun off() {
        println("Light is off, $name")
    }
}
