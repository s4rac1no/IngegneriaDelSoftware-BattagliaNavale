/**
 * <<Control>>
 * Responsabilità: Controlla il lessico, la sintassi
 * e la semantica dell'input dell'utente per verificare
 * che sia un comando o un tentativo di gioco in base
 * alla posizione del giocatore in partita.
 */

package it.uniba.app;

/** Classe che modella l'analizzatore.
 *
 * @author GruppoPatterson
 */
public class Analizzatore {

  /**
   * Attributo d'istanza che contiene
   * i token ricavati dall'inputUtente.
   */
  private String[] arrayToken;

  /**
   * Attributo d'istanza che contiene il codice
   * del comando digitato dall'utente, oppure
   * può contenere un codice per il comando
   * riconosciuto parzialmente o un codice per
   * indicare che il comando non è stato riconosciuto.
   */
  private int idComando;

  /**
   * Attributo statico che contiene il codice
   * per il comando riconsciuto in modo parziale.
   */
  public static final int CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE = 0;

  /**
   * Attributo statico che contiene il codice
   * per il riconoscimento del tentativo dell'utente.
   */
  public static final int CODICE_TENTATIVO = 777;

  /**
   * Attributo statico che contiene il codice
   * per il comando help.
   */
  public static final int CODICE_COMANDO_HELP = 1;

  /**
   * Attributo statico che contiene il codice
   * per il comando gioca.
   */
  public static final int CODICE_COMANDO_GIOCA = 2;

  /**
   * Attributo statico che contiene il codice
   * per il comando esci.
   */
  public static final int CODICE_COMANDO_ESCI = 3;

  /**
   * Attributo statico che contiene il codice
   * per il comando mostralivello.
   */
  public static final int CODICE_COMANDO_MOSTRALIVELLO = 4;

  /**
   * Attributo statico che contiene il codice di suggerimento
   * per i comandi mostralivello e mostranavi quando vengono
   * riconosciuti parzialmente.
   */
  public static final int CODICE_SUGGERIMENTO_MOSTRA = 45;

  /**
   * Attributo statico che contiene il codice di suggerimento
   * per i comandi che iniziano con la lettera 'm' quando vengono
   * riconosciuti parzialmente.
   */
  public static final int CODICE_SUGGERIMENTO_COMANDICONM = 454;

  /**
   * Attributo statico che contiene il codice di suggerimento
   * per i comandi che iniziando con la lettera 'e' quando vengono
   * riconosciuti parzialmente.
   */
  public static final int  CODICE_SUGGERIMENTO_COMANDICONE = 455;

  /**
   * Attributo statico che contiene il codice di suggerimento
   * per i comandi che iniziando con la lettera 's' quando vengono
   * riconosciuti parzialmente.
   */
  public static final int CODICE_SUGGERIMENTO_COMANDICONS = 456;

  /**
   * Attributo statico che contiene il codice
   * per il comando mostranavi.
   */
  public static final int CODICE_COMANDO_MOSTRANAVI = 5;

  /**
   * Attributo statico che contiene il codice
   * per il comando facile.
   */
  public static final int CODICE_COMANDO_FACILE = 6;

  /**
   * Attributo statico che contiene il codice
   * per il comando facile con il numero massimo
   * di tentativi falliti inseriti dall'utente.
   */
  public static final int CODICE_COMANDO_FACILE_CON_TENTATIVI = 66;

  /**
   * Attributo statico che contiene il codice
   * per il comando medio.
   */
  public static final int CODICE_COMANDO_MEDIO = 7;

  /**
   * Attributo statico che contiene il codice
   * per il comando medio con il numero massimo
   * di tentativi falliti inseriti dall'utente.
   */
  public static final int CODICE_COMANDO_MEDIO_CON_TENTATIVI = 77;

  /**
   * Attributo statico che contiene il codice
   * per il comando difficile.
   */
  public static final int CODICE_COMANDO_DIFFICILE = 8;

  /**
   * Attributo statico che contiene il codice
   * per il comando facile con il numero massimo
   * di tentativi falliti inseriti dall'utente.
   */
  public static final int CODICE_COMANDO_DIFFICILE_CON_TENTATIVI = 88;

  /**
   * Attributo statico che contiene il codice
   * per il comando svelagriglia.
   */
  public static final int CODICE_COMANDO_SVELAGRIGLIA = 9;

  /**
   * Attributo statico che contiene il codice
   * per il comando abbandona.
   */
  public static final int CODICE_COMANDO_ABBANDONA = 10;

  /**
   * Attributo statico che contiene il codice
   * per il comando standard.
   */
  public static final int CODICE_COMANDO_STANDARD = 11;

  /**
   * Attributo statico che contiene il codice
   * per il comando large.
   */
  public static final int CODICE_COMANDO_LARGE = 12;

  /**
   * Attributo statico che contiene il codice
   * per il comando extralarge.
   */
  public static final int CODICE_COMANDO_EXTRALARGE = 13;

  /**
   * Attributo statico che contiene il codice
   * per il comando mostragriglia.
   */
  public static final int CODICE_COMANDO_MOSTRAGRIGLIA = 14;

  /**
   * Attributo statico che contiene il codice
   * per il comando tempo.
   */
  public static final int CODICE_COMANDO_TEMPO = 100;

  /**
   * Attributo statico che contiene il codice
   * per il comando mostratempo.
   */
  public static final int CODICE_COMANDO_MOSTRATEMPO = 101;

  /**
   * Attributo statico che contiene il codice di suggerimento
   * per i comandi che iniziando con 'mostrat' quando vengono
   * riconosciuti parzialmente.
   */
  public static final int CODICE_SUGGERIMENTO_MOSTRAT = 111;

  /**
   * Attributo statico che contiene il codice
   * per il comando mostratentativi.
   */
  public static final int CODICE_COMANDO_MOSTRA_TENTATIVI = 15;

  /**
   * Attributo statico che contiene il codice
   * per il comando tentativi.
   */
  public static final int CODICE_COMANDO_TENTATIVI = 155;

  /**
   * Attributo statico che contiene il codice di suggerimento
   * per i comandi che iniziano con la lettera 't' quando vengono
   * riconosciuti parzialmente.
   */
  public static final int CODICE_SUGGERIMENTO_COMANDICONT = 150;

  /**
   * Costruttore della classe Analizzatore.
   */
  Analizzatore() {
  }

  /**
   * Metodo d'istanza che si occupa dello spezzettamento
   * dell'input da tastiera dell'utente in tanti token dato
   * un delimitatore.
   *
   * @param inputUtente Input da tastiera dell'utente
   */
  private void scanner(final String inputUtente) {
    arrayToken = inputUtente.split(" ");
  }

  /**
   * Metodo d'istanza che si occupa dell'analisi lessicale
   * di ogni token presente in arrayToken.
   *
   * @param statoGiocatore Posizione del giocatore nel gioco
   * @throws AnalizzatoreException Eccezione personalizzata per errori
   */
  private void analizzatoreLessicale(final Giocatore.Gioco statoGiocatore)
          throws AnalizzatoreException {
    for (int i = 0; i < arrayToken.length; i++) {
      if (statoGiocatore == Giocatore.Gioco.SCHERMATA_INIZIALE) {
        if (!arrayToken[i].matches("/?[a-z]+") && !arrayToken[i].matches("-?[0-9]+")) {
          throw new AnalizzatoreException(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale"
                  + GestioneStampa.ANSI_RESET + ": I comandi "
                  + "sono preceduti dal simbolo '/'! \n");
        }
      } else if (statoGiocatore == Giocatore.Gioco.GAME) {
        if (!arrayToken[i].matches("/[a-z]+") && !arrayToken[i].matches("-?[0-9]+")
                && !arrayToken[i].matches("[a-z]-([0-9]+)")) {
          throw new AnalizzatoreException(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale"
                  + GestioneStampa.ANSI_RESET + ": Non hai digitato nè un comando"
                  + " ne un tentativo: \n"
                  + "                  - I comandi sono preceduti dal simbolo '/' \n"
                  + "                  - Un tentativo è composto da lettere e numeri. Es:A-5 \n");
        }
      }
    }
  }


  /**
   * Metodo d'istanza che si occupa di analizzare sintatticamente e
   * semanticamente i token presenti nell'arrayToken.
   *
   * @param statoGiocatore enum della posizione del giocatore nel gioco
   * @return int, risultato dell'analisi dell'analizzatore
   * @throws AnalizzatoreException Eccezione personalizzata per errori
   */
  private int analizzatoreSintatticoSemantico(final Giocatore.Gioco statoGiocatore)
          throws AnalizzatoreException {
    idComando = -1;
    if (arrayToken.length > 0) {
      if (arrayToken[0].length() > 0) {
        if (!isComando(statoGiocatore)) {
          if (arrayToken[0].matches("-?[0-9]+")) {
            throw new AnalizzatoreException(GestioneStampa.ANSI_BLUE
                    + "Battaglia Navale"
                    + GestioneStampa.ANSI_RESET + ": Non hai digitato nè un comando"
                    + " ne un tentativo: \n"
                    + "                  - I comandi sono preceduti dal simbolo '/' \n"
                    + "                  - Un tentativo è composto da lettere e numeri. Es:A-5 \n");
          } else {
            return CODICE_TENTATIVO;
          }
        }

        verificaComandoHelp();
        verificaComandoGioca();
        verificaComandiConM();
        verificaComandoFacile();
        verificaComandoDifficile();
        verificaComandoAbbandona();
        verificaComandoConT();
        verificaComandiConS();
        verificaComandoLarge();
        verificaComandiConE();


      }
    }
    if (idComando == -1) {
      throw new AnalizzatoreException(GestioneStampa.ANSI_BLUE
              + "Battaglia Navale" + GestioneStampa.ANSI_RESET
              + ": Comando non riconosciuto, per informazioni digita "
              + GestioneStampa.ANSI_RED + "/help! \n" + GestioneStampa.ANSI_RESET);
    }
    return idComando;
  }

  /**
   * Metodo d'istanza che avvia l'analizzatore.
   *
   * @param inputUtente input dell'utente
   * @param statoGiocatore posizione del giocatore nel gioco
   * @return int, risultato dell'analisi dell'analizzatore
   * @throws AnalizzatoreException Eccezione personalizzata per errori
   */
  public int eseguiAnalizzatore(final String inputUtente, final Giocatore.Gioco statoGiocatore)
          throws AnalizzatoreException {
      if (inputUtente == null || inputUtente.isEmpty()) {
        if (statoGiocatore == Giocatore.Gioco.SCHERMATA_INIZIALE) {
          throw new AnalizzatoreException(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale"
                  + GestioneStampa.ANSI_RESET
                  + ": Digita un comando, per informazioni "
                  + GestioneStampa.ANSI_RED
                  + "/help! \n" + GestioneStampa.ANSI_RESET);
        } else if (statoGiocatore == Giocatore.Gioco.GAME) {
          throw new AnalizzatoreException(GestioneStampa.ANSI_BLUE
                  + "Battaglia Navale"
                  + GestioneStampa.ANSI_RESET
                  + ": Digita un comando o un tentativo,"
                  + " per informazioni "
                  + GestioneStampa.ANSI_RED + "/help! \n"
                  + GestioneStampa.ANSI_RESET);
        }
      } else {
        scanner(inputUtente);
        analizzatoreLessicale(statoGiocatore);
        return analizzatoreSintatticoSemantico(statoGiocatore);
      }

      return -1;
  }

  /**
   * Metodo d'istanza get che si occupa di dare in output
   * il parametro numerico dei comandi.
   *
   * @return String,
   */
  public String getParametroComando() {
    return arrayToken[1];
  }

  /**
   * Metodo d'istanza get che si occupa di dare in output
   * il tentativo digitato dal giocatore.
   *
   * @return String,
   */
  public String getTentativo() {
    return arrayToken[0];
  }

  /**
   * Metodo d'istanza che si occupa di verificare se l'utente
   * ha digitato un comando o meno.
   *
   * @return boolean, true se è un comando, false altrimenti
   */
  private boolean isComando(final Giocatore.Gioco statoGiocatore) throws AnalizzatoreException {
    if (arrayToken[0].charAt(0) != '/') {
      if (statoGiocatore == Giocatore.Gioco.SCHERMATA_INIZIALE) {
        throw new AnalizzatoreException(GestioneStampa.ANSI_BLUE
                + "Battaglia Navale" + GestioneStampa.ANSI_RESET + ": Non hai digitato un comando, "
                + " un comando è preceduto " + "dal simbolo '/'! \n");
      } else if (statoGiocatore == Giocatore.Gioco.GAME) {
        return false;
      }
    }
    return true;
  }

  /**
   * Metodo d'istanza che si occupa di verificare se l'utente
   * ha digitato il comando tempo.
   */
  private void verificaComandoConT() {
    if (arrayToken[0].charAt(1) == 't' && idComando != Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE) {
      if (arrayToken[0].equalsIgnoreCase("/tempo")) {
        if (arrayToken.length == 2) {
          if (arrayToken[1].matches("-?[0-9]+")) {
            idComando = CODICE_COMANDO_TEMPO;
          } else {
            idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
            GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_TEMPO);
          }
        } else {
          idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
          GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_TEMPO);
        }
      } else if (arrayToken[0].contains("/tem")) {
        idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
        GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_TEMPO);
      } else if (arrayToken[0].equalsIgnoreCase("/tentativi")) {
        if (arrayToken.length == 2) {
          if (arrayToken[1].matches("-?[0-9]+")) {
            idComando = CODICE_COMANDO_TENTATIVI;
          } else {
            idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
            GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_TENTATIVI);
          }
        } else {
          idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
          GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_TENTATIVI);
        }
      } else if (arrayToken[0].contains("/ten")) {
        idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
        GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_TENTATIVI);
      } else if (arrayToken[0].contains("/t")) {
        idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
        GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_SUGGERIMENTO_COMANDICONT);
      }
    }
  }

  /**
   * Metodo d'istanza che si occupa di verificare se l'utente
   * ha digitato il comando abbandona.
   */
  private void verificaComandoAbbandona() {
    if (arrayToken[0].charAt(1) == 'a' && idComando != Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE) {
      if (arrayToken[0].equalsIgnoreCase("/abbandona")) {
        if (arrayToken.length == 1) {
          idComando = CODICE_COMANDO_ABBANDONA;
        } else {
          idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
          GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_ABBANDONA);
        }
      } else {
        idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
        GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_ABBANDONA);
      }
    }
  }

  /**
   * Metodo d'istanza che si occupa di verificare se l'utente
   * ha digitato il comando difficile o difficile con tentativi
   * falliti inseriti dall'utente.
   */
  private void verificaComandoDifficile() {
    if (arrayToken[0].charAt(1) == 'd' && idComando != Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE) {
      if (arrayToken[0].equalsIgnoreCase("/difficile")) {
        if (arrayToken.length == 1) {
          idComando = CODICE_COMANDO_DIFFICILE;
        } else if (arrayToken.length == 2) {
          if (arrayToken[1].matches("-?[0-9]+")) {
            idComando = CODICE_COMANDO_DIFFICILE_CON_TENTATIVI;
          } else {
            idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
            GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_DIFFICILE);
          }
        } else {
          idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
          GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_DIFFICILE);
        }
      } else {
        idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
        GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_DIFFICILE);
      }
    }
  }

  /**
   * Metodo d'istanza che si occupa di verificare se l'utente
   * ha digitato il comando facile o facile con tentativi
   * falliti inseriti dall'utente.
   */
  private void verificaComandoFacile() {
    if (arrayToken[0].charAt(1) == 'f' && idComando != Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE) {
      if (arrayToken[0].equalsIgnoreCase("/facile")) {
        if (arrayToken.length == 1) {
          idComando = CODICE_COMANDO_FACILE;
        } else if (arrayToken.length == 2) {
          if (arrayToken[1].matches("-?[0-9]+")) {
            idComando = CODICE_COMANDO_FACILE_CON_TENTATIVI;
          } else {
            idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
            GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_FACILE);
          }
        } else {
          idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
          GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_FACILE);
        }
      } else {
        idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
        GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_FACILE);
      }
    }
  }

  /**
   * Metodo d'istanza che si occupa di verificare se l'utente
   * ha digitato il comando gioca.
   */
  private void verificaComandoGioca() {
    if (arrayToken[0].charAt(1) == 'g' && idComando != Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE) {
      if (arrayToken.length == 1) {
        if (arrayToken[0].equalsIgnoreCase("/gioca")) {
          idComando = CODICE_COMANDO_GIOCA;
        } else {
          idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
          GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_GIOCA);
        }
      } else {
        idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
        GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_GIOCA);
      }
    }
  }

  /**
   * Metodo d'istanza che si occupa di verificare se l'utente
   * ha digitato il comando help.
   */
  private void verificaComandoHelp() {
    if (arrayToken[0].charAt(1) == 'h'
            && idComando != Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE) { // Analizzatore Sintattico
      if (arrayToken.length == 1) {
        if (arrayToken[0].equalsIgnoreCase("/help")) {
          idComando = CODICE_COMANDO_HELP;
        } else {
          idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
          GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_HELP);
        }
      } else {
        idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
        GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_HELP);
      }
    }
  }

  /**
   * Metodo d'istanza che si occupa di verificare se l'utente
   * ha digitato un comando che inizia con la lettera 'm'.
   */
  private void verificaComandiConM() {
    if (arrayToken[0].charAt(1) == 'm' && idComando != Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE) {
      if (arrayToken[0].equalsIgnoreCase("/mostralivello")) {
        if (arrayToken.length == 1) {
          idComando = CODICE_COMANDO_MOSTRALIVELLO;
        } else {
          idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
          GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_MOSTRALIVELLO);
        }
      } else if (arrayToken[0].contains("/mostral")) {
        idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
        GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_MOSTRALIVELLO);
      } else if (arrayToken[0].equalsIgnoreCase("/mostranavi")) {
        if (arrayToken.length == 1) {
          idComando = CODICE_COMANDO_MOSTRANAVI;
        } else {
          idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
          GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_MOSTRANAVI);
        }
      } else if (arrayToken[0].contains("/mostran")) {
          idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
          GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_MOSTRANAVI);
      } else if (arrayToken[0].equalsIgnoreCase("/mostratempo")) {
        if (arrayToken.length == 1) {
          idComando = CODICE_COMANDO_MOSTRATEMPO;
        } else {
          idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
          GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_MOSTRATEMPO);
        }
      } else if (arrayToken[0].contains("/mostratem")) {
          idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
          GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_MOSTRATEMPO);
      } else if (arrayToken[0].equalsIgnoreCase("/mostragriglia")) {
        if (arrayToken.length == 1) {
          idComando = CODICE_COMANDO_MOSTRAGRIGLIA;
        } else {
          idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
          GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_MOSTRAGRIGLIA);
        }
      } else if (arrayToken[0].contains("/mostrag")) {
          idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
          GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_MOSTRAGRIGLIA);
      } else if (arrayToken[0].equalsIgnoreCase("/mostratentativi")) {
        if (arrayToken.length == 1) {
          idComando = CODICE_COMANDO_MOSTRA_TENTATIVI;
        } else {
          idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
          GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_MOSTRA_TENTATIVI);
        }
      } else if (arrayToken[0].contains("/mostraten")) {
        idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
        GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_MOSTRA_TENTATIVI);
      } else if (arrayToken[0].length() > 2) {
        if (arrayToken[0].charAt(2) == 'e') {
          if (arrayToken[0].equalsIgnoreCase("/medio")) {
            if (arrayToken.length == 1) {
              idComando = CODICE_COMANDO_MEDIO;
            } else if (arrayToken.length == 2) {
              if (arrayToken[1].matches("-?[0-9]+")) {
                idComando = CODICE_COMANDO_MEDIO_CON_TENTATIVI;
              } else {
                idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
                GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_MEDIO);
              }
            } else {
              idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
              GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_MEDIO);
            }
          } else {
            idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
            GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_MEDIO);
          }
        } else if (arrayToken[0].contains("/mostrat")) {
          idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
          GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_SUGGERIMENTO_MOSTRAT);
        } else {
          idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
          GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_SUGGERIMENTO_MOSTRA);
        }
      } else {
        idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
        GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_SUGGERIMENTO_COMANDICONM);
      }
    }
  }

  /**
   * Metodo d'istanza che si occupa di verificare se l'utente
   * ha digitato un comando che inizia con la lettera 's'.
   */
    public void verificaComandiConS() {
      if (arrayToken[0].charAt(1) == 's') {
        if (arrayToken[0].equalsIgnoreCase("/svelagriglia")) {
          if (arrayToken.length == 1) {
            idComando = CODICE_COMANDO_SVELAGRIGLIA;
          } else {
            idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
            GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_SVELAGRIGLIA);
          }
        } else if (arrayToken[0].contains("/sv")) {
          idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
          GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_SVELAGRIGLIA);
        } else if (arrayToken[0].length() > 2) {
          if (arrayToken[0].charAt(2) == 't') {
            if (arrayToken[0].equalsIgnoreCase("/standard")) {
              if (arrayToken.length == 1) {
                idComando = CODICE_COMANDO_STANDARD;
              } else {
                idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
                GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_STANDARD);
              }
            } else if (arrayToken[0].contains("/st")) {
              idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
              GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_STANDARD);
            } else {
              idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
              GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_STANDARD);
            }
          } else {
            idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
            GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_STANDARD);
          }
        } else {
          idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
          GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_SUGGERIMENTO_COMANDICONS);
        }
      }

    }

  /**
   * Metodo d'istanza che si occupa di verificare se l'utente
   * ha digitato il comando large.
   */
    public void verificaComandoLarge() {
      if (arrayToken[0].charAt(1) == 'l') {
        if (arrayToken[0].equalsIgnoreCase("/large")) {
          if (arrayToken.length == 1) {
            idComando = CODICE_COMANDO_LARGE;
          } else {
            idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
            GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_LARGE);
          }
        } else {
          idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
          GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_LARGE);
        }
      }
    }

  /**
   * Metodo d'istanza che si occupa di verificare se l'utente
   * ha digitato un comando che inizia con la lettera 'e'.
   */
  public void verificaComandiConE() {
    if (arrayToken[0].charAt(1) == 'e') {
      if (arrayToken[0].equalsIgnoreCase("/esci")) {
        if (arrayToken.length == 1) {
          idComando = CODICE_COMANDO_ESCI;
        } else {
          idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
          GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_ESCI);
        }
      } else if (arrayToken[0].contains("/es")) {
        idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
        GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_ESCI);
      } else if (arrayToken[0].length() > 2) {
        if (arrayToken[0].charAt(2) == 'x') {
          if (arrayToken[0].equalsIgnoreCase("/extralarge")) {
            if (arrayToken.length == 1) {
              idComando = CODICE_COMANDO_EXTRALARGE;
            } else {
              idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
              GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_EXTRALARGE);
            }
          } else if (arrayToken[0].contains("/st")) {
            idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
            GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_EXTRALARGE);
          } else {
            idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
            GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_EXTRALARGE);
          }
        } else {
          idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
          GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_COMANDO_EXTRALARGE);
        }
      } else {
        idComando = CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE;
        GestioneStampa.stampaSuggerimentiAnalizzatore(CODICE_SUGGERIMENTO_COMANDICONE);
      }
    }
  }

  /**
   * Metodo d'istanza get per l'attributo
   * arrayToken.
   *
   * @return arrayToken
   */
  public String[] getArrayToken() {
    return arrayToken.clone();
  }
}


