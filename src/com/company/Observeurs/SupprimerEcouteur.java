package com.company.Observeurs;

import com.company.Controleurs.FormeControleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SupprimerEcouteur implements ActionListener {
    private FormeControleur controleur;

    public SupprimerEcouteur(FormeControleur formeControleur) {
        controleur = formeControleur;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
