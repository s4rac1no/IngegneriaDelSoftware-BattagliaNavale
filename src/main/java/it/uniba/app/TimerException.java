/**
 * <<noECB>>
 */

package it.uniba.app;

/**
 * Classe che crea un eccezione personalizzata controllata.
 *
 * @author GruppoPatterson
 */
public class TimerException extends Exception {

    /**
     * Costruttore di TimerException.
     *
     * @param output String, messaggio che spiega l'invocazione della eccezione
     */
    TimerException(final String output) {
        super(output);
    }
}
