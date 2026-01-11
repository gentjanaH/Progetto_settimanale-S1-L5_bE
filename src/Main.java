import entities.Audio;
import entities.FileMultimediale;
import entities.Immagine;
import entities.video.Video;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        FileMultimediale[] elementi = new FileMultimediale[5];

        for (int i = 0; i < elementi.length; i++) {
            System.out.println("Che tipo di file vuoi creare? 1=Audio, 2=Video, 3=Immagine");
            int scelta = scan.nextInt();
            scan.nextLine();


            switch (scelta) {
                case 1: {
                    System.out.println("Titolo: ");
                    String titolo = scan.nextLine();
                    System.out.println("Durata: ");
                    int durata = scan.nextInt();
                    System.out.println("Volume: ");
                    int volume = scan.nextInt();
                    elementi[i] = new Audio(titolo, volume, durata);
                }
                break;

                case 2: {
                    System.out.println("Titolo: ");
                    String titolo = scan.nextLine();
                    System.out.println("Durata: ");
                    int durata = scan.nextInt();
                    System.out.println("Volume: ");
                    int volume = scan.nextInt();
                    System.out.println("Luminosità: ");
                    int lum = scan.nextInt();
                    elementi[i] = new Video(titolo, volume, lum, durata);
                }
                break;
                case 3: {
                    System.out.println("Titolo: ");
                    String titolo = scan.nextLine();
                    System.out.println("Luminosità: ");
                    int lum = scan.nextInt();
                    elementi[i] = new Immagine(titolo, lum);
                }
                break;
                default: {
                    System.out.println("Scelta non valida.");
                    i--;
                }

            }


        }
        //esecuzione
        int scelta;
        do {
            System.out.println("Quale elemento vuoi eseguire da 1 a 5? Altrimenti premi 0 per uscire.");
            scelta = scan.nextInt();

            if (scelta >= 1 && scelta <= 5) {
                elementi[scelta - 1].esegui();

            } else if (scelta != 0) {
                System.out.println("Elemento non trovato.");
            }
        } while (scelta != 0);
    }
}
