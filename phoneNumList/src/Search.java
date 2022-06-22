import java.io.*;

public class Search extends PhoneList{

    public Search(File file) {
        super(file);
    }
    public void search(String info) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        String thisLine = "";

        while ((thisLine = br.readLine()) != null) {
            if(thisLine.contains(info)){
                System.out.println(thisLine);
            }
        }
    }
}
