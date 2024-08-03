package command.client

import command.*
import command.invoker.GarageDoor
import command.invoker.Light
import command.invoker.Stereo

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
        remote.onButtonWasPushed(1)
        remote.offButtonWasPushed(1)
        remote.onButtonWasPushed(2)
        remote.offButtonWasPushed(2)
        remote.onButtonWasPushed(3)
        remote.offButtonWasPushed(3)
    }
}

fun main() {
    val remoteLoader = RemoteLoader()
    remoteLoader.main()
}