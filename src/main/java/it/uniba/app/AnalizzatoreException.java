/**
 * <<noECB>>
 */

package it.uniba.app;

/**
 * Classe che crea un eccezione personalizzata controllata.
 *
 * @author GruppoPatterson
 */
public class AnalizzatoreException extends Exception {

  /**
   * Costruttore di AnalizzatoreException.
   *
   * @param output String, messaggio che spiega l'invocazione della eccezione
   */
  AnalizzatoreException(final String output) {
    super(output);
  }
}
