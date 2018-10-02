#!/bin/sh

if [ "$1" = 'run-game-engine' ]; then
    java -javaagent:$JAVA_AGENT -Djava.security.egd=file:/dev/./urandom $JAVA_OPTS -jar game-engine.war
else
    echo "Unsupported command '$1' - supported commands are 'run-game-engine'"
fi