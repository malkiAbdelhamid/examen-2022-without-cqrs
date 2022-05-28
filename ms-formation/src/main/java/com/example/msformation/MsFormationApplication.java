package com.example.msformation;

import com.example.msformation.Repositories.FormationRepository;
import com.example.msformation.entities.Formation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

public class MsFormationApplication implements CommandLineRunner {

    @Autowired
    FormationRepository formationRepository;

    public static void main(String[] args) {
        SpringApplication.run(MsFormationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
      formationRepository.save(new Formation(null, "Java",30));
      formationRepository.save(new Formation(null, "Angular",40));

    }
}
