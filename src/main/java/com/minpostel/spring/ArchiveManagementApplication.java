package com.minpostel.spring;

import org.assertj.core.api.Java6BDDAssertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.minpostel.spring.dao.UtilisateurRepository;
import com.minpostel.spring.entities.Utilisateur;

@SpringBootApplication
public class ArchiveManagementApplication implements CommandLineRunner {

	@Autowired
	private UtilisateurRepository utilisateurRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ArchiveManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		uilisateurRepository.save(new Utilisateur(0000, "Jean", "Bosco", "Jean.mengue", "jea@men2018", "678138761", "Monsieur", "Informaticien", "Emana", "jnrmengue@gmail.com", "admin")
	}

}
