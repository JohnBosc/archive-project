package com.minpostel.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minpostel.spring.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

}
