public class Director extends Person{
    String numberOfShows;

    public Director(String name, String surname, Gender gender, String numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
