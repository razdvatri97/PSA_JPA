package com.pucrs.psajpa.controller;

import com.pucrs.psajpa.entidate.Disciplina;
import com.pucrs.psajpa.entidate.Estudante;
import com.pucrs.psajpa.service.DisciplinaService;
import com.pucrs.psajpa.service.EstudanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class EscolaController {

    EstudanteService estudanteService;
    DisciplinaService disciplinaService;

    @GetMapping(value = "/")
    public String home() {
        return "Olá, para acessar o swagger: http://localhost:8080/swagger-ui.html";
    }

    public @ResponseBody Estudante adicionaEstudante(@RequestParam(value = "nome") String nome,
                                                     @RequestParam(value = "documento") int documento,
                                                     @RequestParam(value = "endereco") String endereco) {

        return estudanteService.cadastrarEstudante(nome, documento, endereco);
    }

    @GetMapping(value = "/cadastrarDisciplina")
    public @ResponseBody Disciplina cadastrarDisciplina(@RequestParam int codicoDisciplina,
                                                        @RequestParam String nome,
                                                        @RequestParam String horario,
                                                        @RequestParam int turma) {

        return disciplinaService.cadastrarDisciplina(codicoDisciplina, nome, horario, turma);
    }

    @GetMapping(value = "/listarTodasDisciplinas")
    public @ResponseBody Iterable<Disciplina> listarTodasDisciplinas() {
        return disciplinaService.listarTodasDisciplinas();
    }

    @GetMapping(value = "/listarTodosEstudantes")
    public @ResponseBody Iterable<Estudante> listarTodosEstudantes() {
        return estudanteService.listarTodosEstudantes();
    }

    @GetMapping(value = "/matricularEsudanteDisciplina/{codicoDisciplina}/{turma}/{matricula}")
    public String matricularEstudanteDisciplina(@PathVariable int codicoDisciplina,
                                                @PathVariable int turma,
                                                @PathVariable int matricula) {

        return disciplinaService.matricularAluno(codicoDisciplina, turma, matricula);
    }

}
