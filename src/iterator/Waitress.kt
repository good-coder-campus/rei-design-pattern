package iterator

class Waitress(
    val menus: List<Menu>
) {

    fun printMenu() {
        val menuIterator = menus.iterator()

        while (menuIterator.hasNext()) {
            val menu = menuIterator.next()
            printMenu(menu.createIterator())
        }
    }

    private fun printMenu(iterator: Iterator<MenuItem>) {
        while (iterator.hasNext()) {
            val menuItem = iterator.next()
            println("${menuItem.name}, ")
            println("${menuItem.price} -- ")
            println(menuItem.description)

        }
    }
}

fun main() {
    val pancakeHouseMenu = PancakeHouseMenu()
    val dinerMenu = DinerMenu()
    val cafeMenu = CafeMenu()

    val waitress = Waitress(
        listOf(pancakeHouseMenu, dinerMenu, cafeMenu)
    )
    waitress.printMenu()
}

