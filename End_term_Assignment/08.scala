object Q2{
    def main(args: Array[String]){
        var name = "Himanshu";
        print(isEligible(name));
    }
    var valid_age = 18;
    def isEligible(age: Int, name: String) => {
        if(age>=valid_age)
            println(s"$name of age $age is eligible");
        else
            println(s"$name of age $age is ineligible");
    }
}
