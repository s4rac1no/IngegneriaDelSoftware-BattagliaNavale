/**
 * <<Control>>
 * Responsabilità: Controlla il comportamento
 * dell'applicazione in gioco.
 */

package it.uniba.app;

/** Classe che modella i comandi del gioco.
 *
 * @author GruppoPatterson
 */
public class Comandi {

  /**
   * Metodo statico che stampa le regole e i comandi del gioco.
   */
  public static void help() {
    GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE + "\nBENVENUTO NEL GIOCO DELLA BATTAGLIA NAVALE\n\n"
            + GestioneStampa.ANSI_RESET + "L'obiettivo del gioco è quello di affondare "
            + "tutte le navi presenti sulla griglia. \n"
            + "Il giocatore avrà a disposizione un numero massimo di tentativi falliti per difficoltà\n"
            + "selezionata e un tempo massimo di gioco.\n"
            + "La partita è impostata di default con difficoltà facile, un numero di tentativi massimi\n"
            + "fallibili pari a 50, la griglia di dimensioni standard (10x10) e un tempo massimo di gioco\n"
            + "pari a 15 minuti.\n\n"
            + "Ad ogni tentativo, verrà mostrata la griglia con le navi colpite parzialmente o affondate,\n"
            + "il numero di tentativi già effettuati e il tempo trascorso.\n"
            + "In seguito verrà chiesto al giocatore la lettera "
            + "della colonna della casella scelta e\nil numero di riga, es: A-5.\n"
            + "Per ogni tentativo il sistema segnerà:\n"
            + GestioneStampa.ANSI_BLUE + "Acqua" + GestioneStampa.ANSI_RESET
            + ": se il tentativo non ha colpito alcuna nave\n"
            + GestioneStampa.ANSI_YELLOW + "Colpito" + GestioneStampa.ANSI_RESET
            + ": se il tentativo è andato a buon fine\n"
            + GestioneStampa.ANSI_RED + "Colpito e affondato" + GestioneStampa.ANSI_RESET
            + ": se la nave colpita è stata affondata\n"
            + "In caso di " + GestioneStampa.ANSI_RED + "GAMEOVER" + GestioneStampa.ANSI_RESET
            + ", ovvero, superato il tempo limite o il numero massimo di tentativi fallibili,\n"
            + "la partita si concluderà, verrà mostrata la griglia con tutte le navi poste dal computer a"
            + "\ninizio partita, le navi rimanenti"
            + ", il numero dei tentativi effettuati e dei tentativi falliti\n\n"
            + "Il giocatore può modificare, prima della partita, la dimensione della griglia scegliendo tra:\n"
            + " - " + GestioneStampa.ANSI_RED + "Standard (10x10)" + GestioneStampa.ANSI_RESET + "\n - "
            + GestioneStampa.ANSI_RED
            + "Large (18x18)" + GestioneStampa.ANSI_RESET + "\n - " + GestioneStampa.ANSI_RED + "Extralarge (26x26)"
            + GestioneStampa.ANSI_RESET + "\n\n"
            + "Il giocatore, per ogni griglia, ha la possibilità di modificare la difficoltà scelta o\n"
            + "personalizzare quelle esistenti.\n"
            + "Per la griglia di dimensioni" + GestioneStampa.ANSI_RED + " standard" + GestioneStampa.ANSI_RESET
            + ", le difficoltà sono impostate di default a: \n"
            + " - " + GestioneStampa.ANSI_RED + "Facile" + GestioneStampa.ANSI_RESET
            + " -> numero tentativi massimi fallibili:"
            + GestioneStampa.ANSI_RED + " 50" + GestioneStampa.ANSI_RESET + "      Range di modifica da "
            + GestioneStampa.ANSI_RED
            + "50 a 70" + GestioneStampa.ANSI_RESET + "\n - "
            + GestioneStampa.ANSI_RED + "Medio" + GestioneStampa.ANSI_RESET + " -> numero tentativi massimi fallibili:"
            + GestioneStampa.ANSI_RED + " 30" + GestioneStampa.ANSI_RESET +          "       Range di modifica da "
            + GestioneStampa.ANSI_RED + "30 a 49" + GestioneStampa.ANSI_RESET + "\n - "
            + GestioneStampa.ANSI_RED + "Difficile" + GestioneStampa.ANSI_RESET
            + " -> numero tentativi massimi fallibili:"
            + GestioneStampa.ANSI_RED + " 10" + GestioneStampa.ANSI_RESET +      "   Range di modifica da "
            + GestioneStampa.ANSI_RED + "1 a 29" + GestioneStampa.ANSI_RESET + "\n\n"
            + "Per la griglia di dimensioni" + GestioneStampa.ANSI_RED + " large" + GestioneStampa.ANSI_RESET
            + ", le difficoltà sono impostate di default a: \n"
            + " - " + GestioneStampa.ANSI_RED + "Facile" + GestioneStampa.ANSI_RESET
            + " -> numero tentativi massimi fallibili:"
            + GestioneStampa.ANSI_RED + " 250" + GestioneStampa.ANSI_RESET
            + "     Range di modifica da " + GestioneStampa.ANSI_RED
            + "200 a 294" + GestioneStampa.ANSI_RESET + "\n - "
            + GestioneStampa.ANSI_RED + "Medio" + GestioneStampa.ANSI_RESET + " -> numero tentativi massimi fallibili:"
            + GestioneStampa.ANSI_RED + " 150" + GestioneStampa.ANSI_RESET
            + "      Range di modifica da " + GestioneStampa.ANSI_RED
            + "100 a 199" + GestioneStampa.ANSI_RESET + "\n - "
            + GestioneStampa.ANSI_RED + "Difficile" + GestioneStampa.ANSI_RESET
            + " -> numero tentativi massimi fallibili:"
            + GestioneStampa.ANSI_RED + " 50" + GestioneStampa.ANSI_RESET
            + "   Range di modifica da " + GestioneStampa.ANSI_RED
            + "1 a 99" + GestioneStampa.ANSI_RESET + "\n\n"
            + "Per la griglia di dimensioni" + GestioneStampa.ANSI_RED + " extralarge" + GestioneStampa.ANSI_RESET
            + ", le difficoltà sono impostate di default a: \n"
            + " - " + GestioneStampa.ANSI_RED + "Facile" + GestioneStampa.ANSI_RESET
            + " -> numero tentativi massimi fallibili:"
            + GestioneStampa.ANSI_RED + " 525" + GestioneStampa.ANSI_RESET
            + "     Range di modifica da " + GestioneStampa.ANSI_RED
            + "400 a 646" + GestioneStampa.ANSI_RESET + "\n - "
            + GestioneStampa.ANSI_RED + "Medio" + GestioneStampa.ANSI_RESET + " -> numero tentativi massimi fallibili:"
            + GestioneStampa.ANSI_RED + " 300" + GestioneStampa.ANSI_RESET
            + "      Range di modifica da " + GestioneStampa.ANSI_RED
            + "200 a 399" + GestioneStampa.ANSI_RESET + "\n - "
            + GestioneStampa.ANSI_RED + "Difficile" + GestioneStampa.ANSI_RESET
            + " -> numero tentativi massimi fallibili:"
            + GestioneStampa.ANSI_RED + " 100" + GestioneStampa.ANSI_RESET
            + "  Range di modifica da " + GestioneStampa.ANSI_RED
            + "1 a 199" + GestioneStampa.ANSI_RESET + "\n\n"

            + "Il giocatore può modificare, prima della partita, il tempo massimo di gioco, non superando\n"
            + "il limite massimo di " + GestioneStampa.ANSI_RED + "60" + GestioneStampa.ANSI_RESET + " minuti. \n\n"
            + "Di seguito vengono riportati i comandi del gioco:\n\n"
            + "Per conoscere i tipi di nave, la dimensione in quadrati "
            + "e il numero di esemplari da affondare digita:\n"
            + "- " + GestioneStampa.ANSI_RED
            + "/mostranavi " + GestioneStampa.ANSI_RESET + GestioneStampa.ANSI_GREEN
            + "(SCHERMATA PRINCIPALE, IN GIOCO)\n\n"
            + GestioneStampa.ANSI_RESET
            + "Per iniziare una nuova partita:\n"
            + "- " + GestioneStampa.ANSI_RED
            + "/gioca " + GestioneStampa.ANSI_RESET + GestioneStampa.ANSI_GREEN
            + "(SCHERMATA PRINCIPALE)\n\n" + GestioneStampa.ANSI_RESET
            + "Per impostare la difficoltà con i tentativi falliti di default digita:\n"
            + "- " + GestioneStampa.ANSI_RED + "/facile " + GestioneStampa.ANSI_RESET + GestioneStampa.ANSI_GREEN
            + "(SCHERMATA PRINCIPALE)\n" + GestioneStampa.ANSI_RESET
            + "- " + GestioneStampa.ANSI_RED + "/medio " + GestioneStampa.ANSI_RESET + GestioneStampa.ANSI_GREEN
            + "(SCHERMATA PRINCIPALE)\n" + GestioneStampa.ANSI_RESET
            + "- " + GestioneStampa.ANSI_RED + "/difficile " + GestioneStampa.ANSI_RESET + GestioneStampa.ANSI_GREEN
            + "(SCHERMATA PRINCIPALE)\n\n" + GestioneStampa.ANSI_RESET
            + "Per impostare la difficoltà e i tentativi fallibili massimi digita:\n"
            + "- " + GestioneStampa.ANSI_RED + "/facile numero " + GestioneStampa.ANSI_GREEN
            + "(SCHERMATA PRINCIPALE)\n" + GestioneStampa.ANSI_RESET
            + "- " + GestioneStampa.ANSI_RED + "/medio numero " + GestioneStampa.ANSI_GREEN
            + "(SCHERMATA PRINCIPALE)\n" + GestioneStampa.ANSI_RESET
            + "- " + GestioneStampa.ANSI_RED + "/difficile numero " + GestioneStampa.ANSI_GREEN
            + "(SCHERMATA PRINCIPALE)\n\n" + GestioneStampa.ANSI_RESET
            + "Per conoscere la difficoltà impostata digita:\n"
            + "- " + GestioneStampa.ANSI_RED + "/mostralivello " + GestioneStampa.ANSI_RESET + GestioneStampa.ANSI_GREEN
            + "(SCHERMATA PRINCIPALE, IN GIOCO)\n\n" + GestioneStampa.ANSI_RESET
            + "Per uscire dal gioco digita:\n"
            + "- " + GestioneStampa.ANSI_RED + "/esci " + GestioneStampa.ANSI_GREEN
            + "(SCHERMATA PRINCIPALE, IN GIOCO)\n\n"
            + GestioneStampa.ANSI_RESET
            + "Per visualizzare la tabella di gioco con tutte le navi posizionate digita:\n"
            + "- " + GestioneStampa.ANSI_RED + "/svelagriglia " + GestioneStampa.ANSI_GREEN + "(IN GIOCO)\n\n"
            + GestioneStampa.ANSI_RESET
            + "Per abbandonare una partita digita:\n"
            + "- " + GestioneStampa.ANSI_RED + "/abbandona " + GestioneStampa.ANSI_RESET
            + GestioneStampa.ANSI_GREEN + "(IN GIOCO)\n\n"
            + GestioneStampa.ANSI_RESET
            + "Per selezionare la dimensione della griglia 10x10 digita:\n"
            + "- " + GestioneStampa.ANSI_RED + "/standard " + GestioneStampa.ANSI_RESET + GestioneStampa.ANSI_GREEN
            + "(SCHERMATA PRINCIPALE)\n\n" + GestioneStampa.ANSI_RESET
            + "Per selezionare la dimensione della griglia 18x18 digita:\n"
            + "- " + GestioneStampa.ANSI_RED + "/large " + GestioneStampa.ANSI_RESET + GestioneStampa.ANSI_GREEN
            + "(SCHERMATA PRINCIPALE)\n\n" + GestioneStampa.ANSI_RESET
            + "Per selezionare la dimensione della griglia 26x26 digita:\n"
            + "- " + GestioneStampa.ANSI_RED + "/extralarge " + GestioneStampa.ANSI_RESET + GestioneStampa.ANSI_GREEN
            + "(SCHERMATA PRINCIPALE)\n\n" + GestioneStampa.ANSI_RESET
            + "Per stampare la griglia riportante le navi affondate e colpite digita:\n"
            + "- " + GestioneStampa.ANSI_RED + "/mostragriglia " + GestioneStampa.ANSI_RESET + GestioneStampa.ANSI_GREEN
            + "(IN GIOCO)\n\n" + GestioneStampa.ANSI_RESET
            + "Per impostare un tempo di gioco in minuti digita:\n"
            + "- " + GestioneStampa.ANSI_RED + "/tempo numero " + GestioneStampa.ANSI_GREEN
            + "(SCHERMATA PRINCIPALE)\n\n" + GestioneStampa.ANSI_RESET
            + "Per mostrare il tempo in minuti trascorsi e disponibili digita:\n"
            + "- " + GestioneStampa.ANSI_RED + "/mostratempo " + GestioneStampa.ANSI_GREEN + "(IN GIOCO)\n\n"
            + GestioneStampa.ANSI_RESET
            + "Per stampare il numero di tentativi effettuati, falliti e il numero"
            + " di tentativi fallibili massimi digita: \n"
            + "- " + GestioneStampa.ANSI_RED + "/mostratentativi " + GestioneStampa.ANSI_GREEN + "(IN GIOCO)\n\n"
            + GestioneStampa.ANSI_RESET
            + "Per settare direttamente i tentativi massimi fallibili digita: \n"
            + "- " + GestioneStampa.ANSI_RED + "/tentativi numero " + GestioneStampa.ANSI_GREEN
            + "(SCHERMATA PRINCIPALE)\n\n" + GestioneStampa.ANSI_RESET
            + "E' possibile visualizzare i comandi durante il gioco digitando: \n"
            + "- " + GestioneStampa.ANSI_RED + "/help " + GestioneStampa.ANSI_GREEN
            + "(SCHERMATA PRINCIPALE, IN GIOCO)\n\n" + GestioneStampa.ANSI_RESET);
  }

  /**
   * Metodo d'istanza che si occupa di far giocare il giocatore.
   *
   * @param giocatore Istanza della classe giocatore
   * @param partita   Istanza della classe partita
   */
  public void gioca(final Giocatore giocatore, final Partita partita, final Analizzatore analizzatore) {
    giocatore.setStatoGioco(Giocatore.Gioco.GAME);
    partita.inserimentoNavi();
    partita.setNumeroNaviCorrenti();
    GestioneStampa.clearTerminale();
    GestioneStampa.stampareTitoloGioco();

    boolean fineGioco = false;
    partita.startTimer();

    GestioneStampa.stampaGriglia(partita.getDimensioneGrigliaPartita(),
            giocatore.getGrigliaGiocatore());
    GestioneStampa.stampaMessaggio("\n");
    GestioneStampa.stampaMessaggio("Tempo trascorso: " + partita.getTempoPassatoInMinuti() + " min "
            + ", Tentativi Effettuati: " + partita.getTentativiEffettuati() + " \n\n");
    while (!fineGioco && partita.getTempoRimanente() != 0
            && partita.getTentativiFalliti() != partita.getMaxTentativiFalliti()) {
      int idComando;
      try {
        GestioneStampa.stampaMessaggio("Affonda le navi o digita un comando: ");

        idComando = analizzatore.eseguiAnalizzatore(GestioneInput.inputGame(partita), giocatore.getStatoGioco());

        if (idComando == Analizzatore.CODICE_TENTATIVO) {
          if (effettuaTentativo(partita, giocatore, analizzatore.getTentativo())) {
            GestioneStampa.stampaGriglia(partita.getDimensioneGrigliaPartita(),
                    giocatore.getGrigliaGiocatore());
            GestioneStampa.stampaMessaggio("\n");
            GestioneStampa.stampaMessaggio("Tempo trascorso: " + partita.getTempoPassatoInMinuti() + " min "
                    + ", Tentativi Effettuati: " + partita.getTentativiEffettuati() + " \n\n");
          }

          fineGioco = partita.verificaVittoria();
          if (fineGioco) {
            giocatore.setStatoGioco(Giocatore.Gioco.WIN);
          }
        } else if (idComando == Analizzatore.CODICE_COMANDO_HELP) {
          Comandi.help();
        } else if (idComando == Analizzatore.CODICE_COMANDO_GIOCA) {
          GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale" + GestioneStampa.ANSI_RESET
                  + ": Non puoi iniziare una nuova partita, "
                  + "ti trovi già in una partita in corso! \n\n");
        } else if (idComando == Analizzatore.CODICE_COMANDO_ESCI) {
          esci(partita, giocatore.getStatoGioco());
        } else if (idComando == Analizzatore.CODICE_COMANDO_TEMPO) {
          GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale" + GestioneStampa.ANSI_RESET
                  + ": Non puoi settare il tempo di gioco, "
                  + "ti trovi in una partita in corso! \n\n");
        } else if (idComando == Analizzatore.CODICE_COMANDO_MOSTRALIVELLO) {
          mostraLivello(partita);
        } else if (idComando == Analizzatore.CODICE_COMANDO_MOSTRANAVI) {
          mostraNavi(partita);
        } else if (idComando == Analizzatore.CODICE_COMANDO_FACILE
                || idComando == Analizzatore.CODICE_COMANDO_MEDIO
                || idComando == Analizzatore.CODICE_COMANDO_DIFFICILE) {
          GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale" + GestioneStampa.ANSI_RESET
                  + ": Non puoi settare il livello di gioco, "
                  + "ti trovi già in una partita in corso! \n\n");
        } else if (idComando == Analizzatore.CODICE_COMANDO_MEDIO_CON_TENTATIVI
                || idComando == Analizzatore.CODICE_COMANDO_FACILE_CON_TENTATIVI
                || idComando == Analizzatore.CODICE_COMANDO_DIFFICILE_CON_TENTATIVI) {
          GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale" + GestioneStampa.ANSI_RESET
                  + ": Non puoi settare il livello di gioco con il numero di tentativi falliti, "
                  + "ti trovi già in una partita in corso! \n\n");
        } else if (idComando == Analizzatore.CODICE_COMANDO_TENTATIVI) {
          GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale" + GestioneStampa.ANSI_RESET
                  + ": Non puoi settare il numero di tentativi falliti, "
                  + "ti trovi già in una partita in corso! \n\n");
        } else if (idComando == Analizzatore.CODICE_COMANDO_SVELAGRIGLIA) {
          svelaGriglia(partita);
        } else if (idComando == Analizzatore.CODICE_COMANDO_ABBANDONA) {
          fineGioco = abbandona(partita);
        } else if (idComando == Analizzatore.CODICE_COMANDO_STANDARD
                || idComando == Analizzatore.CODICE_COMANDO_LARGE
                || idComando == Analizzatore.CODICE_COMANDO_EXTRALARGE) {
          GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale" + GestioneStampa.ANSI_RESET
                  + ": Non puoi settare la dimensione della griglia, "
                  + "ti trovi già in una partita in corso! \n\n");
        } else if (idComando == Analizzatore.CODICE_COMANDO_MOSTRAGRIGLIA) {
          mostraGriglia(partita, giocatore);
        } else if (idComando == Analizzatore.CODICE_COMANDO_MOSTRATEMPO) {
          mostraTempo(partita);
        } else if (idComando == Analizzatore.CODICE_COMANDO_MOSTRA_TENTATIVI) {
          mostraTentativi(partita);
        }
      } catch (AnalizzatoreException ex) {
        GestioneStampa.stampaMessaggio(ex.getMessage() + "\n");
      } catch (TimerException ex) {
        GestioneStampa.stampaMessaggio(ex.getMessage() + "\n");
      }
    }

    if (partita.getTempoRimanente() == 0) {
      giocatore.setStatoGioco(Giocatore.Gioco.GAMEOVER);
      GestioneStampa.stampareGameOver();
      GestioneStampa.stampaMessaggio("\n Tempo scaduto! \n\n");
      GestioneStampa.stampaMessaggio(" Verrà svelata la griglia! \n\n");
      GestioneStampa.stampaGriglia(partita.getDimensioneGrigliaPartita(),
              partita.getGrigliaPartita());
      GestioneStampa.stampaMessaggio("\n Navi rimanenti: \n");
      mostraNavi(partita);
      GestioneStampa.stampaMessaggio("\n\n");
      GestioneStampa.stampaMessaggio(" Tentativi Effettuati: " + partita.getTentativiEffettuati()
              + ", Tentativi Falliti: " + partita.getTentativiFalliti() + "\n");
    } else if (partita.getTentativiFalliti() == partita.getMaxTentativiFalliti()) {
      giocatore.setStatoGioco(Giocatore.Gioco.GAMEOVER);
      GestioneStampa.stampareGameOver();
      GestioneStampa.stampaMessaggio("\n Hai raggiunto il max numero dei tentativi falliti! \n");
      GestioneStampa.stampaMessaggio(" Verrà svelata la griglia! \n\n");
      GestioneStampa.stampaGriglia(partita.getDimensioneGrigliaPartita(),
              partita.getGrigliaPartita());
      GestioneStampa.stampaMessaggio("\n Navi rimanenti: \n");
      mostraNavi(partita);
      GestioneStampa.stampaMessaggio("\n\n");
      GestioneStampa.stampaMessaggio(" Tentativi Effettuati: " + partita.getTentativiEffettuati()
              + ", Tentativi Falliti: " + partita.getTentativiFalliti() + "\n");
    } else if (fineGioco && giocatore.getStatoGioco() == Giocatore.Gioco.WIN) {
      GestioneStampa.stampareWin();
      GestioneStampa.stampaMessaggio("\n Hai affondato tutte le navi, Complimenti! \n\n");
    }
  }

  /**
   * Metodo d'istanza che si occupa di settare il livello di gioco.
   *
   * @param partita       Istanza della classe partita
   * @param livelloScelto int, 6 per facile, 7 per medio, 8 per difficile,
   *                      int 66 per facile num_tentativi, int 77 per medio num_tentativi,
   *                      int 88 per difficile num_tentativi.
   */
  public void scegliLivelloGioco(final Partita partita, final int livelloScelto,
                                 final String numTentativiFallitiUtenteInit) {
    try {
      int numTentativiFallitiUtente = -1;
      if (!numTentativiFallitiUtenteInit.equals("")) {
        numTentativiFallitiUtente = Integer.parseInt(numTentativiFallitiUtenteInit);
      }
      // scelta della difficoltà dal giocatore
      switch (livelloScelto) {
        case Analizzatore.CODICE_COMANDO_FACILE -> {
          if (partita.getDimensioneGrigliaPartita() == Griglia.DIMENSIONI_GRIGLIA_DEFAULT) {
            partita.setMaxTentativiFalliti(Partita.NUM_TENTATIVI_FACILE_STANDARD);
          } else if (partita.getDimensioneGrigliaPartita() == Griglia.DIMENSIONI_GRIGLIA_LARGE) {
            partita.setMaxTentativiFalliti(Partita.NUM_TENTATIVI_FACILE_LARGE);
          } else if (partita.getDimensioneGrigliaPartita() == Griglia.DIMENSIONI_GRIGLIA_EXTRALARGE) {
            partita.setMaxTentativiFalliti(Partita.NUM_TENTATIVI_FACILE_EXTRALARGE);
          }
          partita.setLivelloDiGioco("Facile");
        }
        case Analizzatore.CODICE_COMANDO_MEDIO -> {
          if (partita.getDimensioneGrigliaPartita() == Griglia.DIMENSIONI_GRIGLIA_DEFAULT) {
            partita.setMaxTentativiFalliti(Partita.NUM_TENTATIVI_MEDIO_STANDARD);
          } else if (partita.getDimensioneGrigliaPartita() == Griglia.DIMENSIONI_GRIGLIA_LARGE) {
            partita.setMaxTentativiFalliti(Partita.NUM_TENTATIVI_MEDIO_LARGE);
          } else if (partita.getDimensioneGrigliaPartita() == Griglia.DIMENSIONI_GRIGLIA_EXTRALARGE) {
            partita.setMaxTentativiFalliti(Partita.NUM_TENTATIVI_MEDIO_EXTRALARGE);
          }
          partita.setLivelloDiGioco("Medio");
        }
        case Analizzatore.CODICE_COMANDO_DIFFICILE -> {
          if (partita.getDimensioneGrigliaPartita() == Griglia.DIMENSIONI_GRIGLIA_DEFAULT) {
            partita.setMaxTentativiFalliti(Partita.NUM_TENTATIVI_DIFFICILE_STANDARD);
          } else if (partita.getDimensioneGrigliaPartita() == Griglia.DIMENSIONI_GRIGLIA_LARGE) {
            partita.setMaxTentativiFalliti(Partita.NUM_TENTATIVI_DIFFICILE_LARGE);
          } else if (partita.getDimensioneGrigliaPartita() == Griglia.DIMENSIONI_GRIGLIA_EXTRALARGE) {
            partita.setMaxTentativiFalliti(Partita.NUM_TENTATIVI_DIFFICILE_EXTRALARGE);
          }
          partita.setLivelloDiGioco("Difficile");
        }
        case Analizzatore.CODICE_COMANDO_FACILE_CON_TENTATIVI -> {
          if (verificaTentativiMassimi(partita, numTentativiFallitiUtente, "Facile")) {
            partita.setMaxTentativiFalliti(numTentativiFallitiUtente);
          }
          partita.setLivelloDiGioco("Facile");
        }
        case Analizzatore.CODICE_COMANDO_MEDIO_CON_TENTATIVI -> {
          if (verificaTentativiMassimi(partita, numTentativiFallitiUtente, "Medio")) {
            partita.setMaxTentativiFalliti(numTentativiFallitiUtente);
          }
          partita.setLivelloDiGioco("Medio");
        }
        case Analizzatore.CODICE_COMANDO_DIFFICILE_CON_TENTATIVI -> {
          if (verificaTentativiMassimi(partita, numTentativiFallitiUtente, "Difficile")) {
            partita.setMaxTentativiFalliti(numTentativiFallitiUtente);
          }
          partita.setLivelloDiGioco("Difficile");
        }
        default -> {
        }
      }
    } catch (NumberFormatException e) {
      GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
              + "Battaglia Navale" + GestioneStampa.ANSI_RESET
              + ": Errore, numero tentativi non valido! \n\n");
    }
  }

  /**
   * Metodo d'istanza che si occupa di settare la dimensione  della griglia.
   *
   * @param partita       Istanza della classe partita
   * @param taglia int, 6 per facile, 7 per medio, 8 per difficile
   * @param giocatore     Istanza della classe giocatore
   */
  public void impostaTagliaGriglia(final Partita partita, final Giocatore giocatore, final int taglia) {

    switch (taglia) {
      case Analizzatore.CODICE_COMANDO_STANDARD -> {
        partita.modificaGrigliaPartita(Griglia.DIMENSIONI_GRIGLIA_DEFAULT);
        giocatore.modificaGrigliaPartita(
                Griglia.DIMENSIONI_GRIGLIA_DEFAULT);

        partita.setLivelloDiGioco("Facile");
        partita.setMaxTentativiFalliti(Partita.NUM_TENTATIVI_FACILE_STANDARD);
        GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                + "Battaglia Navale"
                + GestioneStampa.ANSI_RESET + ": Livello di gioco impostato di default su Facile! \n\n");
      }
      case Analizzatore.CODICE_COMANDO_LARGE -> {
        partita.modificaGrigliaPartita(Griglia.DIMENSIONI_GRIGLIA_LARGE);
        giocatore.modificaGrigliaPartita(Griglia.DIMENSIONI_GRIGLIA_LARGE);

        partita.setLivelloDiGioco("Facile");
        partita.setMaxTentativiFalliti(Partita.NUM_TENTATIVI_FACILE_LARGE);
        GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                + "Battaglia Navale"
                + GestioneStampa.ANSI_RESET + ": Livello di gioco impostato di default su Facile! \n\n");
      }
      case Analizzatore.CODICE_COMANDO_EXTRALARGE -> {
        partita.modificaGrigliaPartita(
                Griglia.DIMENSIONI_GRIGLIA_EXTRALARGE);
        giocatore.modificaGrigliaPartita(
                Griglia.DIMENSIONI_GRIGLIA_EXTRALARGE);

        partita.setLivelloDiGioco("Facile");
        partita.setMaxTentativiFalliti(Partita.NUM_TENTATIVI_FACILE_EXTRALARGE);
        GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                + "Battaglia Navale"
                + GestioneStampa.ANSI_RESET + ": Livello di gioco impostato di default su Facile! \n\n");
      }
      default -> {
      }
    }
  }

  /**
   * Metodo d'istanza che si occupa di mostrare il livello di gioco.
   *
   * @param partita Istanza della classe partita
   */
  public void mostraLivello(final Partita partita) {
    GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
            + "Battaglia Navale"
            + GestioneStampa.ANSI_RESET + ": Livello di gioco impostato: "
            + GestioneStampa.ANSI_RED + partita.getLivelloDiGioco() + GestioneStampa.ANSI_RESET + "\n");
    GestioneStampa.stampaMessaggio("                  Numero massimo di tentativi falliti: "
            + GestioneStampa.ANSI_RED + partita.getMaxTentativiFalliti()
            + GestioneStampa.ANSI_RESET + "\n\n");
  }

  /**
   * Metodo statico che si occupa di uscire dal gioco.
   */
  public static void esci(final Partita partita, final Giocatore.Gioco statoGiocatore) throws TimerException {
    String conferma;

    GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
            + "Battaglia Navale" + GestioneStampa.ANSI_RESET
            + ": Sei sicuro di uscire dal gioco? [" + GestioneStampa.ANSI_GREEN
            + "si" + GestioneStampa.ANSI_RESET + "/" + GestioneStampa.ANSI_RED
            + "no" + GestioneStampa.ANSI_RESET + "] \n\n");
    GestioneStampa.stampaMessaggio("Conferma: ");

    if (statoGiocatore == Giocatore.Gioco.SCHERMATA_INIZIALE) {
      conferma = GestioneInput.input();
    } else {
      conferma = GestioneInput.inputGame(partita);
    }

    while (!(conferma.equals("si") || conferma.equals("no"))) {
      GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE + "BattagliaNavale"
              + GestioneStampa.ANSI_RESET + ": Non hai inserito una risposta valida\n"
              + "Sei sicuro di uscire dal gioco? [" + GestioneStampa.ANSI_GREEN + "si"
              + GestioneStampa.ANSI_RESET + "/" + GestioneStampa.ANSI_RED
              + "no" + GestioneStampa.ANSI_RESET + "] \n\n");
      GestioneStampa.stampaMessaggio("Conferma: ");

      if (statoGiocatore == Giocatore.Gioco.SCHERMATA_INIZIALE) {
        conferma = GestioneInput.input();
      } else {
        conferma = GestioneInput.inputGame(partita);
      }
    }

    if (conferma.equals("si")) {
      GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
              + "Battaglia Navale" + GestioneStampa.ANSI_RESET
              + ": L'applicazione si chiuderà ... \n");
      System.exit(0);
    } else {
      GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
              + "Battaglia Navale" + GestioneStampa.ANSI_RESET
              + ": OK \n\n");
    }
  }

  /**
   * Metodo d'istanza che is occupa di svelare la griglia delle navi in partita.
   *
   * @param partita Istanza della classe partita
   */
  private void svelaGriglia(final Partita partita) {
    GestioneStampa.stampaGriglia(partita.getDimensioneGrigliaPartita(),
            partita.getGrigliaPartita());
    GestioneStampa.stampaMessaggio("\n");
  }

  /**
   * Metodo d'istanza che si occupa di effettuare un tentativo per affondare
   * una nave.
   *
   * @param partita Istanza della classe partita
   * @param giocatore Istanza della classe giocatore
   * @param tentativo tentativo voluto dall'utente
   * @return boolean
   */
  public boolean effettuaTentativo(final Partita partita, final Giocatore giocatore, final String tentativo) {
    String[] arrayToken = tentativo.split("-");
    final int codiceAsciAminuscola = 97;
    final int codiceAsci0 = 48;
    final int moltiplicaPer10 = 10;
    int colonnaTentativo = ((int) arrayToken[0].charAt(0)) - codiceAsciAminuscola;
    int rigaTentativo = -1;

    if (arrayToken[1].length() == 1) {
      rigaTentativo = (((int) arrayToken[1].charAt(0)) - codiceAsci0);
      rigaTentativo--;
    } else if (arrayToken[1].length() == 2) {
      rigaTentativo = ((((int) arrayToken[1].charAt(0)) - codiceAsci0) * moltiplicaPer10)
              + ((int) arrayToken[1].charAt(1) - codiceAsci0);
      rigaTentativo--;
    } else {
      GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
              + "Battaglia Navale" + GestioneStampa.ANSI_RESET
              + ": Non puoi effettuare questo tentativo, la griglia è impostata da righe:"
              + partita.getDimensioneGrigliaPartita() + " e colonne:"
              + partita.getDimensioneGrigliaPartita() + "! \n\n");

      return false;
    }

    if (partita.getDimensioneGrigliaPartita() > rigaTentativo && rigaTentativo < partita.getDimensioneGrigliaPartita()
            && partita.getDimensioneGrigliaPartita() > colonnaTentativo
            && colonnaTentativo < partita.getDimensioneGrigliaPartita() && rigaTentativo >= 0) {

      if (partita.getCellaGrigliaPartita(rigaTentativo, colonnaTentativo).getStato()
              && giocatore.getCellaGrigliaGiocatore(rigaTentativo, colonnaTentativo).getIcona() == " ") {
        for (int i = 0; i < Partita.NUM_NAVI; i++) {
          if (!partita.getNave(i).isAffondata()) {
            if (partita.getNave(i).getPosizionamento()) { // orizzontale
              if (colonnaTentativo >= partita.getNave(i).getPosizioneColonnaIniziale()
                      && partita.getNave(i).getPosizioneColonnaFinale() >= colonnaTentativo
                      && rigaTentativo == partita.getNave(i).getPosizioneRigaIniziale()
                      && rigaTentativo == partita.getNave(i).getPosizioneRigaFinale()) {
                if (partita.getNave(i).getDimensione() == 1) {
                  partita.getNave(i).decrementaDimensione();
                  // per ogni cella della nave colora in rosso le celle per dire che è affondata
                  for (int j = partita.getNave(i).getPosizioneColonnaIniziale();
                       j <= partita.getNave(i).getPosizioneColonnaFinale();
                       j++) {
                    giocatore.getCellaGrigliaGiocatore(rigaTentativo, j).setIcona(GestioneStampa.ANSI_RED
                            + "⊠" + GestioneStampa.ANSI_RESET);
                  }

                  partita.incrementaTentativiEffettuati();
                  GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_RED + "Colpito e affondato"
                          + GestioneStampa.ANSI_RESET + "\n");
                  return true;
                } else {
                  giocatore.getCellaGrigliaGiocatore(rigaTentativo, colonnaTentativo)
                          .setIcona(GestioneStampa.ANSI_YELLOW
                                  + "⊠" + GestioneStampa.ANSI_RESET);
                  partita.getNave(i).decrementaDimensione();

                  partita.incrementaTentativiEffettuati();

                  GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_YELLOW + "Colpito"
                          + GestioneStampa.ANSI_RESET + "\n");
                  return true;
                }
              }
            } else { // verticale
              if (rigaTentativo >= partita.getNave(i).getPosizioneRigaIniziale()
                      && partita.getNave(i).getPosizioneRigaFinale() >= rigaTentativo
                      && colonnaTentativo == partita.getNave(i).getPosizioneColonnaIniziale()
                      && colonnaTentativo == partita.getNave(i).getPosizioneColonnaFinale()) {
                if (partita.getNave(i).getDimensione() == 1) {
                  partita.getNave(i).decrementaDimensione();
                  // per ogni cella della nave colora in rosso le celle per dire che è affondata
                  for (int j = partita.getNave(i).getPosizioneRigaIniziale();
                       j <= partita.getNave(i).getPosizioneRigaFinale(); j++) {
                    giocatore.getCellaGrigliaGiocatore(j, colonnaTentativo).setIcona(GestioneStampa.ANSI_RED
                            + "⊠" + GestioneStampa.ANSI_RESET);
                  }

                  partita.incrementaTentativiEffettuati();

                  GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_RED + "Colpito e affondato"
                          + GestioneStampa.ANSI_RESET + "\n");
                  return true;
                } else {
                  giocatore.getCellaGrigliaGiocatore(rigaTentativo, colonnaTentativo)
                          .setIcona(GestioneStampa.ANSI_YELLOW
                                  + "⊠" + GestioneStampa.ANSI_RESET);
                  partita.getNave(i).decrementaDimensione();

                  partita.incrementaTentativiEffettuati();

                  GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_YELLOW + "Colpito"
                          + GestioneStampa.ANSI_RESET + "\n");
                  return true;
                }
              }
            }
          }
        }
      } else if (!partita.getCellaGrigliaPartita(rigaTentativo, colonnaTentativo).getStato()
              && giocatore.getCellaGrigliaGiocatore(rigaTentativo, colonnaTentativo).getIcona() == " ") {
        giocatore.getCellaGrigliaGiocatore(rigaTentativo, colonnaTentativo).setIcona(GestioneStampa.ANSI_BLUE
                + "X" + GestioneStampa.ANSI_RESET);

        partita.incrementaTentativiEffettuati();

        GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE + "Acqua" + GestioneStampa.ANSI_RESET + "\n");
        partita.incrementaTentativiFalliti();

        return true;
      } else if (giocatore.getCellaGrigliaGiocatore(rigaTentativo, colonnaTentativo).getIcona() != " ") {
        GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                + "Battaglia Navale" + GestioneStampa.ANSI_RESET
                + ": Hai già effettuato questo tentativo! \n\n");
      }
    } else {
      GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
              + "Battaglia Navale" + GestioneStampa.ANSI_RESET
              + ": Non puoi effettuare questo tentativo, la griglia è impostata da righe:"
              + partita.getDimensioneGrigliaPartita() + " e colonne:"
              + partita.getDimensioneGrigliaPartita() + "! \n\n");
    }

    return false;
  }


  /**
   * Metodo d'istanza che si occupa di stampare il numero di navi correnti in partita.
   *
   * @param partita Istanza della classe partita
   */
  public void mostraNavi(final Partita partita) {
    partita.setNumeroNaviCorrenti();

    GestioneStampa.stampaMessaggio("\n - Cacciatorpediniere ⊠⊠ Esemplari: "
            + partita.getNumCacciatorpedinieri() + "\n");
    GestioneStampa.stampaMessaggio("\n - Incrociatore ⊠⊠⊠ Esemplari: "
            + partita.getNumIncrociatori() + "\n");
    GestioneStampa.stampaMessaggio("\n - Corazzata ⊠⊠⊠⊠ Esemplari: "
            + partita.getNumCorazzate() + "\n");
    GestioneStampa.stampaMessaggio("\n - Portaerei ⊠⊠⊠⊠⊠ Esemplari: "
            + partita.getNumPortaerei() + "\n\n");
  }

  /**
   * Metodo d'istanza che si occupa di abbandonare una partita.
   *
   * @param partita Istanza della classe partita
   * @return boolean, true se la conferma è andata a buon fine, false altrimenti
   */
  private boolean abbandona(final Partita partita) throws TimerException {

    String conferma;

    GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
            + "Battaglia Navale" + GestioneStampa.ANSI_RESET
            + ": Sei sicuro di abbandonare la partita? [" + GestioneStampa.ANSI_GREEN
            + "si" + GestioneStampa.ANSI_RESET + "/" + GestioneStampa.ANSI_RED
            + "no" + GestioneStampa.ANSI_RESET + "] \n\n");
    GestioneStampa.stampaMessaggio("Conferma: ");
    conferma = GestioneInput.inputGame(partita);

    while (!(conferma.equals("si") || conferma.equals("no"))) {
      GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE + "BattagliaNavale"
              + GestioneStampa.ANSI_RESET + ": Non hai inserito una risposta valida\n"
              + "Sei sicuro di voler abbandonare la partita? [" + GestioneStampa.ANSI_GREEN + "si"
              + GestioneStampa.ANSI_RESET + "/" + GestioneStampa.ANSI_RED
              + "no" + GestioneStampa.ANSI_RESET + "] \n\n");
      GestioneStampa.stampaMessaggio("Conferma: ");
      conferma = GestioneInput.inputGame(partita);
    }

    if (conferma.equals("si")) {
      GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
              + "Battaglia Navale" + GestioneStampa.ANSI_RESET
              + ": Hai abbandonato la partita, svelerò la griglia ... \n");

      GestioneStampa.stampaGriglia(partita.getDimensioneGrigliaPartita(),
              partita.getGrigliaPartita());
      GestioneStampa.stampaMessaggio("\n");

      return true;
    }

    return false;
  }

  /**
   * Metodo d'istanza che si occupa di settare il tempo di gioco della partita.
   *
   * @param partita Istanza della classe partita
   * @param minutiDaImpostare stringa dei minuti digitata dall'utente nel comando
   */
  public void impostaTempoDiGioco(final Partita partita, final String minutiDaImpostare) {
    try {
      int minuti = Integer.parseInt(minutiDaImpostare);

      if (minuti > 0 && minuti <= TimerPartita.MAX_TEMPO_GIOCO) {
        partita.setTempoDiGioco(minuti);
        GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                + "Battaglia Navale" + GestioneStampa.ANSI_RESET
                + ": OK \n\n");
      } else if (minuti < 0) {
        GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                + "Battaglia Navale" + GestioneStampa.ANSI_RESET
                + ": Errore, minuti < 0 ! \n\n");
      } else if (minuti > TimerPartita.MAX_TEMPO_GIOCO) {
        GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                + "Battaglia Navale" + GestioneStampa.ANSI_RESET
                + ": Errore, il massimo tempo settabile per una partita è "
                + TimerPartita.MAX_TEMPO_GIOCO + " minuti ! \n\n");
      } else if (minuti == 0) {
        GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                + "Battaglia Navale" + GestioneStampa.ANSI_RESET
                + ": Errore, minuti = 0 ! \n\n");
      }
    } catch (NumberFormatException e) {
      GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
              + "Battaglia Navale" + GestioneStampa.ANSI_RESET
              + ": Errore, il massimo tempo settabile per una partita è "
              + TimerPartita.MAX_TEMPO_GIOCO + " minuti ! \n\n");
    }
  }

  /**
   * Metodo d'istanza che mostra la griglia del giocatore.
   * @param giocatore
   */
  public void mostraGriglia(final Partita partita, final Giocatore giocatore) {
    GestioneStampa.stampaGriglia(partita.getDimensioneGrigliaPartita(),
            giocatore.getGrigliaGiocatore());
  }

  /**
   * Metodo d'istanza che mostra i tentativi del giocatore.
   * @param partita
   */
  public void mostraTentativi(final Partita partita) {
    GestioneStampa.stampaMessaggio("Numero tentativi effettuati: " + GestioneStampa.ANSI_GREEN
            + partita.getTentativiEffettuati() + GestioneStampa.ANSI_RESET
            + "\nNumero tentativi falliti: " + GestioneStampa.ANSI_BLUE + partita.getTentativiFalliti()
            + GestioneStampa.ANSI_RESET
            + "\nNumero massimo di tentativi falliti: " + GestioneStampa.ANSI_RED
            + partita.getMaxTentativiFalliti() + GestioneStampa.ANSI_RESET + "\n");
  }

  /**
   * Metodo d'istanza che si occupa di mostrare il tempo di gioco
   * visualizzando i minuti trascorsi e i minuti disponibili.
   *
   * @param partita Istanza della classe partita
   */
  public void mostraTempo(final Partita partita) {
    GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
            + "Battaglia Navale"
            + GestioneStampa.ANSI_RESET + ": Tempo trascorso: "
            + GestioneStampa.ANSI_RED +  partita.getTempoPassatoInMinuti()
            + " Minuti e " + partita.getTempoPassatoInSecondi() + " Secondi" + GestioneStampa.ANSI_RESET + "\n");
    GestioneStampa.stampaMessaggio("                  Tempo disponibile: "
            + GestioneStampa.ANSI_RED +  partita.getTempoDisponibileInMinuti()
            + " Minuti e " + partita.getTempoDisponibileInSecondi() + " Secondi" + GestioneStampa.ANSI_RESET + "\n\n");
  }

  /**
   * Metodo d'istanza che si occupa di impostare i tentativi
   * falliti del livello di gioco corrente.
   *
   * @param partita Istanza della classe partita
   * @param tentativiFallitiUtente String, tentativi utente da convertire
   */
  public void impostaTentativi(final Partita partita, final String tentativiFallitiUtente) {
    try {
      int numTentativiFallitiUtente = Integer.parseInt(tentativiFallitiUtente);
      final int scartoRangeLarge = 50;
      final int scartoRangeExtralarge = 100;
      if (partita.getDimensioneGrigliaPartita() == Griglia.DIMENSIONI_GRIGLIA_DEFAULT) {
        if (numTentativiFallitiUtente > 0 && numTentativiFallitiUtente <= Partita.MAX_TENTATIVI_STANDARD) {
          GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale: "
                  + GestioneStampa.ANSI_RESET + "OK \n\n");
          partita.setMaxTentativiFalliti(numTentativiFallitiUtente);
          if (numTentativiFallitiUtente >= Partita.NUM_TENTATIVI_FACILE_STANDARD
                  && numTentativiFallitiUtente <= Partita.MAX_TENTATIVI_STANDARD) {
            partita.setLivelloDiGioco("Facile");
          } else if (numTentativiFallitiUtente >= Partita.NUM_TENTATIVI_MEDIO_STANDARD
                  && numTentativiFallitiUtente < Partita.NUM_TENTATIVI_FACILE_STANDARD) {
            partita.setLivelloDiGioco("Medio");
          } else if (numTentativiFallitiUtente > 0
                  && numTentativiFallitiUtente < Partita.NUM_TENTATIVI_MEDIO_STANDARD) {
            partita.setLivelloDiGioco("Difficile");
          }
        } else {
          GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale" + GestioneStampa.ANSI_RESET
                  + ": Errore, il numero dei tentativi falliti per la griglia standard "
                  + "può essere settato tra 1 e 70! \n\n");
        }
      } else if (partita.getDimensioneGrigliaPartita() == Griglia.DIMENSIONI_GRIGLIA_LARGE) {
        if (numTentativiFallitiUtente > 0 && numTentativiFallitiUtente <= Partita.MAX_TENTATIVI_LARGE) {
          GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale: "
                  + GestioneStampa.ANSI_RESET + "OK \n\n");
          partita.setMaxTentativiFalliti(numTentativiFallitiUtente);
          if (numTentativiFallitiUtente >= Partita.NUM_TENTATIVI_FACILE_LARGE - scartoRangeLarge
                  && numTentativiFallitiUtente <= Partita.MAX_TENTATIVI_LARGE) {
            partita.setLivelloDiGioco("Facile");
          } else if (numTentativiFallitiUtente >= Partita.NUM_TENTATIVI_MEDIO_LARGE - scartoRangeLarge
                  && numTentativiFallitiUtente < Partita.NUM_TENTATIVI_FACILE_LARGE - scartoRangeLarge) {
            partita.setLivelloDiGioco("Medio");
          } else if (numTentativiFallitiUtente > 0
                  && numTentativiFallitiUtente < Partita.NUM_TENTATIVI_MEDIO_LARGE - scartoRangeLarge) {
            partita.setLivelloDiGioco("Difficile");
          }
        } else {
          GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale" + GestioneStampa.ANSI_RESET
                  + ": Errore, il numero dei tentativi falliti per la griglia standard "
                  + "può essere settato tra 1 e 294! \n\n");
        }
      } else if (partita.getDimensioneGrigliaPartita() == Griglia.DIMENSIONI_GRIGLIA_EXTRALARGE) {
        if (numTentativiFallitiUtente > 0 && numTentativiFallitiUtente <= Partita.MAX_TENTATIVI_EXTRALARGE) {
          GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale: "
                  + GestioneStampa.ANSI_RESET + "OK \n\n");
          partita.setMaxTentativiFalliti(numTentativiFallitiUtente);
          if (numTentativiFallitiUtente >= Partita.NUM_TENTATIVI_MEDIO_EXTRALARGE + scartoRangeExtralarge
                  && numTentativiFallitiUtente <= Partita.MAX_TENTATIVI_EXTRALARGE) {
            partita.setLivelloDiGioco("Facile");
          } else if (numTentativiFallitiUtente >= Partita.NUM_TENTATIVI_DIFFICILE_EXTRALARGE + scartoRangeExtralarge
                  && numTentativiFallitiUtente < Partita.NUM_TENTATIVI_MEDIO_EXTRALARGE + scartoRangeExtralarge) {
            partita.setLivelloDiGioco("Medio");
          } else if (numTentativiFallitiUtente > 0
                  && numTentativiFallitiUtente < Partita.NUM_TENTATIVI_DIFFICILE_EXTRALARGE + scartoRangeExtralarge) {
            partita.setLivelloDiGioco("Difficile");
          }
        } else {
          GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale" + GestioneStampa.ANSI_RESET
                  + ": Errore, il numero dei tentativi falliti per la griglia standard "
                  + "può essere settato tra 1 e 646! \n\n");
        }
      }
    } catch (NumberFormatException e) {
      GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
              + "Battaglia Navale" + GestioneStampa.ANSI_RESET
              + ": Errore, numero tentativi non valido! \n\n");
    }
  }

  /**
   * Metodo statico che si occupa di verificare
   * il numero dei tentativi falliti dell'utente in
   * base alla griglia utilizzata e i range della
   * difficoltà scelta.
   *
   * @return boolean, true se verificati, false altrimenti
   */
  private static boolean verificaTentativiMassimi(final Partita partita, final int numTentativiUtente,
                                                  final String livelloDiGiocoDaSettare) {
    final int naviTotali = 30;
    final int scartoRangeLarge = 50;
    final int scartoRangeExtralarge = 100;
    if (numTentativiUtente <= 0) {
      GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
              + "Battaglia Navale" + GestioneStampa.ANSI_RESET
              + ": Errore, numero tentativi non valido! \n\n");
      return false;
    } else if (partita.getDimensioneGrigliaPartita() == Griglia.DIMENSIONI_GRIGLIA_DEFAULT) {
      if (livelloDiGiocoDaSettare.equals("Facile")) {
        if (numTentativiUtente <= ((Griglia.DIMENSIONI_GRIGLIA_DEFAULT * Griglia.DIMENSIONI_GRIGLIA_DEFAULT)
                - naviTotali)
                && numTentativiUtente >= Partita.NUM_TENTATIVI_FACILE_STANDARD) {
          GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale: "
                  + GestioneStampa.ANSI_RESET + "OK \n\n");
          return true;
        } else {
          GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale" + GestioneStampa.ANSI_RESET
                  + ": Errore, il numero dei tentativi falliti di facile può essere impostato tra "
                  + Partita.NUM_TENTATIVI_FACILE_STANDARD
                  + " e " + ((Griglia.DIMENSIONI_GRIGLIA_DEFAULT * Griglia.DIMENSIONI_GRIGLIA_DEFAULT)
                  - naviTotali) + "! \n\n ");
        }
      } else if (livelloDiGiocoDaSettare.equals("Medio")) {
        if (numTentativiUtente < Partita.NUM_TENTATIVI_FACILE_STANDARD
                && numTentativiUtente >= Partita.NUM_TENTATIVI_MEDIO_STANDARD) {
          GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale: "
                  + GestioneStampa.ANSI_RESET + "OK \n\n");
          return true;
        } else {
          GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale" + GestioneStampa.ANSI_RESET
                  + ": Errore, il numero dei tentativi falliti di medio può essere impostato tra "
                  + Partita.NUM_TENTATIVI_MEDIO_STANDARD
                  + " e " + (Integer.parseInt(String.valueOf(Partita.NUM_TENTATIVI_FACILE_STANDARD)) - 1) + "! \n\n");
        }
      } else if (livelloDiGiocoDaSettare.equals("Difficile")) {
        if (numTentativiUtente < Partita.NUM_TENTATIVI_MEDIO_STANDARD) {
          GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale: "
                  + GestioneStampa.ANSI_RESET + "OK \n\n");
          return true;
        } else {
          GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale" + GestioneStampa.ANSI_RESET
                  + ": Errore, il numero dei tentativi falliti di difficile può essere impostato tra 1 e "
                  +  (Integer.parseInt(String.valueOf(Partita.NUM_TENTATIVI_MEDIO_STANDARD)) - 1) + "!\n\n");
        }
      }
    } else if (partita.getDimensioneGrigliaPartita() == Griglia.DIMENSIONI_GRIGLIA_LARGE) {
      if (livelloDiGiocoDaSettare.equals("Facile")) {
        if (numTentativiUtente <= ((Griglia.DIMENSIONI_GRIGLIA_LARGE * Griglia.DIMENSIONI_GRIGLIA_LARGE)
                - naviTotali)
                && numTentativiUtente >= Partita.NUM_TENTATIVI_FACILE_LARGE - scartoRangeLarge) {
          GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale: " + GestioneStampa.ANSI_RESET + "OK \n\n");
          return true;
        } else {
          GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale" + GestioneStampa.ANSI_RESET
                  + ": Errore, il numero dei tentativi falliti di facile può essere impostato tra "
                  + (Integer.parseInt(String.valueOf(Partita.NUM_TENTATIVI_FACILE_LARGE)) - scartoRangeLarge)
                  + " e " + ((Griglia.DIMENSIONI_GRIGLIA_LARGE * Griglia.DIMENSIONI_GRIGLIA_LARGE)
                  - naviTotali) + "! \n\n");
        }
      } else if (livelloDiGiocoDaSettare.equals("Medio")) {
        if (numTentativiUtente < Partita.NUM_TENTATIVI_FACILE_LARGE - scartoRangeLarge
                && numTentativiUtente >= Partita.NUM_TENTATIVI_MEDIO_LARGE - scartoRangeLarge) {
          GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale: " + GestioneStampa.ANSI_RESET + "OK \n\n");
          return true;
        } else {
          GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale" + GestioneStampa.ANSI_RESET
                  + ": Errore, il numero dei tentativi falliti di medio può essere impostato tra "
                  + (Integer.parseInt(String.valueOf(Partita.NUM_TENTATIVI_MEDIO_LARGE)) - scartoRangeLarge)
                  + " e " + (Integer.parseInt(String.valueOf(Partita.NUM_TENTATIVI_FACILE_LARGE))
                  - scartoRangeLarge - 1)
                  + "! \n\n");
        }
      } else if (livelloDiGiocoDaSettare.equals("Difficile")) {
        if (numTentativiUtente < Partita.NUM_TENTATIVI_DIFFICILE_LARGE + scartoRangeLarge) {
          GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale: " + GestioneStampa.ANSI_RESET + "OK \n\n");
          return true;
        } else {
          GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale" + GestioneStampa.ANSI_RESET
                  + ": Errore, il numero dei tentativi falliti di difficile può essere impostato tra 1 e "
                  +  (Integer.parseInt(String.valueOf(Partita.NUM_TENTATIVI_DIFFICILE_LARGE)) - 1
                  + scartoRangeLarge) + "!\n\n");
        }
      }
    } else if (partita.getDimensioneGrigliaPartita() == Griglia.DIMENSIONI_GRIGLIA_EXTRALARGE) {
      if (livelloDiGiocoDaSettare.equals("Facile")) {
        if (numTentativiUtente <= ((Griglia.DIMENSIONI_GRIGLIA_EXTRALARGE * Griglia.DIMENSIONI_GRIGLIA_EXTRALARGE)
                - naviTotali)
                && numTentativiUtente >= Partita.NUM_TENTATIVI_MEDIO_EXTRALARGE + scartoRangeExtralarge) {
          GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale: " + GestioneStampa.ANSI_RESET + "OK \n\n");
          return true;
        } else {
          GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale" + GestioneStampa.ANSI_RESET
                  + ": Errore, il numero dei tentativi falliti di facile può essere impostato tra "
                  + (Integer.parseInt(String.valueOf(Partita.NUM_TENTATIVI_MEDIO_EXTRALARGE)) + scartoRangeExtralarge)
                  + " e " + ((Griglia.DIMENSIONI_GRIGLIA_EXTRALARGE * Griglia.DIMENSIONI_GRIGLIA_EXTRALARGE)
                  - naviTotali) + "! \n\n");
        }
      } else if (livelloDiGiocoDaSettare.equals("Medio")) {
        if (numTentativiUtente < Partita.NUM_TENTATIVI_MEDIO_EXTRALARGE + scartoRangeExtralarge
                && numTentativiUtente >= Partita.NUM_TENTATIVI_DIFFICILE_EXTRALARGE + scartoRangeExtralarge) {
          GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale: " + GestioneStampa.ANSI_RESET + "OK \n\n");
          return true;
        } else {
          GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale" + GestioneStampa.ANSI_RESET
                  + ": Errore, il numero dei tentativi falliti di medio può essere impostato tra "
                  + (Integer.parseInt(String.valueOf(Partita.NUM_TENTATIVI_DIFFICILE_EXTRALARGE))
                  + scartoRangeExtralarge)
                  + " e " +  (Integer.parseInt(String.valueOf(Partita.NUM_TENTATIVI_MEDIO_EXTRALARGE))
                  + scartoRangeExtralarge - 1) + "! \n\n");
        }
      } else if (livelloDiGiocoDaSettare.equals("Difficile")) {
        if (numTentativiUtente < Partita.NUM_TENTATIVI_DIFFICILE_EXTRALARGE + scartoRangeExtralarge) {
          GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale: " + GestioneStampa.ANSI_RESET + "OK \n\n");
          return true;
        } else {
          GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale" + GestioneStampa.ANSI_RESET
                  + ": Errore, il numero dei tentativi falliti di difficile può essere impostato tra 1 e "
                  +  (Integer.parseInt(String.valueOf(Partita.NUM_TENTATIVI_DIFFICILE_EXTRALARGE))
                  - 1 + scartoRangeExtralarge) + "!\n\n");
        }
      }
    } else {
      GestioneStampa.stampaMessaggio(GestioneStampa.ANSI_BLUE
              + "Battaglia Navale" + GestioneStampa.ANSI_RESET
              + ": Errore, tentativo non valido per la griglia standard! \n\n");
    }
    return false;
  }
}

