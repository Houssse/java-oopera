package show;

import person.Actor;
import person.Choreographer;
import person.Director;
import person.MusicAuthor;

import java.util.ArrayList;

public class Ballet extends MusicalShow {
    Choreographer choreographer;

    public Ballet(String title, int duration, Director director, ArrayList<Actor> listOfActors,
                  MusicAuthor musicAuthor, String librettoText, Choreographer choreographer) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
