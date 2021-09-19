package com.company.Observeurs;

import com.company.Controleurs.FormeControleur;
import com.company.Enums.FormeEnum;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Classe qui permet de gérer le clique du bouton de la forme choisie
 *
 * @version 1.0
 * @autor Christopher Caron
 * @since 1.0
 */
public class SelectionnerFormeEcouteur implements ActionListener {
    /**
     * Le contrôleur de forme
     */
    private FormeControleur controleur;

    /**
     * Le constructeur de SelectionnerFormeEcouteur
     *
     * @param formeControleur Le contrôleur de forme
     */
    public SelectionnerFormeEcouteur(FormeControleur formeControleur) {
        controleur = formeControleur;
    }

    /**
     * Permet de gérer l'action du clique
     *
     * @param e l'action effectuer
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton bouton = (JButton) e.getSource();
        String nom = bouton.getText();
        controleur.setCreation(true);
        switch (nom) {
            case "Carré" -> controleur.setFormeChoisie(FormeEnum.CARRE);
            case "Cercle" -> controleur.setFormeChoisie(FormeEnum.CERCLE);
            case "Ellipse" -> controleur.setFormeChoisie(FormeEnum.ELLIPSE);
            case "Ligne" -> controleur.setFormeChoisie(FormeEnum.LIGNE);
            case "Rectangle" -> controleur.setFormeChoisie(FormeEnum.RECTANGLE);
            case "Triangle" -> controleur.setFormeChoisie(FormeEnum.TRIANGLE);
        }
    }
}
