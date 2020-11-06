package genetics

class Animal(genes: List[Double]){

  val delta = 0.001

  def genes(): List[Double] ={
    this.genes
  }

 def costFunction(animal: List[Double]): Double = {

   val optimal = animal
   val optimalGenes = optimal  // for simplicity of typing
   val animalGenes = animal   //

   val COST = (for((optGene,anmGene) <- optimalGenes zip animalGenes) yield {
     math.abs(optGene - anmGene)}).sum / animalGenes.length

   COST
 }


}
