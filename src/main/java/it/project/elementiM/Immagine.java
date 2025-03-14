package it.project.elementiM;

public class Immagine extends ElementoMultimediale {
    private int luminosità;

    public Immagine(String titolo, int luminosità) {
        super(titolo);
        this.luminosità = luminosità;
    }

    public void aumentaLuminosità() {
        luminosità++;
    }

    public void diminuisciLuminosità() {
        if (luminosità > 0) {
            luminosità--;
    }
}
public void show() {
    System.out.println(titolo + " " + "*".repeat(luminosità));
}
@Override
public void esegui() {
    show(); }
}