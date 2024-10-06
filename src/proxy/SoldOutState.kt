package proxy

class SoldOutState(
    private val gumballMachine: GumballMachine
) : State {
    override fun insertQuarter() {
        println("매진되었습니다. 다음 기회에 이용해주세요.")
    }

    override fun ejectQuarter() {
        println("동전을 넣지 않으셨습니다. 반환할 동전이 없습니다.")
    }

    override fun turnCrank() {
        throw IllegalStateException("매진되었습니다.")
    }

    override fun dispense() {
        println("매진입니다.")
    }

    override fun refill() {
        gumballMachine.state = gumballMachine.noQuarterState
        println("알맹이가 다시 채워졌습니다.")
    }
}