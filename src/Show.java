import java.util.ArrayList;

public class Show {
    public String title;
    public int duration;
    Director director;
    ArrayList<Actor> listOfActors = new ArrayList<>();

public Show(String title, int duration, Director director) {
    this.title = title;
    this.duration = duration;
    this.director = director;
}

public void printListOfActors() {
    System.out.println("Список актёров:");
    for (Actor actor : listOfActors) {
        System.out.println(actor);
    }
}

public void addNewActor(Actor newActor) {
    if (listOfActors.contains(newActor)) {
        System.out.println("Актёр уже добавлен в список");
    } else {
        listOfActors.add(newActor);
    }
}

public void replaceActor(Actor newActor, String surname) {
    for (int i = 0; i < listOfActors.size(); i++) {
        Actor current = listOfActors.get(i);
        if (current.getSurname().equals(surname)) {
            listOfActors.remove(i);
            listOfActors.add(newActor);
            System.out.println("Новый список актёров:");
            return;
        }
        }
    System.out.println("Актёр с фамилией " + surname + " не найден");
    }
}

