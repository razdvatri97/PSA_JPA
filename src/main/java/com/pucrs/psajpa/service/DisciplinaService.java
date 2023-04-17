package com.pucrs.psajpa.service;

import com.pucrs.psajpa.entidate.Disciplina;
import com.pucrs.psajpa.repositorio.DisciplinaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DisciplinaService {

    @Autowired
    DisciplinaRepositorio disciplinaRepositorio;

    EstudanteService estudanteService;
    ArrayList<Disciplina> listaDisciplinas;

    public Disciplina cadastrarDisciplina(int codicoDisciplina, String nome, String horario, int turma) {

        Disciplina disciplina = new Disciplina(codicoDisciplina, nome, horario, turma);
        disciplinaRepositorio.save(disciplina);

        return disciplina;
    }

    public String matricularAluno(int codicoDisciplina, int turma, int matricula) {
        listaDisciplinas.addAll(disciplinaRepositorio.findAll());

        Disciplina disciplina = disciplinaRepositorio.findByCodigoDisciplina(codicoDisciplina);

        if (disciplinaRepositorio.findByTurma(turma).getTurma() == turma &&
                disciplinaRepositorio.findByTurma(turma).getCodigoDisciplina() == codicoDisciplina) {

            disciplina.setMatriculados(estudanteService.encontraAlunoMatricula(matricula));
        }


        return "Aluno: " + estudanteService.encontraAlunoMatricula(matricula).getNome() +
                " matriculado na disciplina: " + disciplina.getNome() +
                " no horário: " + disciplina.getHorario() +
                " na turma: " + disciplina.getTurma() + ".";
    }

    public Iterable<Disciplina> listarTodasDisciplinas() {
        return disciplinaRepositorio.findAll();
    }
}
