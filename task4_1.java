import java.util.Random;
import java.util.Scanner;

public class task4_1 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] a = new int[11];
        for (int i = 0; i < 10; i++) {
            a[i] = r.nextInt(99) + 1;
        }
        for (int i = 0; i < a.length - 1; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个二位正整数：");
        a[10] = sc.nextInt();
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp;
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("");
        for (int i = 0; i < a.length - 1; i++){
            System.out.print(a[i]+" ");
        }
    }
}