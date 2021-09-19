package com.company.Modeles;

import com.company.Enums.BordureEnum;

import java.awt.*;

/**
 * Classe qui permet d'avoir les détails d'une forme
 *
 * @version 1.0
 * @autor Christopher Caron
 * @since 1.0
 */
public class DetailsForme {
    /**
     * La position du premier point sur l'axe des x
     */
    private int x1;
    /**
     * La position du premier point sur l'axe des y
     */
    private int y1;
    /**
     * La position du deuxième point sur l'axe des x
     */
    private int x2;
    /**
     * La position du deuxième point sur l'axe des y
     */
    private int y2;
    /**
     * La position du troisième point sur l'axe des x
     */
    private int x3;
    /**
     * La position du troisième point sur l'axe des y
     */
    private int y3;
    /**
     * La largeur de la forme
     */
    private int largeur;
    /**
     * La hauteur de la forme
     */
    private int hauteur;
    /**
     * Le rayon de la forme
     */
    private int rayon;
    /**
     * La couleur de la bordure
     */
    private Color couleurBordure;
    /**
     * La couleur de l'intérieur
     */
    private Color couleurInterieur;
    /**
     * Le type de bordure de la forme
     */
    private BordureEnum bordureEnum;

    /**
     * Permet d'obtenir le premier point de l'axe des x
     *
     * @return Le premier point de l'axe des x
     */
    public int getX1() {
        return x1;
    }

    /**
     * Permet d'obtenir le premier point de l'axe des y
     *
     * @return Le premier point de l'axe des y
     */
    public int getY1() {
        return y1;
    }

    /**
     * Permet d'obtenir le deuxième point de l'axe des x
     *
     * @return Le deuxième point de l'axe des x
     */
    public int getX2() {
        return x2;
    }

    /**
     * Permet d'obtenir le deuxième point de l'axe des y
     *
     * @return Le deuxième point de l'axe des y
     */
    public int getY2() {
        return y2;
    }

    /**
     * Permet d'obtenir le troisième point de l'axe des x
     *
     * @return Le troisième point de l'axe des x
     */
    public int getX3() {
        return x3;
    }

    /**
     * Permet d'obtenir le troisième point de l'axe des y
     *
     * @return Le troisième point de l'axe des y
     */
    public int getY3() {
        return y3;
    }

    /**
     * Permet d'obtenir la largeur de la forme
     *
     * @return La largeur de la forme
     */
    public int getLargeur() {
        return largeur;
    }

    /**
     * Permet d'obtenir la hauteur de la forme
     *
     * @return la hauteur de la forme
     */
    public int getHauteur() {
        return hauteur;
    }

    /**
     * Permet d'obtenir le rayon de la forme
     *
     * @return Le rayon de la forme
     */
    public int getRayon() {
        return rayon;
    }

    /**
     * Permet d'obtenir la couleur de la bordure de la forme
     *
     * @return La couleur de la bordure de la forme
     */
    public Color getCouleurBordure() {
        return couleurBordure;
    }

    /**
     * Permet d'obtenir la couleur de l'intérieur de la forme
     *
     * @return La couleur de l'intérieur de la forme
     */
    public Color getCouleurInterieur() {
        return couleurInterieur;
    }

    /**
     * Permet de mettre la position du premier point sur l'axe des x
     *
     * @param x1 La position du premier point sur l'axe des x
     */
    public void setX1(int x1) {
        this.x1 = x1;
    }

    /**
     * Permet de mettre la position du premier point sur l'axe des y
     *
     * @param y1 La position du premier point sur l'axe des y
     */
    public void setY1(int y1) {
        this.y1 = y1;
    }

    /**
     * Permet de mettre la position du deuxième point sur l'axe des x
     *
     * @param x2 La position du deuxième point sur l'axe des x
     */
    public void setX2(int x2) {
        this.x2 = x2;
    }

    /**
     * Permet de mettre la position du deuxième point sur l'axe des y
     *
     * @param y2 La position du deuxième point sur l'axe des y
     */
    public void setY2(int y2) {
        this.y2 = y2;
    }

    /**
     * Permet de mettre la position du troisième point sur l'axe des x
     *
     * @param x3 La position du troisième point sur l'axe des x
     */
    public void setX3(int x3) {
        this.x3 = x3;
    }

    /**
     * Permet de mettre la position du troisième point sur l'axe des y
     *
     * @param y3 La position du troisième point sur l'axe des y
     */
    public void setY3(int y3) {
        this.y3 = y3;
    }

    /**
     * Permet de mettre la largeur de la forme
     *
     * @param largeur La largeur de la forme
     */
    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    /**
     * Permet de mettre la hauteur de la forme
     *
     * @param hauteur La hauteur de la forme
     */
    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    /**
     * Permet de mettre le rayon de la forme
     *
     * @param rayon Le rayon de la forme
     */
    public void setRayon(int rayon) {
        this.rayon = rayon;
    }

    /**
     * Permet de mettre la couleur de la bordure de la forme
     *
     * @param couleurBordure La couleur de la bordure de la forme
     */
    public void setCouleurBordure(Color couleurBordure) {
        this.couleurBordure = couleurBordure;
    }

    /**
     * Permet de mettre la couleur de l'intérieur de la forme
     *
     * @param couleurInterieur La couleur de l'intérieur de la forme
     */
    public void setCouleurInterieur(Color couleurInterieur) {
        this.couleurInterieur = couleurInterieur;
    }

    /**
     * Permet d'obtenir le type de bordure de la forme
     *
     * @return Le type de bordure de la forme
     */
    public BordureEnum getBordureEnum() {
        return bordureEnum;
    }

    /**
     * Permet de mettre le type de bordure de la forme
     *
     * @param bordureEnum le type de bordure de la forme
     */
    public void setBordureEnum(BordureEnum bordureEnum) {
        this.bordureEnum = bordureEnum;
    }
}
