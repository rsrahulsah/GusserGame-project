import java.util.Scanner;

public class Matrices_program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of Row : ");
        int row=sc.nextInt();
        System.out.println("enter the number of column: ");
        int col= sc.nextInt();

        int array[][]=new int[row][col];
        int total=row*col;

        System.out.println("enter the "+total+" elements number");

        for(int i=0; i<row;i++){
            for(int j=0; j<row; j++){
                array[i][j]= sc.nextInt();
            }
        }
        sc.close();
        System.out.println("The given matrices are : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(array[i][j]+"\t ");
            }
            System.out.println();
        }

    }
}
