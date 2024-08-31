package iterator

import java.lang.UnsupportedOperationException

// deprecated
interface CustomIterator {
    fun hasNext(): Boolean

    fun next(): MenuItem
}

class DinerMenuIterator(val items: Array<MenuItem?>) : MutableIterator<MenuItem> {
    var position = 0

    override fun hasNext(): Boolean {
        return !(position >= items.size || items[position] == null)
    }

    override fun next(): MenuItem {
        val menuItem = items[position]
        position++
        return menuItem!!
    }

    override fun remove() {
        throw UnsupportedOperationException()
    }
}

class PancakeMenuIterator(val items: MutableList<MenuItem>): CustomIterator {
    private var position = 0
    override fun hasNext(): Boolean {
        return position < items.size
    }

    override fun next(): MenuItem {
        val menuItem = items[position]
        position++
        return menuItem
    }
}