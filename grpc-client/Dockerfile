FROM eclipse-temurin:21-jre-alpine
MAINTAINER Wang Chen Chen<932560435@qq.com>
ENV VERSION 1.1
COPY ./target/grpc-client-1.1.jar app.jar
ENV LANG C.UTF-8
ENV JVM_OPTS="-server -XX:+DisableExplicitGC -XX:+HeapDumpOnOutOfMemoryError"
ENTRYPOINT java ${JVM_OPTS} -Dfile.encoding=UTF-8 -Duser.timezone=Asia/Shanghai -Djava.security.egd=file:/dev/./urandom -jar /app.jar
