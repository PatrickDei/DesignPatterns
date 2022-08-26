# GoF Design Patterns for OOP

## [Abstract Factory](src/main/java/creational/abstractfactory)
Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

## [Adapter](src/main/java/structural/adapter)
Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.

## [Bridge](src/main/java/structural/bridge)
Decouple an abstraction from its implementation so that the two can vary independently.

## [Builder](src/main/java/creational/builder)
Separate the construction of a complex object from its representation so that the same construction process can create different representations.

## [Chain of Responsibility](src/main/java/behavioral/chainofresponsibility)
Avoid coupling the sender of a request to its receiver by giving more that one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it.

## [Command](src/main/java/behavioral/command)
Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.

## [Composite](src/main/java/structural/composite)
Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.

## [Decorator](src/main/java/structural/decorator)
Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

## [Facade](src/main/java/structural/facade)
Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.

## [Factory Method](src/main/java/creational/factorymethod)
Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.

## [Flyweight](src/main/java/structural/flyweight)
Use sharing to support large numbers of fine-grained objects efficiently.

## [Interpreter](src/main/java/behavioral/interpreter)
Given a language, define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.

## [Iterator](src/main/java/behavioral/iterator)
Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

## [Mediator](src/main/java/behavioral/mediator)
Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.

## [Memento](src/main/java/behavioral/memento)
Without violating encapsulation, capture and externalize an object's internal state s that the object can be restored to this state later.

## [Observer](src/main/java/behavioral/observer)
Define a one-to-many dependency between objects so that when one objects changes state, all its dependents are notified and updated automatically.

## [Prototype](src/main/java/creational/prototype)
Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.

## [Proxy](src/main/java/structural/proxy)
Provide a surrogate or placeholder for another object to control access to it.

## [Singleton](src/main/java/creational/singleton)
Ensure a class has onl one instance, and provide a global point of access to it.

## [State](src/main/java/behavioral/state)
Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.

## [Strategy](src/main/java/behavioral/strategy)
Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

## [Template Method](src/main/java/behavioral/templatemethod)
Define a skeleton of an algorithm in an operation, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

## [Visitor](src/main/java/behavioral/visitor)
Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.