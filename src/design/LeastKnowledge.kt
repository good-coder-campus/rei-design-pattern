package design

class Car(private val engine: Engine) {
    fun start(key: Key) {
        // 메소드 내부에서 생성한 객체는 호출 가능
        val doors = Doors()
        // 매개변수로 전달된 객체는 호출 가능
        val authorized = key.turns()
        if (authorized) {
            // 필드로 선언된 객체는 호출 가능
            engine.start()
            // 로컬 변수로 생성된 객체는 호출 가능
            updateDashboardDisplay()
            // 직접 생성한 객체는 호출 가능
            doors.lock()
        }
    }

    fun updateDashboardDisplay() {
        println("Dashboard display updated")
    }

}


class Engine {
    fun start() {
        println("Engine started")
    }
}

class Key {
    fun turns(): Boolean {
        println("Key turns")
        return true
    }
}

class Doors {
    fun lock() {
        println("Doors locked")
    }
}