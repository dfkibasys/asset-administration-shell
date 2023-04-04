package de.dfki.cos.basys.aas.knowledgegraph.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElement;
import org.springframework.data.neo4j.core.schema.DynamicLabels;
import org.springframework.data.neo4j.core.schema.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@Node("SubmodelElement")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class SubmodelElementNode extends ReferableNode {

	@DynamicLabels
	private List<String> dynamicLabels = new ArrayList<>();

	private String semanticId;

	public SubmodelElementNode(ISubmodelElement submodelElement) {
		super(submodelElement);
		if (submodelElement.getSemanticId() != null && submodelElement.getSemanticId().getKeys().size() > 0) {
			this.semanticId = submodelElement.getSemanticId().getKeys().get(0).getValue();
			this.getDynamicLabels().add(getLabel(getSemanticId()));
		} else {
			this.semanticId = "null";
		}
	}

	private String getLabel(String semanticId) {
		String patternString =  "(?<protocol>wss?):\\/\\/(?<host>.*):(?<port>\\d*)";
		Pattern pattern = Pattern.compile(".*idta\\/(?<label>.*)\\/\\d\\/\\d");
		Matcher matcher = pattern.matcher(semanticId);

		boolean matches = matcher.matches();
		if (matches) {
			String g = matcher.group("label");
			return g.replaceAll("/", "_");
		} else {
			return "UNKNOWN";
		}
	}
}
