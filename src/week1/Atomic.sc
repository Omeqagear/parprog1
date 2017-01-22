
private val x = new AnyRef{}
private var uidCount = 0L

def get_UId(): Long = {
  uidCount = uidCount + 1
  uidCount
}

def startThread()={
  val t = new Thread{
    override def run(): Unit = {
      val uids = for(i <- 0 until 10) yield get_UId()
      println(uids)
    }
  }
  t.start()
  t
}

startThread(); startThread()
