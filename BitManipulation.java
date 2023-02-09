/*
get()
set()
clear()
update()
 */

import java.util.Scanner;

public class BitManipulation {public static void main(String[]args){

    // GET Bit
    // Bitmask : 1<<i
    // Operation : AND
    int n = 5; //0101
    int pos = 2;
    int bitMask = 1<<pos; // 0001 --->  0100
    if((bitMask & n)==0){
        System.out.println("bit was zero");
    }else{
        System.out.println("bit was one");
    }

    // set bit   0 --> 1
    // Bitmask : 1<<i
    // Operation : OR
    int n1 = 5; //0101
    int pos1 = 1;
    int bitMask1 = 1<<pos1; // 0001 --->  0010
    int newNumber = bitMask1 | n1;
    System.out.println(newNumber);

    // Clear bit  1 --> 0
    // Bitmask : 1<<i
    // Operation : And with NOT(BitMask)
    int n2 = 5; //0101
    int pos2 = 2;
    int bitMask2 = 1<<pos2; // 0001 --->  0100
    int newNumber2 = ~(bitMask2) & n2;
    System.out.println(newNumber2);

    // Update bit  0-->1 , 1-->0

    // For 1 --> 0 :
    // Bitmask : 1<<i
    // Operation : And with NOT(BitMask)

    // For 0 --> 1 :
    // Bitmask : 1<<i
    // Operation : OR
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter you want to set ( 1 or 0) :");
    int oper = sc.nextInt();
    int n3 = 5;
    int pos3 = 1;
    int bitMask3 = 1 << pos3;
    // update bit to 1 else update bit to 0
    if(oper == 1){
        // set
        int newNumber3 = bitMask3 | n3;
        System.out.println(newNumber3);
    }else {
        // clear
        int newNumber3 = ~(bitMask3) & n3;
        System.out.println(newNumber3);
    }


}
}
