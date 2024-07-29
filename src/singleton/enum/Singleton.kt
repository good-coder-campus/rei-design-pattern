package singleton.enum


enum class Singleton{
    UNIQUE_INSTANCE
}

class SingletonClient {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val singleton = Singleton.UNIQUE_INSTANCE
            println(singleton)
        }
    }
}