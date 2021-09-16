package com.company.Modeles;

import com.company.Enums.BordureEnum;

import java.awt.*;

public class Cercle extends Forme{
    private int rayon;

    public Cercle(int x1, int y1, int rayon, Color couleurBordure, Color couleurInterieur, BordureEnum bordureEnum){
        super(couleurBordure, couleurInterieur, x1, y1,bordureEnum);
        this.rayon = rayon;
    }

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