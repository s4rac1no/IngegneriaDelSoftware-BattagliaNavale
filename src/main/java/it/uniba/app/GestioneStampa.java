/**
 * <<Boundary>>
 * Responsabilità: Gestisce la stampa a video di messaggi.
 */

package it.uniba.app;

/**
 * Classe che si occupa gestire la stampa a video dei messaggi
 * del gioco. Per migliorare l'interfaccia e la UX dell'utente
 * sono stati inseriti i colori e una particolare formattazione
 * dei messaggi.
 *
 * @author GruppoPatterson
 */
  public final class GestioneStampa {

  /**
   * Attributo statico che contiene il colore di default.
   */
  public static final String ANSI_RESET = "\u001B[0m";

  /**
   * Attributo statico che contiene il colore rosso.
   */
  public static final String ANSI_RED = "\u001B[31m";

  /**
   * Attributo statico che contiene il colore verde.
   */
  public static final String ANSI_GREEN = "\u001B[32m";

  /**
   * Attributo statico che contiene il colore di giallo.
   */
  public static final String ANSI_YELLOW = "\u001B[33m";

  /**
   * Attributo statico che contiene il colore di blu.
   */
  public static final String ANSI_BLUE = "\u001B[34m";

  /**
   * Costruttore di GestioneStampa.
   */
  private GestioneStampa() {
  }

  /**
   * Metodo statico che stampa
   * il titolo del gioco.
   */
  public static void stampareTitoloGioco() {
    stampareScritteInAsciiArt("BATTAGLIA ", ANSI_BLUE);
    stampareScritteInAsciiArt("NAVALE", ANSI_BLUE);
  }

  /**
   * Metodo statico che stampa GameOver.
   */
  public static void stampareGameOver() {
    stampareScritteInAsciiArt("GAME OVER", ANSI_RED);
  }

  /**
   * Metodo statico che stampa Win.
   */
  public static void stampareWin() {
    stampareScritteInAsciiArt("WIN ", ANSI_GREEN);
  }

  /**
   * Metodo statico che si occupa
   * di pulire/cancellare il contenuto
   * del terminale.
   */
  public static void clearTerminale() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  /**
   * Metodo statico che si occupa di stampare
   * in AsciiArt il titolo del gioco.
   *
   * @param input
   * @param color
   */
  public static void stampareScritteInAsciiArt(final String input,
                                               final String color) {

    System.out.println(color);

    stamparePrimaRiga(input);
    System.out.println();
    stampareSecondaRiga(input);
    System.out.println();
    stampareTerzaRiga(input);
    System.out.println();
    stampareQuartaRiga(input);
    System.out.println();
    stampareQuintaRiga(input);
    System.out.println();
    stampareSestaRiga(input);

    System.out.println(ANSI_RESET + "\n");
  }

  /**
   * Metodo statico che si occupa di convertire
   * la prima riga del titolo in AsciiArt.
   *
   * @param input
   */
  private static void stamparePrimaRiga(final String input) {
    int posizione;

    posizione = 0;
    while (posizione < input.length()) {
      if (input.charAt(posizione) == 'A'
              || input.charAt(posizione) == 'a') {
        System.out.printf("  ___   ");
      } else if (input.charAt(posizione) == 'B'
              || input.charAt(posizione) == 'b') {
        System.out.printf(" _____  ");
      } else if (input.charAt(posizione) == 'C'
              || input.charAt(posizione) == 'c') {
        System.out.printf(" _____  ");
      } else if (input.charAt(posizione) == 'D'
              || input.charAt(posizione) == 'd') {
        System.out.printf(" _____  ");
      } else if (input.charAt(posizione) == 'E'
              || input.charAt(posizione) == 'e') {
        System.out.printf(" _____  ");
      } else if (input.charAt(posizione) == 'F'
              || input.charAt(posizione) == 'f') {
        System.out.printf(" _____  ");
      } else if (input.charAt(posizione) == 'G'
              || input.charAt(posizione) == 'g') {
        System.out.printf(" _____  ");
      } else if (input.charAt(posizione) == 'H'
              || input.charAt(posizione) == 'h') {
        System.out.printf(" _   _  ");
      } else if (input.charAt(posizione) == 'I'
              || input.charAt(posizione) == 'i') {
        System.out.printf(" _____  ");
      } else if (input.charAt(posizione) == 'J'
              || input.charAt(posizione) == 'j') {
        System.out.printf("   ___  ");
      } else if (input.charAt(posizione) == 'K'
              || input.charAt(posizione) == 'k') {
        System.out.printf(" _   __ ");
      } else if (input.charAt(posizione) == 'L'
              || input.charAt(posizione) == 'l') {
        System.out.printf(" _      ");
      } else if (input.charAt(posizione) == 'M'
              || input.charAt(posizione) == 'm') {
        System.out.printf(" __  __  ");
      } else if (input.charAt(posizione) == 'N'
              || input.charAt(posizione) == 'n') {
        System.out.printf(" _   _  ");
      } else if (input.charAt(posizione) == 'O'
              || input.charAt(posizione) == 'o') {
        System.out.printf(" _____  ");
      } else if (input.charAt(posizione) == 'P'
              || input.charAt(posizione) == 'p') {
        System.out.printf(" _____  ");
      } else if (input.charAt(posizione) == 'Q'
              || input.charAt(posizione) == 'q') {
        System.out.printf(" _____  ");
      } else if (input.charAt(posizione) == 'R'
              || input.charAt(posizione) == 'r') {
        System.out.printf(" _____  ");
      } else if (input.charAt(posizione) == 'S'
              || input.charAt(posizione) == 's') {
        System.out.printf(" _____  ");
      } else if (input.charAt(posizione) == 'T'
              || input.charAt(posizione) == 't') {
        System.out.printf(" _____  ");
      } else if (input.charAt(posizione) == 'U'
              || input.charAt(posizione) == 'u') {
        System.out.printf(" _   _  ");
      } else if (input.charAt(posizione) == 'V'
              || input.charAt(posizione) == 'v') {
        System.out.printf(" _   _  ");
      } else if (input.charAt(posizione) == 'W'
              || input.charAt(posizione) == 'w') {
        System.out.printf(" _    _  ");
      } else if (input.charAt(posizione) == 'X'
              || input.charAt(posizione) == 'x') {
        System.out.printf("__   __ ");
      } else if (input.charAt(posizione) == 'Y'
              || input.charAt(posizione) == 'y') {
        System.out.printf("__   __ ");
      } else if (input.charAt(posizione) == 'Z'
              || input.charAt(posizione) == 'z') {
        System.out.printf(" ______ ");
      } else if (input.charAt(posizione) == '!') {
        System.out.printf(" _  ");
      } else if (input.charAt(posizione) == '\'') {
        System.out.printf(" _  ");
      }

      posizione++;
    }
  }

  /**
   * Metodo statico che si occupa di convertire
   * la seconda riga del titolo in AsciiArt.
   *
   * @param input
   */
  private static void stampareSecondaRiga(final String input) {
    int posizione;
    posizione = 0;
    while (posizione < input.length()) {
      if (input.charAt(posizione) == 'A'
              || input.charAt(posizione) == 'a') {
        System.out.printf(" / _ \\  ");
      } else if (input.charAt(posizione) == 'B'
              || input.charAt(posizione) == 'b') {
        System.out.printf("| ___ \\ ");
      } else if (input.charAt(posizione) == 'C'
              || input.charAt(posizione) == 'c') {
        System.out.printf("/  __ \\ ");
      } else if (input.charAt(posizione) == 'D'
              || input.charAt(posizione) == 'd') {
        System.out.printf("|  _  \\ ");
      } else if (input.charAt(posizione) == 'E'
              || input.charAt(posizione) == 'e') {
        System.out.printf("|  ___| ");
      } else if (input.charAt(posizione) == 'F'
              || input.charAt(posizione) == 'f') {
        System.out.printf("|  ___| ");
      } else if (input.charAt(posizione) == 'G'
              || input.charAt(posizione) == 'g') {
        System.out.printf("|  __ \\ ");
      } else if (input.charAt(posizione) == 'H'
              || input.charAt(posizione) == 'h') {
        System.out.printf("| | | | ");
      } else if (input.charAt(posizione) == 'I'
              || input.charAt(posizione) == 'i') {
        System.out.printf("|_   _| ");
      } else if (input.charAt(posizione) == 'J'
              || input.charAt(posizione) == 'j') {
        System.out.printf("  |_  | ");
      } else if (input.charAt(posizione) == 'K'
              || input.charAt(posizione) == 'k') {
        System.out.printf("| | / / ");
      } else if (input.charAt(posizione) == 'L'
              || input.charAt(posizione) == 'l') {
        System.out.printf("| |     ");
      } else if (input.charAt(posizione) == 'M'
              || input.charAt(posizione) == 'm') {
        System.out.printf("|  \\/  | ");
      } else if (input.charAt(posizione) == 'N'
              || input.charAt(posizione) == 'n') {
        System.out.printf("| \\ | | ");
      } else if (input.charAt(posizione) == 'O'
              || input.charAt(posizione) == 'o') {
        System.out.printf("|  _  | ");
      } else if (input.charAt(posizione) == 'P'
              || input.charAt(posizione) == 'p') {
        System.out.printf("| ___ \\ ");
      } else if (input.charAt(posizione) == 'Q'
              || input.charAt(posizione) == 'q') {
        System.out.printf("|  _  | ");
      } else if (input.charAt(posizione) == 'R'
              || input.charAt(posizione) == 'r') {
        System.out.printf("| ___ \\ ");
      } else if (input.charAt(posizione) == 'S'
              || input.charAt(posizione) == 's') {
        System.out.printf("/  ___| ");
      } else if (input.charAt(posizione) == 'T'
              || input.charAt(posizione) == 't') {
        System.out.printf("|_   _| ");
      } else if (input.charAt(posizione) == 'U'
              || input.charAt(posizione) == 'u') {
        System.out.printf("| | | | ");
      } else if (input.charAt(posizione) == 'V'
              || input.charAt(posizione) == 'v') {
        System.out.printf("| | | | ");
      } else if (input.charAt(posizione) == 'W'
              || input.charAt(posizione) == 'w') {
        System.out.printf("| |  | | ");
      } else if (input.charAt(posizione) == 'X'
              || input.charAt(posizione) == 'x') {
        System.out.printf("\\ \\ / / ");
      } else if (input.charAt(posizione) == 'Y'
              || input.charAt(posizione) == 'y') {
        System.out.printf("\\ \\ / / ");
      } else if (input.charAt(posizione) == 'Z'
              || input.charAt(posizione) == 'z') {
        System.out.printf("|___  / ");
      } else if (input.charAt(posizione) == '!') {
        System.out.printf("| | ");
      } else if (input.charAt(posizione) == '\'') {
        System.out.printf("( ) ");
      }
      posizione++;
    }
  }

  /**
   * Metodo statico che si occupa di convertire
   * la terza riga del titolo in AsciiArt.
   *
   * @param input
   */
  private static void stampareTerzaRiga(final String input) {
    int posizione;

    posizione = 0;
    while (posizione < input.length()) {
      if (input.charAt(posizione) == 'A'
              || input.charAt(posizione) == 'a') {
        System.out.printf("/ /_\\ \\ ");
      } else if (input.charAt(posizione) == 'B'
              || input.charAt(posizione) == 'b') {
        System.out.printf("| |_/ / ");
      } else if (input.charAt(posizione) == 'C'
              || input.charAt(posizione) == 'c') {
        System.out.printf("| /  \\/ ");
      } else if (input.charAt(posizione) == 'D'
              || input.charAt(posizione) == 'd') {
        System.out.printf("| | | | ");
      } else if (input.charAt(posizione) == 'E'
              || input.charAt(posizione) == 'e') {
        System.out.printf("| |__   ");
      } else if (input.charAt(posizione) == 'F'
              || input.charAt(posizione) == 'f') {
        System.out.printf("| |_    ");
      } else if (input.charAt(posizione) == 'G'
              || input.charAt(posizione) == 'g') {
        System.out.printf("| |  \\/ ");
      } else if (input.charAt(posizione) == 'H'
              || input.charAt(posizione) == 'h') {
        System.out.printf("| |_| | ");
      } else if (input.charAt(posizione) == 'I'
              || input.charAt(posizione) == 'i') {
        System.out.printf("  | |   ");
      } else if (input.charAt(posizione) == 'J'
              || input.charAt(posizione) == 'j') {
        System.out.printf("    | | ");
      } else if (input.charAt(posizione) == 'K'
              || input.charAt(posizione) == 'k') {
        System.out.printf("| |/ /  ");
      } else if (input.charAt(posizione) == 'L'
              || input.charAt(posizione) == 'l') {
        System.out.printf("| |     ");
      } else if (input.charAt(posizione) == 'M'
              || input.charAt(posizione) == 'm') {
        System.out.printf("| .  . | ");
      } else if (input.charAt(posizione) == 'N'
              || input.charAt(posizione) == 'n') {
        System.out.printf("|  \\| | ");
      } else if (input.charAt(posizione) == 'O'
              || input.charAt(posizione) == 'o') {
        System.out.printf("| | | | ");
      } else if (input.charAt(posizione) == 'P'
              || input.charAt(posizione) == 'p') {
        System.out.printf("| |_/ / ");
      } else if (input.charAt(posizione) == 'Q'
              || input.charAt(posizione) == 'q') {
        System.out.printf("| | | | ");
      } else if (input.charAt(posizione) == 'R'
              || input.charAt(posizione) == 'r') {
        System.out.printf("| |_/ / ");
      } else if (input.charAt(posizione) == 'S'
              || input.charAt(posizione) == 's') {
        System.out.printf("\\ `--.  ");
      } else if (input.charAt(posizione) == 'T'
              || input.charAt(posizione) == 't') {
        System.out.printf("  | |   ");
      } else if (input.charAt(posizione) == 'U'
              || input.charAt(posizione) == 'u') {
        System.out.printf("| | | | ");
      } else if (input.charAt(posizione) == 'V'
              || input.charAt(posizione) == 'v') {
        System.out.printf("| | | | ");
      } else if (input.charAt(posizione) == 'W'
              || input.charAt(posizione) == 'w') {
        System.out.printf("| |  | | ");
      } else if (input.charAt(posizione) == 'X'
              || input.charAt(posizione) == 'x') {
        System.out.printf(" \\ V /  ");
      } else if (input.charAt(posizione) == 'Y'
              || input.charAt(posizione) == 'y') {
        System.out.printf(" \\ V /  ");
      } else if (input.charAt(posizione) == 'Z'
              || input.charAt(posizione) == 'z') {
        System.out.printf("   / /  ");
      } else if (input.charAt(posizione) == '!') {
        System.out.printf("| | ");
      } else if (input.charAt(posizione) == '\'') {
        System.out.printf("|/  ");
      }
      posizione++;
    }
  }

  /**
   * Metodo statico che si occupa di convertire
   * la quarta riga del titolo in AsciiArt.
   *
   * @param input
   */
  private static void stampareQuartaRiga(final String input) {
    int posizione;

    posizione = 0;
    while (posizione < input.length()) {
      if (input.charAt(posizione) == 'A'
              || input.charAt(posizione) == 'a') {
        System.out.printf("|  _  | ");
      } else if (input.charAt(posizione) == 'B'
              || input.charAt(posizione) == 'b') {
        System.out.printf("| ___ \\ ");
      } else if (input.charAt(posizione) == 'C'
              || input.charAt(posizione) == 'c') {
        System.out.printf("| |     ");
      } else if (input.charAt(posizione) == 'D'
              || input.charAt(posizione) == 'd') {
        System.out.printf("| | | | ");
      } else if (input.charAt(posizione) == 'E'
              || input.charAt(posizione) == 'e') {
        System.out.printf("|  __|  ");
      } else if (input.charAt(posizione) == 'F'
              || input.charAt(posizione) == 'f') {
        System.out.printf("|  _|   ");
      } else if (input.charAt(posizione) == 'G'
              || input.charAt(posizione) == 'g') {
        System.out.printf("| | __  ");
      } else if (input.charAt(posizione) == 'H'
              || input.charAt(posizione) == 'h') {
        System.out.printf("|  _  | ");
      } else if (input.charAt(posizione) == 'I'
              || input.charAt(posizione) == 'i') {
        System.out.printf("  | |   ");
      } else if (input.charAt(posizione) == 'J'
              || input.charAt(posizione) == 'j') {
        System.out.printf("    | | ");
      } else if (input.charAt(posizione) == 'K'
              || input.charAt(posizione) == 'k') {
        System.out.printf("|    \\  ");
      } else if (input.charAt(posizione) == 'L'
              || input.charAt(posizione) == 'l') {
        System.out.printf("| |     ");
      } else if (input.charAt(posizione) == 'M'
              || input.charAt(posizione) == 'm') {
        System.out.printf("| |\\/| | ");
      } else if (input.charAt(posizione) == 'N'
              || input.charAt(posizione) == 'n') {
        System.out.printf("| . ` | ");
      } else if (input.charAt(posizione) == 'O'
              || input.charAt(posizione) == 'o') {
        System.out.printf("| | | | ");
      } else if (input.charAt(posizione) == 'P'
              || input.charAt(posizione) == 'p') {
        System.out.printf("|  __/  ");
      } else if (input.charAt(posizione) == 'Q'
              || input.charAt(posizione) == 'q') {
        System.out.printf("| | | | ");
      } else if (input.charAt(posizione) == 'R'
              || input.charAt(posizione) == 'r') {
        System.out.printf("|    /  ");
      } else if (input.charAt(posizione) == 'S'
              || input.charAt(posizione) == 's') {
        System.out.printf(" `--. \\ ");
      } else if (input.charAt(posizione) == 'T'
              || input.charAt(posizione) == 't') {
        System.out.printf("  | |   ");
      } else if (input.charAt(posizione) == 'U'
              || input.charAt(posizione) == 'u') {
        System.out.printf("| | | | ");
      } else if (input.charAt(posizione) == 'V'
              || input.charAt(posizione) == 'v') {
        System.out.printf("| | | | ");
      } else if (input.charAt(posizione) == 'W'
              || input.charAt(posizione) == 'w') {
        System.out.printf("| |/\\| | ");
      } else if (input.charAt(posizione) == 'X'
              || input.charAt(posizione) == 'x') {
        System.out.printf(" / ^ \\  ");
      } else if (input.charAt(posizione) == 'Y'
              || input.charAt(posizione) == 'y') {
        System.out.printf("  \\ /   ");
      } else if (input.charAt(posizione) == 'Z'
              || input.charAt(posizione) == 'z') {
        System.out.printf("  / /   ");
      } else if (input.charAt(posizione) == '!') {
        System.out.printf("| | ");
      } else if (input.charAt(posizione) == '\'') {
        System.out.printf("    ");
      }

      posizione++;
    }
  }

  /**
   * Metodo statico che si occupa di convertire
   * la quarta riga del titolo in AsciiArt.
   *
   * @param input
   */
  private static void stampareQuintaRiga(final String input) {
    int posizione;
    posizione = 0;
    while (posizione < input.length()) {
      if (input.charAt(posizione) == 'A'
              || input.charAt(posizione) == 'a') {
        System.out.printf("| | | | ");
      } else if (input.charAt(posizione) == 'B'
              || input.charAt(posizione) == 'b') {
        System.out.printf("| |_/ / ");
      } else if (input.charAt(posizione) == 'C'
              || input.charAt(posizione) == 'c') {
        System.out.printf("| \\__/\\ ");
      } else if (input.charAt(posizione) == 'D'
              || input.charAt(posizione) == 'd') {
        System.out.printf("| |/ /  ");
      } else if (input.charAt(posizione) == 'E'
              || input.charAt(posizione) == 'e') {
        System.out.printf("| |___  ");
      } else if (input.charAt(posizione) == 'F'
              || input.charAt(posizione) == 'f') {
        System.out.printf("| |     ");
      } else if (input.charAt(posizione) == 'G'
              || input.charAt(posizione) == 'g') {
        System.out.printf("| |_\\ \\ ");
      } else if (input.charAt(posizione) == 'H'
              || input.charAt(posizione) == 'h') {
        System.out.printf("| | | | ");
      } else if (input.charAt(posizione) == 'I'
              || input.charAt(posizione) == 'i') {
        System.out.printf(" _| |_  ");
      } else if (input.charAt(posizione) == 'J'
              || input.charAt(posizione) == 'j') {
        System.out.printf("/\\__/ / ");
      } else if (input.charAt(posizione) == 'K'
              || input.charAt(posizione) == 'k') {
        System.out.printf("| |\\  \\ ");
      } else if (input.charAt(posizione) == 'L'
              || input.charAt(posizione) == 'l') {
        System.out.printf("| |____ ");
      } else if (input.charAt(posizione) == 'M'
              || input.charAt(posizione) == 'm') {
        System.out.printf("| |  | | ");
      } else if (input.charAt(posizione) == 'N'
              || input.charAt(posizione) == 'n') {
        System.out.printf("| |\\  | ");
      } else if (input.charAt(posizione) == 'O'
              || input.charAt(posizione) == 'o') {
        System.out.printf("\\ \\_/ / ");
      } else if (input.charAt(posizione) == 'P'
              || input.charAt(posizione) == 'p') {
        System.out.printf("| |     ");
      } else if (input.charAt(posizione) == 'Q'
              || input.charAt(posizione) == 'q') {
        System.out.printf("\\ \\/' / ");
      } else if (input.charAt(posizione) == 'R'
              || input.charAt(posizione) == 'r') {
        System.out.printf("| |\\ \\  ");
      } else if (input.charAt(posizione) == 'S'
              || input.charAt(posizione) == 's') {
        System.out.printf("/\\__/ / ");
      } else if (input.charAt(posizione) == 'T'
              || input.charAt(posizione) == 't') {
        System.out.printf("  | |   ");
      } else if (input.charAt(posizione) == 'U'
              || input.charAt(posizione) == 'u') {
        System.out.printf("| |_| | ");
      } else if (input.charAt(posizione) == 'V'
              || input.charAt(posizione) == 'v') {
        System.out.printf("\\ \\_/ / ");
      } else if (input.charAt(posizione) == 'W'
              || input.charAt(posizione) == 'w') {
        System.out.printf("\\  /\\  / ");
      } else if (input.charAt(posizione) == 'X'
              || input.charAt(posizione) == 'x') {
        System.out.printf("/ / \\ \\ ");
      } else if (input.charAt(posizione) == 'Y'
              || input.charAt(posizione) == 'y') {
        System.out.printf("  | |   ");
      } else if (input.charAt(posizione) == 'Z'
              || input.charAt(posizione) == 'z') {
        System.out.printf("./ /___ ");
      } else if (input.charAt(posizione) == '!') {
        System.out.printf("|_| ");
      } else if (input.charAt(posizione) == '\'') {
        System.out.printf("    ");
      }

      posizione++;
    }
  }

  /**
   * Metodo statico che si occupa di convertire
   * la sesta riga del titolo in AsciiArt.
   *
   * @param input
   */
  private static void stampareSestaRiga(final String input) {
    int posizione;

    posizione = 0;
    while (posizione < input.length()) {
      if (input.charAt(posizione) == 'A'
              || input.charAt(posizione) == 'a') {
        System.out.printf("\\_| |_/ ");
      } else if (input.charAt(posizione) == 'B'
              || input.charAt(posizione) == 'b') {
        System.out.printf("\\____/  ");
      } else if (input.charAt(posizione) == 'C'
              || input.charAt(posizione) == 'c') {
        System.out.printf(" \\____/ ");
      } else if (input.charAt(posizione) == 'D'
              || input.charAt(posizione) == 'd') {
        System.out.printf("|___/   ");
      } else if (input.charAt(posizione) == 'E'
              || input.charAt(posizione) == 'e') {
        System.out.printf("\\____/  ");
      } else if (input.charAt(posizione) == 'F'
              || input.charAt(posizione) == 'f') {
        System.out.printf("\\_|     ");
      } else if (input.charAt(posizione) == 'G'
              || input.charAt(posizione) == 'g') {
        System.out.printf(" \\____/ ");
      } else if (input.charAt(posizione) == 'H'
              || input.charAt(posizione) == 'h') {
        System.out.printf("\\_| |_/ ");
      } else if (input.charAt(posizione) == 'I'
              || input.charAt(posizione) == 'i') {
        System.out.printf(" \\___/  ");
      } else if (input.charAt(posizione) == 'J'
              || input.charAt(posizione) == 'j') {
        System.out.printf("\\____/  ");
      } else if (input.charAt(posizione) == 'K'
              || input.charAt(posizione) == 'k') {
        System.out.printf("\\_| \\_/ ");
      } else if (input.charAt(posizione) == 'L'
              || input.charAt(posizione) == 'l') {
        System.out.printf("\\_____/ ");
      } else if (input.charAt(posizione) == 'M'
              || input.charAt(posizione) == 'm') {
        System.out.printf("\\_|  |_/ ");
      } else if (input.charAt(posizione) == 'N'
              || input.charAt(posizione) == 'n') {
        System.out.printf("\\_| \\_/ ");
      } else if (input.charAt(posizione) == 'O'
              || input.charAt(posizione) == 'o') {
        System.out.printf(" \\___/  ");
      } else if (input.charAt(posizione) == 'P'
              || input.charAt(posizione) == 'p') {
        System.out.printf("\\_|     ");
      } else if (input.charAt(posizione) == 'Q'
              || input.charAt(posizione) == 'q') {
        System.out.printf(" \\_/\\_\\ ");
      } else if (input.charAt(posizione) == 'R'
              || input.charAt(posizione) == 'r') {
        System.out.printf("\\_| \\_| ");
      } else if (input.charAt(posizione) == 'S'
              || input.charAt(posizione) == 's') {
        System.out.printf("\\____/  ");
      } else if (input.charAt(posizione) == 'T'
              || input.charAt(posizione) == 't') {
        System.out.printf("  \\_/   ");
      } else if (input.charAt(posizione) == 'U'
              || input.charAt(posizione) == 'u') {
        System.out.printf(" \\___/  ");
      } else if (input.charAt(posizione) == 'V'
              || input.charAt(posizione) == 'v') {
        System.out.printf(" \\___/  ");
      } else if (input.charAt(posizione) == 'W'
              || input.charAt(posizione) == 'w') {
        System.out.printf(" \\/  \\/  ");
      } else if (input.charAt(posizione) == 'X'
              || input.charAt(posizione) == 'x') {
        System.out.printf("\\/   \\/ ");
      } else if (input.charAt(posizione) == 'Y'
              || input.charAt(posizione) == 'y') {
        System.out.printf("  \\_/   ");
      } else if (input.charAt(posizione) == 'Z'
              || input.charAt(posizione) == 'z') {
        System.out.printf("\\_____/ ");
      } else if (input.charAt(posizione) == '!') {
        System.out.printf("(_) ");
      } else if (input.charAt(posizione) == '\'') {
        System.out.printf("    ");
      }

      posizione++;
    }
  }

  /**
   * Metodo statico che si occupa di stampare dei suggerimenti
   * all'utente qualora il comando fosse digitato in modo parziale.
   *
   * @param casoDaInterpretare int, stabilisce il caso da stampare all'utente
   */
  public static void stampaSuggerimentiAnalizzatore(final int casoDaInterpretare) {
    if (casoDaInterpretare == Analizzatore.CODICE_COMANDO_HELP) {
      System.out.println(GestioneStampa.ANSI_BLUE
              + "Battaglia Navale" + GestioneStampa.ANSI_RESET
              + ": Intendi dire " + GestioneStampa.ANSI_RED + "/help"
              + GestioneStampa.ANSI_RESET + "? \n");
    } else if (casoDaInterpretare == Analizzatore.CODICE_COMANDO_GIOCA) {
      System.out.println(GestioneStampa.ANSI_BLUE
              + "Battaglia Navale" + GestioneStampa.ANSI_RESET
              + ": Intendi dire " + GestioneStampa.ANSI_RED + "/gioca"
              + GestioneStampa.ANSI_RESET + "? \n");
    } else if (casoDaInterpretare == Analizzatore.CODICE_COMANDO_ESCI) {
      System.out.println(GestioneStampa.ANSI_BLUE
              + "Battaglia Navale" + GestioneStampa.ANSI_RESET
              + ": Intendi dire " + GestioneStampa.ANSI_RED + "/esci"
              + GestioneStampa.ANSI_RESET + "? \n");
    } else if (casoDaInterpretare == Analizzatore.CODICE_COMANDO_MOSTRALIVELLO) {
      System.out.println(GestioneStampa.ANSI_BLUE
              + "Battaglia Navale" + GestioneStampa.ANSI_RESET
              + ": Intendi dire "
              + GestioneStampa.ANSI_RED + "/mostralivello"
              + GestioneStampa.ANSI_RESET + "? \n");
    } else if (casoDaInterpretare == Analizzatore.CODICE_COMANDO_MOSTRANAVI) {
      System.out.println(GestioneStampa.ANSI_BLUE
              + "Battaglia Navale" + GestioneStampa.ANSI_RESET
              + ": Intendi dire " + GestioneStampa.ANSI_RED + "/mostranavi"
              + GestioneStampa.ANSI_RESET + "? \n");
    } else if (casoDaInterpretare == Analizzatore.CODICE_COMANDO_MOSTRATEMPO) {
      System.out.println(GestioneStampa.ANSI_BLUE
              + "Battaglia navale" + GestioneStampa.ANSI_RESET
              + ": Intendi dire " + GestioneStampa.ANSI_RED
              + "/mostratempo"
              + GestioneStampa.ANSI_RESET + "? \n");
    } else if (casoDaInterpretare == Analizzatore.CODICE_SUGGERIMENTO_MOSTRA) {
      System.out.println(GestioneStampa.ANSI_BLUE
              + "Battaglia Navale" + GestioneStampa.ANSI_RESET
              + ": Intendi dire " + GestioneStampa.ANSI_RED
              + "/mostranavi, /mostragriglia, /mostralivello, /mostratentativi o /mostratempo"
              + GestioneStampa.ANSI_RESET + "? \n");
    } else if (casoDaInterpretare == Analizzatore.CODICE_SUGGERIMENTO_COMANDICONM) {
      System.out.println(GestioneStampa.ANSI_BLUE
              + "Battaglia Navale" + GestioneStampa.ANSI_RESET
              + ": Intendi dire " + GestioneStampa.ANSI_RED
              + "/mostranavi, /mostralivello, /mostragriglia, /medio, /medio numero_tentativi,"
              + " /mostratentativi o /mostratempo"
              + GestioneStampa.ANSI_RESET + "? \n");
    } else if (casoDaInterpretare == Analizzatore.CODICE_SUGGERIMENTO_MOSTRAT) {
      System.out.println(GestioneStampa.ANSI_BLUE
              + "Battaglia Navale" + GestioneStampa.ANSI_RESET
              + ": Intendi dire " + GestioneStampa.ANSI_RED
              + "/mostratempo o /mostratentativi"
              + GestioneStampa.ANSI_RESET + "? \n");
    } else if (casoDaInterpretare == Analizzatore.CODICE_COMANDO_FACILE
            || casoDaInterpretare == Analizzatore.CODICE_COMANDO_FACILE_CON_TENTATIVI) {
      System.out.println(GestioneStampa.ANSI_BLUE
              + "Battaglia Navale" + GestioneStampa.ANSI_RESET
              + ": Intendi dire " + GestioneStampa.ANSI_RED + "/facile o /facile numero_tentativi"
              + GestioneStampa.ANSI_RESET + "? \n");
    } else if (casoDaInterpretare == Analizzatore.CODICE_COMANDO_MEDIO
            || casoDaInterpretare == Analizzatore.CODICE_COMANDO_MEDIO_CON_TENTATIVI) {
      System.out.println(GestioneStampa.ANSI_BLUE
              + "Battaglia Navale" + GestioneStampa.ANSI_RESET
              + ": Intendi dire " + GestioneStampa.ANSI_RED + "/medio o /medio numero_tentativi"
              + GestioneStampa.ANSI_RESET + "? \n");
    } else if (casoDaInterpretare == Analizzatore.CODICE_COMANDO_DIFFICILE
            || casoDaInterpretare == Analizzatore.CODICE_COMANDO_DIFFICILE_CON_TENTATIVI) {
      System.out.println(GestioneStampa.ANSI_BLUE
              + "Battaglia Navale" + GestioneStampa.ANSI_RESET
              + ": Intendi dire " + GestioneStampa.ANSI_RED + "/difficile o /difficile numero_tentativi"
              + GestioneStampa.ANSI_RESET + "? \n");
    } else if (casoDaInterpretare == Analizzatore.CODICE_COMANDO_ABBANDONA) {
      System.out.println(GestioneStampa.ANSI_BLUE
              + "Battaglia navale" + GestioneStampa.ANSI_RESET
              + ": Intendi dire " + GestioneStampa.ANSI_RED
              + "/abbandona"
              + GestioneStampa.ANSI_RESET + "? \n");
    } else if (casoDaInterpretare == Analizzatore.CODICE_COMANDO_TEMPO) {
      System.out.println(GestioneStampa.ANSI_BLUE
              + "Battaglia navale" + GestioneStampa.ANSI_RESET
              + ": Intendi dire " + GestioneStampa.ANSI_RED
              + "/tempo numero"
              + GestioneStampa.ANSI_RESET + "? \n");
    } else if (casoDaInterpretare == Analizzatore.CODICE_COMANDO_STANDARD) {
      System.out.println(GestioneStampa.ANSI_BLUE
              + "Battaglia Navale" + GestioneStampa.ANSI_RESET
              + ": Intendi dire " + GestioneStampa.ANSI_RED
              + "/standard"
              + GestioneStampa.ANSI_RESET + "? \n");
    } else if (casoDaInterpretare == Analizzatore.CODICE_SUGGERIMENTO_COMANDICONS) {
      System.out.println(GestioneStampa.ANSI_BLUE
              + "Battaglia Navale" + GestioneStampa.ANSI_RESET
              + ": Intendi dire " + GestioneStampa.ANSI_RED
              + "/svelagriglia o /standard"
              + GestioneStampa.ANSI_RESET + "? \n");
    } else if (casoDaInterpretare == Analizzatore.CODICE_COMANDO_LARGE) {
      System.out.println(GestioneStampa.ANSI_BLUE
              + "Battaglia Navale" + GestioneStampa.ANSI_RESET
              + ": Intendi dire " + GestioneStampa.ANSI_RED
              + "/large"
              + GestioneStampa.ANSI_RESET + "? \n");

    } else if (casoDaInterpretare == Analizzatore.CODICE_COMANDO_SVELAGRIGLIA) {
      System.out.println(GestioneStampa.ANSI_BLUE
              + "Battaglia Navale" + GestioneStampa.ANSI_RESET
              + ": Intendi dire " + GestioneStampa.ANSI_RED
              + "/svelagriglia"
              + GestioneStampa.ANSI_RESET + "? \n");

    } else if (casoDaInterpretare == Analizzatore.CODICE_SUGGERIMENTO_COMANDICONE) {
      System.out.println(GestioneStampa.ANSI_BLUE
              + "Battaglia Navale" + GestioneStampa.ANSI_RESET
              + ": Intendi dire " + GestioneStampa.ANSI_RED
              + "/esci o /extralarge"
              + GestioneStampa.ANSI_RESET + "? \n");
    } else if (casoDaInterpretare == Analizzatore.CODICE_COMANDO_EXTRALARGE) {
      System.out.println(GestioneStampa.ANSI_BLUE
              + "Battaglia Navale" + GestioneStampa.ANSI_RESET
              + ": Intendi dire " + GestioneStampa.ANSI_RED
              + "/extralarge"
              + GestioneStampa.ANSI_RESET + "? \n");

    } else if (casoDaInterpretare == Analizzatore.CODICE_COMANDO_MOSTRAGRIGLIA) {
      System.out.println(GestioneStampa.ANSI_BLUE
              + "Battaglia Navale" + GestioneStampa.ANSI_RESET
              + ": Intendi dire " + GestioneStampa.ANSI_RED
              + "/mostragriglia"
              + GestioneStampa.ANSI_RESET + "? \n");
    } else if (casoDaInterpretare == Analizzatore.CODICE_COMANDO_MOSTRA_TENTATIVI) {
      System.out.println(GestioneStampa.ANSI_BLUE
              + "Battaglia Navale" + GestioneStampa.ANSI_RESET
              + ": Intendi dire " + GestioneStampa.ANSI_RED
              + "/mostratentativi"
              + GestioneStampa.ANSI_RESET + "? \n");
    } else if (casoDaInterpretare == Analizzatore.CODICE_COMANDO_TENTATIVI) {
      System.out.println(GestioneStampa.ANSI_BLUE
              + "Battaglia Navale" + GestioneStampa.ANSI_RESET
              + ": Intendi dire " + GestioneStampa.ANSI_RED
              + "/tentativi numero"
              + GestioneStampa.ANSI_RESET + "? \n");
    } else if (casoDaInterpretare == Analizzatore.CODICE_SUGGERIMENTO_COMANDICONT) {
      System.out.println(GestioneStampa.ANSI_BLUE
              + "Battaglia Navale" + GestioneStampa.ANSI_RESET
              + ": Intendi dire " + GestioneStampa.ANSI_RED
              + "/tentativi numero o /tempo numero"
              + GestioneStampa.ANSI_RESET + "? \n");
    }
  }

  /**
   * Metodo statico che si occupa di stampare messaggi a video.
   */
  public static void stampaMessaggio(final String messaggio) {
    System.out.print(messaggio);
  }

  /**
   * Metodo statico che si occupa di richiamare il metodo
   * della griglia che si vuole stampare.
   */
  public static void stampaGriglia(final int dimensioniGriglia, final Cella[][] griglia) {
    if (dimensioniGriglia == Griglia.DIMENSIONI_GRIGLIA_DEFAULT) {
      stampaGrigliaDefault(dimensioniGriglia, griglia);
    } else if (dimensioniGriglia == Griglia.DIMENSIONI_GRIGLIA_LARGE) {
      stampaGrigliaLarge(dimensioniGriglia, griglia);

    } else if (dimensioniGriglia == Griglia.DIMENSIONI_GRIGLIA_EXTRALARGE) {
      stampaGrigliaExtralarge(dimensioniGriglia, griglia);
    }
  }

  /**
   * Metodo statico che si occupa di stampare la griglia di default.
   */
  private static void stampaGrigliaDefault(final int dimensioniGriglia, final Cella[][] griglia) {
    final byte codiceAsciiLetteraA = 65;
    final byte codiceAsciiLetteraJ = 74;
    short contRigheGriglia = 0;
    for (short contColonne = 0; contColonne < dimensioniGriglia; contColonne++) {
      if (contColonne == 0) {
        System.out.println("      " + "┌─────┬─────┬─────┬─────┬─────┬──"
                + "───┬─────┬─────┬─────┬─────┐");
        System.out.print("      ");
        for (int posizione = codiceAsciiLetteraA;
             posizione <= codiceAsciiLetteraJ; posizione++) {
          if (posizione == codiceAsciiLetteraA) {
            System.out.print("│  " + (char) posizione + "  " + "│");
          } else {
            System.out.print("  " + (char) posizione + "  " + "│");
          }
        }
        System.out.println("");
      }
      contRigheGriglia++;
      if (contColonne == 0) {
        System.out.println("┌─────│─────│─────│─────│─────│──"
                + "───│─────│─────│─────│─────│─────│");
      }
      if (contRigheGriglia == dimensioniGriglia) {
        System.out.print("│ " + contRigheGriglia + "  ");
      } else {
        System.out.print("│ " + " " + contRigheGriglia + "  ");
      }
      for (short contRighe = 0; contRighe < dimensioniGriglia; contRighe++) {
        if (contRighe == 0) {
          System.out.print("│  " + griglia[contColonne][contRighe].getIcona()
                  + "  " + "│");
        } else {
          System.out.print("  " + griglia[contColonne][contRighe].getIcona()
                  + "  " + "│");
        }
      }
      System.out.println("");
      if (contColonne != dimensioniGriglia - 1) {
        System.out.println("│─────│─────│─────│─────│─────│───"
                + "──│─────│─────│─────│─────│─────│");
      } else {
        System.out.println("└─────┴─────┴─────┴─────┴──"
                + "───┴─────┴─────┴─────┴─────┴─────┴─────┘");
      }
    }
  }

  /**
   * Metodo statico che si occupa di stampare la griglia large.
   */
  private static void stampaGrigliaLarge(final int dimensioniGriglia, final Cella[][] griglia) {
    short contRigheGriglia = 0;
    final byte codiceAsciiLetteraA = 65;
    final byte codiceAsciiLetteraR = 82;
    for (short contColonne = 0; contColonne < dimensioniGriglia; contColonne++) {
      if (contColonne == 0) {
        System.out.println("      " + "┌─────┬─────┬─────┬─────┬─────"
                + "┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────"
                + "┬─────┬─────┬─────┬─────┐");
        System.out.print("      ");
        for (int posizione = codiceAsciiLetteraA;
             posizione <= codiceAsciiLetteraR; posizione++) {
          if (posizione == codiceAsciiLetteraA) {
            System.out.print("│  " + (char) posizione + "  " + "│");
          } else {
            System.out.print("  " + (char) posizione + "  " + "│");
          }
        }
        System.out.println("");
      }
      contRigheGriglia++;
      if (contColonne == 0) {
        System.out.println("┌─────|─────|─────|─────|─────"
                + "|─────|─────|─────|─────|─────|─────|─────|─────|─────"
                + "|─────|─────|─────|─────|─────|");
      }
      if (contRigheGriglia == dimensioniGriglia) {
        System.out.print("│ " + contRigheGriglia + "  ");
      } else  if (contRigheGriglia < Griglia.DIMENSIONI_GRIGLIA_DEFAULT) {
        System.out.print("│ " + " " + contRigheGriglia + "  ");
      } else if (contRigheGriglia >= Griglia.DIMENSIONI_GRIGLIA_DEFAULT) {
        System.out.print("│ "  + contRigheGriglia + "  ");
      }
      for (short contRighe = 0; contRighe < dimensioniGriglia; contRighe++) {
        if (contRighe == 0) {
          System.out.print("│  " + griglia[contColonne][contRighe].getIcona()
                  + "  " + "│");
        } else if (contRighe > 0 && contRighe < Griglia.DIMENSIONI_GRIGLIA_DEFAULT) {
          System.out.print("  " + griglia[contColonne][contRighe].getIcona()
                  + "  " + "│");
        } else if (contRighe >= Griglia.DIMENSIONI_GRIGLIA_DEFAULT) {
          System.out.print("  " + griglia[contColonne][contRighe].getIcona()
                  + "  " + "│");
        }
      }
      System.out.println("");
      if (contColonne != dimensioniGriglia - 1) {
        System.out.println("|─────|─────|─────|─────|─────"
                + "|─────|─────|─────|─────|─────|─────|─────|─────|─────"
                + "|─────|─────|─────|─────|─────|");
      } else {
        System.out.println("└─────┴─────┴─────┴─────┴──"
                + "───┴─────┴─────┴─────┴─────┴─────┴─────┴"
                + "─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
      }
    }
  }

  /**
   * Metodo statico che si occupa di stampare la griglia extralarge.
   */
  private static void stampaGrigliaExtralarge(final int dimensioniGriglia, final Cella[][] griglia) {
    short contRigheGriglia = 0;
    final byte codiceAsciiLetteraA = 65;
    final byte codiceAsciiLetteraZ = 91;
    for (short contColonne = 0; contColonne < dimensioniGriglia; contColonne++) {
      if (contColonne == 0) {
        System.out.println("      " + "┌─────┬─────┬─────┬─────┬─────"
                + "┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────"
                + "┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
        System.out.print("      ");
        for (int posizione = codiceAsciiLetteraA;
             posizione < codiceAsciiLetteraZ; posizione++) {
          if (posizione == codiceAsciiLetteraA) {
            System.out.print("│  " + (char) posizione + "  " + "│");
          } else {
            System.out.print("  " + (char) posizione + "  " + "│");
          }
        }
        System.out.println("");
      }
      contRigheGriglia++;
      if (contColonne == 0) {
        System.out.println("┌─────|─────|─────|─────|─────"
                + "|─────|─────|─────|─────|─────|─────|─────|─────|─────"
                + "|─────|─────|─────|─────|─────|─────|─────|─────|─────|─────|─────|─────|─────|");
      }
      if (contRigheGriglia == dimensioniGriglia) {
        System.out.print("│ " + contRigheGriglia + "  ");
      } else  if (contRigheGriglia < Griglia.DIMENSIONI_GRIGLIA_DEFAULT) {
        System.out.print("│ " + " " + contRigheGriglia + "  ");
      } else if (contRigheGriglia >= Griglia.DIMENSIONI_GRIGLIA_DEFAULT) {
        System.out.print("│ "  + contRigheGriglia + "  ");
      }
      for (short contRighe = 0; contRighe < dimensioniGriglia; contRighe++) {
        if (contRighe == 0) {
          System.out.print("│  " + griglia[contColonne][contRighe].getIcona()
                  + "  " + "│");
        } else if (contRighe > 0 && contRighe < Griglia.DIMENSIONI_GRIGLIA_DEFAULT) {
          System.out.print("  " + griglia[contColonne][contRighe].getIcona()
                  + "  " + "│");
        } else if (contRighe >= Griglia.DIMENSIONI_GRIGLIA_DEFAULT) {
          System.out.print("  " + griglia[contColonne][contRighe].getIcona()
                  + "  " + "│");
        }
      }
      System.out.println("");
      if (contColonne != dimensioniGriglia - 1) {
        System.out.println("|─────|─────|─────|─────|─────"
                + "|─────|─────|─────|─────|─────|─────|─────|─────|─────"
                + "|─────|─────|─────|─────|─────|─────|─────|─────|─────|─────|─────|─────|─────|");
      } else {
        System.out.println("└─────┴─────┴─────┴─────┴──"
                + "───┴─────┴─────┴─────┴─────┴─────┴─────┴"
                + "─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────"
                + "┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
      }
    }
  }
}
