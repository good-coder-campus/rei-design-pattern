package command

import command.receiver.GarageDoor

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