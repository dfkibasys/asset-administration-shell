package de.dfki.cos.basys.aas.knowledgegraph;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableNeo4jRepositories
@EnableTransactionManagement
@ComponentScan
@SpringBootApplication
public class KnowledgeGraphApplication {

	public static void main(String[] args) {
		SpringApplication.run(KnowledgeGraphApplication.class);
	}

}
