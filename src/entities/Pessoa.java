package entities;

import java.util.Objects;

public class Pessoa {

    private String nome;
    private int autoestima;
    private int nivelEmpatia;
    private int experienciaProfissional;

    public Pessoa(String nome, int autoestima, int nivelEmpatia, int experienciaProfissional) {
        this.nome = nome;
        this.autoestima = autoestima;
        this.nivelEmpatia = nivelEmpatia;
        this.experienciaProfissional = experienciaProfissional;
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
