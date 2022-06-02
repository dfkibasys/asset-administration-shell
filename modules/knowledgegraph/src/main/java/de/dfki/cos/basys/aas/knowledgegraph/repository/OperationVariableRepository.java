package de.dfki.cos.basys.aas.knowledgegraph.repository;

import de.dfki.cos.basys.aas.knowledgegraph.model.OperationVariableNode;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface OperationVariableRepository extends Neo4jRepository<OperationVariableNode, Long> {

}
