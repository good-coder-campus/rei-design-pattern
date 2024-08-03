package command.receiver

class Stereo {
    fun on() {
        println("Stereo is on")
    }

    fun off() {
        println("Stereo is off")
    }

    fun setCD() {
        println("Stereo is set for CD input")
    }

    fun setDVD() {
        println("Stereo is set for DVD input")
    }

    fun setRadio() {
        println("Stereo is set for Radio")
    }

    fun setVolume(volume: Int) {
        println("Stereo volume set to $volume")
    }
}