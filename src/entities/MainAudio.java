package entities;

public class MainAudio {
    public static void main(String[] args) {
        Audio audio1 = new Audio("Alba", 4, 3);
        audio1.play();
        audio1.addVolume();
        audio1.play();
        audio1.lowerVolume();
        audio1.play();
        audio1.addVolume(7);
        audio1.play();
        audio1.lowerVolume(3);
        audio1.play();
    }
}
