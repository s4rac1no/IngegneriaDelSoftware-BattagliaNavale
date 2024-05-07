/**
 *  <<Entity>>
 *  Responsabilità: Modella l'entità Incrociatore,
 *  classe figlia di Nave.
 */

package it.uniba.app;

/**
 * Classe figlia di Nave che modella l' Incrociatore.
 *
 * @author GruppoPatterson
 */
public class Incrociatore extends Nave {

  /**
   * Attributo di classe
   * che definisce il numero massimo
   * d'incrociatori.
   */
  private static final int MAX_INCROCIATORE = 3;

  /**
   * Costruttore d'incrociatore.
   */
  Incrociatore() {
    setDimensione(MAX_INCROCIATORE);
  }

}
