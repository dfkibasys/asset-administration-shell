package de.dfki.cos.basys.aas.knowledgegraph.repository;

import java.util.Optional;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.query.Param;

import de.dfki.cos.basys.aas.knowledgegraph.model.IdentifiableNode;
import de.dfki.cos.basys.aas.knowledgegraph.model.ReferableNode;

public interface ReferableRepository extends Neo4jRepository<ReferableNode, Long>{

    //@Query("MATCH (parent:ReferableNode {idShort:{parentIdShort}})-[]->(child:ReferableNode {idShort: {childIdShort}}) RETURN child")
    //Optional<ReferableNode> getChildByIdShort(@Param("parentIdShort") String parentIdShort, @Param("childIdShort") String childIdShort);

    //@Query("MATCH (parent:Referable {identity:$parentId})-[]->(child:Referable {idShort: $childIdShort}) RETURN child")
    //@Query("MATCH (parent:Referable)-[]->(child:Referable {idShort:$childIdShort}) WHERE id(parent) = $parentId RETURN child")
    @Query("MATCH (child:Referable {idShort:$childIdShort})<-[:hasSubmodelElement]-(parent:Referable) WHERE id(parent) = $parentId RETURN child")
    Optional<ReferableNode> findChildByIdShort(@Param("parentId") Long parentId, @Param("childIdShort") String childIdShort);
    @Query("MATCH (child:Referable {idShort:$childIdShort})<-[:hasSubmodelElement]-(parent:Referable) WHERE id(parent) = $parentId RETURN id(child)")
    Optional<Long> findSubmodelElementId(@Param("parentId") Long parentId, @Param("childIdShort") String childIdShort);
}
