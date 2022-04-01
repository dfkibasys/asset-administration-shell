package de.dfki.cos.basys.aas.knowledgegraph.repository;

import de.dfki.cos.basys.aas.knowledgegraph.model.SubmodelElementCollectionNode;
import de.dfki.cos.basys.aas.knowledgegraph.model.SubmodelNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.List;

public interface SubmodelElementCollectionRepository extends Neo4jRepository<SubmodelElementCollectionNode, Long> {

    List<SubmodelElementCollectionNode> findByIdShort(String idShort);
    List<SubmodelElementCollectionNode> findBySemanticId(String semanticId);

}

