package com.company.Observeurs;

import com.company.Controleurs.FormeControleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Classe qui permet de gérer le clique du bouton pour supprimer une forme
 *
 * @version 1.0
 * @autor Christopher Caron
 * @since 1.0
 */
public class SupprimerEcouteur implements ActionListener {
    /**
     * Le contrôleur de forme
     */
    private FormeControleur controleur;

    /**
     * Le constructeur de SupprimerEcouteur
     *
     * @param formeControleur Le contrôleur de forme
     */
    public SupprimerEcouteur(FormeControleur formeControleur) {
        controleur = formeControleur;
    }

    /**
     * Permet de gérer l'action du clique
     *
     * @param e l'action effectuer
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        controleur.supprimerForme();
    }
}
