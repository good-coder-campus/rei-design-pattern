package adapter

import java.util.Enumeration

class IteratorEnumeration(
    private val iterator: Iterator<*>
) : Enumeration<Any>{
    override fun hasMoreElements(): Boolean {
       return iterator.hasNext()
    }

    override fun nextElement(): Any {
     return iterator.next()!!
    }
}