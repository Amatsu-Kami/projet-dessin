package com.company.Modeles;

import com.company.Enums.BordureEnum;
import java.awt.*;
/**
 * Classe qui permet de créer un rectangle
 *
 * @autor Christopher
 * @version 1.0
 * @since 1.0
 */
public class Rectangle extends Forme{

    /**
     * La largeur du rectangle
     */
    private int largeur;
    /**
     * la hauteur du rectangle
     */
    private int hauteur;

    /**
     * Constructeur du rectangle
     *
     * @param x1 La position du rectangle sur l'axe des x
     * @param y1 La position du rectangle sur l'axe des y
     * @param largeur La largeur du rectangle
     * @param hauteur La hauteur du rectangle
     * @param couleurBordure La couleur de la bordure du rectangle
     * @param couleurInterieur La couleur de l'intéreur du rectangle
     * @param bordureEnum Permet de savoir si le rectangle doit avoir seulement une bordure, une bordure et l'intérieur ou seulement l'intérieur
     */
    public Rectangle(int x1, int y1, int largeur, int hauteur, Color couleurBordure, Color couleurInterieur, BordureEnum bordureEnum){
        super(couleurBordure, couleurInterieur, x1, y1,bordureEnum);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    /**
     * Permet de dessiner le rectangle
     *
     * @param graphiques attribut qui permet de créer la forme
     */
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
