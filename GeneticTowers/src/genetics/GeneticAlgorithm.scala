package genetics
import scala.util.Random

object GeneticAlgorithm {
  val populationSize = 300
  val numberOfGenerations = 250

  /**
   * Uses a genetic algorithm to optimize a generic problem
   *
   * @param incubator     Determines how instances of type T are created from a List of Doubles (genes)
   * @param costFunction  Determines the cost for a given instance of T
   * @param numberOfGenes The size of the List expected by the incubator
   * @tparam T The type to be optimized
   * @return An instance of T with minimal cost
   */

  def geneticAlgorithm[T](incubator: List[Double] => T, costFunction: T => Double, numberOfGenes: Int): T = {

    def populateGenes(): List[Double] = {
      val r = new Random()
      List.fill(numberOfGenes)(-100 + (100 - (-100)) * r.nextDouble())
    }
    val Population: List[List[Double]] = List.fill(populationSize)(populateGenes())//original population

    def ELITE(population: List[List[Double]]): List[List[Double]] = {
      population.sortBy(x => costFunction(incubator(x))).take(74) //take top 74 / 300
    }
    def mutate(animal: List[Double]): List[Double] = {
      val r = new Random
      val rand: Double = -100 + (100 - (-100)) * r.nextDouble()

      val mutatedGenes = (for (gene <- animal) yield {
        if (20 < gene - rand && gene - rand < 40) { //arbitrary range for mutation
          -100 + (100 - (-100)) * r.nextDouble() //mutate to value in range for extra randomness :)
        }
        else {gene
        }
      })
      mutatedGenes
    }
    def crossover(parent1: List[Double], parent2: List[Double]): List[Double] = {
      val offspring = (for( i <- parent1.indices) yield {
        if(i % 2 == 0){
          parent1(i)    //zigzag swap genes for offspring
        }else{
          parent2(i)
        }
        if (i < numberOfGenes/3 || i>numberOfGenes * 2/3) {
          parent1(i)
        }             //split thirds
        else {
          parent2(i)
        }
        (parent1(i) + parent2(i)) / 2     //average
      }).toList
      offspring
    }

    def RECURSE[T](incubator: List[Double] => T, costFunction: T => Double, numberOfGenes: Int, POP: List[List[Double]], GEN: Int): T = {

      val APEX_Predators = ELITE(POP)
      val MUTES = for (pred <- APEX_Predators) yield {mutate(pred)}
      val CROSSES = for (pred <- 0 until APEX_Predators.length-1) yield {crossover(APEX_Predators(pred), APEX_Predators(pred+1))}
      val BEST_ANIMAL = APEX_Predators.head//take # 1 of top

      def rePOP(): List[List[Double]] = {
        val p = List.fill(populationSize - APEX_Predators.length - MUTES.length - CROSSES.length)(populateGenes())++APEX_Predators++MUTES++CROSSES
        val r = new Random()
        val POP = r.shuffle(p)
        POP
      }

      if (GEN < numberOfGenerations) {    //assume GEN > 0//
        RECURSE(incubator, costFunction, numberOfGenes, rePOP(), GEN + 1)
      }
      else {
        incubator(BEST_ANIMAL)
      }
    }
    RECURSE(incubator,costFunction,numberOfGenes,Population,1)
  }

}
