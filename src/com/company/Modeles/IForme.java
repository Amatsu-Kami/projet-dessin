package com.company.Modeles;

import java.awt.*;

/**
 * Classe qui permet de dessiner une forme
 *
 * @version 1.0
 * @autor Christopher Caron
 * @since 1.0
 */
public interface IForme {
    /**
     * Permet de dessiner la forme
     *
     * @param graphiques attribut qui permet de créer la forme
     */
    void draw(Graphics graphiques);
}
