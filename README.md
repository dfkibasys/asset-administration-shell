# Asset Administration Shell #

This repository contains AAS-related models, software modules and docker images. In particular:
 - an EMF-based AAS model and tree-style Eclipse editor according to [Details of the Asset Administration Shell Part 1, Version 2](https://www.plattform-i40.de/PI40/Redaktion/DE/Downloads/Publikation/Details-of-the-Asset-Administration-Shell-Part1.html)
 - an [Apache Zookeeper](https://zookeeper.apache.org/)-backed [AAS Registry](https://wiki.eclipse.org/BaSyx_/_Documentation_/_API_/_Registry) based on the [BaSyx Java-SDK](https://wiki.eclipse.org/BaSyx_/_Download)
 - an AAS services bundle as Java application consisting of 
   - the Zookeeper-backed AAS Registry, 
   - an [AAS Aggregator service](https://wiki.eclipse.org/BaSyx_/_Documentation_/_API_/_AssetAdministrationShell) for remote hosting of asset administration shells and submodels via HTTP/REST
   - a local and dynamic hosting service for AAS and submodels based on DFKI's lightweight [component model](https://github.com/BaSys-PC1/common)
  
## Usage ##

The AAS services can be used via [Docker](https://hub.docker.com/r/dfkibasys/aas-services) and are already included in DFKI's back-end [runtime Docker stack](https://github.com/BaSys-PC1/docker).