package com.example.springbootredditclone;

import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;

public abstract class BaseTest {

    @Container
    static MySQLContainer mySQLContainer = (MySQLContainer) new MySQLContainer("mysql:latest")
            .withDatabaseName("spring-reddit-test-db")
            .withUsername("testuser")
            .withPassword("pass")
            .withReuse(true);

    static {
        mySQLContainer.start();
    }
}