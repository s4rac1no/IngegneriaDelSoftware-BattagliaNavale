package it.uniba.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.fail;
class PartitaTest {
    @Test
    void testPosizionamentoNaviSullaGriglia() {
        Partita partita = new Partita();
        partita.inserimentoNavi();

        final int numeroTotaleCaselleNavi = 30;
        int numeroCaselleOccupate = 0;
        for (int riga = 0; riga < Partita.NUM_TENTATIVI_DIFFICILE_STANDARD; riga++) {
            for (int colonna = 0; colonna < Partita.NUM_TENTATIVI_DIFFICILE_STANDARD; colonna++) {
                if (partita.getCellaGrigliaPartita(riga, colonna).getIcona().equals("⊠")) {
                    numeroCaselleOccupate++;
                }
            }
        }
        if (numeroTotaleCaselleNavi != numeroCaselleOccupate) {
            fail("Navi non posizionate correttamente");
        }
    }
}
