# Proxy

## Intent
Provide a surrogate or placeholder for another object to control access to it

## Also Known As
Surrogate

## Applicability
Proxy is applicable whenever there is a need for a more versatile or sophisticated reference to an object than a simple pointer. Here are several common situations in which the Proxy pattern is applicable:
* A **remote proxy** provides a local representative for an object in a different address space
* A **virtual proxy** creates expensive objects on demand
* A **protection proxy** controls access to the original object. Protection proxies are useful when objects should have different access rights
* A **smart reference** is a replacement for a bare pointer that performs additional actions when an object is accessed. Typical uses include
  * counting the number of references to the real object so that it can be freed automatically when there are no more references (also called **smart pointers**)
  * loading a persistent object into memory when it's first referenced
  * checking that the real object is locked before it's accessed to ensure that no other object can change it

## Participants
* Proxy (ImageProxy)
  * maintains a reference that lets the proxy access the real subject. Proxy may refer to a Subject if the RealSubject and Subject interfaces are the same
  * provides an interface identical to Subjects so that a proxy can be substituted for the real subject
  * controls access to the real subject and may be responsible for creating and deleting it
  * other responsibilities depend on the kind of proxy:
    * *remote proxies* are responsible for encoding a request and its arguments and for sending the encoded request to the real subject in a different address space
    * *virtual proxies* may cache additional information about the real subject so that they can postpone accessing it. For example, the ImageProxy caches the image's extent (bounding box)
    * *protection proxies* check that the caller has the access permissions required to perform a request
* Subject (Graphic)
  * defines the common interface for RealSubject and Proxy so that a Proxy can be used anywhere a RealSubject is expected
* RealSubject (Image)
  * defines the real object that the proxy represents

## Related Patterns
Adapter: An adapter provides a different interface to the object it adapts. In contrast, a proxy provides the same interface as its subject. However, a proxy used for access protection might refuse to perform an operation that the subject will perform, so its interface may be effectively a subset of the subjects.  
Decorator: Although decorators can have similar implementations as proxies, decorators have a different purpose. A decorator adds one or more responsibilities to an object, whereas a proxy controls access to an object.  
Proxies vary in the degree to which they are implemented exactly like a decorator. On the other hand, a remote proxy will not contain a direct reference to its real subject but only an indirect reference, such as "host ID and local address on host". A virtual proxy will start off with an indirect reference such as a filename but will eventually obtain and use a direct reference.