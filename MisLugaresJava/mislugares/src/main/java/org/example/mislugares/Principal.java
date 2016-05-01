package org.example.mislugares;

/**
 * Created by Ramirez on 25/04/2016.
 */
public class Principal {
    public static void main(String[] main) {
        Lugar lugar = new Lugar("Instituto Superior de Profesorado N20",
                "Batalla de Tucuman Nº 2217 - 1º Piso ", -30.7884187, -60.5875718,
                426023, "http://www.isp20.edu.ar",
                "Uno de los mejores lugares para formarse.", 3, TipoLugar.EDUCACION);
        System.out.println("Lugar " + lugar.toString());
        GeoPuntoAlt micasa, instituto;
        micasa = new GeoPuntoAlt(-30.7839686, -60.5799371,0);
        instituto = new GeoPuntoAlt(-30.7879356, -60.5876949,100);
        System.out.println("La distancia de mi casa al instituto es: " +instituto.distanciaConAltura(micasa));
    }
}
