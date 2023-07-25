package model;

import java.util.Set;

public class Trilha {
    private Musica musica;
    private Set<Artista> cantores;

    public Trilha(Musica musica, Set<Artista> cantores) {
        this.musica = musica;
        this.cantores = cantores;
    }

    public Musica getMusica() {
        return musica;
    }

    public void setMusica(Musica musica) {
        if(musica == null){
            throw new IllegalArgumentException("A musica e obrigatoria");
        }
        this.musica = musica;
    }

    public Set<Artista> getCantores() {
        return cantores;
    }

    public void setCantores(Set<Artista> cantores) {
        if(cantores == null){
            throw new IllegalArgumentException("Os cantores sao obrigatorios");
        }
        this.cantores = cantores;
    }
}
