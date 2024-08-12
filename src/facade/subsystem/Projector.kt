package facade.subsystem

class Projector {
    fun on() {
        println("Projector on")
    }

    fun wideScreenMode() {
        println("Projector in wide screen mode (16x9 aspect ratio)")
    }

    fun off() {
        println("Projector off")
    }

    fun tvMode() {
        println("Projector in TV mode (4x3 aspect ratio)")
    }
}