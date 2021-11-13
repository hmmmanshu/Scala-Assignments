object Q2{
    def main(args: Array[String]):Unit={
        var name = "Himanshu";
        print(isEligible(12, name));
    }
    var valid_age = 18;
    def isEligible(age: Int, name: String) = {
        if(age>=valid_age)
            println(s"$name of age $age is eligible");
        else
            println(s"$name of age $age is ineligible");
    }
}
