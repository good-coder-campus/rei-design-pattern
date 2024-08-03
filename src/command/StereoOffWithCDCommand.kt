package command

import command.receiver.Stereo

class StereoOffWithCDCommand(
    private val stereo: Stereo
) : Command {

    override fun execute() {
        stereo.off()
    }

    override fun undo() {
        stereo.on()
        stereo.setCD()
        stereo.setVolume(11)
    }
}
