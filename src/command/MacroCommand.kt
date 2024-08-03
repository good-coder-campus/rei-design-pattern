package command

import command.invoker.RemoteControl
import command.receiver.GarageDoor
import command.receiver.Light
import command.receiver.Stereo

class MacroCommand(
    private val commands: List<Command>
) : Command {
    override fun execute() {
        for (command in commands) {
            command.execute()
        }
    }

    override fun undo() {
        for (command in commands) {
            command.undo()
        }
    }
}


class MacroCommandLoader {
    fun main() {
        val livingRoomLight = Light("Living Room")
        val kitchenLight = Light("Kitchen")
        val garageDoor = GarageDoor()
        val stereo = Stereo()

        val livingRoomLightOn = LightOnCommand(livingRoomLight)
        val livingRoomLightOff = LightOffCommand(livingRoomLight)
        val kitchenLightOn = LightOnCommand(kitchenLight)
        val kitchenLightOff = LightOffCommand(kitchenLight)
        val garageDoorUp = GarageDoorOpenCommand(garageDoor)
        val garageDoorDown = GarageDoorCloseCommand(garageDoor)
        val stereoOnWithCD = StereoOnWithCDCommand(stereo)
        val stereoOff = StereoOffWithCDCommand(stereo)

        val partyOn = MacroCommand(listOf(livingRoomLightOn, kitchenLightOn, garageDoorUp, stereoOnWithCD))
        val partyOff = MacroCommand(listOf(livingRoomLightOff, kitchenLightOff, garageDoorDown, stereoOff))

        val remote = RemoteControl()
        remote.setCommand(0, partyOn, partyOff)

        println(remote)
        remote.onButtonWasPushed(0)
        remote.offButtonWasPushed(0)
        println(remote)
    }
}

fun main() {
    val macroCommandLoader = MacroCommandLoader()
    macroCommandLoader.main()
}