package facade

import facade.subsystem.*

class HomeTheaterFacade(
    private val amp: Amplifier,
    private val tuner: Tuner,
    private val streamingPlayer: StreamingPlayer,
    private val projector: Projector,
    private val lights: TheaterLights,
    private val screen: Screen,
    private val popper: PopcornPopper
) {
    fun watchMovie(movie: String) {
        println("Get ready to watch a movie... $movie")
        popper.on()
        popper.pop()

        lights.dim(10)

        screen.down()

        projector.on()
        projector.wideScreenMode()

        amp.on()
        amp.setStreamingPlayer(streamingPlayer)
        amp.setSurroundSound()
        amp.setVolume(5)

        streamingPlayer.on()
        streamingPlayer.play(movie)
    }

    fun endMovie() {
        println("Shutting movie theater down...")
        popper.off()

        lights.on()

        screen.up()

        projector.off()

        amp.off()
        streamingPlayer.stop()
        streamingPlayer.off()
    }
}