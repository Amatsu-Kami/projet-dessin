package com.company.Modeles;

import com.company.Enums.BordureEnum;

import java.awt.*;

/**
 * Classe qui permet de créer un cercle
 *
 * @version 1.0
 * @autor Christopher Caron
 * @since 1.0
 */
public class Cercle extends Forme {
    /**
     * Le rayon du cercle
     */
    private int rayon;

    /**
     * Constructeur du cercle
     *
     * @param x1               La position du cercle sur l'axe des x
     * @param y1               La position du cercle sur l'axe des y
     * @param rayon            Le rayon du cercle
     * @param couleurBordure   La couleur de la bordure du cercle
     * @param couleurInterieur La couleur de l'intéreur du cercle
     * @param bordureEnum      Permet de savoir si le cercle doit avoir seulement une bordure, une bordure et l'intérieur ou seulement l'intérieur
     */
    public Cercle(int x1, int y1, int rayon, Color couleurBordure, Color couleurInterieur, BordureEnum bordureEnum) {
        super(couleurBordure, couleurInterieur, x1, y1, bordureEnum);
        this.rayon = rayon;
    }

    /**
     * Permet de dessiner le cercle
     *
     * @param graphiques attribut qui permet de créer la forme
     */
    @Override
    public void draw(Graphics graphiques) {
        if (this.bordureEnum == BordureEnum.BORDURE) {
            graphiques.setColor(this.couleurBordure);
            graphiques.drawOval(this.x1, this.y1, this.rayon, this.rayon);
        } else if (this.bordureEnum == BordureEnum.INTERIEUR) {
            graphiques.setColor(couleurInterieur);
            graphiques.fillOval(this.x1, this.y1, this.rayon, this.rayon);
        } else if (this.bordureEnum == BordureEnum.BORDURE_INTERIEUR) {
            graphiques.setColor(couleurInterieur);
            graphiques.fillOval(this.x1, this.y1, this.rayon, this.rayon);
            graphiques.setColor(this.couleurBordure);
            graphiques.drawOval(this.x1, this.y1, this.rayon, this.rayon);
        }
    }
}