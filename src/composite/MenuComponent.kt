package composite

/**
 * 모든 메소드를 구현
 * add, remove, getChild: MenuComponent를 추가, 제거하는 기능
 * getName, getDescription, getPrice, isVegetarian: MenuComponent의 정보를 가져오는 기능
 * print: MenuComponent의 정보를 출력하는 기능, Menu, MenuItem에서 모두 구현
 */
abstract class MenuComponent {

    open fun add(menuComponent: MenuComponent) {
        throw UnsupportedOperationException()
    }

    open fun remove(menuComponent: MenuComponent) {
        throw UnsupportedOperationException()
    }

    open fun getChild(i: Int): MenuComponent {
        throw UnsupportedOperationException()
    }

    open fun getName(): String {
        throw UnsupportedOperationException()
    }

    open fun getDescription(): String {
        throw UnsupportedOperationException()
    }

    open fun getPrice(): Double {
        throw UnsupportedOperationException()
    }

    open fun isVegetarian(): Boolean {
        throw UnsupportedOperationException()
    }

    open fun print() {
        throw UnsupportedOperationException()
    }
}