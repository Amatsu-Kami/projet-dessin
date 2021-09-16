package com.company.Modeles;

import com.company.Enums.BordureEnum;

import java.awt.*;
import java.awt.Rectangle;

public abstract class Forme implements IForme{
    protected Color couleurBordure;
    protected Color couleurInterieur;
    protected int x1;
    protected int y1;
    protected BordureEnum bordureEnum;

    public Forme(Color couleurBordure, int x1, int y1){
        this.couleurBordure = couleurBordure;
        this.x1 = x1;
        this.y1 = y1;
    }

    public Forme(Color couleurBordure, Color couleurInterieur, int x1, int y1, BordureEnum bordureEnum) {
        this.couleurBordure = couleurBordure;
        this.couleurInterieur = couleurInterieur;
        this.x1 = x1;
        this.y1 = y1;
        this.bordureEnum = bordureEnum;
    }

    public Color getCouleurBordure() {
        return couleurBordure;
    }

    public void setCouleurBordure(Color couleurBordure) {
        this.couleurBordure = couleurBordure;
    }

    public Color getCouleurInterieur() {
        return couleurInterieur;
    }

    public void setCouleurInterieur(Color couleurInterieur) {
        this.couleurInterieur = couleurInterieur;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    @Override
    public abstract void draw(Graphics graphiques);
}
