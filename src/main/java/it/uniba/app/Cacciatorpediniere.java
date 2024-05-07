/**
 *  <<Entity>>
 *  Responsabilità: Modella l'entità Cacciatorpediniere,
 *  classe figlia di Nave.
 */

package it.uniba.app;

/**
 * Classe figlia di Nave che modella il Cacciatorpediniere.
 *
 * @author GruppoPatterson
 */
public class Cacciatorpediniere extends Nave {

  /**
   * Attributo di classe
   * che definisce il numero massimo
   * di Cacciatorpedinieri.
   */
  private static final int MAX_CACCIATORPEDINIERE = 2;

  /**
   * Costruttore di Cacciatorpediniere.
   */
  Cacciatorpediniere() {
    setDimensione(MAX_CACCIATORPEDINIERE);
  }

}
