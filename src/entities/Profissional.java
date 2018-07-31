package entities;

public class Profissional implements Habilidade {

    @Override
    public int calculaNivel(int autoestima, int nivelEmpatia, int experienciaProfisional) {
        double penalidade = 1.0;

        if(autoestima < 7 || nivelEmpatia < 7)
            penalidade = 0.1;

        return (experienciaProfisional / 10) - penalidade;
    }
}
