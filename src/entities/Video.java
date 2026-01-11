package entities.video;

import entities.FileMultimediale;
import interfaces.Luminosità;
import interfaces.Player;
import interfaces.Volume;

public class Video extends FileMultimediale implements Volume, Luminosità, Player {
    //ATTRIBUTI
    private int volume;
    private int brightness;
    private int durata;

    //COSTRUTTORI
    public Video(String titolo, int volume, int brightness, int durata) {
        super(titolo);
        this.volume = volume;
        this.brightness = brightness;
        this.durata = durata;
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


    @Override
    public void addVolume() {
        volume++;
    }

    public void addVolume(int n) {
        volume = n;
    }


    @Override
    public void lowerVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public void lowerVolume(int n) {
        if (volume > 0) {
            volume = n;
        }
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println("Titolo video: " + getTitle() + " " + "!".repeat(volume) + " Luminosità: " + " " + "*".repeat(brightness));
        }

    }


    @Override
    public void esegui() {
        play();
    }
}
