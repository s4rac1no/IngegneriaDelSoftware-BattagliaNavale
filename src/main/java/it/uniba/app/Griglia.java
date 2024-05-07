/**
 *  <<Entity>>
 *  Responsabilità: Modella l'entità Griglia
 *  del gioco.
 */

package it.uniba.app;

/**
 * Classe che modella Griglia.
 */
public class Griglia {

  /**
   *  Attributo d'istanza array multidimensionale.
   */
  private Cella[][] griglia;

  /**
   *  Attributo d'istanza che indica la dimensione della
   *  griglia in questione, che può essere defaul, large
   *  e extralarge.
   */
  private int dimensioniGriglia;

  /**
   * Attributo statico che contiene il numero
   * delle righe e delle colonne della griglia
   * di default.
   */
  public static final int DIMENSIONI_GRIGLIA_DEFAULT = 10;

  /**
   * Attributo statico che contiene il numero
   * delle righe e delle colonne della griglia
   * di large.
   */
  public static final int DIMENSIONI_GRIGLIA_LARGE = 18;

  /**
   * Attributo statico che contiene il numero
   * delle righe e delle colonne della griglia
   * di extralarge.
   */
  public static final int DIMENSIONI_GRIGLIA_EXTRALARGE = 26;
  /**
  * Costruttore di Griglia.
  */
  Griglia(final int dimensioniGrigliaInit) {
    dimensioniGriglia = dimensioniGrigliaInit;
    griglia = new Cella[dimensioniGriglia][dimensioniGriglia];

    for (short i = 0; i < griglia.length; i++) {
      for (short j = 0; j < griglia[i].length; j++) {
        griglia[i][j] = new Cella();
        griglia[i][j].setIcona(" ");
      }
    }
  }

  /**
   * Metodo d'istanza per il get di una cella
   * all'interno della griglia.
   *
   * @param riga riga della cella da ottenere
   * @param colonna colonna della cella da ottenere
   * @return cella nella posizione indicata in input
   */
  public Cella getCella(final int riga, final int colonna) {
    return griglia[riga][colonna];
  }

  /**
   * Metodo d'istanza per il get della griglia.
   *
   * @return griglia
   */
  public Cella[][] getGriglia() {
    return griglia.clone();
  }

  /**
   * Metodo d'istanza per il get della dimensione
   * della griglia.
   *
   * @return int, dimensioni della griglia
   */
  public int getDimensioniGriglia() {
    return dimensioniGriglia;
  }

  /**
   * Metodo d'istanza che ricrea la griglia con il
   * numero di righe e colonne passato nei parametri.
   *
   * @param dimensioniGrigliaInit dim di righe e colonne della griglia
   */
  public void setGriglia(final int dimensioniGrigliaInit) {
    dimensioniGriglia = dimensioniGrigliaInit;
    griglia = new Cella[dimensioniGrigliaInit][dimensioniGrigliaInit];

    for (short i = 0; i < griglia.length; i++) {
      for (short j = 0; j < griglia[i].length; j++) {
        griglia[i][j] = new Cella();
        griglia[i][j].setIcona(" ");
      }
    }
  }
}
