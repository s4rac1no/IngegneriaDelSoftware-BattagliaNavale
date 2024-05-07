/**
 *  <<Entity>>
 *  Responsabilità: Modella l'entità Portaerei,
 *  classe figlia di Nave.
 */

package it.uniba.app;

/**
 * Classe figlia di Nave che modella la Portaerei.
 *
 * @author GruppoPatterson
 */
public class Portaerei extends Nave {

  /**
   * Attributo di classe
   * che definisce il numero massimo
   * di portaerei.
   */
  private static final int MAX_PORTAEREI = 5;

  /**
   * Costruttore di Portaerei.
   */
  Portaerei() {
    setDimensione(MAX_PORTAEREI);
  }

}
