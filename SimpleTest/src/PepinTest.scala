import scala.io.StdIn

object PepinTest extends App {


  val fibonacciStream: Stream[BigInt] = BigInt(5) #:: BigInt(8) #:: fibonacciStream.zip(fibonacciStream.tail).map { case (a, b) => a + b }

  val pepinSimples = fibonacciStream.take(StdIn.readInt()).toList.filter(fib => BigInt(3).pow((fib - 1).toInt / 2) % fib == fib - 1)

  println(pepinSimples)

}
