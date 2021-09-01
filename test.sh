ERROR_CODE=0
function continueIfOK() {
    if [ $ERROR_CODE -ne 0 ]
    then
        echo Command not executed, due to Error with previous command.
        echo Failed command: $PREVIOUS_COMMAND
        echo Error code: $ERROR_CODE
        exit $ERROR_CODE
    else
        PREVIOUS_COMMAND=$1
        eval $1
        ERROR_CODE=$?
    fi
}

BPMN_PATH="next-gen-marshallers-basic-example/target/bpmn-test"
continueIfOK "mvn clean install"
continueIfOK "mkdir $BPMN_PATH"

mkdir $BPMN_PATH/generated
continueIfOK "mvn -f ./next-gen-marshallers-basic-example exec:java -Dexec.mainClass=\"com.github.hasys.xml.example.Interchange\""
continueIfOK "cd $BPMN_PATH"
mvn archetype:generate \
    -DarchetypeGroupId=org.kie.kogito \
    -DarchetypeArtifactId=kogito-quarkus-archetype \
    -DgroupId=com.github.hasys -DartifactId=generated-process-example \
    -DarchetypeVersion=1.4.0.Final \
    -Dversion=1.0-SNAPSHOT \
    -B

cd ../../../
continueIfOK "mvn -f ./next-gen-marshallers-basic-example exec:java -Dexec.mainClass=\"com.github.hasys.xml.example.Executable\""
continueIfOK "cd $BPMN_PATH/generated-process-example"
mvn clean package quarkus:dev -DskipTests
