package com.example.Coordenadas_Geograficas;

/** Clase que almacena un punto geográfico usando latitud y logitud
 */
public class GeoPunto {
    //declaración de atributos
    protected double longitud,latitud;

    public double getLongitud() {
        return longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    final double RADIO_TIERRA = 6371000; // en metros

    //declaración de constructor
    public GeoPunto(double lat,double lon){
        //instrucciones del constructor
        this.longitud=lon;
        this.latitud=lat;
    }

    //declaración de métodos
    public String toString(){
        return "longitud:"+longitud+" latitud:"+latitud;
    }

    /**Método que calcula la distancia entre el punto actual y el que llega
     * @param punto geográfico con latitud y longitud
     * @return retorna la distancia calculada en metros
     */
    public double distancia(GeoPunto punto){
        double dLat = Math.toRadians(latitud - punto.latitud);
        double dLon = Math.toRadians(longitud - punto.longitud);
        double lat1 = Math.toRadians(punto.latitud);
        double lat2 = Math.toRadians(latitud);
        double a =    Math.sin(dLat/2) * Math.sin(dLat/2) +
                Math.sin(dLon/2) * Math.sin(dLon/2) *
                        Math.cos(lat1) * Math.cos(lat2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        return c * RADIO_TIERRA;
    }

}
