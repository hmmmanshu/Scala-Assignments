// demonstrate all builtin operation on lists
object lists{
    def main(args:Array[String]):Unit={
        println("|=====================|")
        println("|Name : Himanshu Negi |")
        println("|Section : DS         |")
        println("|Roll No : 32         |")
        println("|=====================|")
        val list = List(1,2,3,4,5)
        println("list = "+list)
        println("head = "+list.head)
        println("tail = "+list.tail)
        println("Empty or not = "+list.isEmpty)
        println("Length = "+list.length)
        println("Reverse = "+list.reverse)
        println("Take first few = "+list.take(3))
        println("Drop first few = "+list.drop(3))
        println("Split list = "+list.splitAt(3))
        println("Range of indices = "+list.indices)
        println("String of list = "+list.indices.map(list(_)).mkString(","))
    }
}