package show;

import person.Actor;
import person.Director;
import person.MusicAuthor;

import java.util.ArrayList;

public class MusicalShow extends Show {
    MusicAuthor musicAuthor;
    String librettoText;

public MusicalShow(String title, int duration, Director director,
                   ArrayList<Actor> listOfActors,
                   MusicAuthor musicAuthor, String librettoText) {
    this.title = title;
    this.duration = duration;
    this.director = director;
    this.listOfActors = listOfActors;
    this.musicAuthor = musicAuthor;
    this.librettoText = librettoText;
}

    public void printLibrettoText(){
        System.out.println(librettoText);
    }
}
