package calculator

import scala.collection.mutable.{Map => MutableMap}
import scala.math.{exp, pow}

object GoalsCalculator {

  def goalsProbabilityMap(homeExpGoals: Double, awayExpGoals: Double): MutableMap[(Int, Int), Double] = {

    val correctScoreProbabilityMap: MutableMap[(Int, Int), Double] = MutableMap()

    for (homeScore <- 0 to 20) {
      for (awayScore <- 0 to 20) {
        correctScoreProbabilityMap += ((homeScore, awayScore) ->
          calculatePoisson(homeExpGoals, homeScore) *
            calculatePoisson(awayExpGoals, awayScore))
      }
    }
    correctScoreProbabilityMap
  }

  def calculatePoisson(mu: Double, k: Int): Double = {
    pow(mu, k) * exp(-mu) / factorial(k)
  }

  def factorial(n: Int): Int = {
    if (n == 0)
      1
    else
      n * factorial(n - 1)
  }

}
