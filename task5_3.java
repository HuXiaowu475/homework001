import java.util.Scanner;

public class task5_3 {
    public static void main(String[] args) {
        System.out.println("请输入一个十六进制字符串：");
        Scanner sc = new Scanner(System.in);
        int sum=0;
        String str = sc.nextLine();
        for(int i=0;i<=str.length()-1;i++){
            int num=0;
            char ch = str.charAt(i);
            if(ch=='a'||ch=='b'||ch=='c'||ch=='d'||ch=='e'||ch=='f'){
                num = 10+(ch-'a');
            }
            else {
                num = Integer.parseInt(""+ch);
            }

            int right=1;
            for(int j=1;j<=str.length()-i-1;j++)
                right *= 16;
            sum += num*right;
        }
        System.out.println("转化为十进制是：");
        System.out.println(sum);
    }
}
