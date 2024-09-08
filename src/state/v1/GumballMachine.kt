package state.v1

class GumballMachine(
    var count: Int = 0
) {
    var state = SOLD_OUT

    init {
        if (count > 0) {
            state = NO_QUARTER
        }
    }

    fun insertQuarter() {
        when (state) {
            HAS_QUARTER -> println("동전은 한 개만 넣어주세요.")
            NO_QUARTER -> {
                state = HAS_QUARTER
                println("동전을 넣었습니다.")
            }
            SOLD_OUT -> println("매진되었습니다. 다음 기회에 이용해주세요.")
            SOLD -> println("잠시만 기다려 주세요. 알맹이가 나가고 있습니다.")
        }
    }

    fun ejectQuarter() {
        when (state){
            HAS_QUARTER -> {
                println("동전이 반환됩니다.")
                state = NO_QUARTER
            }
            NO_QUARTER -> println("동전을 넣어주세요.")
            SOLD -> println("이미 알맹이를 뽑으셨습니다.")
            SOLD_OUT -> println("동전을 넣지 않으셨습니다. 동전이 반환되지 않습니다.")
        }
    }

    // 손잡이를 돌린다
    fun turnCrank() {
        when (state) {
            SOLD -> println("손잡이는 한 번만 돌려주세요.")
            NO_QUARTER -> println("동전을 넣어주세요.")
            SOLD_OUT -> println("매진되었습니다.")
            HAS_QUARTER -> {
                println("손잡이를 돌리셨습니다.")
                state = SOLD
                dispense()
            }
        }
    }

    // 알맹이 내보내기
    fun dispense() {
        when (state) {
            SOLD -> {
                println("알맹이가 나가고 있습니다.")
                count -= 1
                if (count == 0) {
                    println("더 이상 알맹이가 없습니다.")
                    state = SOLD_OUT
                } else {
                    state = NO_QUARTER
                }
            }
            NO_QUARTER -> println("동전을 넣어주세요.")
            SOLD_OUT -> println("매진입니다.")
            HAS_QUARTER -> println("알맹이가 나갈 수 없습니다.")
        }
    }

    override fun toString(): String {
        return "남은 개수: $count, 현재 상태: $state"
    }

    companion object {
        const val SOLD_OUT = 0;
        const val NO_QUARTER = 1;
        const val HAS_QUARTER = 2;
        const val SOLD = 3;
    }
}