import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class SortList extends PhoneList{

    public SortList(File file) {
        super(file);
    }
    public void sortList() throws IOException {
        FileInputStream fis = new FileInputStream(file);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        ArrayList<String> fileList = new ArrayList<String>();
        String thisLine = "";
        while ((thisLine = br.readLine()) != null) {
            fileList.add(thisLine);
        }
        Collections.sort(fileList);

        FileWriter fw = new FileWriter(file);
        for(String newfile : fileList){
            fw.write(newfile + "\n");
        }
        fis.close();
        br.close();
        fw.close();
    }
}
