import scala.io.StdIn

object ProtosTest extends App {

    val n = StdIn.readInt()
    val protosSimples = List.range(1, n + 1)
        .filter(k => (k & (k - 1)) == 0)
        .flatMap(sq => List.range(1, ((n - 1) / sq) + 1).filter(k => k % 2 == 1 && k < sq).map(k => k * sq + 1))
        .filter(pr => List.range(1, n).count(a => math.BigInt(a).pow((pr - 1) / 2) % pr == pr - 1) > 0)

    println(protosSimples.distinct.sorted)

}
