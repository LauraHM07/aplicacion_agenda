package com.laura.agenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laura.agenda.models.Contacto;

public interface ContactoRepository extends JpaRepository<Contacto, Integer>{
    
}
