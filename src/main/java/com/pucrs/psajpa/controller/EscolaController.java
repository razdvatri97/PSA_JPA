package com.pucrs.psajpa.controller;

import com.pucrs.psajpa.entidate.Estudante;
import com.pucrs.psajpa.repositorio.EstudanteRepositorio;
import com.pucrs.psajpa.service.EstudanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EscolaController {

    @Autowired
    private EstudanteRepositorio estudanteRepositorio;

    EstudanteService estudanteService;

    @GetMapping(value = "/")
    public String home() {
        return "Olá, para acessar o swagger: http://localhost:8080/swagger-ui.html";
    }

    public @ResponseBody Estudante adicionaEstudante(@RequestParam(value = "nome") String nome,
                                                     @RequestParam(value = "documento") int documento,
                                                     @RequestParam(value = "endereco") String endereco){

        return estudanteService.cadastrarEstudante(nome, documento, endereco);
    }

    @GetMapping(path="/listarTodosEstudantes")
    public @ResponseBody Iterable<Estudante> listarTodosEstudantes() {
        return estudanteService.listarTodosEstudantes();
    }
}
