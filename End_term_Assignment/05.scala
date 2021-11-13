// demonstrate all builtin operation on lists
object lists{
    def main(args:Array[String]):Unit={
        println("|=====================|")
        println("|Name : Himanshu Negi |")
        println("|Section : DS         |")
        println("|Roll No : 32         |")
        println("|=====================|")
        val list = List(1,2,3,4,5)
        println(list)
        println(list.head)
        println(list.tail)
        println(list.isEmpty)
        println(list.length)
        println(list.reverse)
        println(list.take(3))
        println(list.drop(3))
        println(list.splitAt(3))
        println(list.indices)
        println(list.indices.map(list(_)))
        println(list.indices.map(list(_)).mkString(","))
    }
}