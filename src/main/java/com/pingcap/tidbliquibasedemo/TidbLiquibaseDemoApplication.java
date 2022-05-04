package com.pingcap.tidbliquibasedemo;

import liquibase.Liquibase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TidbLiquibaseDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(TidbLiquibaseDemoApplication.class, args);
    }
}
