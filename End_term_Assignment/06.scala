import scala.compiletime.ops.int
object Q4 {
  def main(args: Array[String]):Unit= {}
  def removeDuplicates(list: List[Int]):Unit= {
    var newList = list.distinct;
    println(newList);
  }
  def find(list: List[Int], ele: Int, ind: Int):Int= {
    return list.find(ele, ind);
  }
  def listLength(list: List[Int]):Int=  {
    return list.length;
  }
  def sort(list: List[Int]):List[Int]=  {
    return list.sorted;
  }
  def sum(list: List[Int]):Int=  {
    return list.sum;
  }
  def listToString(list: List[Int]):String=  {
    return list.toString();
  }
  def smallest(list: List[Int]):List[Int]=  {
    return list.min;
  }
  def maximum(list: List[Int]):Int=  {
    return list.max;
  }
}
