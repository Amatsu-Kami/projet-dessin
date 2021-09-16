package com.company.Modeles;

import com.company.Enums.BordureEnum;

import java.awt.*;

public class Ligne extends Forme{

    private int x2;
    private int y2;

    public Ligne(Color couleur, int x1, int y1, int x2, int y2) {
        super(couleur, x1, y1);
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void draw(Graphics graphiques) {
        graphiques.drawLine(x1,y1,x2,y2);
        graphiques.setColor(couleurBordure);
    }
}
