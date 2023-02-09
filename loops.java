// Loops ---> for,while,do while

import java.util.*;

public class loops {public static void main(StringsDataType[]args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    for(int i=0; i<num; i++){
        for (int j=0; j<=i; j++){
            System.out.print("* ");
        }
        System.out.println();
    }

    int sum =0;
    for (int i =1; i<num;i++){
        sum = sum +i;
    }
    System.out.println(sum);

    for(int i=0; i<num; i++){
        for (int j=num; j>i; j--){
            System.out.print("* ");
        }
        System.out.println();
    }

    int k =0;
    while(k<num){
        System.out.println("Hello");
        k++ ;}

    int m=12;
    do{
        System.out.println("I am loop");
    }while (m<11);

}}
