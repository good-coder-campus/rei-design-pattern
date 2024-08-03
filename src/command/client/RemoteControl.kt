package command.client

import command.Command

class RemoteControl {
    private val onCommands = arrayOfNulls<Command>(7)
    private val offCommands = arrayOfNulls<Command>(7)

    fun setCommand( slot: Int, onCommand: Command, offCommand: Command) {
        onCommands[slot] = onCommand
        offCommands[slot] = offCommand
    }

    fun onButtonWasPushed(slot: Int) {
        onCommands[slot]?.execute()
    }

    fun offButtonWasPushed(slot: Int) {
        offCommands[slot]?.execute()
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("\n------ Remote Control -------\n")
        for (i in onCommands.indices) {
            sb.append("[slot $i] ${onCommands[i]?.javaClass?.name}    ${offCommands[i]?.javaClass?.name}\n")
        }
        return sb.toString()
    }

}