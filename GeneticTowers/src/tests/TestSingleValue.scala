package tests

import genetics.GeneticAlgorithm
import genetics.geometry.SingleValue
import org.scalatest.FunSuite

class TestSingleValue extends FunSuite {

  val EPSILON: Double = 0.00001

  def equalDoubles(d1: Double, d2: Double): Boolean = {
    (d1 - d2).abs < EPSILON
  }

  test("Genetic Algorithm Finds a Random Number") {
    val hiddenNumber = 50.3256
    val computed = GeneticAlgorithm.geneticAlgorithm(SingleValue.incubator, SingleValue.costFunction(hiddenNumber), 30)
    println(computed.value)
    assert(equalDoubles(hiddenNumber, computed.value))
  }
  test("Genetic sfbsjbnoj  pirjspinvwo a Random Number") {
    val hiddenNumber = 0.0
    val computed = GeneticAlgorithm.geneticAlgorithm(SingleValue.incubator, SingleValue.costFunction(hiddenNumber), 30)
    println(computed.value)
    assert(equalDoubles(hiddenNumber, computed.value))
  }
  test("dgdndgndndddn Algorithm fpwij-qj3fbv a Random Number") {
    val hiddenNumber = 25.46
    val computed = GeneticAlgorithm.geneticAlgorithm(SingleValue.incubator, SingleValue.costFunction(hiddenNumber), 30)
    println(computed.value)
    assert(equalDoubles(hiddenNumber, computed.value))
  }
  test("dgdndgndndddn Algorithm Finds a -04jgnwkr  Number") {
    val hiddenNumber = -41.05
    val computed = GeneticAlgorithm.geneticAlgorithm(SingleValue.incubator, SingleValue.costFunction(hiddenNumber), 30  )
    println(computed.value)
    assert(equalDoubles(hiddenNumber, computed.value))
  }
  test("dgdndgndndddn w49jg Finds a Random Number") {
    val hiddenNumber = 15.864
    val computed = GeneticAlgorithm.geneticAlgorithm(SingleValue.incubator, SingleValue.costFunction(hiddenNumber), 30)
    println(computed.value)
    assert(equalDoubles(hiddenNumber, computed.value))
  }
  test("dgdndgndndddn Algorithm wjgnowign a Random Number") {
    val hiddenNumber = -50.06
    val computed = GeneticAlgorithm.geneticAlgorithm(SingleValue.incubator, SingleValue.costFunction(hiddenNumber), 30)
    println(computed.value)
    assert(equalDoubles(hiddenNumber, computed.value))
  }
  test("dgdndgndndddn Algorithm Finds a 3095ingr Number") {
    val hiddenNumber = 19.9
    val computed = GeneticAlgorithm.geneticAlgorithm(SingleValue.incubator, SingleValue.costFunction(hiddenNumber), 30)
    println(computed.value)
    assert(equalDoubles(hiddenNumber, computed.value))
  }
  test("dgdndgndndddn Algorithm iwjripn a Random Number") {
    val hiddenNumber = -5.04
    val computed = GeneticAlgorithm.geneticAlgorithm(SingleValue.incubator, SingleValue.costFunction(hiddenNumber), 30)
    println(computed.value)
    assert(equalDoubles(hiddenNumber, computed.value))
  }
  test("dgdndgndndddn Algorithm sfoin a Random Number") {
    val hiddenNumber = 96.6
    val computed = GeneticAlgorithm.geneticAlgorithm(SingleValue.incubator, SingleValue.costFunction(hiddenNumber), 30)
    println(hiddenNumber)
    println(computed.value)
    assert(equalDoubles(hiddenNumber, computed.value))
  }
  test("sf Algorithm Finds a Random Number") {
    val hiddenNumber = -24.74
    val computed = GeneticAlgorithm.geneticAlgorithm(SingleValue.incubator, SingleValue.costFunction(hiddenNumber), 30)
    println(computed.value)
    assert(equalDoubles(hiddenNumber, computed.value))
  }



}
