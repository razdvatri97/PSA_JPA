package com.pucrs.psajpa.repositorio;

import com.pucrs.psajpa.entidate.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudanteRepositorio extends JpaRepository<Estudante, Integer> {

    Estudante findByMatricula (Integer matricula);
}
