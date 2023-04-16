package com.pucrs.psajpa.repositorio;

import com.pucrs.psajpa.entidate.Estudante;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudanteRepositorio extends CrudRepository<Estudante, Integer> {
}
