package adapter

import java.util.*

class EnumerationIterator(
    private val enumeration: Enumeration<*>
) : Iterator<Any> {

    override fun hasNext(): Boolean {
        return enumeration.hasMoreElements()
    }

    override fun next(): Any {
        return enumeration.nextElement()
    }
}