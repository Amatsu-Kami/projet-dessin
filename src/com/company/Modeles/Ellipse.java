package com.company.Modeles;

import com.company.Enums.BordureEnum;

import java.awt.*;

/**
 * Classe qui permet de créer un ellipse
 *
 * @version 1.0
 * @autor Christopher Caron
 * @since 1.0
 */
public class Ellipse extends Forme {
    /**
     * La largeur de l'ellipse
     */
    private int largeur;
    /**
     * La hauteur de l'ellipse
     */
    private int hauteur;

    /**
     * Constructeur de l'ellipse
     *
     * @param x1               La position de l'ellipse sur l'axe des x
     * @param y1               La position de l'ellipse sur l'axe des y
     * @param largeur          La largeur de l'ellipse
     * @param hauteur          La hauteur de l'ellipse
     * @param couleurBordure   La couleur de la bordure de l'ellipse
     * @param couleurInterieur La couleur de l'intéreur de l'ellipse
     * @param bordureEnum      Permet de savoir si l'ellipse doit avoir seulement une bordure, une bordure et l'intérieur ou seulement l'intérieur
     */
    public Ellipse(int x1, int y1, int largeur, int hauteur, Color couleurBordure, Color couleurInterieur, BordureEnum bordureEnum) {
        super(couleurBordure, couleurInterieur, x1, y1, bordureEnum);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    /**
     * Permet de dessiner l'ellipse
     *
     * @param graphiques attribut qui permet de créer la forme
     */
    @Override
    public void draw(Graphics graphiques) {
        if (this.bordureEnum == BordureEnum.BORDURE) {
            graphiques.setColor(this.couleurBordure);
            graphiques.drawOval(this.x1, this.y1, this.largeur, this.hauteur);
        } else if (this.bordureEnum == BordureEnum.INTERIEUR) {
            graphiques.setColor(couleurInterieur);
            graphiques.fillOval(this.x1, this.y1, this.largeur, this.hauteur);
        } else if (this.bordureEnum == BordureEnum.BORDURE_INTERIEUR) {
            graphiques.setColor(couleurInterieur);
            graphiques.fillOval(this.x1, this.y1, this.largeur, this.hauteur);
            graphiques.setColor(this.couleurBordure);
            graphiques.drawOval(this.x1, this.y1, this.largeur, this.hauteur);
        }
    }
}
