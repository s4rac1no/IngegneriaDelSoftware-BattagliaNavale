/**
 *  <<Entity>>
 *  Responsabilità: Modella l'entità cella
 *  della griglia.
 */

package it.uniba.app;

/**
 * Classe che modella la cella.
 *
 * @author GruppoPatterson
 */
public class Cella {

  /** Attributo d'istanza che indica lo stato della cella
   * true se occupata, false se non occupata.
   */
  private boolean stato;

  /** Attributo d'istanza che memorizza il carattere '⊠'
   * se occupata dalla nave, il carattere whitespace se non occupata.
   */
  private String icona;

  /**
   * Metodo d'istanza get dell'attributo stato.
   *
   * @return stato
   */
  public boolean getStato() {
    return stato;
  }

  /**
   * Metodo d'istanza get dell'attributo icona.
   *
   * @return icona
   */
  public String getIcona() {
    return icona;
  }

  /**
   * Metodo d'istanza set dell'attributo stato.
   *
   * @param statoCella boolean, true se la cella è occupata, false se libera
   */
  public void setStato(final boolean statoCella) {
    this.stato = statoCella;
  }

  /**
   * Metodo d'istanza set dell'attributo icona.
   *
   * @param iconaCella char, carattere nave se occupata, whitespace se libera
   */
  public void setIcona(final String iconaCella) {
    this.icona = iconaCella;
  }
}
