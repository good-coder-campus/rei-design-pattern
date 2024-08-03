package command

import command.invoker.GarageDoor

class GarageDoorOpenCommand(
    private val garageDoor: GarageDoor
) : Command {

    override fun execute() {
        garageDoor.up()
    }

    override fun undo() {
        garageDoor.down()
    }
}