package proxy

import java.rmi.Naming
import java.rmi.server.UnicastRemoteObject

class GumballMachine(
    var count: Int = 0,
    val location: String
) : UnicastRemoteObject(), GumballMachineRemote {
    companion object {
        private const val serialVersionUID = 2L
    }
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
   runCatching {
       val count = 5
         val machine = GumballMachine(count, "서울")
       Naming.rebind("gumballmachine", machine)
   }

}