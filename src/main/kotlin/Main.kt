import java.util.*

fun main(args: Array<String>) {
    val soe = SieveofEratosthenes()
    println("Please write an integer number:")
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    soe.countNumberOfPrimesUpTo(n)
}

class SieveofEratosthenes {
    fun countNumberOfPrimesUpTo(n: Int) {
        val list = BooleanArray(n + 1) { true }
        list[0] = false
        list[1] = false

        for (i in 2..n) {
            if (list[i] == true)
                for (j in 2..(n / i))
                    list[i * j] = false
        }
        val numberOfPrimes = list.count { it }
        println("There are $numberOfPrimes prime numbers up to $n")
    }
}
