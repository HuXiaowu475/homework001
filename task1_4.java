import java.util.Scanner;

public class task1_4 {
    public static void main(String[] args) {
        System.out.println("month：");
        Scanner sc1 = new Scanner(System.in);
        int month = sc1.nextInt();
        System.out.println("day：");
        Scanner sc2 = new Scanner(System.in);
        int day = sc2.nextInt();
        int amount = 0;
        switch (month) {
            case 1:
                amount = 0;
                break;
            case 2:
                amount = 31;
                break;
            case 3:
                amount = 59;
                break;
            case 4:
                amount = 90;
                break;
            case 5:
                amount = 120;
                break;
            case 6:
                amount = 151;
                break;
            case 7:
                amount = 181;
                break;
            case 8:
                amount = 212;
                break;
            case 9:
                amount = 243;
                break;
            case 10:
                amount = 273;
                break;
            case 11:
                amount = 304;
                break;
            case 12:
                amount = 334;
                break;
            default:
                System.out.println("输入无效");
                break;
        }
        amount += day;
        System.out.println("输入日期为2014年的第" + amount + "天");
    }
}
