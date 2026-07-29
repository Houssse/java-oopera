package show;

import person.Actor;
import person.Director;

import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void setListOfActors(ArrayList<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }

    private int findActorBySurname(String surname) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surname)) {
                return i;
            }
        }
        return -1;
    }

    private boolean containsActor(Actor actor) {
        for (Actor a : listOfActors) {
            if (actor.equals(a)) {
                return true;
            }
        }
        return false;
    }

    public void listOfActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor actor) {
        if (actor != null) {
            if (containsActor(actor)) {
                System.out.println("Этот актер уже в списке");
                return;
            }
            listOfActors.add(actor);
            System.out.println("Актер добавлен");
        }
    }

    public void switchActor(Actor actor, String surname) {
        int index = findActorBySurname(surname);
        if (index != -1) {
            listOfActors.set(index, actor);
            System.out.println("Актер заменен");
        } else {
            System.out.println("Актер для замены не найден");
        }
    }
}