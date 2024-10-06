package state

class GumballMonitor(
    private val machine: GumballMachine
) {
    fun report() {
        println("뽑기 기계 보고서")
        println("현재 위치: ${machine.location}")
        println("현재 재고: ${machine.count}개")
        println("현재 상태: ${machine.state}")
    }
}

fun main() {
    val machine = GumballMachine(5, "서울")
    val monitor = GumballMonitor(machine)

    monitor.report()
}