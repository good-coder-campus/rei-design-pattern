package command.client

import command.receiver.GarageDoor
import command.GarageDoorOpenCommand
import command.receiver.Light
import command.LightOnCommand
import command.invoker.SimpleRemoteControl

class RemoteControlTest {
    fun main() {
        val remote = SimpleRemoteControl()
        val light = Light("Living Room")
        val lightOn = LightOnCommand(light)

        remote.setCommand(lightOn)
        remote.buttonWasPressed()
    }

    fun garageTest() {
        val remote = SimpleRemoteControl()
        val garageDoor = GarageDoor()
        val garageDoorOpen = GarageDoorOpenCommand(garageDoor)

        remote.setCommand(garageDoorOpen)
        remote.buttonWasPressed()
    }
}

