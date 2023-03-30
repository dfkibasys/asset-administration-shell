package de.dfki.cos.basys.aas.knowledgegraph.repository;

import de.dfki.cos.basys.aas.knowledgegraph.model.IdentifiableNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Optional;

public interface IdentifiableRepository extends Neo4jRepository<IdentifiableNode, Long>{

    Optional<IdentifiableNode> findById(String id);
}