package adapter

class DuckAdapter(private val duck: Duck): Turkey {
    override fun gobble() {
        duck.quack()
    }

    override fun fly() {
       // 랜덤으로 5번에 한번만 날게 한다
        if ((0..4).random() == 0) {
            duck.fly()
        }
    }
}