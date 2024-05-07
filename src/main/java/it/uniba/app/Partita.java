/**
 *  <<Entity>>
 *  Responsabilità: Modella l'entità Partita
 *  del gioco.
 */

package it.uniba.app;

import java.util.Random;

/**
 * Classe che modella Partita.
 *
 * @author GruppoPatterson
 */
public class Partita {

  /**
   * Attributo d'istanza che contiene la griglia della partita.
   */
  private Griglia grigliaPartita;

  /**
   * Attributo d'istanza che contiene i tentativi effettuati.
   */
  private int tentativiEffettuati;

  /**
   * Attributo d'istanza che contiene i tentativi falliti effettuati.
   */
  private int tentativiFalliti;

  /**
   * Attributo d'istanza che contiene i max tentativi falliti per gameover.
   */
  private int maxTentativiFalliti;

  /**
   * Attributo d'istanza che contiene il
   * nome della difficoltà di gioco scelta,
   * facile, medio, difficile.
   */
  private String livelloDiGioco;

  /**
   * Attributo d'istanza che gestisce il
   * thread del timer della partita.
   */
  private TimerPartita timerPartita;

  /**
   * Attributo di classe che contiene
   * il numero di navi complessivo.
   */
  public static final int NUM_NAVI = 10;

  /**
   * Attributo d'istanza che contiene
   * le istanze delle navi della partita.
   */
  private Nave[] navi;

  /**
   * Attributo d'istanza che contiene
   * il numero di Cacciatorpedinieri
   * non affondati rimanenti nella partita.
   */
  private int numCacciatorpedinieri;

  /**
   * Attributo d'istanza che contiene
   * il numero d'incrociatori non affondati
   * rimanenti nella partita.
   */
  private int numIncrociatori;

  /**
   * Attributo d'istanza che contiene
   * il numero di Corazzate non affondate
   * rimanenti nella partita.
   */
  private int numCorazzate;

  /**
   * Attributo d'istanza che contiene
   * il numero di Portaerei non affondati
   * rimanenti nella partita.
   */
  private int numPortaerei;

  /**
   * Attributo statico che contiene il numero
   * dei tentativi falliti per il comando facile per
   * la griglia standard.
   */
  public static final int NUM_TENTATIVI_FACILE_STANDARD = 50;

  /**
   * Attributo statico che contiene il numero
   * dei tentativi falliti per il comando facile per
   * la griglia large.
   */
  public static final int NUM_TENTATIVI_FACILE_LARGE = 250;

  /**
   * Attributo statico che contiene il numero
   * dei tentativi falliti per il comando facile per
   * la griglia extralarge.
   */
  public static final int NUM_TENTATIVI_FACILE_EXTRALARGE = 525;

  /**
   * Attributo statico che contiene il numero
   * dei tentativi falliti per il comando medio per
   * la griglia standard.
   */
  public static final int NUM_TENTATIVI_MEDIO_STANDARD = 30;

  /**
   * Attributo statico che contiene il numero
   * dei tentativi falliti per il comando medio per
   * la griglia large.
   */
  public static final int NUM_TENTATIVI_MEDIO_LARGE = 150;

  /**
   * Attributo statico che contiene il numero
   * dei tentativi falliti per il comando medio per
   * la griglia extralarge.
   */
  public static final int NUM_TENTATIVI_MEDIO_EXTRALARGE = 300;

  /**
   * Attributo statico che contiene il numero
   * dei tentativi falliti per il comando difficile per
   * la griglia standard.
   */
  public static final int NUM_TENTATIVI_DIFFICILE_STANDARD = 10;

  /**
   * Attributo statico che contiene il numero
   * dei tentativi falliti per il comando difficile per
   * la griglia large.
   */
  public static final int NUM_TENTATIVI_DIFFICILE_LARGE = 50;

  /**
   * Attributo statico che contiene il numero
   * dei tentativi falliti per il comando difficile per
   * la griglia extralarge.
   */
  public static final int NUM_TENTATIVI_DIFFICILE_EXTRALARGE = 100;

  /**
   * Attributo statico che contiene il numero
   * max dei tentativi falliti settabili per
   * la griglia standard.
   */
  public static final int MAX_TENTATIVI_STANDARD = 70;

  /**
   * Attributo statico che contiene il numero
   * max dei tentativi falliti settabili per
   * la griglia large.
   */
  public static final int MAX_TENTATIVI_LARGE = 294;

  /**
   * Attributo statico che contiene il numero
   * max dei tentativi falliti settabili per
   * la griglia extralarge.
   */
  public static final int MAX_TENTATIVI_EXTRALARGE = 646;

  /**
   * Attributo d'istanza per la
   * generazione di numeri casuali.
   */
  private final Random random;

  /**
   * Costruttore di Partita.
   */
  Partita() {
    livelloDiGioco = "Facile";
    maxTentativiFalliti = NUM_TENTATIVI_FACILE_STANDARD;
    tentativiFalliti = 0;
    tentativiEffettuati = 0;

    final int numEsemplare0 = 0;
    final int numEsemplare1 = 1;
    final int numEsemplare2 = 2;
    final int numEsemplare3 = 3;
    final int numEsemplare4 = 4;
    final int numEsemplare5 = 5;
    final int numEsemplare6 = 6;
    final int numEsemplare7 = 7;
    final int numEsemplare8 = 8;
    final int numEsemplare9 = 9;

    timerPartita = new TimerPartita();
    random = new Random();
    grigliaPartita = new Griglia(Griglia.DIMENSIONI_GRIGLIA_DEFAULT);
    navi = new Nave[NUM_NAVI];

    numCacciatorpedinieri = 0;
    numIncrociatori = 0;
    numCorazzate = 0;
    numPortaerei = 0;

    navi[numEsemplare0] = new Cacciatorpediniere();
    navi[numEsemplare1] = new Cacciatorpediniere();
    navi[numEsemplare2] = new Cacciatorpediniere();
    navi[numEsemplare3] = new Cacciatorpediniere();
    navi[numEsemplare4] = new Incrociatore();
    navi[numEsemplare5] = new Incrociatore();
    navi[numEsemplare6] = new Incrociatore();
    navi[numEsemplare7] = new Corazzata();
    navi[numEsemplare8] = new Corazzata();
    navi[numEsemplare9] = new Portaerei();

  }

  /**
   * Metodo d'istanza get per l'attributo
   * numCacciatorpedinieri.
   *
   * @return numCacciatorpedinieri
   */
  public int getNumCacciatorpedinieri() {
    return numCacciatorpedinieri;
  }

  /**
   * Metodo d'istanza get per l'attributo
   * numCorazzate.
   *
   * @return numCorazzate
   */
  public int getNumCorazzate() {
    return numCorazzate;
  }

  /**
   * Metodo d'istanza get per l'attributo
   * numPortaerei.
   *
   * @return numPortaerei
   */
  public int getNumPortaerei() {
    return numPortaerei;
  }

  /**
   * Metodo d'istanza get per l'attributo
   * numIncrociatori.
   *
   * @return numIncrociatori
   */
  public int getNumIncrociatori() {
    return numIncrociatori;
  }

  /**
   * Metodo d'istanza che si occupa
   * del conteggio del numero di navi
   * dinamicamente in una partita.
   */
  public void setNumeroNaviCorrenti() {

    numCacciatorpedinieri = 0;
    numIncrociatori = 0;
    numCorazzate = 0;
    numPortaerei = 0;

    for (int i = 0; i < NUM_NAVI; i++) {
      if (navi[i] instanceof Cacciatorpediniere && !navi[i].isAffondata()) {
        numCacciatorpedinieri++;
      } else if (navi[i] instanceof Incrociatore && !navi[i].isAffondata()) {
        numIncrociatori++;
      } else if (navi[i] instanceof Corazzata && !navi[i].isAffondata()) {
        numCorazzate++;
      } else if (navi[i] instanceof Portaerei && !navi[i].isAffondata()) {
        numPortaerei++;
      }
    }
  }

  /**
   * Metodo d'istanza che ricrea la griglia
   * della partita con righe e colonne passati
   * come parametri.
   */
  public void modificaGrigliaPartita(final int dimensioniGriglia) {
    grigliaPartita.setGriglia(dimensioniGriglia);
  }

  /**
   * Metodo d'istanza set per l'attributo
   * maxTentativiFalliti.
   *
   * @param tentativiFallitiInit contiene il numero
   *                            dei tentativi falliti
   */
  public void setMaxTentativiFalliti(final int tentativiFallitiInit) {
    this.maxTentativiFalliti = tentativiFallitiInit;
  }

  /**
   * Metodo d'istanza set per l'attributo
   * livelloDiGioco.
   *
   * @param livelloGioco contiene il livello di gioco
   */
  public void setLivelloDiGioco(final String livelloGioco) {
    this.livelloDiGioco = livelloGioco;
  }

  /**
   * Metodo d'istanza get per l'attributo
   * livelloDiGioco.
   *
   * @return livelloDiGioco
   */
  public String getLivelloDiGioco() {
    return livelloDiGioco;
  }

  /**
   * Metodo d'istanza che si occupa di posizionare
   * le navi in verticale.
   *
   * @param nave nave posizione verticale
   */
  private void posizionamentoVerticale(final Nave nave, final int maxRandom) {

    boolean navePosizionata;
    int contatoreCelleLibere;
    int rigaRandom;
    int colonnaRandom;

    navePosizionata = false;
    while (!navePosizionata) {

      rigaRandom = random.nextInt(maxRandom);
      colonnaRandom = random.nextInt(maxRandom);

      // Controllo l'inserimento della nave dal basso verso l'alto
      if (rigaRandom < nave.getDimensione() - 1) {
        while (rigaRandom < nave.getDimensione() - 1) {
          rigaRandom = random.nextInt(maxRandom);
        }
      }

      // Tentativo d'inserimento della nave dal basso verso l'alto
      contatoreCelleLibere = 0;
      for (int i = 0; i < nave.getDimensione(); i++) {
        if (!grigliaPartita.getCella(rigaRandom - i,
                colonnaRandom).getStato()) {
          contatoreCelleLibere++;
        }
      }

      // Inserimento nave dal basso verso l'alto
      if (contatoreCelleLibere
              == nave.getDimensione()) { //ControlloAvvieneConSuccesso
        navePosizionata = true;

        nave.setPosizioneColonnaIniziale(colonnaRandom);
        nave.setPosizioneColonnaFinale(colonnaRandom);
        nave.setPosizioneRigaFinale(rigaRandom);

        int i = 0;
        for (i = 0; i < nave.getDimensione(); i++) {
          grigliaPartita.getCella(rigaRandom - i,
                  colonnaRandom).setStato(true);
          grigliaPartita.getCella(rigaRandom - i,
                  colonnaRandom).setIcona("⊠");
        }

        nave.setPosizioneRigaIniziale(rigaRandom - i + 1);
      }

      // Se non è possibile posizionare la nave dal basso verso l'alto,
      // provo dal alto verso il basso
      if (!navePosizionata) {

        // Controllo l'inserimento della nave dall'alto verso il basso
        if (rigaRandom > maxRandom - nave.getDimensione() - 1) {
          while (rigaRandom > maxRandom - nave.getDimensione() - 1) {
            rigaRandom = random.nextInt(maxRandom);
          }
        }

        // Tentativo d'inserimento della nave dall'alto verso il basso
        contatoreCelleLibere = 0;
        for (int i = 0; i < nave.getDimensione(); i++) {
          if (!grigliaPartita.getCella(rigaRandom + i,
                  colonnaRandom).getStato()) {
            contatoreCelleLibere++;
          }
        }

        // Inserimento della nave dall'alto verso il basso
        if (contatoreCelleLibere == nave.getDimensione()) {
          navePosizionata = true;

          nave.setPosizioneColonnaIniziale(colonnaRandom);
          nave.setPosizioneColonnaFinale(colonnaRandom);
          nave.setPosizioneRigaIniziale(rigaRandom);

          int i = 0;
          for (i = 0; i < nave.getDimensione(); i++) {
            grigliaPartita.getCella(rigaRandom + i,
                    colonnaRandom).setStato(true);
            grigliaPartita.getCella(rigaRandom + i,
                    colonnaRandom).setIcona("⊠");
          }

          nave.setPosizioneRigaFinale(rigaRandom + i - 1);
        }
      }
    }
  }

  /**
   * Metodo d'istanza che si occupa
   * di posizionare
   * le navi in orizzontale.
   *
   * @param nave nave in posizione orizzontale
   */
  private void posizionamentoOrizzontale(final Nave nave, final int maxRandom) {
    boolean navePosizionata;
    int contatoreCelleLibere;
    int rigaRandom;
    int colonnaRandom;

    navePosizionata = false;
    while (!navePosizionata) {
      rigaRandom = random.nextInt(maxRandom);
      colonnaRandom = random.nextInt(maxRandom);

      // Controllo l'inserimento della nave da sinistra verso destra
      if (colonnaRandom > maxRandom - nave.getDimensione() - 1) {
        while (colonnaRandom > maxRandom - nave.getDimensione() - 1) {
          colonnaRandom = random.nextInt(maxRandom);
        }
      }

      // Tentativo d'inserimento della nave da sinistra verso destra
      contatoreCelleLibere = 0;
      for (int i = 0; i < nave.getDimensione(); i++) {
        if (!grigliaPartita.getCella(rigaRandom,
                colonnaRandom + i).getStato()) {
          contatoreCelleLibere++;
        }
      }

      // Inserimento della nave da sinistra verso destra
      if (contatoreCelleLibere == nave.getDimensione()) {
        navePosizionata = true;

        nave.setPosizioneRigaIniziale(rigaRandom);
        nave.setPosizioneRigaFinale(rigaRandom);
        nave.setPosizioneColonnaIniziale(colonnaRandom);

        int i;
        for (i = 0; i < nave.getDimensione(); i++) {
          grigliaPartita.getCella(rigaRandom,
                  colonnaRandom + i).setStato(true);
          grigliaPartita.getCella(rigaRandom,
                  colonnaRandom + i).setIcona("⊠");
        }

        nave.setPosizioneColonnaFinale(colonnaRandom + i - 1);
      }

      if (!navePosizionata) {

        // Controllo l'inserimento della nave da destra verso sinistra
        if (colonnaRandom < nave.getDimensione() - 1) {
          while (colonnaRandom < nave.getDimensione() - 1) {
            colonnaRandom = random.nextInt(maxRandom);
          }
        }

        // Tentativo d'inserimento della nave da destra verso sinistra
        contatoreCelleLibere = 0;
        for (int i = 0; i < nave.getDimensione() - 1; i++) {
          if (!grigliaPartita.getCella(rigaRandom,
                  colonnaRandom - i).getStato()) {
            contatoreCelleLibere++;
          }
        }

        // Inserimento della nave da destra verso sinistra
        if (contatoreCelleLibere == nave.getDimensione()) {
          navePosizionata = true;

          nave.setPosizioneRigaIniziale(rigaRandom);
          nave.setPosizioneRigaFinale(rigaRandom);
          nave.setPosizioneColonnaFinale(colonnaRandom);

          int i;
          for (i = 0; i < nave.getDimensione(); i++) {
            grigliaPartita.getCella(rigaRandom,
                    colonnaRandom - i).setStato(true);
            grigliaPartita.getCella(rigaRandom,
                    colonnaRandom - i).setIcona("⊠");
          }

          nave.setPosizioneColonnaIniziale(colonnaRandom - i - 1);
        }
      }
    }
  }

  /**
   * Metodo d'istanza che si occupa d'inserire
   * le navi nella griglia randomicamente
   * in posizione verticale/orizzontale.
   */
  public void inserimentoNavi() {
    for (int i = 0; i < NUM_NAVI; i++) {
      navi[i].setPosizionamento(random.nextBoolean());
      if (!navi[i].getPosizionamento()) {
        posizionamentoVerticale(navi[i], grigliaPartita.getDimensioniGriglia() - 1);
      } else {
        posizionamentoOrizzontale(navi[i], grigliaPartita.getDimensioniGriglia() - 1);
      }
    }
  }

  /**
   * Metodo d'istanza che avvia il thread del timer
   * del gioco.
   */
  public void startTimer() {
    timerPartita.start();
  }

  /**
   * Metodo d'istanza get per lo stato del tempo di gioco rimanente.
   * @return tempoRimanente
   */
  public int getTempoRimanente() {
     return timerPartita.getTempoRimanente();
  }

  /**
   * Metodo d'istanza set per lo stato del tempo di gioco.
   *
   * @param tempoDiGioco variabile contenente il tempo di gioco
   * da settare
   */
  public void setTempoDiGioco(final int tempoDiGioco) {
    timerPartita.setTempoRimanente(tempoDiGioco);
  }

  /**
   * Metodo d'istanza get per una cella della griglia partita dati
   * riga e colonna in input.
   *
   * @param riga
   * @param colonna
   * @return Cella, cella desiderata
   */
  public Cella getCellaGrigliaPartita(final int riga, final int colonna) {
    return grigliaPartita.getCella(riga, colonna);
  }

  /**
   * Metodo d'istanza get per i tentativi effettuati.
   *
   * @return tentativiEffettuati
   */
  public int getTentativiEffettuati() {
    return tentativiEffettuati;
  }

  /**
   * Metodo d'istanza set per i tentativi effettuati.
   *
   * @param tentativiEffettuatiInit
   */
  public void setTentativiEffettuati(final int tentativiEffettuatiInit) {
    this.tentativiEffettuati = tentativiEffettuatiInit;
  }

  /**
   * Metodo d'istanza per incrementare i tentativi effettuati.
   *
   */
  public void incrementaTentativiEffettuati() {
    tentativiEffettuati++;
  }

  /**
   * Metodo d'istanza per incrementare i tentativi falliti.
   *
   */
  public void incrementaTentativiFalliti() {
    tentativiFalliti++;
  }

  /**
   * Metodo d'istanza get per i max tentativi effettuati.
   *
   * @return maxTentativiEffettuati
   */
  public int getMaxTentativiFalliti() {
    return maxTentativiFalliti; }

  /**
   * Metodo d'istanza get che da un output una nave
   * data la posizione in input.
   * @param posizione
   * @return Nave
   */
  public Nave getNave(final int posizione) {
    return navi[posizione];
  }

  /**
   * Metodo d'istanza get per tentativi falliti.
   *
   * @return tentativiFalliti
   */
  public int getTentativiFalliti() {
    return tentativiFalliti;
  }

  /**
   * Metodo d'istanza che converte il tempo passato
   * da secondi a minuti.
   *
   * @return int, tempoPassato in minuti
   */
  public int getTempoPassatoInMinuti() {
    final int numeroDiSecondiInUnMinuto = 60;
    return timerPartita.getTempoPassato() / numeroDiSecondiInUnMinuto;
  }

  /**
   * Metodo d'istanza get che da in output la griglia
   * della partita.
   */
  public Cella[][] getGrigliaPartita() {
    return grigliaPartita.getGriglia();
  }

  /**
   * Metodo d'istanza che da in output i secondi del minuto
   * corrente di tempo passato.
   *
   * @return int, secondi del minuto corrente
   */
  public int getTempoPassatoInSecondi() {
    final int numeroDiSecondiInUnMinuto = 60;
    return timerPartita.getTempoPassato() % numeroDiSecondiInUnMinuto;
  }

  /**
   * Metodo d'istanza che da in output i secondi del minuto
   * corrente di tempo disponibile.
   *
   * @return int, secondi del minuto corrente
   */
  public int getTempoDisponibileInSecondi() {
    final int numeroDiSecondiInUnMinuto = 60;
    return timerPartita.getTempoRimanente() % numeroDiSecondiInUnMinuto;
  }

  /**
   * Metodo d'istanza che converte il tempo disponibile
   * da secondi a minuti.
   *
   * @return int, tempoDisponibile in minuti
   */
  public int getTempoDisponibileInMinuti() {
    final int numeroDiSecondiInUnMinuto = 60;
    return timerPartita.getTempoRimanente() / numeroDiSecondiInUnMinuto;
  }

  /**
   * Metodo d'istanza get per dare in la dimensione della
   * griglia della partita.
   *
   * @return int, tempoPassato in minuti
   */
  public int getDimensioneGrigliaPartita() {
    return grigliaPartita.getDimensioniGriglia();
  }

  /**
   * Metodo d'istanza che si occupa di verificare
   * se tutte le navi sono state affondate.
   *
   * @return boolean, true se affondate, false se almeno
   * una non è affondata
   */
  public boolean verificaVittoria() {
    for (int i = 0; i < navi.length; i++) {
      if (!navi[i].isAffondata()) {
        return false;
      }
    }

    return true;
  }
}
