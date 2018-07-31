package entities;

import java.io.Serializable;

public interface Habilidade extends Serializable {
    public int calculaNivel(int autoestima, int nivelEmpatia, int experienciaProfisional);
}
