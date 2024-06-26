import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> states = new LinkedList<String>();
        states.add("Germany");
        states.add("France");
        states.addLast("Great Britain");
        states.addFirst("Spain");
        states.add(1, "Italy");
        System.out.println(states);
        // Spain  Italy  Germany  France  Great Britain

        System.out.printf("List has %d elements \n", states.size());
        System.out.println(states.get(1) + "\n");
        states.set(1, "Portugal");
        for(String state : states){
            System.out.println(state); // Spain, Portugal, Germany, France, Great Britain.
        }

        if(states.contains("Germany")){ // true
            System.out.println("List contains Germany \n");
        }

        states.remove("Germany");
        states.removeFirst();
        states.removeLast();
        System.out.println("\n" + states + "\n");
        // Portugal France

        LinkedList<Person> people = new LinkedList<Person>();
        people.add(new Person("Mike"));
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));
        // Tom Mike Nick
        people.remove(1);

        for(Person p : people){
            System.out.println(p.getName()); // Tom Nick
        }
        Person first = people.getFirst();
        System.out.println("вывод первого элемента: " + first.getName()); // вывод первого элемента: Tom
    }
}