# Step : Package (skip tests)
FROM maven:3.5.3-jdk-8-alpine as builder
COPY . /build
WORKDIR /build
RUN mvn -s settings_basys.xml clean package -DskipTests

# Step : Build image
FROM openjdk:8-jre-alpine
LABEL maintainer="basys-support@dfki.de"
EXPOSE 4999 5080 5081
COPY --from=builder /build/modules/de.dfki.cos.basys.aas.services/target/*jar-with-dependencies.jar /app/aas-services.jar
COPY --from=builder /build/modules/de.dfki.cos.basys.aas.services/components /app/components
COPY --from=builder /build/modules/de.dfki.cos.basys.aas.services/config /app/config
WORKDIR /app
#ENV JAVA_OPTS="-Dlog4j.configuration=file:///app/config/log4j.properties"
ENTRYPOINT ["java", "-Dlog4j.configuration=file:///app/config/log4j.properties", "-jar","./aas-services.jar"]
