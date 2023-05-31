package de.dfki.cos.basys.aas.knowledgegraph.repository;

import de.dfki.cos.basys.aas.knowledgegraph.model.ReferenceNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import java.util.List;

public interface ReferenceRepository extends Neo4jRepository<ReferenceNode, Long> {
    @Query("MATCH \n" +
            "    (r:Reference)\n" +
            "OPTIONAL MATCH\n" +
            "    (r)-[ref:refersTo]->(e)\n" +
            "WITH\n" +
            "    *\n" +
            "WHERE\n" +
            "    ref is null\n" +
            "return r")
    List<ReferenceNode> findUnresolvedReferences();
}
