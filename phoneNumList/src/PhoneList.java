import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PhoneList {
    File file;
    FileWriter fw;
    String array[];
    ArrayList<String> fileList = new ArrayList<String>();

    public PhoneList(File file) {
        this.file = file;
    }
    public void insert(String info) throws IOException {
        fw = new FileWriter(file, true);
        fw.write(info + "\n");
        fw.close();
    }

}
