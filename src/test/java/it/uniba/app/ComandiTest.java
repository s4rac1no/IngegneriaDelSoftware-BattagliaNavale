package it.uniba.app;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.io.ByteArrayInputStream;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
class ComandiTest {
    private Comandi comandi;
    private Giocatore giocatore;
    private Partita partita;
    private InputStream in;
    private PrintStream standardOut;
    private ByteArrayOutputStream outputStreamCaptor;

    @Test
    void scegliLivelloDiGiocoTestCasoLimiteSuperiore() throws UnsupportedEncodingException {
        comandi = new Comandi();
        partita = new Partita();

        standardOut = System.out;
        outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor, true,
                "UTF-8"));

        comandi.scegliLivelloGioco(partita, Analizzatore.CODICE_COMANDO_FACILE_CON_TENTATIVI,
                "100000000000000000000000000000000");

        assertEquals(GestioneStampa.ANSI_BLUE
                + "Battaglia Navale" + GestioneStampa.ANSI_RESET
                + ": Errore, numero tentativi non valido! \n\n", outputStreamCaptor.toString("UTF-8"),
                "Il numero di Tentativi è maggiore del numero massimo consentito!");

        System.setOut(System.out);
    }

    @Test
    void scegliLivelloDiGiocoTestCasoLimiteInferiore() throws UnsupportedEncodingException {
        comandi = new Comandi();
        partita = new Partita();

        standardOut = System.out;
        outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor, true,
                "UTF-8"));

        comandi.scegliLivelloGioco(partita, Analizzatore.CODICE_COMANDO_FACILE_CON_TENTATIVI,
                "-100000000000000000000000000000000");

        assertEquals(GestioneStampa.ANSI_BLUE
                + "Battaglia Navale" + GestioneStampa.ANSI_RESET
                + ": Errore, numero tentativi non valido! \n\n", outputStreamCaptor.toString("UTF-8"),
                "Il numero di Tentativi è minore del numero minimo consentito!");

        System.setOut(System.out);
    }

    @Test
    void impostaTempoDiGiocoTestCasoLimiteSuperiore() throws UnsupportedEncodingException {
        comandi = new Comandi();
        partita = new Partita();

        standardOut = System.out;
        outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor, true,
                "UTF-8"));

        comandi.impostaTempoDiGioco(partita, "100000000000000000000000000000000");

        assertEquals(GestioneStampa.ANSI_BLUE
                + "Battaglia Navale" + GestioneStampa.ANSI_RESET
                + ": Errore, il massimo tempo settabile per una partita è "
                + TimerPartita.MAX_TEMPO_GIOCO + " minuti ! \n\n", outputStreamCaptor.toString("UTF-8"),
                "Il Tempo inserito è maggiore del massimo consentito!");

        System.setOut(System.out);
    }

    @Test
    void impostaTempoDiGiocoTestCasoLimiteInferiore() throws UnsupportedEncodingException {
        comandi = new Comandi();
        partita = new Partita();

        standardOut = System.out;
        outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor, true,
                "UTF-8"));

        comandi.impostaTempoDiGioco(partita, "-10000000000000000000000000000000");

        assertEquals(GestioneStampa.ANSI_BLUE
                + "Battaglia Navale" + GestioneStampa.ANSI_RESET
                + ": Errore, il massimo tempo settabile per una partita è "
                + TimerPartita.MAX_TEMPO_GIOCO + " minuti ! \n\n", outputStreamCaptor.toString("UTF-8"),
                "Il Tempo inserito è minore del minimo consentito!");

        System.setOut(System.out);
    }

    @Test
    void impostaTentativiTestCasoLimiteSuperiore() throws UnsupportedEncodingException {
        comandi = new Comandi();
        partita = new Partita();

        standardOut = System.out;
        outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor, true,
                "UTF-8"));

        comandi.impostaTentativi(partita, "10000000000000000000000000000000");

        assertEquals(GestioneStampa.ANSI_BLUE
                + "Battaglia Navale" + GestioneStampa.ANSI_RESET
                + ": Errore, numero tentativi non valido! \n\n", outputStreamCaptor.toString("UTF-8"),
                "Il numero di Tentativi è maggiore del numero massimo consentito!");

        System.setOut(System.out);
    }

    @Test
    void impostaTentativiTestCasoLimiteInferiore() throws UnsupportedEncodingException {
        comandi = new Comandi();
        partita = new Partita();

        standardOut = System.out;
        outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor, true,
                "UTF-8"));

        comandi.impostaTentativi(partita, "-10000000000000000000000000000000");

        assertEquals(GestioneStampa.ANSI_BLUE
                + "Battaglia Navale" + GestioneStampa.ANSI_RESET
                + ": Errore, numero tentativi non valido! \n\n", outputStreamCaptor.toString("UTF-8"),
                "Il numero di Tentativi è minore del numero minimo consentito!");

        System.setOut(System.out);
    }

    @Test
    void casoWin() throws UnsupportedEncodingException {
        comandi = new Comandi();
        giocatore = new Giocatore();
        partita = new Partita();

        partita.setMaxTentativiFalliti(2);
        partita.setTempoDiGioco(1);

        for (int i = 0; i < Partita.NUM_NAVI; i++) {
            partita.getNave(i).setDimensione(0);
        }

        String input = "A-1";
        in = new ByteArrayInputStream(input.getBytes("UTF-8"));
        System.setIn(in);

        comandi.gioca(giocatore, partita, new Analizzatore());

        assertTrue(partita.verificaVittoria(), "Errore vittoria partita");

        System.setIn(System.in);
    }

    @Test
    void casoGameOverTentativiMassimiRaggiunti() throws UnsupportedEncodingException {
        comandi = new Comandi();
        giocatore = new Giocatore();
        partita = new Partita();
        partita.setMaxTentativiFalliti(1);

        String input = "a-1";

        in = new ByteArrayInputStream(input.getBytes("UTF-8"));
        System.setIn(in);

        comandi.effettuaTentativo(partita, giocatore, input);
        assertEquals(partita.getTentativiFalliti(), 1, "Numero tentativi massimi raggiunti!");

        System.setIn(System.in);
    }

    @Test
    void casoGameOverTempoTerminato() {
        comandi = new Comandi();
        giocatore = new Giocatore();
        partita = new Partita();
        final int minutiTest = 1;
        partita.setTempoDiGioco(minutiTest);
        comandi.gioca(giocatore, partita, new Analizzatore());
        assertEquals(partita.getTempoRimanente(), 0,
                "Errore nell'impostazione del tempo");
    }

    @Test
    void effettuaTentativoAcqua() throws UnsupportedEncodingException {
        comandi = new Comandi();
        giocatore = new Giocatore();
        partita = new Partita();
        partita.setMaxTentativiFalliti(1);

        standardOut = System.out;
        outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor, true,
                "UTF-8"));

        comandi.effettuaTentativo(partita, giocatore, "a-1");
        assertEquals(GestioneStampa.ANSI_BLUE + "Acqua"
                + GestioneStampa.ANSI_RESET + "\n", outputStreamCaptor.toString("UTF-8"),
                "Errore nella scelta della casella");

        System.setOut(standardOut);
    }

    @Test
    void effettuaTentativoColpito() throws UnsupportedEncodingException {
        comandi = new Comandi();
        giocatore = new Giocatore();
        partita = new Partita();
        partita.setMaxTentativiFalliti(1);

        standardOut = System.out;
        outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor, true,
                "UTF-8"));

        partita.getCellaGrigliaPartita(0, 0).setIcona("⊠");
        partita.getCellaGrigliaPartita(0,  0).setStato(true);

        comandi.effettuaTentativo(partita, giocatore, "a-1");
        assertEquals(GestioneStampa.ANSI_YELLOW + "Colpito"
                + GestioneStampa.ANSI_RESET + "\n", outputStreamCaptor.toString("UTF-8"),
                "Errore nella scelta della casella");

        System.setOut(standardOut);
    }

    @Test
    void effettuaTentativoColpitoAffondato() throws UnsupportedEncodingException {
        comandi = new Comandi();
        giocatore = new Giocatore();
        partita = new Partita();
        partita.setMaxTentativiFalliti(1);

        partita.getCellaGrigliaPartita(0, 0).setIcona("⊠");
        partita.getCellaGrigliaPartita(0,  0).setStato(true);

        partita.getCellaGrigliaPartita(1, 0).setIcona("⊠");
        partita.getCellaGrigliaPartita(1,  0).setStato(true);

        partita.getNave(0).setDimensione(2); // CacciatorPediniere
        partita.getNave(0).setPosizionamento(false); // nave verticale
        partita.getNave(0).setPosizioneColonnaFinale(0);
        partita.getNave(0).setPosizioneColonnaIniziale(0);
        partita.getNave(0).setPosizioneRigaFinale(1);
        partita.getNave(0).setPosizioneRigaIniziale(0);

        comandi.effettuaTentativo(partita, giocatore, "a-1");

        standardOut = System.out;
        outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor, true,
                "UTF-8"));

        comandi.effettuaTentativo(partita, giocatore, "a-2");

        assertEquals(GestioneStampa.ANSI_RED + "Colpito e affondato"
                + GestioneStampa.ANSI_RESET + "\n", outputStreamCaptor.toString("UTF-8"),
                "Errore nella scelta della casella");

        System.out.println(GestioneStampa.ANSI_RED + "Colpito e affondato"
                + GestioneStampa.ANSI_RESET + "\n");

        System.setOut(standardOut);
    }
}
