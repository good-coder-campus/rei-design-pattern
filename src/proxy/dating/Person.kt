package proxy.dating

interface Person {
   fun getName(): String
    fun getGender(): String
    fun getInterests(): String
    fun getGeekRating(): Int

    fun setName(name: String)
    fun setGender(gender: String)
    fun setInterests(interests: String)
    fun setGeekRating(rating: Int)
}