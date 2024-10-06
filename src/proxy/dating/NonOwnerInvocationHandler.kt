package proxy.dating

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method

class NonOwnerInvocationHandler(
    private val person: Person
) : InvocationHandler {
    override fun invoke(proxy: Any?, method: Method?, args: Array<out Any>?): Any? {
        try {
            if (method?.name?.startsWith("get") == true) {
                return method.invoke(person, args)
            } else if (method?.name == "setGeekRating") {
                return method.invoke(person, args)
            } else if (method?.name?.startsWith("set") == true) {
                throw IllegalAccessException()
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return null
    }
}