package com.Portfolio.backend.Repository;

import com.Portfolio.backend.Entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienciaRepository extends JpaRepository <Experiencia, Long>{
    
}
