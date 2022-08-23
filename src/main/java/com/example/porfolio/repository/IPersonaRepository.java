package com.example.porfolio.repository;

import com.example.porfolio.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long>{

    public void deleteById(int id);

    public void findById(int id);
    
}
