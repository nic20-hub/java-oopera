import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Александр", "Ревва", Person.Gender.MALE, "180");
        Actor actor2 = new Actor("Дмитрий", "Нагиев", Person.Gender.MALE, "173");
        Actor actor3 = new Actor("Марина", "Федункив", Person.Gender.FEMALE, "169");

        Director dir1 = new Director("Ярослав", "Петров", Person.Gender.MALE, "4");
        Director dir2 = new Director("Елена", "Иванова", Person.Gender.FEMALE, "6");

        ArrayList<Actor> castForShow = new ArrayList<>();
        ArrayList<Actor> castForBallet = new ArrayList<>();
        ArrayList<Actor> castForOpera = new ArrayList<>();

        Show regularShow = new Show("Юмористическая пьеса", 120, dir1, castForShow);
        Ballet ballet = new Ballet("Лебединое озеро", 150, dir2, castForBallet, "Чайковский", "Либретто балета", "Петипа");
        Opera opera = new Opera("Евгений Онегин", 180, dir1, castForOpera, "Пётр Чайковский", "Либретто оперы", 40);

        regularShow.addActor(actor1);
        regularShow.addActor(actor2);

        ballet.addActor(actor2);
        ballet.addActor(actor3);

        opera.addActor(actor1);
        opera.addActor(actor3);

        System.out.println("--- Юмористическая пьеса ---");
        regularShow.printActorsList();

        System.out.println("--- Балет ---");
        ballet.printActorsList();

        System.out.println("--- Опера ---");
        opera.printActorsList();

        ballet.replaceActor(actor3, "Нагиев");

        System.out.println("--- Балет после замены ---");
        ballet.printActorsList();

        ballet.replaceActor(actor1, "Неизвестный");

        System.out.println("--- Либретто балета ---");
        ballet.printLibretto();

        System.out.println("--- Либретто оперы ---");
        opera.printLibretto();
    }
}