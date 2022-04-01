package de.dfki.cos.basys.aas.knowledgegraph.repository;

import java.util.List;

import de.dfki.cos.basys.aas.knowledgegraph.model.SubmodelNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.query.Param;

public interface SubmodelRepository extends Neo4jRepository<SubmodelNode, String> {

	List<SubmodelNode> findByIdShort(String idShort);
	List<SubmodelNode> findBySemanticId(String semanticId);

	@Query("MATCH (sm:Submodel {id:{smId}})-[*]->(n) DETACH DELETE sm, n")
	void deleteByIdCascading(@Param("smId") String id);
}
