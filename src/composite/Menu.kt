package composite

class Menu(
    private val name: String,
    private val description: String
) : MenuComponent() {
    private val menuComponents = mutableListOf<MenuComponent>()

    override fun add(menuComponent: MenuComponent) {
        menuComponents.add(menuComponent)
    }

    override fun remove(menuComponent: MenuComponent) {
       menuComponents.remove(menuComponent)
    }


    override fun getChild(i: Int): MenuComponent {
      return menuComponents[i]
        }
    override fun getName(): String {
        return name
    }

    override fun getDescription(): String {
        return description
    }

    override fun print() {
        println("\n$name, $description")
        println("---------------------")

        menuComponents.forEach {
            it.print()
        }
    }
}