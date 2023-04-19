package com.example.tp_spring_mvc_thymeleaf;

import com.example.tp_spring_mvc_thymeleaf.entities.Patient;
import com.example.tp_spring_mvc_thymeleaf.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class TpSpringMvcThymeleafApplication implements CommandLineRunner {
    @Autowired
    PatientRepository patientRepository;
    public static void main(String[] args) {
        SpringApplication.run(TpSpringMvcThymeleafApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    patientRepository.save(new Patient(null,"Mohamed",new Date(),false,34));
    patientRepository.save(new Patient(null,"Hanane",new Date(),true,35));
    patientRepository.save(new Patient(null,"Imane",new Date(),false,287));
    }
}
