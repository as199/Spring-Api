package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
           Student assane = new Student(

                    "ASSANE",
                    "dioneassane0290@gmail.com",
                    LocalDate.of(1996, Month.FEBRUARY,24));
            Student fatou = new Student(
                    "Fatou",
                    "fatou@gmail.com",
                    LocalDate.of(1998, Month.FEBRUARY,20));
//            repository.saveAll(
//                    List.of(assane,fatou)
//            );

        };
    }
}
