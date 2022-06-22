import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        String[] list = {"가위", "바위", "보"};
        int[] score = {0, 0, 0};
        while (true) {
            int n = rand.nextInt(3);
            System.out.println("가위바위보중에 하나를 입력해주세요.");
            String word = sc.next();
            System.out.println("(사용자) " + word);
            if (list[n].equals(word)) {
                System.out.println(list[n] + " vs " + word + " 비겼습니다.");
                score[1]++;
                System.out.printf("총 전적 : %d승 %d무 %d패\n\n\n", score[0], score[1], score[2]);
            } else if (n == 0 && word.equals("보") || n == 1 && word.equals("가위") || n == 2 && word.equals("바위")) {
                System.out.println(list[n] + " vs " + word + " 졌습니다.");
                score[2]++;
                System.out.printf("총 전적 : %d승 %d무 %d패\n\n\n", score[0], score[1], score[2]);
            } else if (n == 0 && word.equals("바위") || n == 1 && word.equals("보") || n == 2 && word.equals("가위")) {
                System.out.println(list[n] + " vs " + word + " 이겼습니다.");
                score[0]++;
                System.out.printf("총 전적 : %d승 %d무 %d패\n\n\n", score[0], score[1], score[2]);
            } else if (word.equals("quit")){
                System.out.printf("총 전적 : %d승 %d무 %d패\n", score[0], score[1], score[2]);
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("----error! 제대로된 값을 입력해주세요!!----");
            }
        }


    }
}
