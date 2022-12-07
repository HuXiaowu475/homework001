import java.util.Scanner;

public class task1_1 {
    public static void main(String[] args) {
        while(true) {
            System.out.println("输入一个小写字母：");
            Scanner sc = new Scanner(System.in);
            char c = sc.next().charAt(0);
            switch (c) {
                case 'a':
                    System.out.println('A');
                    break;
                case 'b':
                    System.out.println('B');
                    break;
                case 'c':
                    System.out.println('C');
                    break;
                case 'd':
                    System.out.println('D');
                    break;
                case 'e':
                    System.out.println('E');
                    break;
                default:
                    System.out.println("other");
            }
        }
    }
}
