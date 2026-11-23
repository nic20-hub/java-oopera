import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printDirectorInfo() {
        System.out.println(director);
    }

    public void printActorsList() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Такой актёр уже участвует в спектакле.");
        } else {
            listOfActors.add(actor);
        }
    }

    public void replaceActor(Actor newActor, String surnameToReplace) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).surname.equals(surnameToReplace)) {
                listOfActors.set(i, newActor);
                return;
            }
        }
        System.out.println("Актёр с фамилией " + surnameToReplace + " не найден.");
    }

    @Override
    public String toString() {
        return  "Спектакль: " + title +
                ", режиссёр: " + director +
                ", длительность: " + duration + " мин";
    }
}
