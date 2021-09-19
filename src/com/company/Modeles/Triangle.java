package com.company.Modeles;

import com.company.Enums.BordureEnum;

import java.awt.*;

/**
 * Classe qui permet de créer un triangle
 *
 * @version 1.0
 * @autor Christopher Caron
 * @since 1.0
 */
public class Triangle extends Forme {
    /**
     * Une liste de nombre pour la position des points sur l'axe des x
     */
    private int[] pointsX;
    /**
     * Une liste de nombre pour la position des points sur l'axe des y
     */
    private int[] pointsY;

    /**
     * Constructeur de triangle
     *
     * @param x1               La position du premier point sur l'axe des x
     * @param y1               La position du premier point sur l'axe des y
     * @param x2               La position du deuxième point sur l'axe des x
     * @param y2               La position du deuxième point sur l'axe des y
     * @param x3               La position du troisième point sur l'axe des x
     * @param y3               La position du troisième point sur l'axe des y
     * @param couleurBordure   La couleur de la bordure du triangle
     * @param couleurInterieur La couleur de l'intérieur du triangle
     * @param bordureEnum      Le type de bordure du triangle
     */
    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3, Color couleurBordure, Color couleurInterieur, BordureEnum bordureEnum) {
        super(couleurBordure, couleurInterieur, x1, y1, bordureEnum);
        this.pointsX = new int[]{x1, x2, x3};
        this.pointsY = new int[]{y1, y2, y3};
    }

    /**
     * Permet de dessiner le triangle
     *
     * @param graphiques attribut qui permet de créer la forme
     */
    @Override
    public void draw(Graphics graphiques) {
        Polygon triangle = new Polygon(pointsX, pointsY, 3);
        if (this.bordureEnum == BordureEnum.BORDURE) {
            graphiques.setColor(this.couleurBordure);
            graphiques.drawPolygon(triangle);
        } else if (this.bordureEnum == BordureEnum.INTERIEUR) {
            graphiques.setColor(couleurInterieur);
            graphiques.fillPolygon(triangle);
        } else if (this.bordureEnum == BordureEnum.BORDURE_INTERIEUR) {
            graphiques.setColor(couleurInterieur);
            graphiques.fillPolygon(triangle);
            graphiques.setColor(this.couleurBordure);
            graphiques.drawPolygon(triangle);
        }
    }
}
