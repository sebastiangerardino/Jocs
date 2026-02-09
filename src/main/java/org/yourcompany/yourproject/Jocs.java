/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

import java.util.ArrayList;

import org.yourcompany.yourproject.jocs.Bombo;
import org.yourcompany.yourproject.jocs.Dau;
import org.yourcompany.yourproject.jocs.Ruleta;

/**
 *
 * @author alumne
 */
public class Jocs {

    public static void main(String[] args) {
        MaquinaAleatoria dau = new Dau(6);
        MaquinaAleatoria ruleta = new Ruleta(new int[]{1, 2, 2, 3, 4, 4, 5, 6, 6, 6});

        ArrayList<Integer> boles = new ArrayList<>();
        for (int i = 1; i <= 10; i++) boles.add(i);
        MaquinaAleatoria bombo = new Bombo(boles);

        System.out.println("Llençament del dau: " + dau.llençar());
        System.out.println("Llençament de la ruleta: " + ruleta.llençar());
        System.out.println("Llençament del bombo: " + bombo.llençar());
        System.out.println(boles.toString());
        System.out.println("Llençament del bombo: " + bombo.llençar());
        System.out.println(boles.toString());

        
    }
}
