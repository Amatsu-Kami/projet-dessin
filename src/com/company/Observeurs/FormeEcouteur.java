package com.company.Observeurs;

import com.company.Controleurs.FormeControleur;
import com.company.Modeles.DetailsForme;
import com.company.Vues.VuePrincipale;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Classe qui permet de gérer le clique du bouton pour créer une forme
 *
 * @version 1.0
 * @autor Christopher Caron
 * @since 1.0
 */
public class FormeEcouteur implements ActionListener {
    /**
     * La vue principale
     */
    private VuePrincipale vue;
    /**
     * Le contrôleur de forme
     */
    private FormeControleur controleur;

    /**
     * Le contructeur  de formeEcouteur
     *
     * @param vuePrincipale   La vue principale
     * @param formeControleur Le contrôleur de forme
     */
    public FormeEcouteur(VuePrincipale vuePrincipale, FormeControleur formeControleur) {
        vue = vuePrincipale;
        controleur = formeControleur;
    }

    /**
     * Permet de gérer l'action du clique
     *
     * @param e l'action effectuer
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            DetailsForme detailsForme = new DetailsForme();
            detailsForme.setX1(vue.getX1());
            detailsForme.setY1(vue.getY1());
            detailsForme.setX2(vue.getX2());
            detailsForme.setY2(vue.getY2());
            detailsForme.setX3(vue.getX3());
            detailsForme.setY3(vue.getY3());
            detailsForme.setLargeur(vue.getLargeur());
            detailsForme.setHauteur(vue.getHauteur());
            detailsForme.setRayon(vue.getRayon());
            detailsForme.setCouleurBordure(vue.getCouleurBordure());
            detailsForme.setCouleurInterieur(vue.getCouleurInterieur());
            detailsForme.setBordureEnum(vue.getBordureEnum());
            controleur.ajouterForme(detailsForme);
        } catch (NumberFormatException exception) {
            vue.messageErreur("Veuillez entrer des nombres seulement.");
        }
    }
}
