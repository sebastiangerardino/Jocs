package org.yourcompany.yourproject;
import java.util.ArrayList;

public class JocAleatori {
    private MaquinaAleatoria maquinaAleatoria;
    int NUM_TIRADES;
    int NUM_MAX_RONDES;
    ArrayList<Jugador> jugadors;

    public JocAleatori(MaquinaAleatoria maquinaAleatoria) {
        this.maquinaAleatoria = maquinaAleatoria;
    }

    public void afegirJugador(String nom) {
        int numero = maquinaAleatoria.llençar();
    }

    public String seguentJugada() {

    }

    public int numJugadorsActius() {

    }

    public boolean jocAcabat() {

    }

    public String obtenirGuanyador() {
        
    }
}
