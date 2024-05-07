/**
 *  <<Entity>>
 *  Responsabilità: Modella l'entità Corazzata,
 *  classe figlia di Nave.
 */

package it.uniba.app;

/**
 * Classe figlia di Nave che modella la Corazzata.
 *
 * @author GruppoPatterson
 */
public class Corazzata extends Nave {

  /**
   * Attributo di classe
   * che definisce il numero massimo
   * di corazzate.
   */
  private static final int MAX_CORAZZATA = 4;

  /**
   * Costruttore di Corazzata.
   */
  Corazzata() {
    setDimensione(MAX_CORAZZATA);
  }

}

