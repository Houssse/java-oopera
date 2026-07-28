package person;

public class Director extends Person {
    int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
