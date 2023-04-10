package com.example.workspacermk;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class WorkspaceRmkApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkspaceRmkApplication.class, args);
    }

}
