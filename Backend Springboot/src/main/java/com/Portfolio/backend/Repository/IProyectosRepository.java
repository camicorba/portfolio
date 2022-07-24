package com.Portfolio.backend.Repository;

import com.Portfolio.backend.Entity.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProyectosRepository extends JpaRepository <Proyectos, Long>{
    
}
