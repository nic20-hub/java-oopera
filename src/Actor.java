import java.util.Objects;

public class Actor extends Person{
    String height;

    public Actor(String name, String surname, Gender gender, String height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Actor)) return false;
        Actor actor = (Actor) o;
        return Objects.equals(this.name, actor.name)
                && Objects.equals(this.surname, actor.surname)
                && Objects.equals(this.height, actor.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.surname, this.height);
    }

    @Override
    public String toString() {
        return name + " " + surname + " (" + height + ")";
    }
}
