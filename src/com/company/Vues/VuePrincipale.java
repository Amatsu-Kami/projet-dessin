package com.company.Vues;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VuePrincipale extends JFrame implements ActionListener {

    JButton couleurBordure;
    JButton couleurInterieur;

     public void afficher(){
         JFrame frame = new JFrame();
         frame.setTitle("Dessine moi un dessin");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(640,500);
         frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
         frame.setLayout(new BorderLayout());

         JPanel panel1 = new JPanel();
         panel1.setPreferredSize(new Dimension(1980,37));
         panel1.setBackground(Color.lightGray);
         panel1.setLayout(new FlowLayout());

         panel1.add(new JButton("Carré"));
         panel1.add(new JButton("Cercle"));
         panel1.add(new JButton("Ellipse"));
         panel1.add(new JButton("Ligne"));
         panel1.add(new JButton("Rectangle"));
         panel1.add(new JButton("Triangle"));

         JPanel panel2 = new JPanel();
         panel2.setPreferredSize(new Dimension(200,100));
         panel2.setBackground(Color.lightGray);
         panel2.setLayout(new FlowLayout());

         JRadioButton bordureSeulement = new JRadioButton("Contour seulement");
         JRadioButton interieurSeulement = new JRadioButton("Intérieur seulement");
         JRadioButton interieurBordure = new JRadioButton("Intérieur et contour");
         ButtonGroup bg = new ButtonGroup();
         bg.add(bordureSeulement);
         bg.add(interieurSeulement);
         bg.add(interieurBordure);

         panel2.add(bordureSeulement);
         panel2.add(interieurSeulement);
         panel2.add(interieurBordure);

         couleurBordure = new JButton("Couleur bordure");
         couleurBordure.addActionListener(e -> JColorChooser.showDialog(null, "Choisissez une couleur", Color.BLACK));
         couleurInterieur = new JButton("Couleur intérieur");
         couleurInterieur.addActionListener(e -> JColorChooser.showDialog(null, "Choisissez une couleur", Color.BLACK));

         panel2.add(couleurBordure);
         panel2.add(couleurInterieur);

         frame.add(panel1,BorderLayout.NORTH);
         frame.add(panel2,BorderLayout.EAST);
         frame.setVisible(true);
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==couleurBordure){
            JColorChooser colorChooser = new JColorChooser();

            Color color = JColorChooser.showDialog(null, "Choisie une couleur", Color.BLACK);
        } else if (e.getSource()==couleurInterieur){
            JColorChooser colorChooser = new JColorChooser();

            Color color = JColorChooser.showDialog(null, "Choisie une couleur", Color.BLACK);
        }
    }
}