# Factory Method

## Intent
Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.

## Also Known As
Virtual Constructor

## Applicability
Use the Factory Method pattern when
* a class can't anticipate the class of objects it must create
* a class wants its subclasses to specify the objects it creates
* classes delegate responsibility to one of the several helper subclasses, and you want to localize the knowledge of which helper subclass is the delegate

## Participants
* Product (Document)
  * defines the interface of objects the factory method creates
* ConcreteProduct (MyDocument)
  * implements the Product interface
* Creator (Application)
  * declares the factory method, which returns an object of type Product. Creator may also define a default implementation of the factory method that returns a default ConcreteProduct object
  * may call the factory method to create a Product object
* ConcreteCreator (MyApplication)
  * overrides the factory method to return an instance of a ConcreteProduct

## Related Patterns
Abstract Factory is often implemented with factory methods.  
Factory methods are usually called within Template Methods.  
Prototypes don't require subclassing Creator. However they often require an Initialize operation on the Product class. Creator uses Initialize to initialize the object. Factory Method doesn't require such an operation.