package de.dfki.cos.basys.aas.knowledgegraph.configuration;

import de.dfki.cos.basys.aas.knowledgegraph.util.GregorianCalendarConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.core.convert.Neo4jConversions;
import org.springframework.core.convert.converter.GenericConverter;
import java.util.*;


@Configuration
class Neo4jConfig {
    @Bean
    public Neo4jConversions neo4jConversions() {
        Set<GenericConverter> additionalConverters = Collections.singleton(new GregorianCalendarConverter());
        return new Neo4jConversions(additionalConverters);
    }
}