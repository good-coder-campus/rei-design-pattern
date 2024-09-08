package state

class HasQuarterState(
    private val gumballMachine: GumballMachine
) : State {
    override fun insertQuarter() {
        println("동전은 한 개만 넣어주세요.")
    }

    override fun ejectQuarter() {
        println("동전이 반환됩니다.")
        gumballMachine.state = gumballMachine.noQuarterState
    }

    override fun turnCrank() {
        println("손잡이를 돌리셨습니다.")
        val winner = (0..9).random()
        if (winner == 0 && gumballMachine.count > 1) {
            gumballMachine.state = gumballMachine.winnerState
        } else {
            gumballMachine.state = gumballMachine.soldState
        }
    }

    override fun dispense() {
        println("알맹이가 나갈 수 없습니다.")
    }

    override fun refill() {
        println("동전을 먼저 사용해 주세요.")
    }
}