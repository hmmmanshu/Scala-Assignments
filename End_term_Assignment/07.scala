object Q7{
    def main():Unit={
        var list1 = List(99.5, 100, 50, 55, 70, 100, -1)
        var list2 = List(10, 20, 30, 40, 50)
        print("Concatenated : ")
        println(List.concat(list1, list2))
        print("Max : ")
        println(list1.max)
        print("Min : ")
        println(list1.min)

    }
}