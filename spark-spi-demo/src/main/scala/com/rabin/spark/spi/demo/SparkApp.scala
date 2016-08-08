package com.rabin.spark.spi.demo

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import com.rabin.spark.recordprocessor.RecordProcssorService

object SparkApp {

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf()
      .setMaster("local[*]")
      .setAppName("SPIDemo")
      
    val sc = new SparkContext(conf)   
      
    val p = RecordProcssorService.getRecordProcessor("A")
    val dat = sc.parallelize(Seq("Rabin","Mark","Jeff"))
    val processed = dat.map { x => p.processRecord(x) }
    
    processed foreach println
    
  }

}