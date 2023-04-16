import kotlin.math.sqrt
import kotlin.random.Random

fun main() {
    //Realize that as the number of points increases, it gets closer to the true PI value
    println("Enter the number of points:")
    val n = readlnOrNull()?.toIntOrNull() ?: return

    var numberInCircle = 0
    val start = System.currentTimeMillis()

    repeat(n) {
        val x = Random.nextDouble()
        val y = Random.nextDouble()
        val distance = sqrt(x * x + y * y)
        if (distance <= 1) {
            numberInCircle++
        }
    }

    val end = System.currentTimeMillis()
    val time = end - start

    val myPi = 4.0 * numberInCircle / n
    println("My pi: $myPi")
    println("Kotlin's pi: ${Math.PI}")
    println("Time: $time ms.")
}