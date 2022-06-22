import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Remove extends PhoneList{

    public Remove(File file) {
        super(file);
    }
    public void remove(String info) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        ArrayList<String> fileList = new ArrayList<String>();
        ArrayList<String> fileList2 = new ArrayList<String>();
        String thisLine = "";
        int cnt = 0;
        while ((thisLine = br.readLine()) != null) {
            String[] readList = thisLine.split(" ");
            if(readList[0].equals(info)){
                cnt++;
                fileList2.add(thisLine);
            }
            fileList.add(thisLine);
        }
        br.close();
        if(cnt == 1) {
            delete(info, fileList);
        }else if (cnt >= 2) {
            fileList2.forEach(System.out::println);
            Scanner sc = new Scanner(System.in);
            System.out.println("----지울번호를 입력해주세요----");
            String num = sc.nextLine();
            delete(info + " " + num, fileList);
        }else if (cnt == 0){
            System.out.println("없는 정보입니다");
        }

    }
    public void delete(String info, ArrayList<String> fileList)throws IOException{
        File file2 = new File("D:/phonenum/numberList.txt");

        FileInputStream fis = new FileInputStream(file2);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        String thisLine = "";

        String[] str;

        if(info.contains(" ")) {
            str = info.split(" ");
            FileWriter fw = new FileWriter(file2);
            for(String newfile : fileList){
                if(newfile.contains(str[0]) && newfile.contains(str[1])){
                    System.out.println("삭제되었습니다");
                    continue;
                }
                fw.write(newfile + "\n");
            }
            fw.close();

            return;
        }else {
            FileWriter fw = new FileWriter(file2);
            for(String newfile : fileList){
                if(newfile.contains(info)){
                    System.out.println("삭제되었습니다");
                    continue;
                }
                fw.write(newfile + "\n");
            }
            fw.close();

        }
        fis.close();
        br.close();
    }
}
