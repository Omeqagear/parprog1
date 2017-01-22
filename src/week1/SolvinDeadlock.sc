class Account (private var amount: Int = 0){
  val uid = get_UId()

  private var uidCount = 0L
  def get_UId(): Long = {
    uidCount = uidCount + 1
    uidCount
  }

  private def lockAndTransfer(target: Account, n: Int) =
    this.synchronized{
      target.synchronized{
        this.amount -= n
        target.amount += n
      }
    }

  def transfer(target: Account, n: Int) =
    if(this.uid < target.uid) this.lockAndTransfer(target, n)
    else target.lockAndTransfer(this, -n)
}

val a1 = new Account(500000)
val a2 = new Account(700000)

a1.transfer(a2, 150000)
a2.transfer(a1, 150000)