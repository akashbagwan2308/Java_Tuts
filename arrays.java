import java.util.Scanner;

public class arrays {public static void main(StringsDataType[]args){
//    int[] marks = new int[3];
//    int marks[]={97,98,95};
    int marks[] = new int[3];
    marks[0]=97;// physics
    marks[1]=98;// chemistry
    marks[2]=95;// english
//    System.out.println(marks[0]);
//    System.out.println(marks[1]);
//    System.out.println(marks[2]);
    for (int i = 0;i<3;i++){System.out.println(marks[i]);}
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int size = sc.nextInt();
    int numbers[]= new int[size];
    for(int i=0;i<size;i++){ System.out.println("Enter array "+(i+1)+" element :");int num = sc.nextInt(); numbers[i]=num;}
    System.out.println("Enter the number to find !!");
    int x = sc.nextInt();
    for (int i = 0;i<numbers.length;i++){if(numbers[i]==x){System.out.println(x+" found at index "+i); }}


}
}
