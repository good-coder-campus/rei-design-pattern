package facade.subsystem

class StreamingPlayer {
    fun on() {
        println("Streaming player is on")
    }

    fun off() {
        println("Streaming player is off")
    }

    fun play(movie: String) {
        println("Streaming player is playing $movie")
    }

    fun stop() {
        println("Streaming player is stopped")
    }

    fun pause() {
        println("Streaming player is paused")
    }

    fun setSurroundAudio() {
        println("Streaming player is set for surround audio")
    }

    fun setTwoChannelAudio() {
        println("Streaming player is set for two channel audio")
    }
}