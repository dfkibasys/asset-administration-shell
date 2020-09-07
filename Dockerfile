# Step : Package (skip tests)
FROM maven:3.5.3-jdk-8-alpine as builder
COPY . /build
WORKDIR /build
RUN mvn -s settings_basys.xml clean package -DskipTests

# Step : Build image
FROM openjdk:8-jre-alpine
LABEL maintainer="basys-support@dfki.de"
EXPOSE 8080
COPY --from=builder /build/modules/de.dfki.cos.basys.aas.registry.zookeeper/target/*jar-with-dependencies.jar /app/aas-registry.jar
WORKDIR /app
ENTRYPOINT ["java","-jar","./aas-registry.jar"]