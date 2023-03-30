package de.dfki.cos.basys.aas.knowledgegraph.repository;

import de.dfki.cos.basys.aas.knowledgegraph.model.SubmodelNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface SubmodelRepository extends Neo4jRepository<SubmodelNode, Long> {

	Optional<SubmodelNode> findById(String id);
	List<SubmodelNode> findByIdShort(String idShort);
	List<SubmodelNode> findBySemanticId(String semanticId);

	@Query("MATCH (sm:Submodel {id:$smId})-[*]->(n) DETACH DELETE sm, n")
	void deleteByIdCascading(@Param("smId") String id);
}
