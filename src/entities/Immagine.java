package entities;

import interfaces.Luminosità;

public class Immagine extends FileMultimediale implements Luminosità {
    //immagine estende file multimediale
//ATTRIBUTI
    private int brightness;

    //COSTRUTTORI
    public Immagine(String titolo, int brightness) {
        super(titolo);
        this.brightness = brightness;

    }

    //METODI

    @Override
    public void addBright() {
        brightness++;
    }

    public void addBright(int n) {
        brightness = n;
    }

    @Override
    public void lowerBright() {
        if (brightness > 0) {
            brightness--;
        }
    }

    public void lowerBright(int n) {
        if (brightness > 0) {
            brightness = n;
        }
    }
//quì dichiaro il metodo show() che mi serve solo per le immagini

    public void show() {

        System.out.println("Titolo dell'immagine: " + getTitle() + " " + "*".repeat(brightness));
    }


}
