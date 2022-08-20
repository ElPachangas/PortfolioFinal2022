package com.portfolio.GEL.Repository;

import com.portfolio.GEL.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository <Persona, Long>{
    
}
