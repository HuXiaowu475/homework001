import java.util.Scanner;

public class task1_2 {
    public static void main(String[] args) {
        while(true) {
            System.out.println("输入一个学生的成绩：");
            Scanner sc = new Scanner(System.in);
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                if (score >= 60)
                    System.out.println("合格");
                else
                    System.out.println("不合格");
            } else
                System.out.println("输入无效");
        }
    }
}
