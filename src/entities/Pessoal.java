package entities;

public class Pessoal implements Habilidade {

    @Override
    public int calculaNivel(int autoestima, int nivelEmpatia, int experienciaProfisional) {
        return (int)(0.5 * autoestima + 0.3 * (experienciaProfisional / 10) + 0.2 * nivelEmpatia);
    }
}
