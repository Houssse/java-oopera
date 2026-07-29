package person;

import java.util.Objects;

public class Actor extends Person {
    private int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Actor actor = (Actor) object;
        return height == actor.height &&
                Objects.equals(getName(), actor.getName()) &&
                Objects.equals(getGender(), actor.getGender()) &&
                Objects.equals(getSurname(), actor.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, getName(), getGender(), getSurname());
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + "(" + height + ")";
    }
}