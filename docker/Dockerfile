FROM frolvlad/alpine-scala
MAINTAINER JJ Merelo <jjmerelo@GMail.com>
WORKDIR /root
CMD ["/usr/local/bin/sbt"]

RUN apk update && apk upgrade
RUN apk add git
RUN apk add curl
RUN curl -sL "http://dl.bintray.com/sbt/native-packages/sbt/0.13.13/sbt-0.13.13.tgz" -o /usr/local/sbt.tgz
RUN cd /usr/local && tar xvfz sbt.tgz
RUN mv /usr/local/sbt-launcher-packaging-0.13.13/bin/sbt-launch.jar /usr/local/bin
COPY docker/sbt /usr/local/bin
RUN chmod 0755 /usr/local/bin/sbt
RUN /usr/local/bin/sbt
    
