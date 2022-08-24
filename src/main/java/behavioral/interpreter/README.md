# Interpreter

## Intent
Given a language, define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.

## Applicability
Use the Interpreter pattern when there is a language to interpret, and you can represent statements in the language as abstract syntax trees. The Interpreter pattern works best when
* the grammar is simple. For complex grammars, the class hierarchy for the grammar becomes large and unmanageable. Tools such as parse generators are a better alternative in such classes. They can interpret expressions without building abstract syntax trees, which can save space and possibly time
* efficiency is not a critical concern. The most efficient interpreters are usually *not* implemented by interpreting parse trees directly but by first translating them into another form. For example, regular expressions are often transformed into state machines. But even then, the *translator* can be implemented by the Interpreter pattern, so the pattern is still applicable

## Participants
* AbstractExpression (RegularExpression)
  * declares an abstract Interpret operation that is common to all nodes in the abstract syntax tree
* TerminalExpression (LiteralExpression)
  * implements an Interpret operation associated with terminal symbols in the grammar
  * an instance is required for every terminal symbol in an instance
* NonTerminalExpression (AlternationExpression, RepetitionExpression, SequenceExpression)
  * one such class is required for every rule R ::= R<sub>1</sub> R<sub>2</sub> ... R<sub>n</sub> in the grammar
  * maintains instance variables of type AbstractExpression for each of the symbols R<sub>1</sub> through R<sub>n</sub>
  * implements an Interpret operation for non terminal symbols in the grammar. Interpret typically calls itself recursively on the variables representing R<sub>1</sub> through R<sub>n</sub>
* Context
  * contains information that's global to the interpreter
* Client
  * builds (or is given) an abstract syntax tree representing a particular sentence in the language that the grammar defines. The abstract syntax tree is assembled from instances of the NonTerminalExpression and TerminalExpression classes
  * invokes the Interpret operation

## Related Patterns
Composite: The abstract syntax tree is an instance of the Composite pattern.  
Flyweight shows how to share terminal symbols within the abstract syntax tree.  
Iterator: The interpreter can use an Iterator to traverse the structure.  
Visitor can be used to maintain the behavior in each node in the abstract syntax tree in one class.