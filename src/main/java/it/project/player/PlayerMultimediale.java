package it.project.player;

import it.project.elementiM.Audio;
import it.project.elementiM.ElementoMultimediale;
import it.project.elementiM.Immagine;
import it.project.elementiM.Video;

import java.util.Scanner;

public class PlayerMultimediale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Inserisci il tipo di elemento (1 = Immagine, 2 = Audio, 3 = Video):");
            int tipo = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Inserisci il titolo:");
            String titolo = scanner.nextLine();

            switch (tipo) {
                case 1:
                    System.out.println("Inserisci la luminosità:");
                    int luminosità = scanner.nextInt();
                    elementi[i] = new Immagine(titolo, luminosità);
                    break;
                case 2:
                    System.out.println("Inserisci la durata:");
                    int durataAudio = scanner.nextInt();
                    System.out.println("Inserisci il volume:");
                    int volumeAudio = scanner.nextInt();
                    elementi[i] = new Audio(titolo, durataAudio, volumeAudio);
                    break;
                case 3:
                    System.out.println("Inserisci la durata:");
                    int durataVideo = scanner.nextInt();
                    System.out.println("Inserisci il volume:");
                    int volumeVideo = scanner.nextInt();
                    System.out.println("Inserisci la luminosità:");
                    luminosità = scanner.nextInt();
                    elementi[i] = new Video(titolo, durataVideo, volumeVideo, luminosità);
                    break;
                default:
                    System.out.println("Tipo di elemento non valido.");
                    i--;
                    break;
            }


        }

        int scelta;
        do {
            System.out.println("Scegli un elemento da eseguire (1-5, 0 per uscire):");
            scelta = scanner.nextInt();
            if (scelta >= 1 && scelta <= 5) {
                elementi[scelta - 1].esegui();
            } else if (scelta != 0) {
                System.out.println("Scelta non valida.");
            }
        } while (scelta != 0);
        scanner.close();
    }
}
