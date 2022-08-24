# Mediator

## Intent
Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.

## Applicability
Use the Mediator pattern when
* a set of objects communicate in well-defined but complex ways. The resulting dependencies are unstructured and difficult to understand
* reusing an object is difficult because it refers to and communicates with many other objects
* a behavior that's distributed between several classes should be customizable without a lot of subclassing

## Participants
* Mediator (DialogDirector)
  * defines an interface for communicating with Colleague objects
* ConcreteMediator (FontDialogDirector)
  * implements cooperative behavior by coordinating Colleague objects
  * knows and maintains its colleagues
* Colleague classes (ListBox, EntryField)
  * each Colleague class knows its mediator object
  * each colleague communicates with its mediator whenever it would have otherwise communicated with another colleague

## Related Patterns
Facade differs from Mediator in that it abstracts a subsystem of objects to provide a more convenient interface. Its protocol is unidirectional; that is, Facade objects make requests of the subsystem classes but not vice versa. In contrast, Mediator enables cooperative behavior that colleague objects don't or can't provide, and the protocol is multi directional.  
Colleagues can communicate with the mediator using the Observer pattern.