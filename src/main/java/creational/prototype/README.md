# Prototype

## Intent
Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype

## Applicability
Use the Prototype pattern when a system should be independent of how its products are created, composed, and represented; ***and***  
* when the classes to instantiate are specified at run-time, for example, by dynamic loading; ***or***
* to avoid building a class hierarchy of factories that parallels the class hierarchy of products; ***or***
* when instances of a class can have one of only a few different combinations of state. It may be more convenient to install a corresponding number of prototypes and clone them rather than instantiating the class manually, each time with the appropriate state

## Participants
* Prototype (Graphic)
  * declares an interface for cloning itself
* ConcretePrototype (Staff, WholeNote, HalfNote)
  * implements an operation for cloning itself
* Client (GraphicTool)
  * creates a new object by asking a prototype to clone itself

## Related Patterns
Prototype and Abstract Factory are competing patterns in some ways. They can also be used together, however. An Abstract Factory might store a set of properties from which to clone and return product objects.  
Designs that make heavy use of the Composite and Decorator patterns can benefit from Prototype as well.