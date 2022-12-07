import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task6_2 {
    public static void main(String[] args) {
        List<String> datelist = new ArrayList<String>();
        System.out.println("请输入一个数字：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count=0;
        if(num<=2)
            System.out.println("没有质数");
        else {
            for (int i = 2; i < num; i++) {
                boolean flag = true;
                int sq = (int) Math.sqrt(i);
                for (int j = 2; j <= sq; j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    datelist.add("" + i);
                    count +=1;
                }
            }
        }
        System.out.println(num+"以内有"+count+"个质数");
        System.out.println(datelist);
    }
}
