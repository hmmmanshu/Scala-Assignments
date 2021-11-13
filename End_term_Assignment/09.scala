import scala.collection.immutable.ListMap
object pincode {
  def main(args: Array[String]): Unit = {
    println("|=====================|")
    println("|Name : Himanshu Negi |")
    println("|Section : DS         |")
    println("|Roll No : 32         |")
    println("|=====================|")
    var m = Map("Bill" -> 56, "Johnny" -> 87, "Tommy" -> 11, "Cheena" -> 13)
    println(ListMap(m.toSeq.sortWith(_._1 > _._1): _*))
  }
}
