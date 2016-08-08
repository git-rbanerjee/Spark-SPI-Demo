#A Spark App With Extensible Business Logic Using Service Provider Interfaces

An extensible application is one that you can extend without modifying its original code base. You can enhance its functionality with new plug-ins or modules. Developers, software vendors, and customers can add new functionality or application programming interfaces (APIs) by adding a new Java Archive (JAR) file onto the application class path or into an application-specific extension directory.

This Demo shows how to use this feature with Spark.

#spark-spi-demo 
The Spark Base code which is going to use business logics as a Service

#spark-spi-record-processor-service-provider
Is a Service provider interface (SPI).The set of public interfaces and abstract classes that a service defines. The SPI defines the classes and methods available to your application.

#spark-spi-record-processer-a
Is a Service Provider, Implements the SPI. An application with extensible services enable you, vendors, and customers to add service providers without modifying the original application. There could be many Service Providers for a SPI.

[Read more about SPI](https://docs.oracle.com/javase/tutorial/sound/SPI-intro.html)
