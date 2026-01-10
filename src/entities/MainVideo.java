package entities;

import entities.video.Video;

public class MainVideo {
    public static void main(String[] args) {
        Video video1 = new Video("Il cigno nero ", 4, 6, 4);
        video1.play();
        video1.addBright();
        video1.play();
        video1.addVolume();
        video1.play();
        video1.addBright(5);
        video1.play();
        video1.addVolume(7);
        video1.play();
    }

}
