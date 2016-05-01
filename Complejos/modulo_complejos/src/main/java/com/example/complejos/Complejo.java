package com.example.complejos;

/** Clase que representa un número complejo. */
class Complejo {

    //declaración de atributos
    protected double real, imaginario;

    //declaración de constructor
    public Complejo(double real, double imaginario) {
        this.real= real;
        this.imaginario= imaginario;
    }

    public double getReal() {
        return real;
    }

    public double getImaginario() {
        return imaginario;
    }

    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }

    public void setReal(double real) {
        this.real = real;
    }
    //declaración de métodos
    /** Transcribe el complejo a String.
     * @returnun string con la parte entera y la imaginaria
     */

    public String toString() {
        return real + "+"+ imaginario + "i";
    }

    /** Suma al complejo de este objeto otro complejo.
     * @param v  el complejo que sumamos
     */

    public void suma(Complejo v) {
        real = real + v.real;
        imaginario = imaginario + v.imaginario;
    }

    public void suma(double re, double im) {
        real = real + re;
        imaginario = imaginario + im;
    }

    public void suma(double re) {
        real = real + re;
    }
}
