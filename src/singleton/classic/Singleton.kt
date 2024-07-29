package singleton.classic

class Singleton private constructor() { // 생성자는 private
    companion object {
       private var uniqueInstance: Singleton? = null

        fun getInstance(): Singleton { // 클래스의 인스턴스를 만들어서 리턴한
            if (uniqueInstance == null) {
                uniqueInstance = Singleton()
            }
            return uniqueInstance!!
        }
    }
}
