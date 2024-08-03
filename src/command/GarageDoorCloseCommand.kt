package command

import command.receiver.GarageDoor

class GarageDoorCloseCommand(
    private val garageDoor: GarageDoor
) : Command {

    override fun execute() {
        garageDoor.down()
    }

    override fun undo() {
        garageDoor.up()
    }
}