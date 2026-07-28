package person;

import java.util.Objects;

public class Actor extends Person {
    int height;

    public Actor(String name, String surname, Gender gender, int height) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.height = height;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Actor actor = (Actor) object;
        return height == actor.height &&
                Objects.equals(name, actor.name) &&
                Objects.equals(gender, actor.gender) &&
                Objects.equals(surname, actor.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, name, gender, surname);
    }

    @Override
    public String toString() {
        return name + " " + surname + "(" + height + ")";
    }
}
