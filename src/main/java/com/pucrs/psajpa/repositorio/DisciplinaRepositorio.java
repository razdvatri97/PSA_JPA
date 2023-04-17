package com.pucrs.psajpa.repositorio;

import com.pucrs.psajpa.entidate.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplinaRepositorio extends JpaRepository<Disciplina, Integer> {

    Disciplina findByTurma (int turma);

    Disciplina findByCodigoDisciplina(int codicoDisciplina);
}
