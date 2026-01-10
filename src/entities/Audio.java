package entities;


import interfaces.Player;
import interfaces.Volume;

public class Audio extends FileMultimediale implements Volume, Player {
    //ATTRIBUTI
    private int volume;
    private int durata;

    //COSTRUTTORI
    public Audio(String titolo, int volume, int durata) {
        super(titolo);
        this.volume = volume;
        this.durata = durata;
    }

    //METODI
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

    //metodo play()

    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println("Titolo audio: " + getTitle() + " " + "!".repeat(volume));
        }

    }

}
