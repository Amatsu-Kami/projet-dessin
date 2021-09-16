package com.company.Observeurs;

import com.company.Controleurs.FormeControleur;
import com.company.Enums.BordureEnum;
import com.company.Enums.FormeEnum;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BordureEcouteur implements ActionListener {
    private FormeControleur controleur;

    public BordureEcouteur(FormeControleur formeControleur) {
        controleur = formeControleur;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JRadioButton bouton = (JRadioButton) e.getSource();
        String nom = bouton.getText();
        controleur.setCreation(false);
        switch (nom) {
            case "Bordure seulement" -> controleur.setBordureChoisie(BordureEnum.BORDURE);
            case "Intérieur seulement" -> controleur.setBordureChoisie(BordureEnum.INTERIEUR);
            case "Intérieur et bordure" -> controleur.setBordureChoisie(BordureEnum.BORDURE_INTERIEUR);
        }
    }
}
