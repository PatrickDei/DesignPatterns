# Abstract Factory

## Intent
Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

## Also Known As
Kit

## Applicability
Use the Abstract Factory pattern when
* a system should be independent of how its products are created, composed and represented
* a system should be configured with one of multiple families of products
* a family of related product objects is designed to be used together, and you need to enforce this constraint
* you want to provide a class library of products, and you want to reveal just their interfaces, not their implementations

## Participants
* AbstractFactory (WidgetFactory)
  * declares an interface for operations that create abstract product objects
* ConcreteFactory (MotifWidgetFactory, PMWidgetFactory)
  * implements the operations to create concrete product objects
* AbstractProduct (Window, Scrollbar)
  * declares an interface for a type of product object
* ConcreteProduct (MotifWindow, MotifScrollbar)
  * defines a product object to be created by the corresponding concrete factory
  * implements the AbstractProduct interface
* Client
  * uses only interfaces declared by AbstractFactory and AbstractProduct class

## Related Patterns
AbstractFactory classes are often implemented with factory methods, but they can also be implemented using Prototype  
A concrete factory is often a singleton