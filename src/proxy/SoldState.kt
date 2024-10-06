package proxy

class SoldState(
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
        // 알맹이를 꺼내기 위해 알맹이를 하나 반환하고 count를 감소시킨다.
        gumballMachine.releaseBall()
        if (gumballMachine.count > 0) {
            gumballMachine.state = gumballMachine.noQuarterState
        } else {
            println("더 이상 알맹이가 없습니다.")
            gumballMachine.state = gumballMachine.soldOutState
        }
    }
}