package com.capstone.crim_alert.model.config;

import com.capstone.crim_alert.model.repository.UsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsConfig {

    @Bean
    CommandLineRunner commandLineRunner1 (UsRepository repository){
        return args -> {


        };
    }
}
