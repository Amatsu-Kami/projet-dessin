package com.company.Modeles;

import java.awt.*;
/**
 * Classe qui permet de créer une ligne
 *
 * @autor Christopher
 * @version 1.0
 * @since 1.0
 */
public class Ligne extends Forme{

    /**
     * La position du deuxième point sur l'axe des x
     */
    private int x2;
    /**
     * La position du deuxième point sur l'Axe des y
     */
    private int y2;

    /**
     * Constructeur de ligne
     *
     * @param couleur La couleur de la ligne
     * @param x1 La position du premier point sur l'axe des x
     * @param y1 La position du premier point sur l'axe des y
     * @param x2 La position du deuxième point sur l'axe des x
     * @param y2 La position du deuxième point sur l'axe des y
     */
    public Ligne(Color couleur, int x1, int y1, int x2, int y2) {
        super(couleur, x1, y1);
        this.x2 = x2;
        this.y2 = y2;
    }

    /**
     * Permet de dessiner la ligne
     *
     * @param graphiques attribut qui permet de créer la forme
     */
    @Override
    public void draw(Graphics graphiques) {
        graphiques.drawLine(x1,y1,x2,y2);
        graphiques.setColor(couleurBordure);
    }
}
