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

        return args ->{Student houcem= new Student("houcem","test", LocalDate.of(2000, Month.APRIL,29));
            Student hamma= new Student("houcem","test", LocalDate.of(2000, Month.APRIL,29));repository.saveAll(List.of(houcem,hamma));};

    }

}
