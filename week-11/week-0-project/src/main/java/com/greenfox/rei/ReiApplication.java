package com.greenfox.rei;

import com.greenfox.rei.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class ReiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReiApplication.class, args);
    }

}
