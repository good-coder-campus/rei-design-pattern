package composite

class Waitress(
    private val allMenus:MenuComponent
) {

    fun printMenu() {
        allMenus.print()
    }
}

fun main() {
    val pancakeHouseMenu = Menu("PANCAKE HOUSE MENU", "Breakfast")
    val dinerMenu = Menu("DINER MENU", "Lunch")
    val cafeMenu = Menu("CAFE MENU", "Dinner")
    val dessertMenu = Menu("DESSERT MENU", "Dessert of course!")

    val allMenus = Menu("ALL MENUS", "All menus combined")

    allMenus.add(pancakeHouseMenu)
    allMenus.add(dinerMenu)
    allMenus.add(cafeMenu)

    dinerMenu.add(MenuItem(
        "Pasta",
        "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
        true,
        3.89
    ))
    dinerMenu.add(dessertMenu)

    dessertMenu.add(MenuItem(
        "Apple Pie",
        "Apple pie with a flakey crust, topped with vanilla icecream",
        true,
        1.59
    ))

    val waitress = Waitress(allMenus)
    waitress.printMenu()

}