FROM openjdk:9-jdk

ARG MAVEN_VERSION=3.6.3
ARG USER_HOME_DIR="/root"
ARG SHA=c35a1803a6e70a126e80b2b3ae33eed961f83ed74d18fcd16909b2d44d7dada3203f1ffe726c17ef8dcca2dcaa9fca676987befeadc9b9f759967a8cb77181c0
ARG BASE_URL=https://archive.apache.org/dist/maven/maven-3/${MAVEN_VERSION}/binaries

RUN mkdir -p /usr/local/maven /usr/local/maven/ref \
&& curl -fsSL -o /tmp/apache-maven.tar.gz ${BASE_URL}/apache-maven-${MAVEN_VERSION}-bin.tar.gz \
&& echo "${SHA}  /tmp/apache-maven.tar.gz" | sha512sum -c - \
&& tar -xzf /tmp/apache-maven.tar.gz -C /usr/local/maven --strip-components=1 \
&& rm -f /tmp/apache-maven.tar.gz \
&& ln -s /usr/local/maven/bin/mvn /usr/bin/mvn

ENV MAVEN_HOME /usr/local/maven
ENV MAVEN_CONFIG "$USER_HOME_DIR/.m2"

COPY bin/entrypoint.sh /usr/local/bin/entrypoint.sh
RUN chmod +x /usr/local/bin/entrypoint.sh

WORKDIR /var/www/java-beginners-guide

ENTRYPOINT ["entrypoint.sh"]

CMD ["mvn", "-version"]