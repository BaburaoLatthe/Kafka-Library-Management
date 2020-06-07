package com.kafka.librarymanagement.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.kafka.config.TopicBuilder;


/**
 * @author admannasaheb-ext
 * 
 * Creating Topic programmatically
 * 
 * NOTE *** But don't use this in production ***
 */
@Configuration
@Profile(value = { "local" })
public class AutoCreateConfig {

	@Bean
	public NewTopic libraryEvents() {
	return TopicBuilder.name("library-events")				   // Topic Name
											.partitions(3)    // No of partitions in topic
											.replicas(3)     // No of replications in a topic
											.build();
	}
	
}
