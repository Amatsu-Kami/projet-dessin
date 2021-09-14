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
         frame.setTitle("Fait moi un dessin");
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
         panel2.setLayout(new GridLayout(15,1));

         JRadioButton bordureSeulement = new JRadioButton("Contour seulement");
         bordureSeulement.setBackground(Color.lightGray);
         JRadioButton interieurSeulement = new JRadioButton("Intérieur seulement");
         interieurSeulement.setBackground(Color.lightGray);
         JRadioButton interieurBordure = new JRadioButton("Intérieur et contour");
         interieurBordure.setBackground(Color.lightGray);
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

         JPanel panelx1 = new JPanel();
         panelx1.setPreferredSize(new Dimension(200,100));
         panelx1.setBackground(Color.lightGray);
         panelx1.setLayout(new FlowLayout());

         JLabel labelx1 = new JLabel("X1:");
         JTextField textFieldx1 = new JTextField();
         textFieldx1.setPreferredSize(new Dimension(160, 35));
         panelx1.add(labelx1);
         panelx1.add(textFieldx1);
         panel2.add(panelx1);

         JPanel panely1 = new JPanel();
         panely1.setPreferredSize(new Dimension(200,100));
         panely1.setBackground(Color.lightGray);
         panely1.setLayout(new FlowLayout());

         JLabel labely1 = new JLabel("Y1:");
         JTextField textFieldy1 = new JTextField();
         textFieldy1.setPreferredSize(new Dimension(160, 35));
         panely1.add(labely1);
         panely1.add(textFieldy1);
         panel2.add(panely1);

         JPanel panelx2 = new JPanel();
         panelx2.setPreferredSize(new Dimension(200,100));
         panelx2.setBackground(Color.lightGray);
         panelx2.setLayout(new FlowLayout());

         JLabel labelx2 = new JLabel("X2:");
         JTextField textFieldx2 = new JTextField();
         textFieldx2.setPreferredSize(new Dimension(160, 35));
         panelx2.add(labelx2);
         panelx2.add(textFieldx2);
         panel2.add(panelx2);

         JPanel panely2 = new JPanel();
         panely2.setPreferredSize(new Dimension(200,100));
         panely2.setBackground(Color.lightGray);
         panely2.setLayout(new FlowLayout());

         JLabel labely2 = new JLabel("Y2:");
         JTextField textFieldy2 = new JTextField();
         textFieldy2.setPreferredSize(new Dimension(160, 35));
         panely2.add(labely2);
         panely2.add(textFieldy2);
         panel2.add(panely2);

         JPanel panelx3 = new JPanel();
         panelx3.setPreferredSize(new Dimension(200,100));
         panelx3.setBackground(Color.lightGray);
         panelx3.setLayout(new FlowLayout());

         JLabel labelx3 = new JLabel("X3:");
         JTextField textFieldx3 = new JTextField();
         textFieldx3.setPreferredSize(new Dimension(160, 35));
         panelx3.add(labelx3);
         panelx3.add(textFieldx3);
         panel2.add(panelx3);

         JPanel panely3 = new JPanel();
         panely3.setPreferredSize(new Dimension(200,100));
         panely3.setBackground(Color.lightGray);
         panely3.setLayout(new FlowLayout());

         JLabel labely3 = new JLabel("Y3:");
         JTextField textFieldy3 = new JTextField();
         textFieldy3.setPreferredSize(new Dimension(160, 35));
         panely3.add(labely3);
         panely3.add(textFieldy3);
         panel2.add(panely3);

         JPanel panellargeur = new JPanel();
         panellargeur.setPreferredSize(new Dimension(200,100));
         panellargeur.setBackground(Color.lightGray);
         panellargeur.setLayout(new FlowLayout());

         JLabel labellargeur = new JLabel("Largeur:");
         JTextField textFieldlargeur = new JTextField();
         textFieldlargeur.setPreferredSize(new Dimension(140, 35));
         panellargeur.add(labellargeur);
         panellargeur.add(textFieldlargeur);
         panel2.add(panellargeur);

         JPanel panelhauteur = new JPanel();
         panelhauteur.setPreferredSize(new Dimension(200,100));
         panelhauteur.setBackground(Color.lightGray);
         panelhauteur.setLayout(new FlowLayout());

         JLabel labelhauteur = new JLabel("Hauteur:");
         JTextField textFieldhauteur= new JTextField();
         textFieldhauteur.setPreferredSize(new Dimension(140, 35));
         panelhauteur.add(labelhauteur);
         panelhauteur.add(textFieldhauteur);
         panel2.add(panelhauteur);

         JPanel panelrayon = new JPanel();
         panelrayon.setPreferredSize(new Dimension(200,100));
         panelrayon.setBackground(Color.lightGray);
         panelrayon.setLayout(new FlowLayout());

         JLabel labelrayon = new JLabel("Rayon:");
         JTextField textFieldrayon = new JTextField();
         textFieldrayon.setPreferredSize(new Dimension(145, 35));
         panelrayon.add(labelrayon);
         panelrayon.add(textFieldrayon);
         panel2.add(panelrayon);

         JButton ok = new JButton("OK");
         panel2.add(ok);

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