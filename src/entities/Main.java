package entities;

public class Main {
    public static void main(String[] args) {
        Immagine img1 = new Immagine("Tramonto", 11);
        img1.show();
        img1.lowerBright();
        img1.show();

        Immagine img2 = new Immagine("Mare", 7);
        img2.show();
        img2.addBright();
        img2.show();
    }
}
