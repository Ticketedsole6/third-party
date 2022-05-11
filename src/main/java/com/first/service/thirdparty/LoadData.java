package com.first.service.thirdparty;

import com.first.service.thirdparty.models.User;
import com.first.service.thirdparty.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
@Slf4j
public class LoadData {
    @Bean
    CommandLineRunner initDatabase(UserRepository userRepository){
        return args -> {
            log.info("Preloading " + userRepository.save(
                    User
                            .builder()
                            .firstName("pepe")
                            .lastName("jobs")
                            .maritalStatus("married")
                            .isAlive(true)
                            .birthday(LocalDate.of(1960, Month.JANUARY,1))
                            .build()
            )
            );

            log.info("Preloading " + userRepository.save(
                            User
                                    .builder()
                                    .firstName("david")
                                    .lastName("apellido")
                                    .maritalStatus("single")
                                    .isAlive(true)
                                    .birthday(LocalDate.of(1960, Month.APRIL,1))
                                    .build()
                    )
            );

            log.info("Preloading " + userRepository.save(
                            User
                                    .builder()
                                    .firstName("steve")
                                    .lastName("apellido")
                                    .maritalStatus("single")
                                    .isAlive(true)
                                    .birthday(LocalDate.of(1960, Month.DECEMBER,1))
                                    .build()
                    )
            );
        };
    }
}
