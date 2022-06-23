package com.example.springbootredditclone;

import com.example.springbootredditclone.config.SwaggerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@Import(SwaggerConfiguration.class)
public class SpringBootRedditCloneApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRedditCloneApplication.class, args);
    }

}
