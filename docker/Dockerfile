FROM anapsix/alpine-java
MAINTAINER JJ Merelo <jjmerelo@GMail.com>
WORKDIR /root
CMD java -jar bobot.jar BoBoBot

RUN apk update && apk upgrade
COPY target/scala-2.11/bobot-assembly-0.0.1.jar /root/bobot.jar
COPY hitos.json /root/
