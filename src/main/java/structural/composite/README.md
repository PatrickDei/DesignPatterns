# Composite

## Intent
Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.

## Applicability
Use the Composite pattern when
* you want to represent part-whole hierarchies of objects
* you want clients to be able to ignore the difference between compositions of objects and individual objects. Clients will treat all objects in the composite structure uniformly

## Participants
* Component (Graphic)
  * declares the interface for objects in the composition
  * implements default behavior for the interface common to all classes, as appropriate
  * declares an interface for accessing and managing its child components
  * (optional) defines an interface for accessing a component's parent in the recursive structure, and implements it if that's appropriate
* Leaf (Rectangle, Line, Text, etc.)
  * represents leaf objects in the composition. A leaf has no children
  * defines behavior for primitive objects in the composition
* Composite (Picture)
  * defines behaviour for components having children
  * stores child components
  * implements child-related operations in the Component interface
* Client
  * manipulates objects in the composition through the Component interface

## Related Patterns
Often the component-parent link is used for a Chain of Responsibility.  
Decorator is often used with Composite. When decorators and composites are used together, they will usually have a common parent class. So decorators will have to support the Component interface with operations like Add, Remove, and GetChild.  
Flyweight lets you share components, but they can no longer refer to their parents.  
Iterator can be used to traverse composites.  
Visitor localizes operations and behavior that would otherwise be distributed across Composite and Leaf classes.