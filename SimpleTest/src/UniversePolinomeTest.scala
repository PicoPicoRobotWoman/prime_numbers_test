import scala.io.StdIn

object UniversePolinomeTest extends App {

  print("введите натуральное число (n) больше 3: ")

  val simples = List(BigInt(2), BigInt(3)).union(List.range(2, StdIn.readInt() + 1)
    .filter(i => (i - 1) % 6 == 0 || (i + 1) % 6 == 0)
    .filter(i => List.range(1, (i + 1) / 2)
      .scanLeft(BigInt(1))((acc, value) => acc * (i - value + 1) / value)
      .map(k => k % i).sum == 1)
    )

    println(s"все просты числа до n : $simples")
    println(s"найдено простых чисел: ${simples.size}")

}
