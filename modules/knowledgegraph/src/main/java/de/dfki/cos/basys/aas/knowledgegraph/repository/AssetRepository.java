package de.dfki.cos.basys.aas.knowledgegraph.repository;

import de.dfki.cos.basys.aas.knowledgegraph.model.AssetNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.List;
import java.util.Optional;

public interface AssetRepository extends Neo4jRepository<AssetNode, Long> {

	Optional<AssetNode> findById(String id);
	List<AssetNode> findByIdShort(String idShort);

}
