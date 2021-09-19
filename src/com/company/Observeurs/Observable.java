package com.company.Observeurs;

import java.util.LinkedList;
import java.util.List;

/**
 * Classe qui permet de gérer les observables
 *
 * @version 1.0
 * @autor Christopher Caron
 * @since 1.0
 */
public class Observable {
    /**
     * La liste des observeurs
     */
    private List<Observeur> observeurs;

    /**
     * Le constructeur d'observable
     */
    public Observable() {
        observeurs = new LinkedList<>();
    }

    /**
     * Permet d'attacher un observeur à la liste
     *
     * @param aObserveur L'observeur à attacher
     */
    public void attache(Observeur aObserveur) {
        observeurs.add(aObserveur);
    }

    /**
     * Permet de détacher un observeur à la liste
     *
     * @param aObserveur L'observeur à détacher
     */
    public void detache(Observeur aObserveur) {
        observeurs.remove(aObserveur);
    }

    /**
     * Permet d'informer qu'il y a un changement et qu'il faut actualiser les observeurs
     */
    protected void informe() {
        for (Observeur laObserveur : observeurs) {
            laObserveur.actualisation(this);
        }
    }
}