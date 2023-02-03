public class Person {
    String name;
    String surname;
    int numTickets;

    public Person(String name, String surname, int numTickets) {
        this.name = name;
        this.surname = surname;
        this.numTickets = numTickets;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getNumTickets() {
        return numTickets;
    }

    public void setNumTickets(int numTickets) {
        this.numTickets = numTickets;
    }
}
