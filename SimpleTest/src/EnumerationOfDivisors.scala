import scala.io.StdIn

object EnumerationOfDivisors extends App {

    val simples = List(2, 3).union(
        (2 to StdIn.readInt())
            .filter(i => (i - 1) % 6 == 0 || (i + 1) % 6 == 0)
            .filter( i => (2 until i - 1).filter(i => (i - 1) % 6 == 0 || (i + 1) % 6 == 0).count(k => i % k == 0) == 0))

    println(simples)

}
