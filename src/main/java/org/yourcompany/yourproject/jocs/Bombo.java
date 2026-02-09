package org.yourcompany.yourproject.jocs;
import java.util.ArrayList;
import java.util.Random;

import org.yourcompany.yourproject.MaquinaAleatoria;

public class Bombo implements MaquinaAleatoria {
    
    private ArrayList<Integer> boles = new ArrayList<>();

    public Bombo(ArrayList<Integer> boles) {
    boles.add(1);
    boles.add(2);
    boles.add(3);
    boles.add(3);
    boles.add(4);
    boles.add(6);
    }

    @Override
    public int llençar() {
        Random random = new Random();

        int bolaRandom = random.nextInt(boles.size());
        int bolaExtreta = boles.get(bolaRandom);
        boles.remove(bolaExtreta);

        return bolaExtreta;
    }

    public ArrayList<Integer> getBoles() {
        return boles;
    }

}
