package academy.belhard;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private final static String  FILE_NAME="persons.csv";

    public static void main(String[] args) throws EmptySourceException {



        Person person1=new Person("Brad", "Pitt", new Address("Los Angeles", "Beverly hills", 90210));
        Person person2=new Person("Donald", "Trump", new Address("Washington", "Pennsylvania Avenue", 1600));
        Person person3=new Person("Elon", "Musk", new Address(null, "Deer Creek Road", 3500));

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        List <Person> persons=new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

       PersonIOUtil.writePersons(FILE_NAME,persons);

        System.out.println("После чтения из файла");
        for (Person person : PersonIOUtil.readPersons(FILE_NAME)) {
            System.out.println(person);
        }


    }
}
