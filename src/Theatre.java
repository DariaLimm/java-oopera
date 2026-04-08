import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Александр", "Печкин", Gender.MALE, 1.8);
        Actor actor2 = new Actor("Сергей", "Крючко", Gender.MALE, 2);
        Actor actor3 = new Actor("Елизавета", "Валина", Gender.FEMALE, 1.7);
        Director director1 = new Director("Дарья", "Борсук", Gender.FEMALE, 47);
        Director director2 = new Director("Антон", "Силкин", Gender.MALE, 19);
        Person musicAuthor1 = new Person("Воцарт", "Рель", Gender.MALE);
        Person choreographer2 = new Person("Мирель", "Ван", Gender.MALE);

        Show show = new Show("Миг", 90, director2);
        Opera opera = new Opera("Тишина", 79, director1, musicAuthor1, "Нам пора уходить. Рассекает стекло серебристая нить. Навсегда истекло наше время давно. Переменим режим.", 11);
        Ballet ballet = new Ballet("Giselle", 112, director1, musicAuthor1,"En la desesperación giselle arranca con el mismo collar y lo echa a los pies de la novia", choreographer2);

        System.out.println(show.title);
        show.addNewActor(actor1);
        show.addNewActor(actor3);
        show.printListOfActors();
        show.replaceActor(actor2, "Печкин");
        show.printListOfActors();
        System.out.println();

        System.out.println(opera.title);
        opera.addNewActor(actor3);
        opera.addNewActor(actor2);
        opera.printListOfActors();
        opera.replaceActor(actor2, "Дутский");
        opera.printListOfActors();
        opera.printLibretto();
        System.out.println();

        System.out.println(ballet.title);
        ballet.addNewActor(actor1);
        ballet.addNewActor(actor2);
        ballet.printListOfActors();
        ballet.printLibretto();
        System.out.println();

    }


}
