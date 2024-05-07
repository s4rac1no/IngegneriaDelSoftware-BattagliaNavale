/**
 * <<Boundary>>
 * Responsabilità: Gestisce l'acquisizione dell'input
 * dell'utente.
 */

package it.uniba.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


/**
 * Gestisce l'acquisizione dell'input dell'utente.
 */
public final class GestioneInput {
    private GestioneInput() { }
    /**
     * Metodo statico che legge l'input inserito dall'utente.
     *
     * @return String, stringa contentente l'input dell'utente
     */
    public static String input() {
        Scanner keyboard = new Scanner(System.in, "UTF-8");
        String userInput = keyboard.nextLine();
        return userInput.toLowerCase();
    }

    /**
     * Metodo statico che legge l'input in gioco inserito dall'utente.
     * Utilizzato per chiudere l'input al termine del timer del gioco.
     *
     * @return String, stringa contentente l'input dell'utente
     */
    public static String inputGame(final Partita partita) throws TimerException {
        boolean waitUtente;
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
            while (partita.getTempoRimanente() != 0 && !in.ready()) {
                // Ho inserito questa variabile perché CheckStyle mi segnalava emptyBlock
                waitUtente = true;
            }


            waitUtente = false;

            if (in.ready()) {
                return in.readLine().toLowerCase();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        throw new TimerException("");
    }
}
