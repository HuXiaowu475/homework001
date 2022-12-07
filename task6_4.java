import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task6_4 {
    public static List<String> minPrime(int n){
        List<String> res = new ArrayList<String>();
        for (int i = 2; i < n; i++) {
            boolean flag = true;
            int sq = (int) Math.sqrt(i);
            for (int j = 2; j <= sq; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                res.add("" + i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("请输入一个数字：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = num;
        boolean flag = false;
        List<String> resx = new ArrayList<String>();
        if(num<=2)
            System.out.println("该数不能质因数分解");
        else {

            int sq = (int) Math.sqrt(num);
            for (int i = 2; i <= sq; i++) {
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("该数不能质因数分解");
            }
            if(flag) {
                    List<String> res1 = new ArrayList<String>();
                    boolean flag1 = true;
                    while (flag1) {
                        res1 = minPrime(num);
                        for (int k = 0; k < res1.size(); k++) {
                            if (num % Integer.parseInt(res1.get(k)) == 0) {
                                resx.add("" + Integer.parseInt(res1.get(k)));
                                num = num / Integer.parseInt(res1.get(k));
                                break;
                            }
                        }
                        int sq1 = (int) Math.sqrt(num);
                        flag1 = false;
                        for (int i = 2; i <= sq1; i++) {
                            if (num % i == 0) {
                                flag1 = true;
                                break;
                            }
                        }
                    }
                    resx.add("" + num);
                    System.out.print(num1+"=");
                    for (int l = 0; l < resx.size(); l++){
                        if(l!=resx.size()-1)
                            System.out.print(Integer.parseInt(resx.get(l))+"*");
                        else
                            System.out.print(Integer.parseInt(resx.get(l)));
                    }
            }

        }


    }
}

