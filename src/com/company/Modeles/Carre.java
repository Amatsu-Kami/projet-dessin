package com.company.Modeles;

import com.company.Enums.BordureEnum;

import java.awt.*;

/**
 * Classe qui permet de créer un carré
 *
 * @version 1.0
 * @autor Christopher Caron
 * @since 1.0
 */
public class Carre extends Forme {
    /**
     * La largeur du carré
     */
    private int largeur;

    /**
     * Constructeur du carré
     *
     * @param x1               La position du carré sur l'axe des x
     * @param y1               La position du carré sur l'axe des y
     * @param largeur          La largeur du carré
     * @param couleurBordure   La couleur de la bordure du carré
     * @param couleurInterieur La couleur de l'intéreur du carré
     * @param bordureEnum      Permet de savoir si le carré doit avoir seulement une bordure, une bordure et l'intérieur ou seulement l'intérieur
     */
    public Carre(int x1, int y1, int largeur, Color couleurBordure, Color couleurInterieur, BordureEnum bordureEnum) {
        super(couleurBordure, couleurInterieur, x1, y1, bordureEnum);
        this.largeur = largeur;
    }

    /**
     * Permet de dessiner le carré
     *
     * @param graphiques attribut qui permet de créer la forme
     */
    @Override
    public void draw(Graphics graphiques) {
        if (this.bordureEnum == BordureEnum.BORDURE) {
            graphiques.setColor(this.couleurBordure);
            graphiques.drawRect(this.x1, this.y1, this.largeur, this.largeur);
        } else if (this.bordureEnum == BordureEnum.INTERIEUR) {
            graphiques.setColor(couleurInterieur);
            graphiques.fillRect(this.x1, this.y1, this.largeur, this.largeur);
        } else if (this.bordureEnum == BordureEnum.BORDURE_INTERIEUR) {
            graphiques.setColor(couleurInterieur);
            graphiques.fillRect(this.x1, this.y1, this.largeur, this.largeur);
            graphiques.setColor(this.couleurBordure);
            graphiques.drawRect(this.x1, this.y1, this.largeur, this.largeur);
        }
    }
}
