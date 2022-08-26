# Visitor

## Intent
Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.

## Applicability
Use the Visitor pattern when
* an object structure contains many classes of objects with differing interfaces, and you want to perform operations on these objects that depend on their concrete classes
* many distinct and unrelated operations need to be performed on objects in an object structure, and you want to avoid "polluting" their classes with these operations. Visitor lets you keep related operations together by defining them in one class. When the object structure is shared by many applications, use Visitor to put operations in just those applications that need them
* the classes defining the object structure rarely change, but you often want to define new operations over the structure. Changing the objects structure classes requires redefining the interface to all visitors, which is potentially costly. If the object structure classes change often, then it's probably better to define the operations in those classes

## Participants
* Visitor (NodeVisitor)
  * declares a Visit operation for each class of ConcreteElement in the object structure. THe operation's name and signature identifies the class that sends the Visit request to the visitor. THat lets the visitor determine the concrete class of the element being visited. Then the visitor can access the element directly through its particular interface
* ConcreteVisitor (TypeCheckingVisitor)
  * implements each operation declared by Visitor. Each operation implements a fragment of the algorithm defined for the corresponding class of object in the structure. ConcreteVisitor provides the contexxt for the algorithm and stores its local state. This state often accumulates results during the traversal of the structure
* Element (Node)
  * defines an Accept operation that takes a visitor as an argument
* ConcreteElement (AssignmentNode, VariableRefNode)
  * implements an Accept operation that takes a visitor as an argument
* ObjectStructure (Program)
  * can enumerate its elements
  * may provide a high-level interface to allow the visitor to visit its elements
  * may either be a composite or a collection such as a list or a set

## Related Patterns
Composite: Visitors can be used to apply an operation over an object structure defined by the Composite pattern.  
Interpreter: Visitor may be applied to do the interpretation.