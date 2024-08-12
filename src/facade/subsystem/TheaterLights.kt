package facade.subsystem

class TheaterLights {
    fun on() {
        println("Theater Ceiling Lights on")
    }

    fun off() {
        println("Theater Ceiling Lights off")
    }

    fun dim(level: Int) {
        println("Theater Ceiling Lights dimming to $level%")
    }
}