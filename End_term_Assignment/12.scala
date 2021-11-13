import org.ddahl.rscala._
import ru.retailrocket.ispark._
object DataScience{
    def connect = RClient("R", false)
    @transient
    val r = connect()
    def dataViz():Unit={
        R.plot(r.c("x", 1 to 10), r.c("y", 1 to 10)) // Random data to visualize
    }
    def dataDescription(data: DataFrame): Unit = {
        val data_desc = data.describe() // Summarize the data usnig inbuilt functions
        data_desc.show()
    }
    def main(args: Array[String]): Unit = {
        dataViz()
        dataDescription("himanshu/Desktop/sample.csv")
    }
}