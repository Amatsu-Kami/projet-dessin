package com.company.Modeles;

import com.company.Enums.BordureEnum;

import java.awt.*;

public class Triangle extends Forme {

    private int[] pointsX;
    private int[] pointsY;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3, Color couleurBordure, Color couleurInterieur, BordureEnum bordureEnum) {
        super(couleurBordure, couleurInterieur, x1, y1,bordureEnum);
        this.pointsX = new int[]{x1, x2, x3};
        this.pointsY = new int[]{y1, y2, y3};
    }

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
