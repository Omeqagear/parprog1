
def sumSegment(a: Array[Int], p: Double, s: Int, t: Int): Int ={
  var i = s ; var sum: Int = 0
  while(i < t){
    sum = sum + power(a(i), p)
    i = i + 1
  }
  sum
}

def power(x: Int, p: Double): Int = math.exp(p * math.log(math.abs(x))).toInt

def pNorm(a: Array[Int], p: Double): Int =
  power(sumSegment(a,p,0,a.length), 1/p)

def pNormTwoPart(a: Array[Int], p: Double): Int={
  val m = a.length / 2
  val (sum1, sum2) = (sumSegment(a,p,0,m),
                        sumSegment(a,p,m,a.length))
  power(sum1 + sum2, 1/p)
}
