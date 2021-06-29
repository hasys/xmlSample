# Java sample of new Marshallers

* Using undocumented annotation: **@XmlUnwrappedCollection**
* -[ ] Boolean variable default getter/setter is not mapping correctly  
* -[ ] Namespaces for bpmn2 elements. For other packages it is possible to use only package-info.java configs  
* -[ ] Root node has addition non removable `xmlns="http://www.omg.org/bpmn20"`
* -[ ] CDATA MetaValue doesn't have namespace
* -[ ] Add process elements order 
* package-info tips:
  * Basic **XmlSchema** contains
    * **namespace**
    * **elementFormDefault**
  * **xmlns** is for inner namespaces
  * **location** is for the root element