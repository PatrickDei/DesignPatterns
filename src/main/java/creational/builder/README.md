# Builder

## Intent
Separate the construction of a complex pbject from its representation so that the same construction process can create different representations

## Applicability
Use the Builder pattern when:
* the algorithm for creating a complex object should be independent of the parts that make up the object and how they're assembled
* the construction process must allow different representations for the object that's constructed

## Participants
* Builder (TextConverter)
  * specifies an abstract interface for creating parts of a Product object
* ConcreteBuilder (ASCIIConverter, TeXConverter, TextWidgetConverter)
  * constructs and assembles parts of the product by implementing the Builder interface
  * defines and keeps track of the representation it creates
  * provides an interface for retrieving the product (e.g., GetASCIIText, GetTextWidget)
* Director (RTFReader)
  * constructs an object using the Builder interface
* Product (ASCIIText, TeXText, TextWidget)
  * represents the complex object under construction. ConcreteBuilder builds the product's internal representation and defines the process by which it's assembled
  * includes classes that define the constituent parts, including interfaces for assembling the parts into the final result

## Related Patterns
Abstract Factory is similar to Builder in that it too may construct complex objects. The primary difference is that the Builder pattern focuses on constructing a complex object step by step. Abstract Factory's emphasis is on families of product objects (either simple or complex). Builder returns the product as a final step, but as far as the Abstract Factory pattern is concerned, the product gets returned immediately.  
A Composite is what the builder often returns.