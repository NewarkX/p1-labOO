package model;


import java.util.Set;

public class CD {

    private Set<Trilha> trilhas;

    public CD(Set<Trilha> trilhas) {
        this.trilhas = trilhas;
    }

    public Set<Trilha> getTrilhas() {
        return trilhas;
    }

    public void setTrilhas(Set<Trilha> trilhas) {
        if(trilhas == null){
            throw new IllegalArgumentException("As trilhas são obrigatórias");
        }
        this.trilhas = trilhas;
    }
}
