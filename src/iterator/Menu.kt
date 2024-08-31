package iterator

interface Menu {
    fun createIterator(): Iterator<MenuItem>
}