package de.dfki.cos.basys.aas.knowledgegraph.repository;

import de.dfki.cos.basys.aas.knowledgegraph.model.BlobNode;
import de.dfki.cos.basys.aas.knowledgegraph.model.OperationNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface BlobRepository extends Neo4jRepository<BlobNode, Long> {

}
