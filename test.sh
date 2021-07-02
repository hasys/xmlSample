BPMN_PATH="next-gen-marshallers-basic-example/target/bpmn-test"
mvn clean install
mkdir $BPMN_PATH
mkdir $BPMN_PATH/generated
mvn -f ./next-gen-marshallers-basic-example exec:java -Dexec.mainClass="com.github.hasys.xml.example.Interchange"
cd $BPMN_PATH
mvn archetype:generate \
    -DarchetypeGroupId=org.kie.kogito \
    -DarchetypeArtifactId=kogito-quarkus-archetype \
    -DgroupId=com.github.hasys -DartifactId=generated-process-example \
    -DarchetypeVersion=1.4.0.Final \
    -Dversion=1.0-SNAPSHOT \
    -B
cd ../../../
mvn -f ./next-gen-marshallers-basic-example exec:java -Dexec.mainClass="com.github.hasys.xml.example.Executable"
cd $BPMN_PATH/generated-process-example
mvn clean package quarkus:dev -DskipTests
