package org.yourcompany.yourproject.jocs;
import java.util.Random;

import org.yourcompany.yourproject.MaquinaAleatoria;

public class Ruleta implements MaquinaAleatoria {
    private int[] numeros = {1, 2, 2, 3, 4, 4, 5, 6, 6, 6};

    public Ruleta(int[] numeros) {
        this.numeros = numeros;
    }

    @Override
    public int llençar() {
        Random random = new Random();

        int numeroRandom = random.nextInt(numeros.length);

        return numeros[numeroRandom];
    }

    public int[] getNumeros() {
        return numeros;
    }
    
}
