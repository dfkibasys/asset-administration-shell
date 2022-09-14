package de.dfki.cos.basys.aas.knowledgegraph.repository;

import de.dfki.cos.basys.aas.knowledgegraph.model.ReferenceNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface ReferenceRepository extends Neo4jRepository<ReferenceNode, Long> {

}
