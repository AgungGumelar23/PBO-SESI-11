package FileHandling;

import java.io.File;
import java.io.IOException;

public class Create {
    public Create() {
        try {
            File file = new File("data.json");
            if (file.createNewFile()) {
                System.out.println("file create : " + file.getName());
            } else {
                System.out.println("File sudah ada");
            }
        } catch (IOException e) {
            System.out.println("Gagal");
            e.printStackTrace();
        }
    }
}
