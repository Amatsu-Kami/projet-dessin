package com.company.Observeurs;

import com.company.Controleurs.FormeControleur;
import com.company.Enums.BordureEnum;
import com.company.Enums.FormeEnum;
import com.company.Modeles.*;
import com.company.Vues.VuePrincipale;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectionnerFormeEcouteur implements ActionListener {
    private FormeControleur controleur;

    public SelectionnerFormeEcouteur(FormeControleur formeControleur) {
        controleur = formeControleur;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton bouton = (JButton)e.getSource();
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
