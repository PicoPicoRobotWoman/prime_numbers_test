import scala.io.StdIn

object Main extends App {

  val simples = List(BigInt(2), BigInt(3)).union(List.range(2, StdIn.readInt() + 1)
    .filter(i => (i - 1) % 6 == 0 || (i + 1) % 6 == 0)
    .filter(i => List.range(1, (i + 1) / 2)
      .scanLeft(BigInt(1))((acc, value) => acc * (i - value + 1) / value)
      .tail
      .map(k => k % i).sum == 0)
    )

  println(simples.size)

}
