package com.company.Modeles;

import com.company.Enums.BordureEnum;

import java.awt.*;

public class DetailsForme {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;
    private int largeur;
    private int hauteur;
    private int rayon;
    private Color couleurBordure;
    private Color couleurInterieur;
    private BordureEnum bordureEnum;

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public int getX3() {
        return x3;
    }

    public int getY3() {
        return y3;
    }

    public int getLargeur() {
        return largeur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public int getRayon() {
        return rayon;
    }

    public Color getCouleurBordure() {
        return couleurBordure;
    }

    public Color getCouleurInterieur() {
        return couleurInterieur;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public void setRayon(int rayon) {
        this.rayon = rayon;
    }

    public void setCouleurBordure(Color couleurBordure) {
        this.couleurBordure = couleurBordure;
    }

    public void setCouleurInterieur(Color couleurInterieur) {
        this.couleurInterieur = couleurInterieur;
    }

    public BordureEnum getBordureEnum() {
        return bordureEnum;
    }

    public void setBordureEnum(BordureEnum bordureEnum) {
        this.bordureEnum = bordureEnum;
    }
}
