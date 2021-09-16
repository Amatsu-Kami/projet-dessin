package com.company.Modeles;

import com.company.Enums.BordureEnum;

import java.awt.*;

public class Ellipse extends Forme{

    private int largeur;
    private int hauteur;

    public Ellipse(int x1, int y1, int largeur, int hauteur, Color couleurBordure, Color couleurInterieur, BordureEnum bordureEnum){
        super(couleurBordure, couleurInterieur, x1, y1,bordureEnum);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

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
