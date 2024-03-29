package de.dfki.cos.basys.aas.knowledgegraph.repository;

import de.dfki.cos.basys.aas.knowledgegraph.model.AssetAdministrationShellNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface AssetAdministrationShellRepository extends Neo4jRepository<AssetAdministrationShellNode, Long> {

	Optional<AssetAdministrationShellNode> findById(String id);
	List<AssetAdministrationShellNode> findByIdShort(String idShort);

	//@Query("MATCH path=(aas:AssetAdministrationShell {id:{aasId}})-[*]->(n) 
		// WHERE NOT ((:RelationShipNode)->(n) AND NOT (:ReferenceNode)->(n))
		// DETACH DELETE aas, n")
	@Query("MATCH (aas:AssetAdministrationShell {id:$aasId})-[*]->(n) DETACH DELETE aas, n")
	void deleteByIdCascading(@Param("aasId") String id);

	//@Query("MATCH (n) DETACH DELETE n")
	@Query("MATCH (aas:AssetAdministrationShell)-[*]->(n) DETACH DELETE aas, n")
	void deleteAllCascading();

	//@Query("MATCH (parent:AssetAdministrationShellNode {id:{aasId}})-[]->(child: ReferableNode {idShort: {childIdShort}}) RETURN child")
	//Optional<ReferableNode> getChildWithIdShort(@Param("aasId") String id, @Param("childIdShort") String idShort);

}
