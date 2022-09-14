package de.dfki.cos.basys.aas.knowledgegraph.repository;

import de.dfki.cos.basys.aas.knowledgegraph.model.AssetAdministrationShellNode;
import de.dfki.cos.basys.aas.knowledgegraph.model.AssetNode;
import de.dfki.cos.basys.aas.knowledgegraph.model.SubmodelNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface AssetRepository extends Neo4jRepository<AssetNode, Long> {

	Optional<AssetNode> findById(String id);
	List<AssetNode> findByIdShort(String idShort);

}
