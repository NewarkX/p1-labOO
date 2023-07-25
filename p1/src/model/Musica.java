package model;

import java.util.Set;

public class Musica {
    private Set<Artista> compositores;

    public Musica(Set<Artista> compositores) {
        this.compositores = compositores;
    }

    public Set<Artista> getCompositores() {
        if(compositores == null){
            throw new IllegalArgumentException("Os compositores sao obrigatorios");
        }
        return compositores;
    }

    public void setCompositores(Set<Artista> compositores) {
        this.compositores = compositores;
    }
}
