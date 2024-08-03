package command.invoker

import command.Command

class SimpleRemoteControl(
) {
    private lateinit var slot: Command

    fun setCommand(command: Command) {
        slot = command
    }
    fun buttonWasPressed() {
        slot.execute()
    }
}