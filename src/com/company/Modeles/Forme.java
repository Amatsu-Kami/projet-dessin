package com.company.Modeles;

import com.company.Enums.BordureEnum;

import java.awt.*;

/**
 * Classe qui permet de créer une forme
 *
 * @version 1.0
 * @autor Christopher Caron
 * @since 1.0
 */
public abstract class Forme implements IForme {
    /**
     * La couleur de la bordure
     */
    protected Color couleurBordure;
    /**
     * La couleur de l'intérieur de la forme
     */
    protected Color couleurInterieur;
    /**
     * La position de la forme sur l'axe des x
     */
    protected int x1;
    /**
     * La position de la forme sur l'axe des y
     */
    protected int y1;
    /**
     * Le type de bordure de la forme
     */
    protected BordureEnum bordureEnum;

    /**
     * Constructeur de forme
     *
     * @param couleurBordure La couleur de le bordure de la forme
     * @param x1             La position de la forme sur l'axe des x
     * @param y1             La position de la forme sur l'axe des y
     */
    public Forme(Color couleurBordure, int x1, int y1) {
        this.couleurBordure = couleurBordure;
        this.x1 = x1;
        this.y1 = y1;
    }

    /**
     * Constructeur de forme
     *
     * @param couleurBordure   La couleur de la bordure de la forme
     * @param couleurInterieur La couleur de l'intèrieur de la forme
     * @param x1               La position de la forme sur l'axe des x
     * @param y1               La position de la forme sur l'axe des y
     * @param bordureEnum      Le type de bordure de la forme
     */
    public Forme(Color couleurBordure, Color couleurInterieur, int x1, int y1, BordureEnum bordureEnum) {
        this.couleurBordure = couleurBordure;
        this.couleurInterieur = couleurInterieur;
        this.x1 = x1;
        this.y1 = y1;
        this.bordureEnum = bordureEnum;
    }

    /**
     * Permet de dessiner la forme
     *
     * @param graphiques attribut qui permet de créer la forme
     */
    @Override
    public abstract void draw(Graphics graphiques);
}
