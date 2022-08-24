# Iterator

## Intent
Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

## Also Known As
Cursor

## Applicability
Use the Iterator pattern
* to access an aggregate object's contents without exposing its internal representation
* to support multiple traversals of aggregate objects
* to provide a uniform interface for traversing different aggregate structures (that is, to support polymorphic iteration)

## Participants
* Iterator
  * defines an interface for accessing and traversing elements
* ConcreteIterator
  * implements the Iterator interface
  * keeps track of the current position in the traversal of the aggregate
* Aggregate
  * defines an interface for creating an Iterator object
* ConcreteAggregate
  * implements the Iterator creation interface to return an instance of the proper ConcreteIterator

## Related Patterns
Composite: Iterators are often applied to recursive structures such as Composites.
Factory Method: Polymorphic iterators rely on factory methods to instantiate the appropriate Iterator subclass.
Memento is often used in conjunction with the Iterator pattern. An iterator can use a memento to capture the state of an iteration. The iterator stores the memento internally.

### Disclaimer*
Code not implemented because it is part of the standard java class library