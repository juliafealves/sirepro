package controllers;

import entities.Pessoa;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SistemaController {
    private Map<String, Pessoa> pessoas;

    public SistemaController() {
        this.pessoas = new HashMap<>();
    }

    public void cadastrarPessoa(String nome, int autoestima, int empatia, int ep){
        this.pessoas.put(nome, new Pessoa(nome, autoestima, empatia, ep));
    }

    public String recuperarPessoa(String nome){
        return this.pessoas.get(nome).toString();
    }

    public String listarPessoas(){
        return this.pessoas.values().stream().map(Pessoa::toString).collect(Collectors.joining(System.lineSeparator()));
    }

    public void ativarHabilidade(String nomePessoa, String hab){
        this.pessoas.get(nomePessoa).ativaHabilidade(hab);
    }

    public int getNivelHabilidade(String nomePessoa){
        return this.pessoas.get(nomePessoa).calculaHabilidade();
    }
}
