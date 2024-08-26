package templatemethod

import java.util.Arrays

class Duck(
    val name: String,
    val weight: Int
) : Comparable<Duck> {
    override fun compareTo(other: Duck): Int {
        if (this.weight < other.weight) {
            return -1
        } else if (this.weight == other.weight) {
            return 0
        } else {
            return 1
        }
    }

    override fun toString(): String {
        return "$name weighs $weight"
    }
}

fun main() {
    val ducks = arrayOf(
        Duck("Daffy", 8),
        Duck("Dewey", 2),
        Duck("Howard", 7),
        Duck("Louie", 2),
        Duck("Donald", 10),
        Duck("Huey", 2)
    )
    println("정렬 전")
    display(ducks)

    Arrays.sort(ducks)

    println("\n정렬 후")
    display(ducks)


}

fun display(ducks: Array<Duck>) {
    for (duck in ducks) {
        println(duck)
    }
}