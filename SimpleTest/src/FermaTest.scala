import scala.io.StdIn

object FermaTest extends App {

    val FermaSimples = (2 to StdIn.readInt())
        .toList
        .filter(p => (2 until p).toList.count(  a =>
            (BigInt(a).pow(p) - a ) % p == 0) == p - 2
        )

    println(FermaSimples.size)

}
