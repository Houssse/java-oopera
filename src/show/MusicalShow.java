package show;

import person.Actor;
import person.Director;
import person.MusicAuthor;

import java.util.ArrayList;

public class MusicalShow extends Show {
    private MusicAuthor musicAuthor;
    private String librettoText;

    public MusicalShow(String title, int duration, Director director,
                       ArrayList<Actor> listOfActors,
                       MusicAuthor musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors); // Используем конструктор родителя
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public MusicAuthor getMusicAuthor() {
        return musicAuthor;
    }

    public void setMusicAuthor(MusicAuthor musicAuthor) {
        this.musicAuthor = musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public void setLibrettoText(String librettoText) {
        this.librettoText = librettoText;
    }

    public void printLibrettoText() {
        System.out.println(librettoText);
    }
}