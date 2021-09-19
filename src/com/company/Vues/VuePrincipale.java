package com.company.Vues;

import com.company.Controleurs.FormeControleur;
import com.company.Enums.BordureEnum;
import com.company.Enums.FormeEnum;
import com.company.Observeurs.Observable;
import com.company.Observeurs.Observeur;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Classe qui permet de gérer la vue principale
 *
 * @version 1.0
 * @autor Christopher Caron
 * @since 1.0
 */
public class VuePrincipale implements Observeur {
    /**
     * Le bouton pour la couleur de la bordure
     */
    JButton couleurBordureBouton;
    /**
     * Le bouton pour la couleur de l'intérieur
     */
    JButton couleurInterieurBouton;
    /**
     * Le champs de texte pour le premier point sur l'axe des x
     */
    JTextField textFieldX1;
    /**
     * Le champs de texte pour le premier point sur l'axe des y
     */
    JTextField textFieldY1;
    /**
     * Le champs de texte pour le deuxième point sur l'axe des x
     */
    JTextField textFieldX2;
    /**
     * Le champs de texte pour le deuxième point sur l'axe des y
     */
    JTextField textFieldY2;
    /**
     * Le champs de texte pour le troisième point sur l'axe des x
     */
    JTextField textFieldX3;
    /**
     * Le champs de texte pour le troisième point sur l'axe des y
     */
    JTextField textFieldY3;
    /**
     * Le champs de texte pour la largeur
     */
    JTextField textFieldLargeur;
    /**
     * Le champs de texte pour la hauteur
     */
    JTextField textFieldHauteur;
    /**
     * Le champs de texte pour le rayon
     */
    JTextField textFieldRayon;
    /**
     * Le bouton pour créer la forme
     */
    JButton boutonCreer;
    /**
     * La couleur de la bordure
     */
    Color couleurBordure;
    /**
     * La couleur de l'intérieur
     */
    Color couleurInterieur;
    /**
     * Le cadre de l'application
     */
    JFrame frame;
    /**
     * Le bouton pour créer un carré
     */
    JButton carreBouton;
    /**
     * Le bouton pour créer un cercle
     */
    JButton cercleBouton;
    /**
     * Le bouton pour créer un ellipse
     */
    JButton ellipseBouton;
    /**
     * Le bouton pour créer une ligne
     */
    JButton ligneBouton;
    /**
     * Le bouton pour créer un rectangle
     */
    JButton rectangleBouton;
    /**
     * Le bouton pour créer un triangle
     */
    JButton triangleBouton;
    /**
     * Le bouton pour selectionner la bordure seulement
     */
    JRadioButton bordureSeulement;
    /**
     * Le bouton pour selectionner l'intérieur seulement
     */
    JRadioButton interieurSeulement;
    /**
     * Le bouton pour selectionner l'intérieur et la bordure
     */
    JRadioButton interieurBordure;
    /**
     * Le panneau pour le premier point sur l'axe des x
     */
    JPanel panelX1;
    /**
     * Le panneau pour le premier point sur l'axe des y
     */
    JPanel panelY1;
    /**
     * Le panneau pour le deuxième point sur l'axe des x
     */
    JPanel panelX2;
    /**
     * Le panneau pour le deuxième point sur l'axe des y
     */
    JPanel panelY2;
    /**
     * Le panneau pour le troisième point sur l'axe des x
     */
    JPanel panelX3;
    /**
     * Le panneau pour le troisième point sur l'axe des y
     */
    JPanel panelY3;
    /**
     * Le panneau pour la largeur
     */
    JPanel panelLargeur;
    /**
     * Le panneau pour la hauteur
     */
    JPanel panelHauteur;
    /**
     * Le panneau pour le rayon
     */
    JPanel panelRayon;
    /**
     * Le panneau qui contient tous les autres panneaux
     */
    JPanel panelDroit;
    /**
     * Le panneau qui va contenit les dessins de forme
     */
    VueCanvas canvas;
    /**
     * Le bouton pour la suppression de forme
     */
    JButton suppressionBouton;
    /**
     * Le bouton pour supprimer une forme
     */
    JButton supprimerBouton;
    /**
     * Le combo box qui va contenir tous les formes qui sont sur le canvas
     */
    JComboBox comboBox;

    /**
     * Permet d'afficher le cadre avec tous les panneaux
     */
    public void afficher() {
        frame = new JFrame();
        frame.setTitle("Fait moi un dessin");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640, 500);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLayout(new BorderLayout());

        JPanel panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(1980, 37));
        panel1.setBackground(Color.lightGray);
        panel1.setLayout(new FlowLayout());

        carreBouton = new JButton("Carré");
        cercleBouton = new JButton("Cercle");
        ellipseBouton = new JButton("Ellipse");
        ligneBouton = new JButton("Ligne");
        rectangleBouton = new JButton("Rectangle");
        triangleBouton = new JButton("Triangle");
        suppressionBouton = new JButton("Suppression");

        panel1.add(carreBouton);
        panel1.add(cercleBouton);
        panel1.add(ellipseBouton);
        panel1.add(ligneBouton);
        panel1.add(rectangleBouton);
        panel1.add(triangleBouton);
        panel1.add(suppressionBouton);

        panelDroit = new JPanel();
        panelDroit.setPreferredSize(new Dimension(200, 100));
        panelDroit.setBackground(Color.lightGray);
        BoxLayout boxLayout = new BoxLayout(panelDroit, BoxLayout.Y_AXIS);
        panelDroit.setLayout(boxLayout);

        bordureSeulement = new JRadioButton("Bordure seulement");
        bordureSeulement.setBackground(Color.lightGray);
        interieurSeulement = new JRadioButton("Intérieur seulement");
        interieurSeulement.setBackground(Color.lightGray);
        interieurBordure = new JRadioButton("Intérieur et bordure");
        interieurBordure.setBackground(Color.lightGray);
        ButtonGroup bg = new ButtonGroup();
        bg.add(bordureSeulement);
        bg.add(interieurSeulement);
        bg.add(interieurBordure);

        panelDroit.add(bordureSeulement);
        panelDroit.add(interieurSeulement);
        panelDroit.add(interieurBordure);

        bordureSeulement.setSelected(true);

        couleurBordureBouton = new JButton("Couleur bordure");
        couleurBordureBouton.addActionListener(e -> {
            couleurBordure = JColorChooser.showDialog(null, "Choisissez une couleur", Color.BLACK);
        });
        couleurInterieurBouton = new JButton("Couleur intérieur");
        couleurInterieurBouton.addActionListener(e -> {
            couleurInterieur = JColorChooser.showDialog(null, "Choisissez une couleur", Color.BLACK);
        });
        panelDroit.add(couleurBordureBouton);
        panelDroit.add(couleurInterieurBouton);

        panelX1 = new JPanel();
        panelX1.setPreferredSize(new Dimension(200, 100));
        panelX1.setBackground(Color.lightGray);
        panelX1.setLayout(new FlowLayout());

        JLabel labelX1 = new JLabel("X1:");
        textFieldX1 = new JTextField(10);
        textFieldX1.setMaximumSize(textFieldX1.getPreferredSize());
        panelX1.add(labelX1);
        panelX1.add(textFieldX1);
        panelDroit.add(panelX1);

        panelY1 = new JPanel();
        panelY1.setPreferredSize(new Dimension(200, 100));
        panelY1.setBackground(Color.lightGray);
        panelY1.setLayout(new FlowLayout());

        JLabel labelY1 = new JLabel("Y1:");
        textFieldY1 = new JTextField(10);
        textFieldY1.setMaximumSize(textFieldY1.getPreferredSize());
        panelY1.add(labelY1);
        panelY1.add(textFieldY1);
        panelDroit.add(panelY1);

        panelX2 = new JPanel();
        panelX2.setPreferredSize(new Dimension(200, 100));
        panelX2.setBackground(Color.lightGray);
        panelX2.setLayout(new FlowLayout());

        JLabel labelX2 = new JLabel("X2:");
        textFieldX2 = new JTextField(10);
        textFieldX2.setMaximumSize(textFieldX2.getPreferredSize());
        panelX2.add(labelX2);
        panelX2.add(textFieldX2);
        panelDroit.add(panelX2);

        panelY2 = new JPanel();
        panelY2.setPreferredSize(new Dimension(200, 100));
        panelY2.setBackground(Color.lightGray);
        panelY2.setLayout(new FlowLayout());

        JLabel labelY2 = new JLabel("Y2:");
        textFieldY2 = new JTextField(10);
        textFieldY2.setMaximumSize(textFieldY2.getPreferredSize());
        panelY2.add(labelY2);
        panelY2.add(textFieldY2);
        panelDroit.add(panelY2);

        panelX3 = new JPanel();
        panelX3.setPreferredSize(new Dimension(200, 100));
        panelX3.setBackground(Color.lightGray);
        panelX3.setLayout(new FlowLayout());

        JLabel labelX3 = new JLabel("X3:");
        textFieldX3 = new JTextField(10);
        textFieldX3.setMaximumSize(textFieldX3.getPreferredSize());
        panelX3.add(labelX3);
        panelX3.add(textFieldX3);
        panelDroit.add(panelX3);

        panelY3 = new JPanel();
        panelY3.setPreferredSize(new Dimension(200, 100));
        panelY3.setBackground(Color.lightGray);
        panelY3.setLayout(new FlowLayout());

        JLabel labelY3 = new JLabel("Y3:");
        textFieldY3 = new JTextField(10);
        textFieldY3.setMaximumSize(textFieldY3.getPreferredSize());
        panelY3.add(labelY3);
        panelY3.add(textFieldY3);
        panelDroit.add(panelY3);

        panelLargeur = new JPanel();
        panelLargeur.setPreferredSize(new Dimension(200, 100));
        panelLargeur.setBackground(Color.lightGray);
        panelLargeur.setLayout(new FlowLayout());

        JLabel labelLargeur = new JLabel("Largeur:");
        textFieldLargeur = new JTextField(10);
        textFieldLargeur.setMaximumSize(textFieldLargeur.getPreferredSize());
        panelLargeur.add(labelLargeur);
        panelLargeur.add(textFieldLargeur);
        panelDroit.add(panelLargeur);

        panelHauteur = new JPanel();
        panelHauteur.setPreferredSize(new Dimension(200, 100));
        panelHauteur.setBackground(Color.lightGray);
        panelHauteur.setLayout(new FlowLayout());

        JLabel labelHauteur = new JLabel("Hauteur:");
        textFieldHauteur = new JTextField(10);
        textFieldHauteur.setMaximumSize(textFieldHauteur.getPreferredSize());
        panelHauteur.add(labelHauteur);
        panelHauteur.add(textFieldHauteur);
        panelDroit.add(panelHauteur);

        panelRayon = new JPanel();
        panelRayon.setPreferredSize(new Dimension(200, 100));
        panelRayon.setBackground(Color.lightGray);
        panelRayon.setLayout(new FlowLayout());

        JLabel labelRayon = new JLabel("Rayon:");
        textFieldRayon = new JTextField(10);
        textFieldRayon.setMaximumSize(textFieldRayon.getPreferredSize());
        panelRayon.add(labelRayon);
        panelRayon.add(textFieldRayon);
        panelDroit.add(panelRayon);

        comboBox = new JComboBox();

        panelDroit.add(comboBox);

        JPanel panelSupression = new JPanel();
        panelSupression.setBackground(Color.lightGray);
        supprimerBouton = new JButton("Supprimer");
        panelSupression.add(supprimerBouton);
        panelDroit.add(panelSupression);

        JPanel panelCreer = new JPanel();
        panelCreer.setBackground(Color.lightGray);
        boutonCreer = new JButton("OK");
        panelCreer.add(boutonCreer);
        panelDroit.add(panelCreer);

        canvas = new VueCanvas();
        canvas.setBorder(BorderFactory.createBevelBorder(0));

        panelDroit.setVisible(false);

        Box.Filler glue = (Box.Filler) Box.createVerticalGlue();
        glue.changeShape(glue.getMinimumSize(),
                new Dimension(0, Short.MAX_VALUE),
                glue.getMaximumSize());
        panelDroit.add(glue);

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panelDroit, BorderLayout.EAST);
        frame.add(canvas);
        frame.setVisible(true);
    }

    /**
     * Permet d'obtenir le canvas
     *
     * @return Le canvas
     */
    public VueCanvas getCanvas() {
        return canvas;
    }

    /**
     * Permet d'obtenir le premier point de l'axe des x
     *
     * @return Le premier point de l'axe des x
     */
    public int getX1() {
        return !textFieldX1.getText().equals("") ? Integer.parseInt(textFieldX1.getText()) : 0;
    }

    /**
     * Permet d'obtenir le premier point de l'axe des y
     *
     * @return Le premier point de l'axe des y
     */
    public int getY1() {
        return !textFieldY1.getText().equals("") ? Integer.parseInt(textFieldY1.getText()) : 0;
    }

    /**
     * Permet d'obtenir le deuxième point de l'axe des x
     *
     * @return Le deuxième point de l'axe des x
     */
    public int getX2() {
        return !textFieldX2.getText().equals("") ? Integer.parseInt(textFieldX2.getText()) : 0;
    }

    /**
     * Permet d'obtenir le deuxième point de l'axe des y
     *
     * @return Le deuxième point de l'axe des y
     */
    public int getY2() {
        return !textFieldY2.getText().equals("") ? Integer.parseInt(textFieldY2.getText()) : 0;
    }

    /**
     * Permet d'obtenir le troisième point de l'axe des x
     *
     * @return Le troisième point de l'axe des x
     */
    public int getX3() {
        return !textFieldX3.getText().equals("") ? Integer.parseInt(textFieldX3.getText()) : 0;
    }

    /**
     * Permet d'obtenir le troisième point de l'axe des y
     *
     * @return Le troisième point de l'axe des y
     */
    public int getY3() {
        return !textFieldY3.getText().equals("") ? Integer.parseInt(textFieldY3.getText()) : 0;
    }

    /**
     * Permet d'obtenir la largeur
     *
     * @return La largeur
     */
    public int getLargeur() {
        return !textFieldLargeur.getText().equals("") ? Integer.parseInt(textFieldLargeur.getText()) : 0;
    }

    /**
     * Permet d'obtenir la hauteur
     *
     * @return La hauteur
     */
    public int getHauteur() {
        return !textFieldHauteur.getText().equals("") ? Integer.parseInt(textFieldHauteur.getText()) : 0;
    }

    /**
     * Permet d'obtenir le rayon
     *
     * @return Le rayon
     */
    public int getRayon() {
        return !textFieldRayon.getText().equals("") ? Integer.parseInt(textFieldRayon.getText()) : 0;
    }

    /**
     * Permet d'obtenir le type de bordure
     *
     * @return Le type de bordure
     */
    public BordureEnum getBordureEnum() {
        BordureEnum bordureEnum = BordureEnum.BORDURE;
        if (interieurSeulement.isSelected()) {
            bordureEnum = BordureEnum.INTERIEUR;
        } else if (interieurBordure.isSelected()) {
            bordureEnum = BordureEnum.BORDURE_INTERIEUR;
        }
        return bordureEnum;
    }

    /**
     * Permet d'obtenir la couleur de la bordure
     *
     * @return La couleur de la bordure
     */
    public Color getCouleurBordure() {
        return couleurBordure;
    }

    /**
     * Permet d'obtenir la couleur de l'intérieur
     *
     * @return La couleur de l'intérieur
     */
    public Color getCouleurInterieur() {
        return couleurInterieur;
    }

    /**
     * Permet d'ajouter une forme au combo box
     *
     * @param nom Le nom de la forme
     */
    public void ajouterAuComboBox(String nom) {
        this.comboBox.addItem(nom);
    }

    /**
     * Permet de supprimer une forme du combo box
     *
     * @param index L'index de la forme à supprimer
     */
    public void supprimerDuComboBox(int index) {
        this.comboBox.removeItemAt(index);
    }

    /**
     * Permet d'obtenir l'index d'une forme
     *
     * @return L'index de la forme
     */
    public int getFormeIndex() {
        return comboBox.getSelectedIndex();
    }

    /**
     * Permet d'afficher un message d'erreur
     *
     * @param message Le message d'erreur
     */
    public void messageErreur(String message) {
        JOptionPane.showMessageDialog(frame, message);
    }

    /**
     * Permet d'ajouter des écouteurs d'action
     *
     * @param formeEcouteur             L'écouteur d'action de forme
     * @param selectionnerFormeEcouteur L'écouteur d'action de selectionnerForme
     * @param suppressionEcouteur       L'écouteur d'action de suppression
     * @param supprimerEcouteur         L'écouteur d'action de supprimer
     * @param bordureEcouteur           L'écouteur d'action de bordure
     */
    public void addFormeEcouteur(ActionListener formeEcouteur, ActionListener selectionnerFormeEcouteur, ActionListener suppressionEcouteur, ActionListener supprimerEcouteur, ActionListener bordureEcouteur) {
        boutonCreer.addActionListener(formeEcouteur);
        carreBouton.addActionListener(selectionnerFormeEcouteur);
        cercleBouton.addActionListener(selectionnerFormeEcouteur);
        ellipseBouton.addActionListener(selectionnerFormeEcouteur);
        ligneBouton.addActionListener(selectionnerFormeEcouteur);
        rectangleBouton.addActionListener(selectionnerFormeEcouteur);
        triangleBouton.addActionListener(selectionnerFormeEcouteur);
        suppressionBouton.addActionListener(suppressionEcouteur);
        supprimerBouton.addActionListener(supprimerEcouteur);
        bordureSeulement.addActionListener(bordureEcouteur);
        interieurSeulement.addActionListener(bordureEcouteur);
        interieurBordure.addActionListener(bordureEcouteur);

    }

    /**
     * Permet d'actualiser l'observable
     *
     * @param observable L'observable à actualiser
     */
    @Override
    public void actualisation(Observable observable) {
        FormeControleur formeControleur = (FormeControleur) observable;
        FormeEnum formeEnum = formeControleur.getFormeChoisie();
        BordureEnum bordureEnum = formeControleur.getBordureChoisie();
        if (formeControleur.isSuppression()) {
            panelDroit.setVisible(true);
            bordureSeulement.setVisible(false);
            interieurSeulement.setVisible(false);
            interieurBordure.setVisible(false);
            couleurBordureBouton.setVisible(false);
            couleurInterieurBouton.setVisible(false);
            panelX1.setVisible(false);
            panelY1.setVisible(false);
            panelX2.setVisible(false);
            panelY2.setVisible(false);
            panelX3.setVisible(false);
            panelY3.setVisible(false);
            panelLargeur.setVisible(false);
            panelHauteur.setVisible(false);
            panelRayon.setVisible(false);
            boutonCreer.setVisible(false);
            comboBox.setVisible(true);
            supprimerBouton.setVisible(true);
        } else if (formeControleur.isCreation()) {
            switch (formeEnum) {
                case CARRE -> {
                    panelDroit.setVisible(true);
                    bordureSeulement.setSelected(true);
                    bordureSeulement.setVisible(true);
                    interieurSeulement.setVisible(true);
                    interieurBordure.setVisible(true);
                    couleurBordureBouton.setVisible(true);
                    couleurInterieurBouton.setVisible(false);
                    panelX1.setVisible(true);
                    panelY1.setVisible(true);
                    panelX2.setVisible(false);
                    panelY2.setVisible(false);
                    panelX3.setVisible(false);
                    panelY3.setVisible(false);
                    panelLargeur.setVisible(true);
                    panelHauteur.setVisible(false);
                    panelRayon.setVisible(false);
                    boutonCreer.setVisible(true);
                    comboBox.setVisible(false);
                    supprimerBouton.setVisible(false);
                }
                case CERCLE -> {
                    panelDroit.setVisible(true);
                    bordureSeulement.setSelected(true);
                    bordureSeulement.setVisible(true);
                    interieurSeulement.setVisible(true);
                    interieurBordure.setVisible(true);
                    couleurBordureBouton.setVisible(true);
                    couleurInterieurBouton.setVisible(false);
                    panelX1.setVisible(true);
                    panelY1.setVisible(true);
                    panelX2.setVisible(false);
                    panelY2.setVisible(false);
                    panelX3.setVisible(false);
                    panelY3.setVisible(false);
                    panelLargeur.setVisible(false);
                    panelHauteur.setVisible(false);
                    panelRayon.setVisible(true);
                    boutonCreer.setVisible(true);
                    comboBox.setVisible(false);
                    supprimerBouton.setVisible(false);
                }
                case ELLIPSE, RECTANGLE -> {
                    panelDroit.setVisible(true);
                    bordureSeulement.setSelected(true);
                    bordureSeulement.setVisible(true);
                    interieurSeulement.setVisible(true);
                    interieurBordure.setVisible(true);
                    couleurBordureBouton.setVisible(true);
                    couleurInterieurBouton.setVisible(false);
                    panelX1.setVisible(true);
                    panelY1.setVisible(true);
                    panelX2.setVisible(false);
                    panelY2.setVisible(false);
                    panelX3.setVisible(false);
                    panelY3.setVisible(false);
                    panelLargeur.setVisible(true);
                    panelHauteur.setVisible(true);
                    panelRayon.setVisible(false);
                    boutonCreer.setVisible(true);
                    comboBox.setVisible(false);
                    supprimerBouton.setVisible(false);
                }
                case LIGNE -> {
                    panelDroit.setVisible(true);
                    bordureSeulement.setVisible(false);
                    interieurSeulement.setVisible(false);
                    interieurBordure.setVisible(false);
                    couleurBordureBouton.setVisible(true);
                    couleurInterieurBouton.setVisible(false);
                    panelX1.setVisible(true);
                    panelY1.setVisible(true);
                    panelX2.setVisible(true);
                    panelY2.setVisible(true);
                    panelX3.setVisible(false);
                    panelY3.setVisible(false);
                    panelLargeur.setVisible(false);
                    panelHauteur.setVisible(false);
                    panelRayon.setVisible(false);
                    boutonCreer.setVisible(true);
                    comboBox.setVisible(false);
                    supprimerBouton.setVisible(false);
                }
                case TRIANGLE -> {
                    panelDroit.setVisible(true);
                    bordureSeulement.setSelected(true);
                    bordureSeulement.setVisible(true);
                    interieurSeulement.setVisible(true);
                    interieurBordure.setVisible(true);
                    couleurBordureBouton.setVisible(true);
                    couleurInterieurBouton.setVisible(false);
                    panelX1.setVisible(true);
                    panelY1.setVisible(true);
                    panelX2.setVisible(true);
                    panelY2.setVisible(true);
                    panelX3.setVisible(true);
                    panelY3.setVisible(true);
                    panelLargeur.setVisible(false);
                    panelHauteur.setVisible(false);
                    panelRayon.setVisible(false);
                    boutonCreer.setVisible(true);
                    comboBox.setVisible(false);
                    supprimerBouton.setVisible(false);
                }
            }
        } else {
            switch (bordureEnum) {
                case BORDURE -> {
                    couleurBordureBouton.setVisible(true);
                    couleurInterieurBouton.setVisible(false);
                }
                case INTERIEUR -> {
                    couleurBordureBouton.setVisible(false);
                    couleurInterieurBouton.setVisible(true);
                }
                case BORDURE_INTERIEUR -> {
                    couleurBordureBouton.setVisible(true);
                    couleurInterieurBouton.setVisible(true);
                }
            }
        }
    }
}