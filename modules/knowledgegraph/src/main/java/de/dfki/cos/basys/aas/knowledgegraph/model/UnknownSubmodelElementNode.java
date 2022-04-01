package de.dfki.cos.basys.aas.knowledgegraph.model;

import org.springframework.data.neo4j.core.schema.Node;


@Node("UnknownSubmodelElement")
public class UnknownSubmodelElementNode extends SubmodelElementNode {

	public UnknownSubmodelElementNode(String idShort, String semanticId) {
		super(idShort, semanticId);
	}
}
