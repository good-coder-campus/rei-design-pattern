package state

class GumballMachine(
    var count: Int = 0
) {
    val soldOutState : State
    val noQuarterState : State
    val hasQuarterState : State
    val soldState : State
    var winnerState: State
    var state: State

    init {
        soldOutState = SoldOutState(this)
        noQuarterState = NoQuarterState(this)
        hasQuarterState = HasQuarterState(this)
        soldState = SoldState(this)
        winnerState = WinnerState(this)
        state = if (count > 0) noQuarterState else soldOutState
    }

    fun insertQuarter() {
        state.insertQuarter()
    }

    fun ejectQuarter() {
        state.ejectQuarter()
    }

    fun turnCrank() {
        state.turnCrank()
        state.dispense()
    }

    fun releaseBall() {
        println("알맹이가 나가고 있습니다.")
        if (count != 0) {
            count -= 1
        }
    }

    fun refill(count: Int) {
        this.count = count
        state.refill() // NoQuarter 상태로 변경
    }

    override fun toString(): String {
        return "남은 개수: $count"
    }
}

fun main() {
    val gumballMachine = GumballMachine(5)

    println(gumballMachine)
    gumballMachine.insertQuarter()
    gumballMachine.turnCrank()

    println(gumballMachine)

    gumballMachine.insertQuarter()
    gumballMachine.turnCrank()
    gumballMachine.insertQuarter()
    gumballMachine.turnCrank()

    println(gumballMachine)

}