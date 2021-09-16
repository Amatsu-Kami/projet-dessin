package com.company.Controleurs;

import com.company.Enums.BordureEnum;
import com.company.Enums.FormeEnum;
import com.company.Modeles.*;
import com.company.Observeurs.*;
import com.company.Vues.VuePrincipale;

import java.util.ArrayList;

public class FormeControleur extends Observable {
    private VuePrincipale vue;
    private FormeEnum formeChoisie;
    private BordureEnum bordureChoisie;
    private ArrayList<Forme> formes;
    private boolean suppression;
    private boolean creation;

    public FormeControleur(VuePrincipale vue) {
        this.vue = vue;
        this.formes = new ArrayList<>();
        attache(vue);
    }

    public void afficherVue() {
        this.vue.afficher();
        this.vue.addFormeEcouteur(new FormeEcouteur(vue, this), new SelectionnerFormeEcouteur(this), new SuppressionEcouteur(this), new SupprimerEcouteur(this), new BordureEcouteur(this));
    }

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
        this.vue.ajouterAuComboBox(forme.getClass().getSimpleName() + " " + (index + 1));
    }

    public void supprimerForme(){
        int index = this.vue.getFormeIndex();
        if (index >= 0){
            Forme forme = this.formes.get(index);
            this.vue.getCanvas().supprimerForme(forme);
            this.vue.supprimerDuComboBox(index);
            this.formes.remove(forme);
        }
    }

    public boolean isSuppression() {
        return suppression;
    }

    public void setSuppression(boolean suppression) {
        this.suppression = suppression;
        informe();
    }

    public boolean isCreation() {
        return creation;
    }

    public void setCreation(boolean creation) {
        this.creation = creation;
    }

    public void setFormeChoisie(FormeEnum formeChoisie) {
        this.formeChoisie = formeChoisie;
        this.setSuppression(false);
        informe();
    }

    public FormeEnum getFormeChoisie() {
        return formeChoisie;
    }

    public BordureEnum getBordureChoisie() {
        return bordureChoisie;
    }

    public void setBordureChoisie(BordureEnum bordureChoisie) {
        this.bordureChoisie = bordureChoisie;
        informe();
    }
}