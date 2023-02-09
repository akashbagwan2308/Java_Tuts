import java.util.Scanner;

public class TwoDArrays {public static void main(StringsDataType[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no of Rows :");
    int rows = sc.nextInt();
    System.out.println("Enter no of Columns :");
    int columns = sc.nextInt();
    int numbers[][]= new int[rows][columns];
    for (int i=0;i<rows;i++){
        for (int j =0; j<columns;j++){
            System.out.println("Enter the element :");
            numbers[i][j]= sc.nextInt();
        }
    }
    System.out.println("Your 2 D array :");
    for (int i=0;i<rows;i++){
        for (int j =0; j<columns;j++){
            System.out.print(numbers[i][j]+" ");
        }
        System.out.println();
    }
}
}
//import java.util.*;
//
//
//public class Arrays {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//
//
//        int matrix[][] = new int[n][m];
//        for(int i=0; i<n; i++) {
//            for(int j=0; j<m; j++) {
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//
//
//        System.out.println("The Spiral Order Matrix is : ");
//        int rowStart = 0;
//        int rowEnd = n-1;
//        int colStart = 0;
//        int colEnd = m-1;
//
//
//        //To print spiral order matrix
//        while(rowStart <= rowEnd && colStart <= colEnd) {
//            //1
//            for(int col=colStart; col<=colEnd; col++) {
//                System.out.print(matrix[rowStart][col] + " ");
//            }
//            rowStart++;
//
//
//            //2
//            for(int row=rowStart; row<=rowEnd; row++) {
//                System.out.print(matrix[row][colEnd] +" ");
//            }
//            colEnd--;
//
//
//            //3
//            for(int col=colEnd; col>=colStart; col--) {
//                System.out.print(matrix[rowEnd][col] + " ");
//            }
//            rowEnd--;
//
//
//            //4
//            for(int row=rowEnd; row>=rowStart; row--) {
//                System.out.print(matrix[row][colStart] + " ");
//            }
//            colStart++;
//
//
//            System.out.println();
//        }
//    }
//}
