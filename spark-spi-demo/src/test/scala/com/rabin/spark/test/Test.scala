package com.rabin.spark.test

import com.rabin.spark.recordprocessor.RecordProcssorService

object Test extends App{
  
  val p = RecordProcssorService.getRecordProcessor("A")
   if( p != null)
     println (p.processRecord("rabin") )
  
}