package academy.belhard;

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
        Person.setFirstName=String[0];
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


//    public static List readPersons(String nameOfFile) {
//
//
////try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"))) {
////
////        String s;
////        while ((s = reader.readLine()) != null) {
////        System.out.println(s);
////        }
////
////        } catch (IOException e) {
////        e.printStackTrace();
////        }
//
//
//    }
}
    //Создайте в классе PersonIOUtil статический метод writePersons, который принимает 2 аргумента: название
//        файла и коллекцию объектов класса Person. Реализуйте логику записи объектов Person в файл в этом методе
//        С помощью PersonIOUtil запишите в файл созданные экземпляры класса Person
//        Создайте в классе PersonIOUtil статический метод readPersons, который принимает 1 аргумент - название
//        файла и возвращает коллекцию объектов Person. Реализуйте логику чтения из файла и построения объектов
//        Person в этом методе. Если файл не существует или пустой, генерируйте исключение EmptySourceFileException
//        С помощью PersonIOUtil прочитайте файл и сгенерируйте коллекцию объектов Person. Выведите ее в консоль
//        Залить код в репозиторий и отправить ссылку на репозиторий преподавателю