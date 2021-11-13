object closures{
    def main(args: Array[String]):Unit={
        var name = "Himanshu";
        isEligible(12, name);
    }
    var valid_age = 18;
    def isEligible(age: Int, name: String) = {
        println("|=====================|")
        println("|Name : Himanshu Negi |")
        println("|Section : DS         |")
        println("|Roll No : 32         |")
        println("|=====================|")
        if(age>=valid_age)
            println(s"$name of age $age is eligible");
        else
            println(s"$name of age $age is ineligible");
    }
}
