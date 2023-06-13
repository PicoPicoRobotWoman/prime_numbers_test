import scala.io.StdIn

object VilsonTest extends App {

    val simples = (1 until  StdIn.readInt())
        .scanLeft(BigInt(1))( (acc, value) => acc * value).drop(1)
        .zipWithIndex.map { case (element, index) => (element, index + 2)}
        .filter(i => (i._1 + 1) % i._2 == 0).map(i => i._2)

    println(simples)

}
