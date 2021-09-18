package com.company.Controleurs;

import com.company.Enums.BordureEnum;
import com.company.Enums.FormeEnum;
import com.company.Modeles.*;
import com.company.Observeurs.*;
import com.company.Vues.VuePrincipale;
import java.util.ArrayList;
/**
 * Cette classe permet de faire les échanges entre les modèles et les vue
 *
 * @autor Christopher
 * @version 1.0
 * @since 1.0
 */
public class FormeControleur extends Observable {
    /**
     * La vue principale
     */
    private VuePrincipale vue;
    /**
     * Un enum avec les formes possibles
     */
    private FormeEnum formeChoisie;
    /**
     * Un enum avec les bordures possibles
     */
    private BordureEnum bordureChoisie;
    /**
     * Une liste des formes qui vont être ajouté
     */
    private ArrayList<Forme> formes;
    /**
     * Boolean pour savoir si le programme est en mode suppression de forme
     */
    private boolean suppression;
    /**
     * Boolean pour savoir si le programme est en mode création de forme
     */
    private boolean creation;

    /**
     * Constructeur de forme contrôleur
     *
     * @param vue La vue principale
     */
    public FormeControleur(VuePrincipale vue) {
        this.vue = vue;
        this.formes = new ArrayList<>();
        attache(vue);
    }

    /**
     * Permet d'afficher la vue principale
     */
    public void afficherVue() {
        this.vue.afficher();
        this.vue.addFormeEcouteur(new FormeEcouteur(vue, this), new SelectionnerFormeEcouteur(this), new SuppressionEcouteur(this), new SupprimerEcouteur(this), new BordureEcouteur(this));
    }

    /**
     * Permet d'ajouter des formes dans le canvas, dans la liste de formes et dans le combo box
     *
     * @param detailsForme
     */
    public void ajouterForme(DetailsForme detailsForme) {
        Forme forme = null;
        switch (formeChoisie) {
            case CARRE -> {
                forme = new Carre(detailsForme.getX1(), detailsForme.getY1(), detailsForme.getLargeur(), detailsForme.getCouleurBordure(), detailsForme.getCouleurInterieur(), detailsForme.getBordureEnum());
            }
            case CERCLE -> {
                forme = new Cercle(detailsForme.getX1(), detailsForme.getY1(), detailsForme.getRayon(), detailsForme.getCouleurBordure(), detailsForme.getCouleurInterieur(), detailsForme.getBordureEnum());
            }
            case ELLIPSE -> {
                forme = new Ellipse(detailsForme.getX1(), detailsForme.getY1(), detailsForme.getLargeur(), detailsForme.getHauteur(), detailsForme.getCouleurBordure(), detailsForme.getCouleurInterieur(), detailsForme.getBordureEnum());
            }
            case LIGNE -> {
                forme = new Ligne(detailsForme.getCouleurBordure(), detailsForme.getX1(), detailsForme.getY1(), detailsForme.getX2(), detailsForme.getY2());
            }
            case RECTANGLE -> {
                forme = new Rectangle(detailsForme.getX1(), detailsForme.getY1(), detailsForme.getLargeur(), detailsForme.getHauteur(), detailsForme.getCouleurBordure(), detailsForme.getCouleurInterieur(), detailsForme.getBordureEnum());
            }
            case TRIANGLE -> {
                forme = new Triangle(detailsForme.getX1(), detailsForme.getY1(), detailsForme.getX2(), detailsForme.getY2(), detailsForme.getX3(), detailsForme.getY3(), detailsForme.getCouleurBordure(), detailsForme.getCouleurInterieur(), detailsForme.getBordureEnum());
            }
        }
        this.formes.add(forme);
        this.vue.getCanvas().ajouterForme(forme);
        int index = this.formes.indexOf(forme);
        this.vue.ajouterAuComboBox((index + 1) + " - " + forme.getClass().getSimpleName());
    }

    /**
     * Permet de supprimer une forme du canvas, de la liste de formes et du combo box
     */
    public void supprimerForme(){
        int index = this.vue.getFormeIndex();
        if (index >= 0){
            Forme forme = this.formes.get(index);
            this.vue.getCanvas().supprimerForme(forme);
            this.vue.supprimerDuComboBox(index);
            this.formes.remove(forme);
        }
    }

    /**
     * Permet de savoir si l'application est en mode suppression
     *
     * @return Le boolean de si l'application est en mode suppression ou non
     */
    public boolean isSuppression() {
        return suppression;
    }

    /**
     * Permet de mettre l'application en mode suppression
     *
     * @param suppression Boolean qui permet de savoir si l'application est en mode suppression ou non
     */
    public void setSuppression(boolean suppression) {
        this.suppression = suppression;
        informe();
    }

    /**
     * Permet de savoir si l'application est en mode création ou non
     *
     * @return Le boolean de si l'application est en mode création ou non
     */
    public boolean isCreation() {
        return creation;
    }

    /**
     * Permet de mettre l'application en mode création
     *
     * @param creation Boolean qui permet de savoir si l'application est en mode création ou non
     */
    public void setCreation(boolean creation) {
        this.creation = creation;
    }

    /**
     * Permet de mettre la forme choisie
     *
     * @param formeChoisie La forme choisie
     */
    public void setFormeChoisie(FormeEnum formeChoisie) {
        this.formeChoisie = formeChoisie;
        this.setSuppression(false);
        informe();
    }

    /**
     * Permet de savoir quelle forme est choisie
     *
     * @return La forme choisie
     */
    public FormeEnum getFormeChoisie() {
        return formeChoisie;
    }

    /**
     * Permet de savoir quelle bordure est choisie
     *
     * @return La bordure choisie
     */
    public BordureEnum getBordureChoisie() {
        return bordureChoisie;
    }

    /**
     * Permet de mettre la bordure choisie
     *
     * @param bordureChoisie La bordure choisie
     */
    public void setBordureChoisie(BordureEnum bordureChoisie) {
        this.bordureChoisie = bordureChoisie;
        informe();
    }
}