import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<Person> queue = new LinkedList<>();
        queue.addAll(generateClients());

        while (!queue.isEmpty()) {
            Person name = queue.poll();
            System.out.println(name.getName() + " " + name.getSurname() + " прокатился на аттракционе.");
            int numTickets = name.getNumTickets() - 1;
            name.setNumTickets(numTickets);
            if (numTickets > 0) {
                queue.add(name);
            }
        }
    }

    public static List<Person> generateClients() {
        List<Person> people = new LinkedList<>();
        people.add(new Person("Игорь", "Никитин", 2));
        people.add(new Person("Алексей", "Порфирьев", 4));
        people.add(new Person("Сергей", "Разгуляев", 3));
        people.add(new Person("Геннадий", "Клюшкин", 1));
        people.add(new Person("Иван", "Смольников", 5));
        return people;
    }
}
