package com.project.completo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.completo.entity.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente,Integer> {

}
