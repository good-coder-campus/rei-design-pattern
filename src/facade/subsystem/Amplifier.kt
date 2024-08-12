package facade.subsystem

class Amplifier {
    private lateinit var tuner: Tuner
    private lateinit var streamingPlayer: StreamingPlayer
    fun on() {
        println("Amplifier is on")
    }

    fun off() {
        println("Amplifier is off")
    }

    fun setStereoSound() {
        println("Amplifier is set for stereo sound")
    }

    fun setSurroundSound() {
        println("Amplifier is set for surround sound")
    }

    fun setVolume(level: Int) {
        println("Amplifier volume set to $level")
    }

    fun setTuner(tuner: Tuner) {
        this.tuner = tuner
        println("Amplifier is set to tuner")
    }

    fun setStreamingPlayer(streamingPlayer: StreamingPlayer) {
        this.streamingPlayer = streamingPlayer
        println("Amplifier is set to streaming player")
    }
}