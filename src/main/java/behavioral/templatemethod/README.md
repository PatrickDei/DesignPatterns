# Template Method

## Intent
Define a skeleton of an algorithm in an operation, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

## Applicability
The Template Method pattern should be used
* to implement the invariant parts of an algorithm once and leave it up to subclasses to implement the behavior that can vary
* when common behavior among subclasses should be factored and localized in a common class to avoid code duplication. This is a good example of "refactoring to generalize". You first identify the differences into new operations. Finally, you replace differing code with a template method that calls one of these new operations
* to control subclasses extensions. You can define a template method that calls "hook" operations at specific points, thereby permitting extensions only at those points

## Participants
* AbstractClass (Application)
  * defines abstract **primitive operations** that concrete subclasses define to implement steps of an algorithm
  * implements a template method defining the skeleton of an algorithm. The template method calls primitive operations as well as operations defined in AbstractClass or those of their objects
* ConcreteClass (MyApplication)
  * implements the primitive operations to carry out subclass-specific steps of the algorithm

## Related Patterns
Factory Methods are often called by template methods. In the Motivation example, the factory method DoCreateDocument is called by the template methodOpenDocument.  
Strategy: Template methods use inheritance to vary part of an algorithm. Strategies use delegation to vary the entire algorithm.