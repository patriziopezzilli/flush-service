package com.flush.flushservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.flush.flushservice.persistence.repository")
public class AppConfig {
}
