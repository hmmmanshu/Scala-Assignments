object Q4 {
  def removeDuplicates(list: List[Int]) {
    var newList = list.distinct;
    println(newList);
  }
  def find(list: List[Int], ele: Int, ind: Int) {
    return list.find(ele, ind);
  }
  def listLength(list: List[Int]) {
    return list.length;
  }
  def sort(list: List[Int]) {
    return list.sorted;
  }
  def sum(list: List[Int]) {
    return list.sum;
  }
  def listToString(list: List[Int]) {
    return list.toString();
  }
  def smallest(list: List[Int]) {
    return list.min;
  }
  def maximum(list: List[Int]) {
    return list.max;
  }
  def main(args: Array[String]) {}
}
