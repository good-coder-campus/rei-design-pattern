package proxy

class NoQuarterState(
  @Transient  private val gumballMachine: GumballMachine
) : State {
    companion object {
        private const val serialVersionUID = 2L
    }

    override fun insertQuarter() {
        println("동전을 넣었습니다.")
        gumballMachine.state = gumballMachine.hasQuarterState
    }

    override fun ejectQuarter() {
        println("동전을 넣어주세요.")
    }

    override fun turnCrank() {
        throw IllegalStateException("동전을 넣어주세요.")
    }

    override fun dispense() {
        println("동전을 넣어주세요.")
    }

    override fun refill() {
        println("동전을 넣어주세요.")
    }
}