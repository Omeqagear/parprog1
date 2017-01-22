package example
import Lists._
/**
  * Created by Administrador on 21/1/2017.
  */
object Main extends App{
 val added = sum(List(2,3,5,4,2,2))
 val maxed = max(List(2,30,456,20,25451321,4581,54165465,54687864))

  println(s"the sum of the firts List is $added and the max number of the second List is $maxed")
}
