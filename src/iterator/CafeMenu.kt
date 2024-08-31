package iterator

class CafeMenu : Menu {
    val menuItems = hashMapOf<String, MenuItem>()

    init {
        addItem(
            "베지 버거와 에어프라이즈",
            "통밀 빵, 상추, 토마토, 감자튀김",
            true,
            3.99
        )
        addItem(
            "오늘의 스프",
            "샐러드가 곁들여진 오늘의 스프",
            false,
            3.69
        )
        addItem(
            "베리또",
            "쌀, 콩, 살사, 상추가 곁들여진 베리또",
            true,
            4.29
        )
    }

    fun addItem(name: String, description: String, vegetarian: Boolean, price: Double) {
        val menuItem = MenuItem(name, description, vegetarian, price)
        menuItems[name] = menuItem
    }

    override fun createIterator(): Iterator<MenuItem> {
        return menuItems.values.iterator()
    }
}