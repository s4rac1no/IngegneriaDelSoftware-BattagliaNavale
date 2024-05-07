/**
 *  <<Entity>>
 *  Responsabilità: Modella l'entità Giocatore
 *  del gioco.
 */

package it.uniba.app;

/**
 * Classe che modella Giocatore.
 *
 * @author GruppoPatterson
 */
public class Giocatore {

  /** Attributo d'istanza contenente la grigliaGiocatore.  */
  private Griglia grigliaGiocatore;

  /** Attributo di classe contenente i diversi stati del gioco. */
  public enum Gioco { SCHERMATA_INIZIALE, GAME, WIN, GAMEOVER; }

  /** Attributo d'istanza che contiene un valore di enum. */
  private Gioco statoGioco;

  /**
   * Costruttore di Giocatore.
   */
  Giocatore() {
    setStatoGioco(Gioco.SCHERMATA_INIZIALE);
    grigliaGiocatore = new Griglia(Griglia.DIMENSIONI_GRIGLIA_DEFAULT);
  }

  /**
   * Metodo get per lo stato del gioco.
   *
   * @return Variabile contenente un valore appartenente all'enum Gioco
   */
  public Gioco getStatoGioco() {
    return statoGioco;
  }

  /**
   * Metodo set per lo stato del gioco.

   * @param statoGiocoInit variabile contenente
   *                       un valore appartenente all'enum Gioco.
   */
  public void setStatoGioco(final Gioco statoGiocoInit) {
    statoGioco = statoGiocoInit;
  }

  /**
   * Metodo d'istanza che ricrea la griglia
   * del giocatore con righe e colonne passati
   * come parametri.
   */
  public void modificaGrigliaPartita(final int dimensioniGriglia) {
    grigliaGiocatore.setGriglia(dimensioniGriglia);
  }

  /**
   * Metodo d'istanza get che da in output una cella della griglia
   * dati riga e colonna in input.
   * @param riga
   * @param colonna
   */
  public Cella getCellaGrigliaGiocatore(final int riga, final int colonna) {
    return grigliaGiocatore.getCella(riga, colonna);
  }

  /**
   * Metodo d'istanza get che da in output la griglia
   * del giocatore.
   */
  public Cella[][] getGrigliaGiocatore() {
    return grigliaGiocatore.getGriglia();
  }
}
