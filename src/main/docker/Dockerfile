FROM ubuntu

MAINTAINER GL
VOLUME /tmp
ADD game-engine*.war game-engine.war
ADD docker-entrypoint.sh .
RUN chmod 755 docker-entrypoint.sh && touch game-engine.war
ENV NR_APP_NAME sgame-engine-dev
EXPOSE 8080
ENTRYPOINT ["./docker-entrypoint.sh"]
