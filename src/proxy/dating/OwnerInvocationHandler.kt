package proxy.dating

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method

class OwnerInvocationHandler(
    private val person: Person
) : InvocationHandler {
    override fun invoke(proxy: Any?, method: Method?, args: Array<out Any>?): Any? {
        try {
            if (method?.name?.startsWith("get") == true) {
                return method.invoke(person, args)
            } else if (method?.name == "setGeekRating") {
                throw IllegalAccessException()
            } else if (method?.name?.startsWith("set") == true) {
                return method.invoke(person, args)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return null
    }
}