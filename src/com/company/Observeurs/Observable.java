package com.company.Observeurs;

import java.util.LinkedList;
import java.util.List;

public class Observable {

    private List<Observeur> observeurs;

    public Observable(){
        observeurs = new LinkedList<>();
    }

    public void attache(Observeur aObserveur) {
        observeurs.add(aObserveur);
    }

    public void detache(Observeur aObserveur) {
        observeurs.remove(aObserveur);
    }

    protected void informe() {
        for(Observeur laObserveur : observeurs) {
            laObserveur.actualisation(this);
        }
    }
}