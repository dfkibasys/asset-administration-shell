package de.dfki.cos.basys.aas.knowledgegraph.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.event.IEvent;
import org.springframework.data.neo4j.core.schema.Node;

@Node("Event")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class EventNode extends SubmodelElementNode {

    public EventNode(IEvent event) {
        super(event);
    }
}
