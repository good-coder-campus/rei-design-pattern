package adapter

class RoundHole(private val radius: Int) {
   fun getRadius(): Int {
       return radius
   }

    fun fits(peg: RoundPeg): Boolean {
        return radius >= peg.getRadius()
    }
}

open class RoundPeg(private val radius: Int) {
   open fun getRadius(): Int {
        return radius
    }
}

class SquarePeg(private val width: Int) {
    fun getWidth(): Int {
        return width
    }
}

class SquarePegAdapter(private val peg: SquarePeg): RoundPeg(peg.getWidth() * 2) {
    override fun getRadius(): Int {
        return peg.getWidth() * Math.sqrt(2.0).toInt() / 2
    }
}

fun main() {
    val hole = RoundHole(5)
    val rpeg = RoundPeg(5)
    println(hole.fits(rpeg)) // true

    val smallSqPeg = SquarePeg(5)
    val largeSqPeg = SquarePeg(10)
//    hole.fits(smallSqPeg) // false

    val smallSqPegAdapter = SquarePegAdapter(smallSqPeg)
    val largeSqPegAdapter = SquarePegAdapter(largeSqPeg)
    println(hole.fits(smallSqPegAdapter)) // true
    println(hole.fits(largeSqPegAdapter)) // false
}
