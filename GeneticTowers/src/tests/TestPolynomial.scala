package tests

import org.scalatest.FunSuite
import genetics.GeneticAlgorithm
import genetics.geometry.SingleValue
import genetics.geometry.Polynomial

class TestPolynomial extends FunSuite {

  val EPSILON: Double = 0.1

  def equalDoubles(d1: Double, d2: Double): Boolean = {
    (d1 - d2).abs < EPSILON
  }
  test("Genetic sfbsjbnoj  Finds a Random Number") {
   // val hiddenPoly = List(List(-2.0,1.0),List(-1.0,3.0),List(0.0,5.0),List(1.0,7.0),List(2.0,9.0))
   // val computed = GeneticAlgorithm.geneticAlgorithm(Polynomial.incubator, Polynomial.costFunction(hiddenNumber), 100)
   // println(computed.evaluate)
//
   // assert(equalDoubles(, computed.value))
  }

}
