import java.util.*;
public class Qus4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N Value and coins:");
        int n = in.nextInt();
        int [][] mat= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                mat[i][j]=in.nextInt();
            }
        }

        for(int[] row : mat)
            System.out.println(Arrays.toString(row));

        for(int i=n-2;i>-1;i--){
            for(int j=0;j<=i;j++){
                mat[i][j]+=Math.max(mat[i+1][j],mat[i+1][j+1]);
            }
        }

        for(int[] row : mat)
            System.out.println(Arrays.toString(row));
        
        System.out.print(mat[0][0]);
        
    }
}


/*
5
6 1 2 5 9 3 9 6 7 2 8 5 1 9 4

3
22 3 10 9 10 10

 */