package command.client

import command.invoker.GarageDoor
import command.GarageDoorOpenCommand
import command.invoker.Light
import command.LightOnCommand

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

