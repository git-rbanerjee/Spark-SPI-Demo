package com.rabin.spark.recordprocessor.typea

import com.rabin.spark.recordprocessor.spi.RecordProcessor

class RecordProcessorTypeA extends RecordProcessor  {
  
  override def processRecord(record:String):String = {
    
    return "Hey " + record + " !" 
    
  }
  
  override def getType():String = {
    return "A";
    
  }
  
  
}