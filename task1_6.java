public class task1_6 {
    public static void main(String[] args) {
        int sum=0,counter=0;
        for(int i=1;i<=100;i++){
            if(i%7==0){
                counter+=1;
                sum+=i;
            }
        }
        System.out.println("个数："+counter);
        System.out.println("总和："+sum);
    }
}
