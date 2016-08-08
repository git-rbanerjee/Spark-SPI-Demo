package com.rabin.spark.recordprocessor

import com.rabin.spark.recordprocessor.spi.RecordProcessor
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

object RecordProcssorService {
  private val services = ServiceLoader.load(classOf[RecordProcessor])
  
  def reload():Unit = {
    services.reload()
  }
  
  def getRecordProcessor(processor_type:String):RecordProcessor = {
    val it = services.iterator()
    while(it.hasNext())
    {
      val serv = it.next()
      if(serv.getType().equals(processor_type))
        return serv
    }
    return null
    
  }
  
}