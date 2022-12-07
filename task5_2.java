import java.util.Scanner;

public class task5_2 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符：");
        Scanner sc=new Scanner(System.in);
        char ch=(sc.nextLine()).charAt(0);
        System.out.println("请输入一个字符串：");
        String str = sc.nextLine();
        int found = 0;
        int locate = 0;
        for(int i=0;i<=str.length()-1;i++){
            if(ch==str.charAt(i)){
                found = 1;
                locate = i;
            }
        }
        if(found==1)
            System.out.println(locate+1);
        else if(found==0)
            System.out.println("Not Found");
    }
}
