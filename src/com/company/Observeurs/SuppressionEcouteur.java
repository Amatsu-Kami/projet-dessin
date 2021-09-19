package com.company.Observeurs;

import com.company.Controleurs.FormeControleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Classe qui permet de gérer le clique du bouton de suppression
 *
 * @version 1.0
 * @autor Christopher Caron
 * @since 1.0
 */
public class SuppressionEcouteur implements ActionListener {
    /**
     * Le contrôleur de forme
     */
    private FormeControleur controleur;

    /**
     * Le Constructeur de SuppressionEcouteur
     *
     * @param formeControleur Le contrôleur de forme
     */
    public SuppressionEcouteur(FormeControleur formeControleur) {
        controleur = formeControleur;
    }

    /**
     * Permet de gérer l'action du clique
     *
     * @param e l'action effectuer
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        controleur.setCreation(false);
        controleur.setSuppression(true);
    }
}
