package show;

import person.Actor;
import person.Director;

import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors;

    public void listOfActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor actor) {
        if (actor != null) {
            for (Actor a : listOfActors) {
                if (actor.equals(a)) {
                    System.out.println("Этот актер уже в списке");
                    return;
                }
            }
            listOfActors.add(actor);
            System.out.println("Актер добавлен");
        }
    }

    public void switchActor(Actor actor, String surname) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surname)) {
                listOfActors.set(i, actor);
                System.out.println("Актер заменен");
                return;
            }
        }
        System.out.println("Актер для замены не найден");
    }
}
