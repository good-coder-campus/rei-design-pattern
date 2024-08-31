package composite

class MenuItem(
    private val name: String,
    private val description: String,
    private val vegetarian: Boolean,
    private val price: Double
): MenuComponent() {
    override fun getName() = name
    override fun getDescription() = description
    override fun getPrice() = price
    override fun isVegetarian() = vegetarian
    override fun print() {
        println("  $name")
        if (vegetarian) println("(v)")
        println(", $price")
        println("     -- $description")
    }

}