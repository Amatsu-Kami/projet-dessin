package com.company.Vues;

import com.company.Modeles.IForme;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class VueCanvas extends JPanel {
    public List<IForme> formes = new LinkedList<>();


    public void paint(Graphics graphiques){
        super.paint(graphiques);
        for (IForme forme : formes) {
            forme.draw(graphiques);
        }
    }

    public void ajouterForme(IForme forme){
        formes.add(forme);
        repaint();
    }

    public void supprimerForme(IForme forme){
        formes.remove(forme);
        repaint();
    }
}
