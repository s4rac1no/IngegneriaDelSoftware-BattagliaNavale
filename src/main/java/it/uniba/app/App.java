/**
 * <<Control>>
 * Responsabilità: Controlla il comportamento
 * dell'applicazione nella schermata principale
 * del gioco.
 */


package it.uniba.app;

/**
 * Classe main dell'applicazione.
 *
 * @author GruppoPatterson
 */
public final class App {

  private Partita partita;
  private Giocatore giocatore;
  private Comandi comandi;
  private Analizzatore analizzatore;

  /**
   * Costruttore di App.
   */
  private App() {
    partita = new Partita();
    giocatore = new Giocatore();
    comandi = new Comandi();
    analizzatore = new Analizzatore();
  }

  /**
    * Punto d'ingresso dell'applicazione.
    *
    * @param args command line arguments
    */
  public static void main(final String[] args) {
    App app = new App();
    GestioneStampa.stampareTitoloGioco();
    if (args.length != 0) {
      if (args[0].equals("--help") || args[0].equals("-h")) {
        Comandi.help();
      } else {
        GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                + "Battaglia Navale: "
                + GestioneStampa.ANSI_RESET + "Flag di avvio non riconosciuto! \n\n");
      }
    }

    app.schermataPrincipale();
  }

  /**
   * Metodo d'istanza che si occupa di controllare la
   * schermata principale del gioco.
   */
  public void schermataPrincipale() {
    while (true) {
      int idComando;

      try {
        GestioneStampa.stampaMessaggio("Digita un comando: ");

        idComando = analizzatore.eseguiAnalizzatore(GestioneInput.input(), giocatore.getStatoGioco());

        if (idComando == Analizzatore.CODICE_COMANDO_HELP) {
          Comandi.help();
        } else if (idComando == Analizzatore.CODICE_COMANDO_GIOCA) {
          comandi.gioca(giocatore, partita, analizzatore);
          giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);
          partita = new Partita();
          giocatore = new Giocatore();
          GestioneStampa.stampareTitoloGioco();
        } else if (idComando == Analizzatore.CODICE_COMANDO_ESCI) {
          Comandi.esci(partita, giocatore.getStatoGioco());
          GestioneStampa.stampareTitoloGioco();
        } else if (idComando == Analizzatore.CODICE_COMANDO_TEMPO) {
          comandi.impostaTempoDiGioco(partita, analizzatore.getParametroComando());
        } else if (idComando == Analizzatore.CODICE_COMANDO_MOSTRALIVELLO) {
          comandi.mostraLivello(partita);
        } else if (idComando == Analizzatore.CODICE_COMANDO_MOSTRANAVI) {
          comandi.mostraNavi(partita);
        } else if (idComando == Analizzatore.CODICE_COMANDO_FACILE
                || idComando == Analizzatore.CODICE_COMANDO_MEDIO
                || idComando == Analizzatore.CODICE_COMANDO_DIFFICILE) {
          GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale: "
                  + GestioneStampa.ANSI_RESET + "OK \n\n");
          comandi.scegliLivelloGioco(partita, idComando, "");
        } else if (idComando == Analizzatore.CODICE_COMANDO_FACILE_CON_TENTATIVI
                || idComando == Analizzatore.CODICE_COMANDO_MEDIO_CON_TENTATIVI
                || idComando == Analizzatore.CODICE_COMANDO_DIFFICILE_CON_TENTATIVI) {
          comandi.scegliLivelloGioco(partita, idComando, analizzatore.getArrayToken()[1]);
        } else if (idComando == Analizzatore.CODICE_COMANDO_TENTATIVI) {
          comandi.impostaTentativi(partita, analizzatore.getParametroComando());
        } else if (idComando == Analizzatore.CODICE_COMANDO_STANDARD
                || idComando == Analizzatore.CODICE_COMANDO_LARGE
                || idComando == Analizzatore.CODICE_COMANDO_EXTRALARGE) {
          GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale: "
                  + GestioneStampa.ANSI_RESET + "OK \n\n");
          comandi.impostaTagliaGriglia(partita, giocatore, idComando);
        } else if (idComando == Analizzatore.CODICE_COMANDO_SVELAGRIGLIA) {
          GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale: "
                  + GestioneStampa.ANSI_RESET + "Il comando " + GestioneStampa.ANSI_RED
                  + "/svelagriglia" + GestioneStampa.ANSI_RESET
                  + " può essere utilizzato solo in partita! \n\n");
        } else if (idComando == Analizzatore.CODICE_COMANDO_ABBANDONA) {
          GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale: "
                  + GestioneStampa.ANSI_RESET + "Il comando " + GestioneStampa.ANSI_RED
                  + "/abbandona" + GestioneStampa.ANSI_RESET
                  + " può essere utilizzato solo in partita! \n\n");
        } else if (idComando == Analizzatore.CODICE_COMANDO_MOSTRAGRIGLIA) {
          GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale: "
                  + GestioneStampa.ANSI_RESET + "Il comando " + GestioneStampa.ANSI_RED
                  + "/mostragriglia" + GestioneStampa.ANSI_RESET
                  + " può essere utilizzato solo in partita! \n\n");
        } else if (idComando == Analizzatore.CODICE_COMANDO_MOSTRATEMPO) {
          GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale: "
                  + GestioneStampa.ANSI_RESET + "Il comando " + GestioneStampa.ANSI_RED
                  + "/mostratempo" + GestioneStampa.ANSI_RESET
                  + " può essere utilizzato solo in partita! \n\n");
        } else if (idComando == Analizzatore.CODICE_COMANDO_MOSTRA_TENTATIVI) {
          GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale: "
                  + GestioneStampa.ANSI_RESET + "Il comando " + GestioneStampa.ANSI_RED
                  + "/mostratentativi" + GestioneStampa.ANSI_RESET
                  + " può essere utilizzato solo in partita! \n\n");
        }
      } catch (AnalizzatoreException ex) {
        GestioneStampa.stampaMessaggio(ex.getMessage() + "\n");
      } catch (TimerException ex) {
        GestioneStampa.stampaMessaggio(ex.getMessage() + "\n");
      }
    }
  }
}

