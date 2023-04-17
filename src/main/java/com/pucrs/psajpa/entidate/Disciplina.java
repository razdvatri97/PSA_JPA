package com.pucrs.psajpa.entidate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.ArrayList;

@Entity
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    int codigoDisciplina;
    String nome;
    String horario;
    int turma;
    ArrayList<Estudante> matriculados;

    public Disciplina(int codigoDisciplina, String nome, String horario, int turma) {
        this.codigoDisciplina = codigoDisciplina;
        this.nome = nome;
        this.horario = horario;
        this.turma = turma;
    }

    public int getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public void setCodigoDisciplina(int codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getTurma() {
        return turma;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }

    public ArrayList<Estudante> getMatriculados() { return matriculados; }

    public boolean setMatriculados(Estudante estudante) {
        matriculados.add(estudante);
        return true;
    }
}
