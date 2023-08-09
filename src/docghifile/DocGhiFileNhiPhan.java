package docghifile;

import java.io.*;
import java.util.List;

public class DocGhiFileNhiPhan {

    private DocGhiFileNhiPhan() {
    }
    private static DocGhiFileNhiPhan instance;

    public static DocGhiFileNhiPhan getInstance(){
        if (instance == null)
            instance = new DocGhiFileNhiPhan();
        return instance;
    }

    public void ghiFile(List<User> list) throws IOException {
        File file = new File("ds.img");
        OutputStream os = new FileOutputStream(file);
        ObjectOutputStream fos = new ObjectOutputStream(os);
        fos.writeObject(list);
        fos.close();
    }

    public List<User> readFile() throws IOException, ClassNotFoundException {
        File file = new File("ds.img");
        InputStream inputStream = new FileInputStream(file);
        ObjectInputStream os = new ObjectInputStream(inputStream);
        List<User> list = (List<User>) os.readObject();
        return list;
    }


}
