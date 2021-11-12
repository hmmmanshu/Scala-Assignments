object Q2{
    def main(args: Array[String]){
        var name = "Himanshu";
        print(isEligible(name));
    }
    def isEligible(age: Int, name: String) => {
        if(age>=18)
            println(s"$name of age $age is eligible");
        else
            println(s"$name of age $age is ineligible");
    }
}