# echo $0
SOURCE_FILE=$1
TEST_FILE=$2
CLASSPATH="lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar:."
javac -cp $CLASSPATH $SOURCE_FILE.java $TEST_FILE.java
java -cp $CLASSPATH org.junit.runner.JUnitCore $TEST_FILE
