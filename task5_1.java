import java.util.Scanner;

public class task5_1 {
    public static void main(String[] args) {
        System.out.println("请输入一串字符串：");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = new String();
        for(int i=str1.length()-1;i>=0;i--){
            str2 += str1.charAt(i);
        }
        System.out.println(str2);
        System.out.println(str1.equals(str2));
    }
}
