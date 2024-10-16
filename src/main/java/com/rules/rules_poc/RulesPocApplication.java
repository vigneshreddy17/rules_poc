package com.rules.rules_poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.cassandra.CassandraAutoConfiguration;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = CassandraAutoConfiguration.class)
public class RulesPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(RulesPocApplication.class, args);
	}

}
