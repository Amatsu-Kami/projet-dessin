package com.company.Modeles;

import com.company.Enums.BordureEnum;

import java.awt.*;

public class Rectangle extends Forme{

    private int largeur;
    private int hauteur;

    public Rectangle(int x1, int y1, int largeur, int hauteur, Color couleurBordure, Color couleurInterieur, BordureEnum bordureEnum){
        super(couleurBordure, couleurInterieur, x1, y1,bordureEnum);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public void draw(Graphics graphiques) {
        if (this.bordureEnum == BordureEnum.BORDURE) {
            graphiques.setColor(this.couleurBordure);
            graphiques.drawRect(this.x1, this.y1, this.largeur, this.hauteur);
        } else if (this.bordureEnum == BordureEnum.INTERIEUR) {
            graphiques.setColor(couleurInterieur);
            graphiques.fillRect(this.x1, this.y1, this.largeur, this.hauteur);
        } else if (this.bordureEnum == BordureEnum.BORDURE_INTERIEUR) {
            graphiques.setColor(couleurInterieur);
            graphiques.fillRect(this.x1, this.y1, this.largeur, this.hauteur);
            graphiques.setColor(this.couleurBordure);
            graphiques.drawRect(this.x1, this.y1, this.largeur, this.hauteur);
        }
    }
}
