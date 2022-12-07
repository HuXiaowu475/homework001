public class task4_3 {
    public static void main(String[] args) {
        int c[][]={{1,2,3},{4,5,6},{7,8,9}};
        int d[][]={{2,2,2},{1,1,1},{3,3,3}};
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        System.out.println("c+d:");
        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){
                a[i][j]=c[i][j]+d[i][j];
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
        for(int i = 0;i < 3;i++) {
            for(int j = 0;j < 3;j++) {
                int sum = 0;
                for (int rc = 0; rc < 3; rc++){
                    sum += c[i][rc] * d[rc][j];
                }
                b[i][j] = sum;
            }

         }
        System.out.println("c*d:");
        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
