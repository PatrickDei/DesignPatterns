# Strategy

## Intent
Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

## Also Known As
Policy

## Applicability
Use the Strategy pattern when
* many related classes differ only in their behavior. Strategies provide a way to configure a class with one of many behaviors
* you need different variants of an algorithm. For example, you might define algorithms reflecting different space/time trade-offs. Strategies can be used when these variants are implemented as a class hierarchy of algorithms
* an algorithm uses data that clients shouldn't know about. Use the Strategy pattern to avoid exposing complex, algorithm-specific data structures
* a class defines many behaviors, and these appear as multiple conditional statements in its operations. Instead of many conditionals, move related conditional branches into their own Strategy class

## Participants
* Strategy (Compositor)
  * declares an interface common to all supported algorithms. Context uses this interface to call the algorithm defined by a ConcreteStrategy
* ConcreteStrategy (SimpleCompositor, TeXCompositor, ArrayCompositor)
  * implements the algorithm using the Strategy interface
* Context (Composition)
  * is configured with a ConcreteStrategy object
  * maintains a reference to a Strategy object
  * may define an interface that lets Strategy access its data

## Related Patterns
Flyweight: Strategy objects often make good flyweights.