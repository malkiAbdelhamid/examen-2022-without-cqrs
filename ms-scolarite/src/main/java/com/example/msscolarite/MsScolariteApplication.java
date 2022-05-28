package com.example.msscolarite;

import com.example.msscolarite.Repositories.EtudiantRepository;
import com.example.msscolarite.entitied.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

public class MsScolariteApplication implements CommandLineRunner {

    @Autowired
    EtudiantRepository etudiantRepository;
    public static void main(String[] args) {
        SpringApplication.run(MsScolariteApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        etudiantRepository.save(new Etudiant(null,"malki", "4isi",1L));
        etudiantRepository.save(new Etudiant(null,"ali", "4siw",2L));
        etudiantRepository.save(new Etudiant(null,"karim","MatserSiC",1L));
        etudiantRepository.save(new Etudiant(null,"fouad", "MasterSiR",1L));

    }
}
