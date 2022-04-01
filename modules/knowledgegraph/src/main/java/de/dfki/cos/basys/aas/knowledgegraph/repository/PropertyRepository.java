package de.dfki.cos.basys.aas.knowledgegraph.repository;

import java.util.List;

import de.dfki.cos.basys.aas.knowledgegraph.model.PropertyNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface PropertyRepository extends Neo4jRepository<PropertyNode, Long> {

	List<PropertyNode> findByIdShort(String idShort);
	List<PropertyNode> findBySemanticId(String semanticId);
	
}
