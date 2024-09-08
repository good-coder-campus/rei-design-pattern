package state.v1

class GumballMachineTestDrive {
}

fun main() {
    val machine = GumballMachine(5) // 5개의 알맹이가 있는 거동하는 거동하는 기계를 만든다.

    println(machine)

    // 동전을 넣기
    machine.insertQuarter()
    machine.turnCrank()

    println(machine)

    machine.insertQuarter()
    machine.ejectQuarter()
    machine.turnCrank() // 동전을 넣지 않았지만 손잡이를 돌림

    println(machine)

    machine.insertQuarter()
    machine.turnCrank()
    machine.insertQuarter()
    machine.turnCrank()
    machine.ejectQuarter() // 동전이 없는 상황에서 반환 요청

    println(machine)

    machine.insertQuarter()
    machine.insertQuarter() // 동전을 두번 넣음
    machine.turnCrank()
    machine.insertQuarter()
    machine.turnCrank()
    machine.insertQuarter()
    machine.turnCrank()

    println(machine)
}