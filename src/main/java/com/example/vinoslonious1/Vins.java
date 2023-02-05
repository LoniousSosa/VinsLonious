package com.example.vinoslonious1;

public class Vins {
    String marca;
    String tipus;

    public Vins(String marca, String tipus) {
        this.marca = marca;
        this.tipus = tipus;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }
}
