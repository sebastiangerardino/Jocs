package org.yourcompany.yourproject.jocs;

import org.yourcompany.yourproject.MaquinaAleatoria;

public class Dau implements MaquinaAleatoria {
    private int numCares;

    public Dau(int numCares) {
        this.numCares = numCares;
    }

    @Override
    public int llençar() {
        return (int) (Math.random() * numCares) + 1;
    }

    public int getNumCares() {
        return numCares;
    }
}