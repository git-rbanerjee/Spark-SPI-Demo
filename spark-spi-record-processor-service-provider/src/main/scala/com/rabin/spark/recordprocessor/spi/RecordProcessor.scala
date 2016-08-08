package com.rabin.spark.recordprocessor.spi

trait RecordProcessor extends Serializable {
  
  def processRecord(record:String):String 
  def getType():String
  
}