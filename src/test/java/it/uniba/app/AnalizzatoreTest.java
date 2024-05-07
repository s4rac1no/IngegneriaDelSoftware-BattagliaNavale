package it.uniba.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AnalizzatoreTest {
    private Giocatore giocatore;
    private Analizzatore analizzatore;

    @Test
    void stringaAlfabeticaSchermataIniziale() throws AnalizzatoreException {
        String testInput = "pippo";
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);
        analizzatore = new Analizzatore();
        assertThrows(AnalizzatoreException.class,
                () -> analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco()));
    }

    @Test
    void stringaAlfabeticaInGame() throws AnalizzatoreException {
        String testInput = "pippo";
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.GAME);
        analizzatore = new Analizzatore();
        assertThrows(AnalizzatoreException.class,
                () -> analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco()));
    }

    @Test
    void stringaAlfanumericaSchermataIniziale() throws AnalizzatoreException {
        String testInput = "pippo123";
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);
        analizzatore = new Analizzatore();
        assertThrows(AnalizzatoreException.class,
                () -> analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco()));
    }

    @Test
    void stringaAlfanumericaInGame() throws AnalizzatoreException {
        String testInput = "pippo123";
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.GAME);
        analizzatore = new Analizzatore();
        assertThrows(AnalizzatoreException.class,
                () -> analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco()));
    }

    @Test
    void comandoNonRiconosciutoSchermataIniziale() throws AnalizzatoreException {
        String testInput = "/pippo";
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);
        analizzatore = new Analizzatore();
        assertThrows(AnalizzatoreException.class,
                () -> analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco()));
    }

    @Test
    void comandoNonRiconosciutoInGame() throws AnalizzatoreException {
        String testInput = "/pippo";
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.GAME);
        analizzatore = new Analizzatore();
        assertThrows(AnalizzatoreException.class,
                () -> analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco()));
    }

    @Test
    void stringaVuotaSchermataIniziale() throws AnalizzatoreException {
        String testInput = "";
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);
        analizzatore = new Analizzatore();
        assertThrows(AnalizzatoreException.class,
                () -> analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco()));
    }

    @Test
    void stringaVuotaInGame() throws AnalizzatoreException {
        String testInput = "";
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.GAME);
        analizzatore = new Analizzatore();
        assertThrows(AnalizzatoreException.class,
                () -> analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco()));
    }

    @Test
    void comandoRiconosciutoHelp() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/help";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_HELP,
                "idComando deve essere uguale a 'CODICE_COMANDO_HELP'");
    }

    @Test
    void comandoParzialmenteRiconosciutoHelp() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        System.out.println("Stampa interpretazioni analizzatore: ");
        testInput = "/hel";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE,
                "idComando deve essere uguale a 'CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE'");
    }

    @Test
    void comandoRiconosciutoConPiuParametriHelp() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        System.out.println("Stampa interpretazioni analizzatore: ");
        testInput = "/help pippo";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE,
                "idComando deve essere uguale a 'CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE'");
    }

    @Test
    void comandoRiconosciutoGioca() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/gioca";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_GIOCA,
                "idComando deve essere uguale a 'CODICE_COMANDO_GIOCA'");
    }

    @Test
    void comandoParzialmenteRiconosciutoGioca() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/gio";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE,
                "idComando deve essere uguale a 'CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE'");
    }

    @Test
    void comandoRiconosciutoConPiuParametriGioca() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/gioca pippo";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE,
                "idComando deve essere uguale a 'CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE'");
    }

    @Test
    void comandoRiconosciutoMostraNavi() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/mostranavi";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_MOSTRANAVI,
                "idComando deve essere uguale a 'CODICE_COMANDO_MOSTRANAVI'");
    }

    @Test
    void comandoRiconosciutoConPiuParametriMostranavi() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/mostranavi pippo";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE,
                "idComando deve essere uguale a 'CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE'");
    }

    @Test
    void comandoRiconosciutoMostraLivello() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/mostralivello";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_MOSTRALIVELLO,
                "idComando deve essere uguale a 'CODICE_COMANDO_MOSTRALIVELLO'");
    }

    @Test
    void comandoParzialmenteRiconosciutoMostralivello() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/mostral";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE,
                "idComando deve essere uguale a 'CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE'");
    }

    @Test
    void comandoRiconosciutoConPiuParametriMostralivello() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/mostralivello pippo";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE,
                "idComando deve essere uguale a 'CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE'");
    }

    @Test
    void comandoRiconosciutoEsci() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/esci";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_ESCI,
                "idComando deve essere uguale a 'CODICE_COMANDO_ESCI'");
    }

    @Test
    void comandoParzialmenteRiconosciutoEsci() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/esc";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE,
                "idComando deve essere uguale a 'CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE'");
    }

    @Test
    void comandoRiconosciutoConPiuParametriEsci() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/esci pippo";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE,
                "idComando deve essere uguale a 'CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE'");
    }

    @Test
    void comandoRiconosciutoSvelaGriglia() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/svelagriglia";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_SVELAGRIGLIA,
                "idComando deve essere uguale a 'CODICE_COMANDO_SVELAGRIGLIA'");
    }

    @Test
    void comandoParzialmenteRiconosciutoSvelagriglia() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/sve";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE,
                "idComando deve essere uguale a 'CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE'");
    }

    @Test
    void comandoRiconosciutoConPiuParametriSvelagriglia() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/svelagriglia pippo";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE,
                "idComando deve essere uguale a 'CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE'");
    }

    @Test
    void comandoRiconosciutoAbbandona() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/abbandona";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_ABBANDONA,
                "idComando deve essere uguale a 'CODICE_COMANDO_ABBANDONA'");
    }

    @Test
    void comandoParzialmenteRiconosciutoAbbandona() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/abb";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE,
                "idComando deve essere uguale a 'CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE'");
    }

    @Test
    void comandoRiconosciutoConPiuParametriAbbandona() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/abbandona pippo";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE,
                "idComando deve essere uguale a 'CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE'");
    }

    @Test
    void comandoRiconosciutoStandard() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/standard";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_STANDARD,
                "idComando deve essere uguale a 'CODICE_COMANDO_STANDARD'");
    }

    @Test
    void comandoParzialmenteRiconosciutoStandard() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/sta";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE,
                "idComando deve essere uguale a 'CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE'");
    }

    @Test
    void comandoRiconosciutoConPiuParametriStandard() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/standard pippo";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE,
                "idComando deve essere uguale a 'CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE'");
    }

    @Test
    void comandoRiconosciutoLarge() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/large";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_LARGE,
                "idComando deve essere uguale a 'CODICE_COMANDO_LARGE'");
    }

    @Test
    void comandoParzialmenteRiconosciutoLarge() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/lar";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE,
                "idComando deve essere uguale a 'CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE'");
    }

    @Test
    void comandoRiconosciutoConPiuParametriLarge() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/large pippo";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE,
                "idComando deve essere uguale a 'CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE'");
    }

    @Test
    void comandoRiconosciutoExtralarge() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/extralarge";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_EXTRALARGE,
                "idComando deve essere uguale a 'CODICE_COMANDO_EXTRALARGE'");
    }

    @Test
    void comandoParzialmenteRiconosciutoExtralarge() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/ex";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE,
                "idComando deve essere uguale a 'CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE'");
    }

    @Test
     void comandoRiconosciutoConPiuParametriExtralarge() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/extralarge pippo";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE,
                "idComando deve essere uguale a 'CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE'");
    }

    @Test
     void comandoRiconosciutoMostraGriglia() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/mostragriglia";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_MOSTRAGRIGLIA,
                "idComando deve essere uguale a 'CODICE_COMANDO_MOSTRAGRIGLIA'");
    }

    @Test
     void comandoParzialmenteRiconosciutoMostraGriglia() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/mostrag";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE,
                "idComando deve essere uguale a 'CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE'");
    }

    @Test
     void comandoRiconosciutoConPiuParametriMostraGriglia() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/mostragriglia pippo";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE,
                "idComando deve essere uguale a 'CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE'");
    }

    @Test
     void comandoRiconosciutoMostraTempo() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/mostratempo";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_MOSTRATEMPO,
                "idComando deve essere uguale a 'CODICE_COMANDO_MOSTRATEMPO'");
    }

    @Test
     void comandoParzialmenteRiconosciutoMostraTempo() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/mostratem";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE,
                "idComando deve essere uguale a 'CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE'");
    }

    @Test
     void comandoRiconosciutoConPiuParametriMostraTempo() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/mostratempo pippo";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE,
                "idComando deve essere uguale a 'CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE'");
    }

    @Test
     void comandoRiconosciutoMostraTentativi() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/mostratentativi";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_MOSTRA_TENTATIVI,
                "idComando deve essere uguale a 'CODICE_COMANDO_MOSTRA_TENTATIVI'");
    }

    @Test
     void comandoParzialmenteRiconosciutoMostraTentativi() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/mostraten";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE,
                "idComando deve essere uguale a 'CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE'");
    }

    @Test
     void comandoRiconosciutoConPiuParametriMostraTentativi() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/mostratentativi pippo";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE,
                "idComando deve essere uguale a 'CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE'");
    }

    @Test
     void comandoRiconosciutoFacile() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/facile";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_FACILE,
                "idComando deve essere uguale a 'CODICE_COMANDO_FACILE'");
    }

    @Test
     void comandoParzialmenteRiconosciutoFacile() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/fac";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE,
                "idComando deve essere uguale a 'CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE'");
    }

    @Test
     void comandoRiconosciutoConParametroInadattoFacile() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/facile pippo";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE,
                "idComando deve essere uguale a 'CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE'");
    }

    @Test
     void comandoRiconosciutoMedio() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/medio";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_MEDIO,
                "idComando deve essere uguale a 'CODICE_COMANDO_MEDIO'");
    }

    @Test
     void comandoParzialmenteRiconosciutoMedio() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/med";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE,
                "idComando deve essere uguale a 'CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE'");
    }

    @Test
     void comandoRiconosciutoConParametroInadattoMedio() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/medio pippo";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE,
                "idComando deve essere uguale a 'CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE'");
    }

    @Test
     void comandoRiconosciutoDifficile() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/difficile";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_DIFFICILE,
                "idComando deve essere uguale a 'CODICE_COMANDO_DIFFICILE'");
    }
    @Test
     void comandoParzialmenteRiconosciutoDifficile() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/dif";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE,
                "idComando deve essere uguale a 'CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE'");
    }
    @Test
     void comandoRiconosciutoConParametroInadattoDifficile() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/difficile pippo";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE,
                "idComando deve essere uguale a 'CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE'");
    }

    @Test
     void comandoRiconosciutoFacileConTentativi() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/facile 10";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_FACILE_CON_TENTATIVI,
                "idComando deve essere uguale a 'CODICE_COMANDO_FACILE_CON_TENTATIVI'");
    }

    @Test
     void comandoRiconosciutoMedioConTentativi() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/medio 10";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_MEDIO_CON_TENTATIVI,
                "idComando deve essere uguale a 'CODICE_COMANDO_MEDIO_CON_TENTATIVI'");
    }

    @Test
     void comandoRiconosciutoDifficileConTentativi() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/difficile 10";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_DIFFICILE_CON_TENTATIVI,
                "idComando deve essere uguale a 'CODICE_COMANDO_DIFFICILE_CON_TENTATIVI'");
    }

    @Test
     void comandoRiconosciutoFacileConTentativiNegativi() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/facile -10";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_FACILE_CON_TENTATIVI,
                "idComando deve essere uguale a 'CODICE_COMANDO_FACILE_CON_TENTATIVI'");
    }

    @Test
     void comandoRiconosciutoMedioConTentativiNegativi() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/medio -10";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_MEDIO_CON_TENTATIVI,
                "idComando deve essere uguale a 'CODICE_COMANDO_MEDIO_CON_TENTATIVI'");
    }

    @Test
     void comandoRiconosciutoDifficileConTentativiNegativi() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/difficile -10";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_DIFFICILE_CON_TENTATIVI,
                "idComando deve essere uguale a 'CODICE_COMANDO_DIFFICILE_CON_TENTATIVI'");
    }

    @Test
     void comandoRiconosciutoTempoConNumeroPositivo() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/tempo 10";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_TEMPO,
                "idComando deve essere uguale a 'CODICE_COMANDO_TEMPO'");
    }

    @Test
    void comandoParzialmenteRiconosciutoTempo() throws AnalizzatoreException {
       String testInput;
       int idComando;
       giocatore = new Giocatore();
       giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);


       testInput = "/tem";
       analizzatore = new Analizzatore();
       idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
       assertEquals(idComando, Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE,
               "idComando deve essere uguale a 'CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE'");
   }

    @Test
     void comandoRiconosciutoTempoConNumeroNegativo() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/tempo -10";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_TEMPO,
                "idComando deve essere uguale a 'CODICE_COMANDO_TEMPO'");
    }

    @Test
     void comandoRiconosciutoTentativiConNumeroPositivo() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/tentativi 10";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_TENTATIVI,
                "idComando deve essere uguale a 'CODICE_COMANDO_TENTATIVI'");
    }

    @Test
     void comandoRiconosciutoTentativiConNumeroNegativo() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/tentativi -10";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_TENTATIVI,
                "idComando deve essere uguale a 'CODICE_COMANDO_TENTATIVI'");
    }

    @Test
     void comandoParzialmenteRiconosciutoMostra() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/most";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE,
                "idComando deve essere uguale a 'CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE'");
    }

    @Test
     void comandoParzialmenteRiconosciutoMostraT() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/mostrat";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE,
                "idComando deve essere uguale a 'CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE'");
    }

    @Test
    void comandoParzialmenteRiconosciutoM() throws AnalizzatoreException {
       String testInput;
       int idComando;
       giocatore = new Giocatore();
       giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

       testInput = "/m";
       analizzatore = new Analizzatore();
       idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
       assertEquals(idComando, Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE,
               "idComando deve essere uguale a 'CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE'");
   }

   @Test
     void comandoParzialmenteRiconosciutoT() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/t";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE,
                "idComando deve essere uguale a 'CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE'");
    }

    @Test
     void comandoParzialmenteRiconosciutoE() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/e";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE,
                "idComando deve essere uguale a 'CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE'");
    }

    @Test
     void comandoParzialmenteRiconosciutos() throws AnalizzatoreException {
        String testInput;
        int idComando;
        giocatore = new Giocatore();
        giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

        testInput = "/s";
        analizzatore = new Analizzatore();
        idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
        assertEquals(idComando, Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE,
                "idComando deve essere uguale a 'CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE'");
    }

    @Test
    void comandoParzialmenteRiconosciutoTentativi() throws AnalizzatoreException {
       String testInput;
       int idComando;
       giocatore = new Giocatore();
       giocatore.setStatoGioco(Giocatore.Gioco.SCHERMATA_INIZIALE);

       testInput = "/ten";
       analizzatore = new Analizzatore();
       idComando = analizzatore.eseguiAnalizzatore(testInput, giocatore.getStatoGioco());
       assertEquals(idComando, Analizzatore.CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE,
               "idComando deve essere uguale a 'CODICE_COMANDO_RICONOSCIUTO_PARZIALMENTE'");
   }
}
