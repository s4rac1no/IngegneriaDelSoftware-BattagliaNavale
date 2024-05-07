/**
 *  <<Entity>>
 *  Responsabilità: Modella l'entità Nave,
 *  classe padre di Incrociatore, Cacciatorpediniere,
 *  Portaerei e Corazzata.
 */

package it.uniba.app;

/**
 * Classe che modella Nave.
 *
 * @author GruppoPatterson
 */
public abstract class Nave {

  /**
   * Attributo d'istanza che indica la dimensione
   * in termini di celle.
   */
  private int dimensione; // Indica la dimensione in termini di celle

  /**
   * Attributo d'istanza che indica il posizionamento
   * della nave, 0 verticale/1 orizzontale.
   */
  private boolean posizionamento; // 0 verticale, 1 orizzontale

  /**
   * Attributo d'istanza che indica
   * la posizione della riga iniziale della nave
   * nella griglia.
   */
  private int posizioneRigaIniziale;

  /**
   * Attributo d'istanza che indica
   * la posizione colonna iniziale della nave
   * nella griglia.
   */
  private int posizioneColonnaIniziale;

  /**
   * Attributo d'istanza che indica
   * la posizione riga finale della nave
   * nella griglia.
   */
  private int posizioneRigaFinale;

  /**
   * Attributo d'istanza che indica
   * la posizione colonna finale della nave
   * nella griglia.
   */
  private int posizioneColonnaFinale;

  /**
   * Metodo d'istanza
   * set per l'attributo dimensione.
   *
   * @param dimensioneNave contiene la dimensione
   *                       nave
   */
  public void setDimensione(final int dimensioneNave) {
    this.dimensione = dimensioneNave;
  }

  /**
   * Metodo d'istanza
   * get per l'attributo dimensione.
   *
   * @return dimensione
   */
  public int getDimensione() {
    return dimensione;
  }

  /**
   * Metodo d'istanza
   * set per l'attributo posizionamento.
   *
   * @param posizionamentoNave per aggiungere
   *                           la nave verticalmente
   *                           o orizzontalmente sulla griglia
   */
  public void setPosizionamento(final boolean posizionamentoNave) {
    this.posizionamento = posizionamentoNave;
  }

  /**
   * Metodo d'istanza
   * get per l'attributo posizionamento.
   *
   * @return posizionamento
   */
  public boolean getPosizionamento() {
    return posizionamento;
  }

  /**
   * Metodo d'istanza
   * set per l'attributo posizioneRigaIniziale.
   *
   * @param posizioneRigaInizialeNave imposta la
   *                                  riga iniziale nave
   */
  public void setPosizioneRigaIniziale(final int posizioneRigaInizialeNave) {
    this.posizioneRigaIniziale = posizioneRigaInizialeNave;
  }

  /**
   * Metodo d'istanza
   * set per l'attributo posizioneColonnaIniziale.
   *
   * @param posizioneColonnaInizialeNave imposta la
   *                                     colonna iniziale nave
   */
  public void setPosizioneColonnaIniziale(
          final int posizioneColonnaInizialeNave) {
    this.posizioneColonnaIniziale = posizioneColonnaInizialeNave;
  }

  /**
   * Metodo d'istanza
   * set per l'attributo posizioneRigaFinale.
   *
   * @param posizioneRigaFinaleNave imposta la
   *                                riga finale nave
   */
  public void setPosizioneRigaFinale(final int posizioneRigaFinaleNave) {
    this.posizioneRigaFinale = posizioneRigaFinaleNave;
  }

  /**
   * Metodo d'istanza
   * set per l'attributo posizioneColonnaFinale.
   *
   * @param posizioneColonnaFinaleNave imposta la
   *                                   colonna finale nave
   **/
  public void setPosizioneColonnaFinale(final int posizioneColonnaFinaleNave) {
    this.posizioneColonnaFinale = posizioneColonnaFinaleNave;
  }

  /**
   * Metodo d'istanza
   * get per l'attributo posizioneColonnaFinale.
   *
   * @return posizioneColonnaFinale
   **/
  public int getPosizioneColonnaFinale() {
    return posizioneColonnaFinale;
  }

  /**
   * Metodo d'istanza
   * get per l'attributo posizioneColonnaIniziale.
   *
   * @return posizioneColonnaIniziale
   **/
  public int getPosizioneColonnaIniziale() {
    return posizioneColonnaIniziale;
  }

  /**
   * Metodo d'istanza
   * get per l'attributo posizioneRigaIniziale.
   *
   * @return posizioneRigaIniziale
   **/
  public int getPosizioneRigaIniziale() {
    return posizioneRigaIniziale;
  }

  /**
   * Metodo d'istanza
   * get per l'attributo posizioneRigaFinale.
   *
   * @return posizioneRigaFinale
   **/
  public int getPosizioneRigaFinale() {
    return posizioneRigaFinale;
  }

  /**
   * Metodo d'istanza che si occupa di verificare
   * se la nave è affondata o meno.
   *
   * @return true se affondato, false se non affondato
   */
  public boolean isAffondata() {
    if (getDimensione() == 0) {
      return true;
    }
    return false;
  }

  /**
   * Metodo d'istanza che si occupa di decrementare
   * la dimensione della nave.
   */
  public void decrementaDimensione() {
    dimensione--;
  }
}
