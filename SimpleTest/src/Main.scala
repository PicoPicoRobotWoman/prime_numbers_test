import scala.io.StdIn

object Main extends App {

    val simples = List.range(2, StdIn.readInt() + 1)
        .filter(i => (i - 1) % 6 == 0 || (i + 1) % 6 == 0)
        .filter(i => List.range(1, (i + 1) / 2 )
                .scanLeft(BigInt(0))((acc, value) => if( acc == 0) (i - value + 1) / value else acc * (i - value + 1) / value)
                .map(k => k % i).sum == 0)
        .union(List(BigInt(2), BigInt(3)))

    println(simples)

}
