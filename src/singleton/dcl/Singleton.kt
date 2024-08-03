package singleton.dcl

class Singleton private constructor() {

    companion object {
        @Volatile
        private var instance: Singleton? = null

        fun getInstance(): Singleton {
            return instance ?: synchronized(Singleton::class.java) {
                instance = Singleton()
                instance!!
            }

        }
    }
}