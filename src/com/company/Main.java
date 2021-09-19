package com.company;

import com.company.Controleurs.FormeControleur;
import com.company.Vues.VuePrincipale;

/**
 * Classe qui permet de démarrer l'application
 *
 * @version 1.0
 * @autor Christopher Caron
 * @since 1.0
 */
public class Main {

    public static void main(String[] args) {
        VuePrincipale vuePrincipale = new VuePrincipale();
        FormeControleur formeControleur = new FormeControleur(vuePrincipale);
        formeControleur.afficherVue();
    }
}
