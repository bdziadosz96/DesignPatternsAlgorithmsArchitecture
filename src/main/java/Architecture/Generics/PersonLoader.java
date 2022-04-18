package Architecture.Generics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class PersonLoader {
    private final RandomAccessFile file;

    public PersonLoader(final File file) throws FileNotFoundException {
        this.file = new RandomAccessFile(file, "rw");
    }

    public String load() throws IOException {
        return file.readUTF();
    }

}
