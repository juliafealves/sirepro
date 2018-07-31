package entities;

public class Interpessoal implements Habilidade {

    @Override
    public int calculaNivel(int autoestima, int nivelEmpatia, int experienciaProfisional) {
        return (int)(0.3 * autoestima + 0.2 * (experienciaProfisional / 10) + 0.5 * nivelEmpatia);
    }
}
