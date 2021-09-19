package com.company.Vues;

import com.company.Modeles.IForme;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Classe qui permet de gérer le canvas
 *
 * @version 1.0
 * @autor Christopher Caron
 * @since 1.0
 */
public class VueCanvas extends JPanel {
    /**
     * La liste de formes
     */
    public List<IForme> formes = new LinkedList<>();


    /**
     * Permet de dessiner les formes sur le canvas
     *
     * @param graphiques Attribut qui permet de créer la forme
     */
    public void paint(Graphics graphiques) {
        super.paint(graphiques);
        for (IForme forme : formes) {
            forme.draw(graphiques);
        }
    }

    /**
     * Permet d'ajouter une forme
     *
     * @param forme La forme à ajouter
     */
    public void ajouterForme(IForme forme) {
        formes.add(forme);
        repaint();
    }

    /**
     * Permet de supprimer une forme
     *
     * @param forme La forme à supprimer
     */
    public void supprimerForme(IForme forme) {
        formes.remove(forme);
        repaint();
    }
}
