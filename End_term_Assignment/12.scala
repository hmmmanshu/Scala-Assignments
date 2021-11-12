object dataprep{
    def dataprep(data: DataFrame): DataFrame = {
        val data_prep = data.withColumn("label", data("label").cast(DoubleType))
        val data_prep_indexed = data_prep.withColumn("label", data_prep("label").cast(DoubleType))
        val data_prep_indexed_norm = data_prep_indexed.withColumn("label", data_prep_indexed("label").cast(DoubleType))
        val data_prep_indexed_norm_indexed = data_prep_indexed_norm.withColumn("label", data_prep_indexed_norm("label").cast(DoubleType))
        val data_prep_indexed_norm_indexed_scaled = data_prep_indexed_norm_indexed.withColumn("label", data_prep_indexed_norm_indexed("label").cast(DoubleType))
        data_prep_indexed_norm_indexed_scaled
    }
    def dataDescription(data: DataFrame): Unit = {
        val data_desc = data.describe()
        data_desc.show()
    }
    def main(args: Array[String]): Unit = {
        
    }
}