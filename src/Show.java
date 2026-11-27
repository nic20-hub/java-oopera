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
        int indexToReplace = -1;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surnameToReplace)) {
                indexToReplace = i;
                break;
            }
        }
        if (indexToReplace == -1) {
            System.out.println("Актёр с фамилией " + surnameToReplace + " не найден.");
            return;
        }
        if (listOfActors.contains(newActor)) {
            System.out.println("Актёр " + newActor.getName() + " " + newActor.getSurname() +
                    " уже участвует в спектакле. Замена отменена.");
            return;
        }

        listOfActors.set(indexToReplace, newActor);
        System.out.println("Актёр успешно заменён.");
    }

    @Override
    public String toString() {
        return  "Спектакль: " + title +
                ", режиссёр: " + director +
                ", длительность: " + duration + " мин";
    }
}
