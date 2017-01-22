class HelloThread extends Thread{
  override def run(){
    println("Hello ")
    println("World")
  }
}


def main(): Unit ={
  val t = new HelloThread
  val s = new HelloThread
  s.start()
  t.start()
  s.join()
  t.join()
}

main()

main()

main()
