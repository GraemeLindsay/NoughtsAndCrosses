FROM openjdk

MAINTAINER GL
VOLUME /tmp
ADD game-engine*.war game-engine.war
ADD docker-entrypoint.sh .
RUN chmod 755 docker-entrypoint.sh && touch game-engine.war
EXPOSE 8080
ENTRYPOINT ["sh", "./docker-entrypoint.sh"]
