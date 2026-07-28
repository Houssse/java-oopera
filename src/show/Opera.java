package show;

import person.Actor;
import person.Director;
import person.MusicAuthor;

import java.util.ArrayList;

public class Opera extends MusicalShow {
    int choirSize;

    public Opera(String title, int duration, Director director, ArrayList<Actor> listOfActors,
                 MusicAuthor musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
