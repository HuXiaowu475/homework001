import java.util.Scanner;

public class task1_3 {
    public static void main(String[] args) {
        while(true) {
            System.out.println("输入一个月份：");
            Scanner sc = new Scanner(System.in);
            int month = sc.nextInt();
            if (month >= 1 && month <= 12) {
                if (month/3==1)
                    System.out.println("春季");
                else if (month/3==2)
                    System.out.println("夏季");
                else if (month/3==3)
                    System.out.println("秋季");
                else
                    System.out.println("冬季");
            } else
                System.out.println("输入无效");
        }
    }
}
