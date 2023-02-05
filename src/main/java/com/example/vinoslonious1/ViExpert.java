package com.example.vinoslonious1;

import java.util.ArrayList;
import java.util.List;

public class ViExpert {
    ArrayList<Vins> vins = new ArrayList<>();;

    public void addVins(Vins vi){
        vins.add(vi);
    }

    public List<String> getMarques(String tipusVi){
        List<String> marcas = new ArrayList<>();
        for (Vins v:
                vins) {
            if (v.getTipus().equalsIgnoreCase(tipusVi)){
                marcas.add(v.getMarca());
            }
        }
        return marcas;
    }
}
