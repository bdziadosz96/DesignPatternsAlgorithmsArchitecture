import Architecture.Generics.Employee;
import Architecture.Generics.Person;
import Architecture.Generics.PersonLoader;
import Architecture.Generics.PersonSaver;
import Architecture.Generics.Worker;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonStorageTests {
    private final Employee employee = new Employee("Michal", 20);
    private final Worker worker = new Worker("Kacper", 25);
    private final Person person = new Person("Kamil", 30);

    private File file = new File("sample");
    private PersonSaver saver = new PersonSaver(file);
    private PersonLoader loader = new PersonLoader(file);

    PersonStorageTests() throws FileNotFoundException {
    }

    @Test
     void savesAndLoadPerson() throws IOException {
        saver.save(employee);

        assertEquals(employee.getName(), loader.load());
    }

    @Test
    void saveAndLoadListOfPeopleGeneric() throws IOException {
        List<Employee> personList = new ArrayList<>();
        personList.add(employee);

        saver.saveAll(personList);
        assertEquals(personList.get(0).getName(),loader.load());
    }


    @Test
    void saveAndLoadListOfPeopleGenericv2() throws IOException {
        List<Person> personList = new ArrayList<>();
        personList.add(person);
        personList.add(employee);
        personList.add(worker);

        saver.saveAll(personList);
        assertEquals(personList.get(0).getName(),loader.load());
        assertEquals(personList.get(1).getName(),loader.load());
        assertEquals(personList.get(2).getName(),loader.load());
    }

    @Test
    void saveAndLoadListOfPeopleGenericv3() throws IOException {
        List<Worker> personList = new ArrayList<>();
        personList.add(worker);

        saver.saveAll(personList);
        assertEquals(personList.get(0).getName(),loader.load());

    }

}
