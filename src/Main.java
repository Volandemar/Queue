import java.util.*;

public class Main {

    public static List<Person> generateClients() {
        List<Person> person = new ArrayList<>();
        person.add(new Person("Vasya", "Pokov", 5));
        person.add(new Person("Kolyua", "Pokov", 4));
        person.add(new Person("Olya", "Pokov", 3));
        person.add(new Person("Kdfjslk", "Pokov", 7));
        return person;
    }

    public static void main(String[] args) {
        Deque<Person> i = new ArrayDeque<>();
        i.addAll(generateClients());

        while (!i.isEmpty()) {
            Person firstPerson = i.pollFirst();
            System.out.println(firstPerson.getName() + " " + firstPerson.getSurname() + " устроил покатушки. Осталось билетов: " + (firstPerson.getTicket() - 1));
            if (firstPerson.getTicket() - 1 > 0) {
                firstPerson.setTicket(firstPerson.getTicket() - 1);
                i.addLast(firstPerson);
            }

        }
    }
}