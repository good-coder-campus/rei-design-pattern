package proxy

class GumballMonitor(
    private val machine: GumballMachineRemote
) {
    fun report() {
        println("뽑기 기계 보고서")
        println("현재 위치: ")
        println("현재 재고: ")
        println("현재 상태: ")
    }
}

fun main() {
    val machine = GumballMachine(5, "서울")
    val monitor = GumballMonitor(machine)

    monitor.report()
}