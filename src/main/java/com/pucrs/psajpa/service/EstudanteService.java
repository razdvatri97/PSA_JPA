package com.pucrs.psajpa.service;

import com.pucrs.psajpa.entidate.Estudante;
import com.pucrs.psajpa.repositorio.EstudanteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

public class EstudanteService {

    @Autowired
    private EstudanteRepositorio estudanteRepositorio;

    public Estudante cadastrarEstudante(String nome, int documento, String endereco) {

        Estudante estudante = new Estudante(nome.toLowerCase(), documento, endereco.toLowerCase());
        estudanteRepositorio.save(estudante);

        return estudante;
    }

    public Iterable<Estudante> listarTodosEstudantes() {
        return estudanteRepositorio.findAll();
    }
}
