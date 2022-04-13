# Asset Administration Shell #

This repository contains AAS-related models, software modules and docker images. In particular:
 - an [extended AAS event model](/modules/event) with an [implementation for MQTT](/modules/event-mqtt)
 - a [micro-service for creating and maintaining a knowledge graph of AAS contents](/modules/knowledgegraph) based on AAS Registry updates. As knowledge graph back-end, we use [Neo4J](https://neo4j.com/) in our [(AAS) docker-compose stack](https://github.com/BaSys-PC1/docker/aas). The implementation is in an early alpha stage. Thus, the service itself is not yet included in the docker-compose stack.
 - an [enhanced AAS Server](/modules/server) based on the [Eclipse BaSyx Java Components](https://github.com/eclipse-basyx/basyx-java-components) featuring
   - integration with the [AAS Registry (DotAAS)](https://github.com/BaSys-PC1/aas-registry) according to the "Details of the Asset Administration Shell, Part 2" spec
   - integration in the [(AAS) docker-compose stack](https://github.com/BaSys-PC1/docker/aas)
   - Base64URL-encoded AAS/submodel identifiers
   - rich configuration options
   - loading of multiple aasx/json/xml files on start-up
   - hot deployment of aasx/json/xml files while running
