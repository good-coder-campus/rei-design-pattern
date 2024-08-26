package templatemethod

import java.util.*

class MyStringList(
    val myList: MutableList<String>, override val size: Int
): AbstractList<String>() {

    override fun get(index: Int): String {
        return myList[index]
    }

    override fun set(index: Int, element: String): String {
       val oldString = myList[index]
         myList[index] = element
        return oldString
    }
}