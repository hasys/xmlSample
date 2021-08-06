# Java sample of new Marshallers

* Using undocumented annotation: **@XmlUnwrappedCollection**
* -[x] Boolean variable default getter/setter is not mapping correctly  
* -[x] Namespaces for bpmn2 elements. For other packages it is possible to use only package-info.java configs
  * Possible solution just don't use root namespace it will also benefit clarity of the process
* -[ ] Root node has addition non removable `xmlns="http://www.omg.org/bpmn20"`
* -[x] CDATA MetaValue doesn't have namespace
* -[ ] Add process elements order 
* package-info tips:
  * Basic **XmlSchema** contains
    * **namespace**
    * **elementFormDefault**
  * **xmlns** is for inner namespaces
  * **location** is for the root element