package command.client

import command.*
import command.invoker.RemoteControl
import command.receiver.GarageDoor
import command.receiver.Light
import command.receiver.Stereo

class RemoteLoader {
    fun main() {
        val remote = RemoteControl()

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

        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff)
        // to lambda
//        remote.setCommand(0, { livingRoomLight.on() }, { livingRoomLight.off() })
        remote.setCommand(1, kitchenLightOn, kitchenLightOff)
        remote.setCommand(2, garageDoorUp, garageDoorDown)
        remote.setCommand(3, stereoOnWithCD, stereoOff)

        println(remote)
        remote.onButtonWasPushed(0)
        remote.offButtonWasPushed(0)
        println(remote)
        remote.undoButtonWasPushed()
        remote.offButtonWasPushed(0)
        remote.onButtonWasPushed(0)
        println(remote)
        remote.undoButtonWasPushed()
    }
}

fun main() {
    val remoteLoader = RemoteLoader()
    remoteLoader.main()
}