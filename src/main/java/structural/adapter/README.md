# Adapter

## Intent
Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.

## Also Known As
Wrapper

## Applicability
Use the Adapter pattern when
* you want to use an existing class, and its interface does not match the one you need
* you want to create a reusable class that cooperates with unrelated or unforeseen classes, that is, classes that don't necessarily have compatible interfaces
* (object adapter only) you need to use several existing subclasses, but it's impractical to adapt their interface by subclassing every one. An object adapter can adapt the interface of its parent class

## Participants
* Target (Shape)
  * defines the domain-specific interface that Client uses
* Client (DrawingEditor)
  * collaborates with objects conforming to the Target interface
* Adaptee (TextView)
  * defines an existing interface that needs adapting
* Adapter (TextShape)
  * adapts the interface of Adaptee to the Target interface

## Related patterns
Bridge has a structure similar to an object adapter, but Bridge has a different intent: It is meant to separate an interface from its implementation so that they can be varied easily and independently. An adapter is meant to change the interface of an *existing* object.  
Decorator enhances another object without changing its interface. A decorator is thus more transparent to the application than an adapter is. As a consequence, Decorator supports recursive composition, which isn't possible with pure adapters.  
Proxy defines a representative or surrogate for another object and does not change its interface.