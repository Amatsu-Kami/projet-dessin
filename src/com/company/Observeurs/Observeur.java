package com.company.Observeurs;

/**
 * Classe qui permet de gérer les observeurs
 *
 * @version 1.0
 * @autor Christopher Caron
 * @since 1.0
 */
public interface Observeur {
    /**
     * Permet d'actualiser l'observable
     *
     * @param observable L'observable à actualiser
     */
    void actualisation(Observable observable);
}
