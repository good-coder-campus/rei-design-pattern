package state

class WinnerState(
    private val gumballMachine: GumballMachine
) : State {
    override fun insertQuarter() {
        println("잠깐만 기다려 주세요. 알맹이가 나가고 있습니다.")
    }

    override fun ejectQuarter() {
        println("이미 알맹이를 뽑으셨습니다.")
    }

    override fun turnCrank() {
        throw IllegalStateException("손잡이를 한 번만 돌려주세요.")
    }

    override fun refill() {
        throw IllegalStateException("이미 알맹이가 나가고 있습니다.")
    }

    override fun dispense() {
        gumballMachine.releaseBall()
        if (gumballMachine.count == 0) {
            // 2개를 뽑을 수 없음
            gumballMachine.state = gumballMachine.soldOutState
        } else {
            // 2개를 뽑는다
            gumballMachine.releaseBall()
            println("축하드립니다! 알맹이를 하나 더 받으실 수 있습니다.")
            if (gumballMachine.count > 0) {
                gumballMachine.state = gumballMachine.noQuarterState
            } else {
                println("더 이상 알맹이가 없습니다.")
                gumballMachine.state = gumballMachine.soldOutState
            }
        }
    }
}