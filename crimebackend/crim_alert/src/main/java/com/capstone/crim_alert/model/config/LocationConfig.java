package com.capstone.crim_alert.model.config;

import com.capstone.crim_alert.model.entities.Location;
import com.capstone.crim_alert.model.repository.LocationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class LocationConfig {
    @Bean
    CommandLineRunner commandLineRunner (LocationRepository repository){
        return args -> {
            Location sakaka =new Location(
                    1,
                    "Sakaka"
            );

            Location arar  =new Location(
                    2,
                    "Arar"

            );
            repository.saveAll(List.of(sakaka,arar));
        };
    }
}
