package academy.belhard;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PersonIOUtil {

    public static String formatForWriting (Person person){
        return person.getFirstName() + ";"
                + person.getLastName() + ";"
                + person.getAddress().getCity() + ";"
                + person.getAddress().getStreet() + ";"
                + person.getAddress().getNumberOfHouse() + "\n";
    }

    public static Person formatObject (String s) {
        String[] filds = s.split(";");
       return new Person(filds[0], filds[1], new Address(filds[2],filds[3],Integer.parseInt(filds[4])));
    }

    public static void writePersons(String nameOfFile, List <Person> list) {
        try (FileWriter writer = new FileWriter(nameOfFile)) {

            for (Person person : list) {
                writer.write(formatForWriting(person));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static List<Person> readPersons(String nameOfFile)  {

        List<Person>persons=new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(nameOfFile))) {
        String s;
        while ((s = reader.readLine()) != null) {
        persons.add(formatObject(s));

        }

        } catch (IOException e) {
        e.printStackTrace();

        }

        try {
            if (persons.isEmpty()) {
                throw new EmptySourceException ("Не удалось провести чтение из файла или файл пуст");
            }
        }catch (EmptySourceException e){
            e.printStackTrace();
        }


        return persons ;

    }
}
