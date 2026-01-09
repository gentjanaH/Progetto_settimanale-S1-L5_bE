package entities;

public abstract class FileMultimediale {
    //fileMultimediale è la mia superclasse
    //ATTRIBUTI
    private String title;

    //COSTRUTTORI
    public FileMultimediale(String titolo) {
        this.title = titolo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "FileMultimediale{" +
                "title='" + title + '\'' +
                '}';
    }
}


