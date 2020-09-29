import calculator.GoalsCalculator

object HelloWorld {

  val problemOne: ProblemOne = ProblemOne()

  val a = List(1,2,4)

  def main(args: Array[String]):Unit ={
    println("Problem One:")
    println(problemOne.findLastElement(a))
    println(problemOne.lastRecursive(a))
    println()
    println("Problem Two:")
    println(ProblemTwo.penultimateBuiltin(a))
    println(ProblemTwo.penultimateRecursive(a))
    println()
    println("Problem Three:")
    println(ProblemThree.nth(2,a))
    println(GoalsCalculator.goalsProbabilityMap(2.5))
  }

}