package de.dfki.cos.basys.aas.registry.rest.api.dto;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.basyx.submodel.metamodel.api.reference.IKey;
import org.eclipse.basyx.submodel.metamodel.api.reference.IReference;

public class Reference implements IReference {

	List<IKey> keys = new ArrayList<>();

	public Reference() {
	}

	public Reference(IReference semanticId) {
		for (IKey key : semanticId.getKeys()) {
			keys.add(new Key(key));
		}
	}

	@Override
	public List<IKey> getKeys() {
		return keys;
	}

}
