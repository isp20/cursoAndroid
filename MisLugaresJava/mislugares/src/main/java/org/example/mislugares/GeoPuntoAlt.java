package org.example.mislugares;

/**
 * Created by Ramirez on 26/04/2016.
 */
public class GeoPuntoAlt extends GeoPunto {
    //declaración de atributos
    private double altura;

    public GeoPuntoAlt(double lon, double lat, double alt) {
        super(lon, lat);
        this.altura=alt;
    }


    public double distanciaConAltura(GeoPuntoAlt punto){
        double distancia_anterior=super.distancia((GeoPunto)punto);
        double distancia_nueva=Math.sqrt(Math.pow(distancia_anterior,2)+Math.pow(this.altura-punto.altura,2));
        return distancia_nueva;
    }
}
