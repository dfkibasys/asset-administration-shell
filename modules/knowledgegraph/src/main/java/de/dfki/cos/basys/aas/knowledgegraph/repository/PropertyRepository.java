package de.dfki.cos.basys.aas.knowledgegraph.repository;

import de.dfki.cos.basys.aas.knowledgegraph.model.PropertyNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.List;

public interface PropertyRepository extends Neo4jRepository<PropertyNode, Long> {

	List<PropertyNode> findByIdShort(String idShort);
	List<PropertyNode> findBySemanticId(String semanticId);
	
}
