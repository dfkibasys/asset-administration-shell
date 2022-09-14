package de.dfki.cos.basys.aas.knowledgegraph.repository;

import de.dfki.cos.basys.aas.knowledgegraph.model.FileNode;
import de.dfki.cos.basys.aas.knowledgegraph.model.OperationNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface OperationRepository extends Neo4jRepository<OperationNode, Long> {

}
