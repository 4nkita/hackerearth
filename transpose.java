import java.util.*;
import java.io.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        int row,col,i,j;
        
        Scanner s= new Scanner(System.in);
        row= s.nextInt();
        col=s.nextInt();
        int[][] arr=new int[row][col];
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
     for(i=0;i<col;i++)
        {
            for(j=0;j<row;j++)
            {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}