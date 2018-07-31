package entities;

import java.io.Serializable;
import java.util.Objects;

public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    private String nome;
    private int autoestima;
    private int nivelEmpatia;
    private int experienciaProfissional;
    private Habilidade habilidade;
    private int problemasResolvidos;

    public Pessoa(String nome, int autoestima, int nivelEmpatia, int experienciaProfissional) {
        this.nome = nome;
        this.autoestima = autoestima;
        this.nivelEmpatia = nivelEmpatia;
        this.experienciaProfissional = experienciaProfissional;
        this.problemasResolvidos = 0;
    }

    public void ativaHabilidade(String habilidade){
        if("pessoal".equalsIgnoreCase(habilidade))
            this.habilidade = new Pessoal();
        else if("profissional".equalsIgnoreCase(habilidade))
            this.habilidade = new Profissional();
        else if("interpessoal".equalsIgnoreCase(habilidade))
            this.habilidade = new Interpessoal();
        else
            throw new IllegalArgumentException("Habilidade inválida.");
    }

    public int calculaHabilidade(){
        return this.habilidade.calculaNivel(autoestima, nivelEmpatia, experienciaProfissional);
    }

    public void resolveProblema(int nivelProblema){
        if(nivelProblema <= this.calculaHabilidade())
            this.problemasResolvidos++;
    }

    public int getProblemasResolvidos() {
        return problemasResolvidos;
    }

    @Override
    public String toString() {
        return this.nome + " - " + this.autoestima + " - " + this.nivelEmpatia + " - " + this.experienciaProfissional;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
