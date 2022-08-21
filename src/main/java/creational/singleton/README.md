# Singleton

## Intent
Ensure a class only has one isntance, and provide a global point of access to it.

## Applicability
Use a Singleton pattern when
* there must be exactly one instance of a class, and it must be accessible to clients from a well-known access point
* when the sole instance should be extensible by subclassing, and clients should be able to use an extended instance without modifying their code

## Participants
* Singleton
  * defines an Instance operation that lets clients access its unique instance. Instance is a class operation (that is, a static member function in C++, Java...)
  * may be responsible for creating its own unique instance

## Implementation
Sometimes the singleton class could be extended so solutions must occur to know which subclass to instantiate.  
A more flexible approach uses a registry of singletons. Instead of having
Instance define the set of possible Singleton classes, the Singleton classes
can register their singleton instance by name in a well-known registry.  
The registry maps between string names and singletons. When Instance needs
a singleton, it consults the registry, asking for the singleton by name.
The registry looks up the corresponding singleton (if it exists) and returns
it. This approach frees Instance from knowing all possible Singleton classes
or instances. All it requires is a common interface for all Singleton classes
that includes operations for the registry.

## Related Patterns
Many patterns can be implemented using the Singleton pattern. See Abstract Factory, Builder, and Prototype.