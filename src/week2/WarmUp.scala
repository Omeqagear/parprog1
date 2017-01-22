package week2

import org.scalameter._

val time = withWarmer(new Warmer.Default) measure{
(0 until 100000).toArray
}

object WarmUp extends App{



}