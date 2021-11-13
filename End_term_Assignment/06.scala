object method_implementations {
  def main(args: Array[String]): Unit = {
    println("|=====================|")
    println("|Name : Himanshu Negi |")
    println("|Section : DS         |")
    println("|Roll No : 32         |")
    println("|=====================|")
    var list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    println(removeDuplicates(list));
    println(find_ele(list, 5));
    println(listLength(list));
    println(sort(list));
    println(sum(list));
    println(listToString(list));
    println(smallest(list));
    println(maximum(list));
  }
  def removeDuplicates(list: List[Int]): Unit = {
    var newList = list.distinct;
    println(newList);
  }
  def find_ele(list: List[Int], ele: Int): Boolean = {
    return list.contains(ele);
  }
  def listLength(list: List[Int]): Int = {
    return list.length;
  }
  def sort(list: List[Int]): List[Int] = {
    return list.sorted;
  }
  def sum(list: List[Int]): Int = {
    return list.sum;
  }
  def listToString(list: List[Int]): String = {
    return list.toString();
  }
  def smallest(list: List[Int]): Int = {
    return list.min;
  }
  def maximum(list: List[Int]): Int = {
    return list.max;
  }
}
