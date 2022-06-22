import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        File file = new File("D:/phonenum/numberList.txt");
        System.out.println(file.getCanonicalFile());

        PhoneList phonelist = new PhoneList(file);
        SortList sortList = new SortList(file);
        Remove re = new Remove(file);
        Search sr = new Search(file);
        Exit exit = new Exit();

        while(true){
            sortList.sortList();
            System.out.println("/write, /remove, /search, /exit");
            String cmd = scanner.next();
            switch(cmd){
                case "/write":
                    System.out.print("이름을 입력하세요: ");
                    String name = scanner.next();
                    System.out.print("전화번호를 입력하세요: ");
                    String phonenum = scanner.next();
                    phonelist.insert(name + " " + phonenum);
                    break;
                case "/remove":
                    System.out.print("삭제 할 정보를 입력하세요: ");
                    String mov = scanner.next();
                    re.remove(mov);
                    break;
                case "/search":
                    System.out.print("검색 할 정보를 입력하세요: ");
                    String ser = scanner.next();
                    sr.search(ser);
                    break;
                case "/exit":
                    exit.exit();
                default: System.out.println("올바른 명령어를 입력해주세요.");
            }
        }

    }
}
