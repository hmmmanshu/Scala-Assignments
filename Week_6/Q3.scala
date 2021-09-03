trait Trait1
{
    def abstractMethod;
    def nonAbstractMethod
    { 
        println("As Due to Covid 19" + " there is a nation wide lockdown")
    }
}
// DemoClass inherits trait
class DemoClass extends Trait1
{
    def abstractMethod()
    {
        println("We all are at home")
    }
}
object printValues
{
    // Main method
    def main(args: Array[String])
    {
        val printVal = new DemoClass();
        printVal.abstractMethod
        printVal.nonAbstractMethod
    }
}