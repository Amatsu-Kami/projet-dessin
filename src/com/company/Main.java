package com.company;

import com.company.Controleurs.FormeControleur;
import com.company.Vues.VuePrincipale;

public class Main {

    public static void main(String[] args) {
        VuePrincipale vuePrincipale = new VuePrincipale();
        FormeControleur formeControleur = new FormeControleur(vuePrincipale);
        formeControleur.afficherVue();
    }
}
