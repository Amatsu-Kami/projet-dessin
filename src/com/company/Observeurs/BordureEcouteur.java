package com.company.Observeurs;

import com.company.Controleurs.FormeControleur;
import com.company.Enums.BordureEnum;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Classe qui permet de gérer le clique du bouton radio de bordure
 *
 * @version 1.0
 * @autor Christopher Caron
 * @since 1.0
 */
public class BordureEcouteur implements ActionListener {
    /**
     * Le contrôleur de forme
     */
    private FormeControleur controleur;

    /**
     * Constructeur de l'observeur bordure ecouteur
     *
     * @param formeControleur Le contrôleur de forme
     */
    public BordureEcouteur(FormeControleur formeControleur) {
        controleur = formeControleur;
    }

    /**
     * Permet de gérer l'action du clique
     *
     * @param e l'action effectuer
     */
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
