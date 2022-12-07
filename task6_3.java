import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task6_3 {
    public static void main(String[] args) {
        int[] res0 = {2};
        System.out.println("请输入一个数字：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 1;
        int[] res = {2};
        if (num <= 2)
            System.out.println("没有质数");
        else {
            for (int i = 3; i < num; i++) {
                boolean flag = true;
                int sq = (int) Math.sqrt(i);
                for (int j = 0; j < res0.length; j++) {
                    if (res0[j] <= sq && i % res0[j] == 0) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    res = new int[res0.length + 1];
                    for (int k = 0; k < res0.length; k++) {
                        res[k] = res0[k];
                    }
                    res[res0.length] = i;
                    res0 = res;
                    count += 1;
                }
            }
        }
        System.out.println(num + "以内有" + count + "个质数");
        for (int i = 0; i < res.length; i++){
            if(i==0)
                System.out.print("["+res[i]);
            else
                System.out.print(","+res[i]);
        }
        System.out.print("]");
    }
}
