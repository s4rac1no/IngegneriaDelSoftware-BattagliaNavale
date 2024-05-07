/**
 * <<Control>>
 * Responsabilità: Controlla l'esecuzione parallela
 * di un thread che si occupa di gestire il tempo
 * di gioco.
 */

package it.uniba.app;

/**
 * Classe che modella il timer della partita.
 *
 * @author GruppoPatterson
 */
public class TimerPartita extends Thread {
    /**
     * Attributo d'istanza che contiene
     * il tempo rimanente.
     */
    private int tempoRimanente;

    /**
     * Attributo d'istanza che contiene
     * il tempo passato dall'avvio del timer.
     */
    private int tempoPassato;

    /**
     * Attributo statico che contiene il numero
     * del tempo di gioco di default.
     */
    public static final int TEMPO_GIOCO_DEFAULT = 15;

    /**
     * Attributo statico che contiene il max tempo
     * di gioco settabile.
     */
    public static final int MAX_TEMPO_GIOCO = 60;

    /**
     * Costruttore di TimerPartita.
     */
    TimerPartita() {
        tempoRimanente = TEMPO_GIOCO_DEFAULT;
    }

    /**
     * Metodo d'istanza set per l'attributo
     * tempoRimanente.
     *
     * @param tempoRimanenteDaSettare contiene il tempo di gioco
     * che si vuole settare
     */
    public void setTempoRimanente(final int tempoRimanenteDaSettare) {
        this.tempoRimanente = tempoRimanenteDaSettare;
    }

    /**
     * Metodo d'istanza get per l'attributo
     * tempoRimanente.
     *
     * @return tempoRimanente
     */
    public int getTempoRimanente() {
        return tempoRimanente;
    }

    /**
     * Metodo d'istanza get per l'attributo
     * tempoPassato.
     *
     * @return tempoRimanente
     */
    public int getTempoPassato() {
        return tempoPassato;
    }

    /**
     * Metodo d'istanza run che si avvia
     * allo start del thread.
     */
    @Override
    public void run() {
        final int sleepMillisecondi = 1000;
        final int numeroDiSecondiInUnMinuto = 60;
        tempoRimanente = tempoRimanente * numeroDiSecondiInUnMinuto;
        tempoPassato = 0;
        while (tempoRimanente > 0) {
            tempoPassato++;
            tempoRimanente--;

            try {
                Thread.sleep(sleepMillisecondi); // Attendi un secondo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
