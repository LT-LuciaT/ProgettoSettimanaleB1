package it.project.player;

import it.project.elementiM.Audio;
import it.project.elementiM.ElementoMultimediale;
import it.project.elementiM.Immagine;
import it.project.elementiM.Video;

import java.io.InputStream;

public class TestPlayer {
    public static void main(String[] args){
        String inputSimulato =
                "1\nFotoFamily\n3\n" + // Immagine: titolo "Foto", luminosità 3
                        "2\nCanzoneFavourite\n2\n4\n" + // Audio: titolo "Canzone", durata 2, volume 4
                        "3\nVideoConcerto\n3\n2\n5\n" + // Video: titolo "Video", durata 3, volume 2, luminosità 5
                        "1\nSelfie\n2\n" + // Immagine: titolo "Selfie", luminosità 2
                        "2\nPodcast\n4\n3\n" + //Audio: titolo "Podcast", durata 4, volume 3
                        "1\n2\n3\n4\n5\n0\n"; // Uscita dal programma

        InputStream inputStream = new java.io.ByteArrayInputStream(inputSimulato.getBytes());
        System.setIn(inputStream);

        PlayerMultimediale.main(null);
    }
}
