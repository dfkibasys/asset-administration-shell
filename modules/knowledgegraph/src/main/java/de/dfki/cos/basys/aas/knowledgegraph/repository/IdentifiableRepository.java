package de.dfki.cos.basys.aas.knowledgegraph.repository;

import java.util.Optional;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import de.dfki.cos.basys.aas.knowledgegraph.model.IdentifiableNode;

public interface IdentifiableRepository extends Neo4jRepository<IdentifiableNode, Long>{

    Optional<IdentifiableNode> findById(String id);
}