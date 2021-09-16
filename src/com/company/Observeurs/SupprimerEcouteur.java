package com.company.Observeurs;

import com.company.Controleurs.FormeControleur;
import com.company.Vues.VuePrincipale;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SupprimerEcouteur implements ActionListener {
    private FormeControleur controleur;
    private VuePrincipale vue;

    public SupprimerEcouteur(FormeControleur formeControleur) {
        controleur = formeControleur;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        controleur.supprimerForme();
    }
}
