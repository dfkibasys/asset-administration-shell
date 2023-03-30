package de.dfki.cos.basys.aas.knowledgegraph.repository;

import de.dfki.cos.basys.aas.knowledgegraph.model.UnknownSubmodelElementNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.List;

public interface UnknownSubmodelElementRepository extends Neo4jRepository<UnknownSubmodelElementNode, Long> {

	List<UnknownSubmodelElementNode> findByIdShort(String idShort);
	List<UnknownSubmodelElementNode> findBySemanticId(String semanticId);
	
}
