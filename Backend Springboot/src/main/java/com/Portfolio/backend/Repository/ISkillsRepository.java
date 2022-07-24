package com.Portfolio.backend.Repository;

import com.Portfolio.backend.Entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISkillsRepository extends JpaRepository <Skills, Long>{
    
}
