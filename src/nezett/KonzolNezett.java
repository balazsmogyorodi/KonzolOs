package nezett;

import java.util.ArrayList;
import java.util.List;
import modell.KonkretOs;
import modell.MenthetoFuto;
import modell.Nyomtathato;
import modell.NyomtathatoMenthetoUtod;
import modell.NyomtathatoUtod;

public class KonzolNezett {

    private List<KonkretOs> mindenki;
    private List<Nyomtathato> nyomtatHatoak;

    public KonzolNezett() {
        mindenki = new ArrayList<>();
        nyomtatHatoak = new ArrayList<>();
        feltoltMindenkit();
        feltotlNyomtathato();

    }

    private void feltoltMindenkit() {
        KonkretOs ko1 = new KonkretOs();
        mindenki.add(ko1);
        mindenki.add(new KonkretOs(true));
        mindenki.add(new MenthetoFuto("Ez 1 menthető 1"));
        mindenki.add(new MenthetoFuto("Ez 1 menthető 2", true));

        mindenki.add(new NyomtathatoUtod());
        mindenki.add(new NyomtathatoUtod());

        mindenki.add(new NyomtathatoMenthetoUtod());
        mindenki.add(new NyomtathatoMenthetoUtod());
    }

    private void feltotlNyomtathato() {
        for (KonkretOs ko : mindenki) {
            if (ko instanceof Nyomtathato) {
                nyomtatHatoak.add((Nyomtathato) ko);
            }
        }
    }

    public void kiirMindenkit() {
        for (KonkretOs os : mindenki) {
            System.out.println(os);
        }
        System.out.println("\n\n");

    }

    public void kiirNyomtathato() {
        for (Nyomtathato os : nyomtatHatoak) {
            System.out.println(((KonkretOs) os).mitTudok());
        }

    }

}
