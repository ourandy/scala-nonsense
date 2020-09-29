package calculator

import scala.math.{exp, pow}

object GoalsCalculator {

  def goalsProbabilityMap(goals: Double): Map[Int, Double] = {

    Array.ofDim[Int](21)
      .zipWithIndex
      .map { case (v, i) => (i, v) }
      .toMap
      .map {
        case (k, v) => k -> calculatePoisson(goals, k)
      }

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
