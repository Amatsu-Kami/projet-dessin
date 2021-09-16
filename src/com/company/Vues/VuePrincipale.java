package com.company.Vues;

import com.company.Controleurs.FormeControleur;
import com.company.Enums.BordureEnum;
import com.company.Enums.FormeEnum;
import com.company.Observeurs.Observable;
import com.company.Observeurs.Observeur;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class VuePrincipale implements Observeur {

    JButton couleurBordureBouton;
    JButton couleurInterieurBouton;
    JTextField textFieldX1;
    JTextField textFieldY1;
    JTextField textFieldX2;
    JTextField textFieldY2;
    JTextField textFieldX3;
    JTextField textFieldY3;
    JTextField textFieldLargeur;
    JTextField textFieldHauteur;
    JTextField textFieldRayon;
    JButton okButton;
    Color couleurBordure;
    Color couleurInterieur;
    JFrame frame;
    JButton carreBouton;
    JButton cercleBouton;
    JButton ellipseBouton;
    JButton ligneBouton;
    JButton rectangleBouton;
    JButton triangleBouton;
    JRadioButton bordureSeulement;
    JRadioButton interieurSeulement;
    JRadioButton interieurBordure;
    JPanel panelX1;
    JPanel panelY1;
    JPanel panelX2;
    JPanel panelY2;
    JPanel panelX3;
    JPanel panelY3;
    JPanel panelLargeur;
    JPanel panelHauteur;
    JPanel panelRayon;
    JPanel panel2;
    VueCanvas canvas;
    JButton suppressionBouton;
    JButton supprimerBouton;
    JComboBox comboBox;

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

        panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(200, 100));
        panel2.setBackground(Color.lightGray);
        BoxLayout boxLayout = new BoxLayout(panel2, BoxLayout.Y_AXIS);
        panel2.setLayout(boxLayout);

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

        panel2.add(bordureSeulement);
        panel2.add(interieurSeulement);
        panel2.add(interieurBordure);

        bordureSeulement.setSelected(true);

        couleurBordureBouton = new JButton("Couleur bordure");
        couleurBordureBouton.addActionListener(e -> {
            couleurBordure = JColorChooser.showDialog(null, "Choisissez une couleur", Color.BLACK);
        });
        couleurInterieurBouton = new JButton("Couleur intérieur");
        couleurInterieurBouton.addActionListener(e -> {
            couleurInterieur = JColorChooser.showDialog(null, "Choisissez une couleur", Color.BLACK);
        });
        panel2.add(couleurBordureBouton);
        panel2.add(couleurInterieurBouton);

        panelX1 = new JPanel();
        panelX1.setPreferredSize(new Dimension(200, 100));
        panelX1.setBackground(Color.lightGray);
        panelX1.setLayout(new FlowLayout());

        JLabel labelX1 = new JLabel("X1:");
        textFieldX1 = new JTextField(10);
        textFieldX1.setMaximumSize(textFieldX1.getPreferredSize());
        panelX1.add(labelX1);
        panelX1.add(textFieldX1);
        panel2.add(panelX1);

        panelY1 = new JPanel();
        panelY1.setPreferredSize(new Dimension(200, 100));
        panelY1.setBackground(Color.lightGray);
        panelY1.setLayout(new FlowLayout());

        JLabel labelY1 = new JLabel("Y1:");
        textFieldY1 = new JTextField(10);
        textFieldY1.setMaximumSize(textFieldY1.getPreferredSize());
        panelY1.add(labelY1);
        panelY1.add(textFieldY1);
        panel2.add(panelY1);

        panelX2 = new JPanel();
        panelX2.setPreferredSize(new Dimension(200, 100));
        panelX2.setBackground(Color.lightGray);
        panelX2.setLayout(new FlowLayout());

        JLabel labelX2 = new JLabel("X2:");
        textFieldX2 = new JTextField(10);
        textFieldX2.setMaximumSize(textFieldX2.getPreferredSize());
        panelX2.add(labelX2);
        panelX2.add(textFieldX2);
        panel2.add(panelX2);

        panelY2 = new JPanel();
        panelY2.setPreferredSize(new Dimension(200, 100));
        panelY2.setBackground(Color.lightGray);
        panelY2.setLayout(new FlowLayout());

        JLabel labelY2 = new JLabel("Y2:");
        textFieldY2 = new JTextField(10);
        textFieldY2.setMaximumSize(textFieldY2.getPreferredSize());
        panelY2.add(labelY2);
        panelY2.add(textFieldY2);
        panel2.add(panelY2);

        panelX3 = new JPanel();
        panelX3.setPreferredSize(new Dimension(200, 100));
        panelX3.setBackground(Color.lightGray);
        panelX3.setLayout(new FlowLayout());

        JLabel labelX3 = new JLabel("X3:");
        textFieldX3 = new JTextField(10);
        textFieldX3.setMaximumSize(textFieldX3.getPreferredSize());
        panelX3.add(labelX3);
        panelX3.add(textFieldX3);
        panel2.add(panelX3);

        panelY3 = new JPanel();
        panelY3.setPreferredSize(new Dimension(200, 100));
        panelY3.setBackground(Color.lightGray);
        panelY3.setLayout(new FlowLayout());

        JLabel labelY3 = new JLabel("Y3:");
        textFieldY3 = new JTextField(10);
        textFieldY3.setMaximumSize(textFieldY3.getPreferredSize());
        panelY3.add(labelY3);
        panelY3.add(textFieldY3);
        panel2.add(panelY3);

        panelLargeur = new JPanel();
        panelLargeur.setPreferredSize(new Dimension(200, 100));
        panelLargeur.setBackground(Color.lightGray);
        panelLargeur.setLayout(new FlowLayout());

        JLabel labelLargeur = new JLabel("Largeur:");
        textFieldLargeur = new JTextField(10);
        textFieldLargeur.setMaximumSize(textFieldLargeur.getPreferredSize());
        panelLargeur.add(labelLargeur);
        panelLargeur.add(textFieldLargeur);
        panel2.add(panelLargeur);

        panelHauteur = new JPanel();
        panelHauteur.setPreferredSize(new Dimension(200, 100));
        panelHauteur.setBackground(Color.lightGray);
        panelHauteur.setLayout(new FlowLayout());

        JLabel labelHauteur = new JLabel("Hauteur:");
        textFieldHauteur = new JTextField(10);
        textFieldHauteur.setMaximumSize(textFieldHauteur.getPreferredSize());
        panelHauteur.add(labelHauteur);
        panelHauteur.add(textFieldHauteur);
        panel2.add(panelHauteur);

        panelRayon = new JPanel();
        panelRayon.setPreferredSize(new Dimension(200, 100));
        panelRayon.setBackground(Color.lightGray);
        panelRayon.setLayout(new FlowLayout());

        JLabel labelRayon = new JLabel("Rayon:");
        textFieldRayon = new JTextField(10);
        textFieldRayon.setMaximumSize(textFieldRayon.getPreferredSize());
        panelRayon.add(labelRayon);
        panelRayon.add(textFieldRayon);
        panel2.add(panelRayon);

        comboBox = new JComboBox();

        panel2.add(comboBox);

        JPanel panelSupression = new JPanel();
        panelSupression.setBackground(Color.lightGray);
        supprimerBouton = new JButton("Supprimer");
        panelSupression.add(supprimerBouton);
        panel2.add(panelSupression);

        JPanel panelOk = new JPanel();
        panelOk.setBackground(Color.lightGray);
        okButton = new JButton("OK");
        panelOk.add(okButton);
        panel2.add(panelOk);

        canvas = new VueCanvas();
        canvas.setBorder(BorderFactory.createBevelBorder(0));

        panel2.setVisible(false);

        Box.Filler glue = (Box.Filler) Box.createVerticalGlue();
        glue.changeShape(glue.getMinimumSize(),
                new Dimension(0, Short.MAX_VALUE),
                glue.getMaximumSize());
        panel2.add(glue);

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.EAST);
        frame.add(canvas);
        frame.setVisible(true);
    }

    public VueCanvas getCanvas() {
        return canvas;
    }

    public int getX1() {
        return !textFieldX1.getText().equals("") ? Integer.parseInt(textFieldX1.getText()) : 0;
    }

    public int getY1() {
        return !textFieldY1.getText().equals("") ? Integer.parseInt(textFieldY1.getText()) : 0;
    }

    public int getX2() {
        return !textFieldX2.getText().equals("") ? Integer.parseInt(textFieldX2.getText()) : 0;
    }

    public int getY2() {
        return !textFieldY2.getText().equals("") ? Integer.parseInt(textFieldY2.getText()) : 0;
    }

    public int getX3() {
        return !textFieldX3.getText().equals("") ? Integer.parseInt(textFieldX3.getText()) : 0;
    }

    public int getY3() {
        return !textFieldY3.getText().equals("") ? Integer.parseInt(textFieldY3.getText()) : 0;
    }

    public int getLargeur() {
        return !textFieldLargeur.getText().equals("") ? Integer.parseInt(textFieldLargeur.getText()) : 0;
    }

    public int getHauteur() {
        return !textFieldHauteur.getText().equals("") ? Integer.parseInt(textFieldHauteur.getText()) : 0;
    }

    public int getRayon() {
        return !textFieldRayon.getText().equals("") ? Integer.parseInt(textFieldRayon.getText()) : 0;
    }

    public BordureEnum getBordureEnum() {
        BordureEnum bordureEnum = BordureEnum.BORDURE;
        if (interieurSeulement.isSelected()) {
            bordureEnum = BordureEnum.INTERIEUR;
        } else if (interieurBordure.isSelected()) {
            bordureEnum = BordureEnum.BORDURE_INTERIEUR;
        }
        return bordureEnum;
    }

    public Color getCouleurBordure() {
        return couleurBordure;
    }

    public Color getCouleurInterieur() {
        return couleurInterieur;
    }

    public void ajouterAuComboBox(String nom) {
        this.comboBox.addItem(nom);
    }

    public void supprimerDuComboBox(int index){
        this.comboBox.removeItemAt(index);
    }

    public int getFormeIndex() {
        return comboBox.getSelectedIndex();
    }

    public void messageErreur(String message) {
        JOptionPane.showMessageDialog(frame, message);
    }

    public void addFormeEcouteur(ActionListener formeEcouteur, ActionListener selectionnerFormeEcouteur, ActionListener suppressionEcouteur, ActionListener supprimerEcouteur, ActionListener bordureEcouteur) {
        okButton.addActionListener(formeEcouteur);
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

    @Override
    public void actualisation(Observable observable) {
        FormeControleur formeControleur = (FormeControleur) observable;
        FormeEnum formeEnum = formeControleur.getFormeChoisie();
        BordureEnum bordureEnum = formeControleur.getBordureChoisie();
        if (formeControleur.isSuppression()) {
            panel2.setVisible(true);
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
            okButton.setVisible(false);
            comboBox.setVisible(true);
            supprimerBouton.setVisible(true);
        } else if (formeControleur.isCreation()){
            switch (formeEnum) {
                case CARRE -> {
                    panel2.setVisible(true);
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
                    okButton.setVisible(true);
                    comboBox.setVisible(false);
                    supprimerBouton.setVisible(false);
                }
                case CERCLE -> {
                    panel2.setVisible(true);
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
                    okButton.setVisible(true);
                    comboBox.setVisible(false);
                    supprimerBouton.setVisible(false);
                }
                case ELLIPSE, RECTANGLE -> {
                    panel2.setVisible(true);
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
                    okButton.setVisible(true);
                    comboBox.setVisible(false);
                    supprimerBouton.setVisible(false);
                }
                case LIGNE -> {
                    panel2.setVisible(true);
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
                    okButton.setVisible(true);
                    comboBox.setVisible(false);
                    supprimerBouton.setVisible(false);
                }
                case TRIANGLE -> {
                    panel2.setVisible(true);
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
                    okButton.setVisible(true);
                    comboBox.setVisible(false);
                    supprimerBouton.setVisible(false);
                }
            }
        } else {
            switch (bordureEnum){
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