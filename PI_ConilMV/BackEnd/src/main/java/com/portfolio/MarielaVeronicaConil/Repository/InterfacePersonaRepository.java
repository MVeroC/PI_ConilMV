package com.portfolio.MarielaVeronicaConil.Repository;

import com.portfolio.MarielaVeronicaConil.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterfacePersonaRepository extends JpaRepository<Persona,Long> {
    
}
