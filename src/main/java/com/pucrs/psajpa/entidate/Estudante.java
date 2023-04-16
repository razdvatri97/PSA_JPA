package com.pucrs.psajpa.entidate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.concurrent.atomic.AtomicInteger;

@Entity
public class Estudante {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    String nome;
    int documento;
    String endereco;

    int matricula;


    public Estudante(String nome, int documento, String endereco) {
        this.nome = nome;
        this.documento = documento;
        this.endereco = endereco;
        this.matricula = getIncremento();
    }

    private int getIncremento() {
        AtomicInteger matricula = new AtomicInteger();
        matricula.addAndGet(1);
        return matricula.get();
    }

    public Estudante() {
    }

    public String getNome() {
        return nome;
    }

    public int getDocumento() {
        return documento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getMatricula() {
        return matricula;
    }

}
