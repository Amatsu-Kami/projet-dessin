package com.company.Modeles;

import com.company.Enums.BordureEnum;

import java.awt.*;

public class Carre extends Forme{

    private int largeur;

    public Carre(int x1, int y1, int largeur, Color couleurBordure, Color couleurInterieur, BordureEnum bordureEnum){
        super(couleurBordure, couleurInterieur, x1, y1,bordureEnum);
        this.largeur = largeur;
    }

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
