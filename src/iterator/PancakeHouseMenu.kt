package iterator

class PancakeHouseMenu (
    val menuItems: MutableList<MenuItem> = mutableListOf()
) : Menu {
    init {
        addItem(
            "K&B 팬케이크 세트",
            "스크램블드 에그와 토스트가 곁들여진 팬케이크",
            true,
            2.99
        )
        addItem(
            "레귤러 팬케이크 세트",
            "달걀 후라이와 소시지가 곁들여진 팬케이크",
            false,
            2.99
        )
        addItem(
            "블루베리 팬케이크",
            "신선한 블루베리와 시럽으로 만든 팬케이크",
            true,
            3.49
        )
        addItem(
            "와플",
            "와플, 취향에 따라 블루베리나 딸기를 얹을 수 있습니다.",
            true,
            3.59
        )
    }

    fun addItem(name: String, description: String, vegetarian: Boolean, price: Double) {
        val menuItem = MenuItem(name, description, vegetarian, price)
        menuItems.add(menuItem)
    }

    override fun createIterator(): Iterator<MenuItem> {
        return menuItems.iterator()
    }
}

class DinerMenu : Menu {
    var numberOfItems = 0
    val menuItems = Array(MAX_ITEMS) { MenuItem("", "", false, 0.0) }

    init {
        addItem(
            "채식주의자용 BLT",
            "통밀 위에(식빵 대신) ���추, 토마토, 베이컨이 얹혀진 샌드위치",
            true,
            2.99
        )
        addItem(
            "BLT",
            "통밀 위에(식빵 대신) 상추, 토마토, 베이컨이 얹혀진 샌드위치",
            false,
            2.99
        )
        addItem(
            "오늘의 스프",
            "감자 샐러드를 곁들인 오늘의 스프",
            false,
            3.29
        )
        addItem(
            "핫도그",
            "사워크라우트, 갖은 양념, 양파, 치즈가 곁들여진 핫도그",
            false,
            3.05
        )

    }

    companion object {
        const val MAX_ITEMS = 6
    }

    fun addItem(name: String, description: String, vegetarian: Boolean, price: Double) {
        val menuItem = MenuItem(name, description, vegetarian, price)
        if (numberOfItems >= MAX_ITEMS) {
            println("죄송합니다, 메뉴가 꽉 찼습니다. 더 이상 추가할 수 없습니다.")
        } else {
            menuItems[numberOfItems] = menuItem
            numberOfItems += 1
        }
    }

    override fun createIterator(): Iterator<MenuItem> {
        return menuItems.iterator()
    }

}

fun main() {
    val breakfastItems = PancakeHouseMenu().menuItems
    val lunchItems = DinerMenu().menuItems

    println("아침 메뉴")
    breakfastItems.forEach {
        println(it)
    }

    println("점심 메뉴")
    lunchItems.forEach {
        println(it)
    }

    val iterator = breakfastItems.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }
}