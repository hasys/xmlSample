# Next Gen BPMN Marshallers

> Depends on [mapper-xml](https://github.com/treblereel/mapper-xml) install it locally before work with these samples.

Example to generated minimal executable BPMN and test possibility to import from different editors.

## To test generation of executable process
Execute:
```bash
./test.sh
```
After Quarkus start up:
* Open URL: http://localhost:8080/q/swagger-ui/ and execute simplestRunnable process with POST.
* Or execute in separate console:
```bash
curl -X POST "http://localhost:8080/simpliestRunnable" -H  "accept: */*" -H  "Content-Type: application/json" -d "{}"
```
* You will see the `Hello World` in the console

## To see how new marshaller can handle different editors/namespaces
To see how new parser works with Trisotech, BPMN.io and Kogito BPMN Designer:
* Open directory: `next-gen-marshallers-basic-example/target/bpmn-test/generated`

There you can find:
* File `generated.bpmn` is generated with new marshallers from java objects
* File `kogitoOriginal.bpmn` is generated in Kogito BPMN Editor
* File `kogitoRemarshalled.bpmn` is unmarshalled `kogitoOriginal.bpmn` and marshalled back to bpmn
* File `bpmnioOriginal.bpmn` is generated in BPMN.io Online Editor
* File `bpmnioRemarshalled.bpmn` is unmarshalled `bpmnioOriginal.bpmn` and marshalled back to bpmn
* File `trisotechOriginal.bpmn` is generated in Trisotech BPMN Editor
* File `trisotechRemarshalled.bpmn` is unmarshalled `trisotechOriginal.bpmn` and marshalled back to bpmn

