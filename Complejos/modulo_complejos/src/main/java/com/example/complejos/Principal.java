package com.example.complejos;

/**
 * Created by Ramirez on 24/04/2016.
 */
class Principal {
    public static void main(String[] main) {
        Complejo z, w;
        z = new ComplejoAmpliado(2, 3.0);
        w = new ComplejoAmpliado(3, -3.0);
        z.suma(w);
        System.out.println("Complejo: " + z);
    }
}
