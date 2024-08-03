package command.client

import command.Command

class RemoteControl {
    private val onCommands = arrayOfNulls<Command>(7)
    private val offCommands = arrayOfNulls<Command>(7)
    private lateinit var undoCommand: Command

    fun setCommand( slot: Int, onCommand: Command, offCommand: Command) {
        onCommands[slot] = onCommand
        offCommands[slot] = offCommand
    }

    fun onButtonWasPushed(slot: Int) {
        onCommands[slot]?.execute()
        undoCommand = onCommands[slot]!!
    }

    fun offButtonWasPushed(slot: Int) {
        offCommands[slot]?.execute()
        undoCommand = offCommands[slot]!!
    }

    // 직전에 실행한 명령을 취소하기 위해 undoCommand에 저장된 명령을 실행
    fun undoButtonWasPushed() {
        undoCommand.undo()
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