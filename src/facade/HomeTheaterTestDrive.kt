package facade

import facade.subsystem.*

class HomeTheaterTestDrive {
    fun main() {
        val amp = Amplifier()
        val tuner = Tuner()
        val dvd = StreamingPlayer()
        val projector = Projector()
        val lights = TheaterLights()
        val screen = Screen()
        val popper = PopcornPopper()

        val homeTheater = HomeTheaterFacade(amp, tuner, dvd, projector, lights, screen, popper)

        homeTheater.watchMovie("Raiders of the Lost Ark")
        homeTheater.endMovie()
    }
}

fun main() {
    HomeTheaterTestDrive().main()
}