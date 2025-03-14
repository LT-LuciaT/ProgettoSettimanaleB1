package it.project.elementiM;

import it.project.player.Riproducibile;

public class Video extends ElementoMultimediale implements Riproducibile {
    private int durata;
    private int volume;
    private int luminosità;

    public Video(String titolo, int durata, int volume, int luminosità) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosità = luminosità;
    }

    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
        }

    }

    public void alzaVolume() {
        if (volume < 10) {
            volume++;
        }
    }

    public void aumentaLuminosità() {
        luminosità++;

    }

    public void diminuisciLuminosità() {
        if (luminosità > 0) {
            luminosità--;
        }
    }
    @Override
    public void play() {
        for ( int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + "!".repeat(volume) + " " + "*".repeat(luminosità));
    }

    }@Override
        public void esegui() {
            play();
        }

}
