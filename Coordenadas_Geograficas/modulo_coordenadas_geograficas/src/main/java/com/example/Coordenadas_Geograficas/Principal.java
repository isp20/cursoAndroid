package com.example.Coordenadas_Geograficas;

/**
 * Created by Ramirez on 24/04/2016.
 */
public class Principal {
    public static void main(String[] main) {
        GeoPunto micasa, instituto;
        micasa = new GeoPunto(-30.7839686, -60.5799371);
        instituto = new GeoPunto(-30.7879356, -60.5876949);
        System.out.println("La distancia de mi casa al instituto es: " +instituto.distancia(micasa));
    }
}
