package de.dfki.cos.basys.aas.knowledgegraph.repository;

import de.dfki.cos.basys.aas.knowledgegraph.model.EventNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface EventRepository extends Neo4jRepository<EventNode, Long> {

}
