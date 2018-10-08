#!/bin/sh

#java -javaagent:$JAVA_AGENT -Djava.security.egd=file:/dev/./urandom $JAVA_OPTS -jar game-engine.war -debug
java -jar game-engine.war -DlogLevel=DEBUG
