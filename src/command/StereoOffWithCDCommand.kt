package command

import command.invoker.Stereo

class StereoOffWithCDCommand(
    private val stereo: Stereo
) : Command {

    override fun execute() {
        stereo.off()
    }
}
