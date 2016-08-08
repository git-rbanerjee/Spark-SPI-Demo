#A Spark App With Extensible Business Logic Using Java SPI

An extensible application is one that you can extend without modifying its original code base. You can enhance its functionality with new plug-ins or modules. Developers, software vendors, and customers can add new functionality or application programming interfaces (APIs) by adding a new Java Archive (JAR) file onto the application class path or into an application-specific extension directory.

This Demo shows how to use this features with Spark.

#Service
A set of programming interfaces and classes that provide access to some specific application functionality or feature. The service can define the interfaces for the functionality and a way to retrieve an implementation. In the word-processor example, a dictionary service can define a way to retrieve a dictionary and the definition of a word, but it does not implement the underlying feature set. Instead, it relies on a service provider to implement that functionality.
#Service provider interface (SPI)
The set of public interfaces and abstract classes that a service defines. The SPI defines the classes and methods available to your application.
#Service Provider
Implements the SPI. An application with extensible services enable you, vendors, and customers to add service providers without modifying the original application.
