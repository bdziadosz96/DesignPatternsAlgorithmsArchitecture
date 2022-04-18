package Architecture.Generics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;

public class PersonSaver {
    private final RandomAccessFile file;

    public PersonSaver(final File file) throws FileNotFoundException {
        this.file = new RandomAccessFile(file, "rw");
    }

    public void save(Person person) throws IOException {
        file.writeUTF(person.getName());
    }

    public void saveAll(List<? extends Person> list) throws IOException {
        for (Person person : list) {
            file.writeUTF(person.getName());
        }
    }




}
