package proxy.dating

import java.lang.reflect.Proxy

class OwnerProxyTest {

    fun getOwnerProxy(person: Person): Person {
        return Proxy.newProxyInstance(
            person.javaClass.classLoader,
            person.javaClass.interfaces,
            OwnerInvocationHandler(person)
        ) as Person
    }

    fun getNonOwnerProxy(person: Person): Person {
        return Proxy.newProxyInstance(
            person.javaClass.classLoader,
            person.javaClass.interfaces,
            NonOwnerInvocationHandler(person)
        ) as Person
    }

    fun getProxy(person: Person, owner: Person): Person {
        return if (person.getName() == owner.getName()) {
            getOwnerProxy(person)
        } else {
            getNonOwnerProxy(person)
        }
    }
}

fun main() {
    val owner = PersonImpl("Joe", "male", "running", 5)
    val nonOwner = PersonImpl("Sue", "female", "jogging", 3)

    val ownerProxy = OwnerProxyTest().getProxy(owner, owner)
    val nonOwnerProxy = OwnerProxyTest().getProxy(nonOwner, owner)

    try {
        ownerProxy.setGeekRating(10)
    } catch (e: Exception) {
        println("Owner can't set geek rating")
    }

    try {
        nonOwnerProxy.setGeekRating(10)
    } catch (e: Exception) {
        println("Non-owner can't set geek rating")
    }
}