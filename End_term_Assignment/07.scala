object seven{
    def main():Unit={
        list1 = List(99.5, 100, 50, 55, 70, 100, -1)
        list2 = List(10, 20, 30, 40, 50)
        list1.concat(list2)
        print("Max : ")
        println(list1.max)
        print("Min : ")
        println(list1.min)

    }
}