// Functions and methods

import java.util.Scanner;

public class function {
    public static void printMyname(){
        System.out.println("Hello I am a Java Developer!");
    }
    public static int sum(int a,int b){// int result = a+b;
        return a+b;
    }
    public static int mul(int a,int b){
        return a*b;
    }
    public static int factorial(int n){
        if(n<0){
            System.out.println("Input not valid");
            return 0;
        }
        int fact = 1;
            for(int i=1;i<=n;i++){
                fact = fact *i;
        }
        return fact;

    }
    // Task
    public static float average(float a,float b,float c){
        return (a+b+c)/3;
    }
    public static int sumOdd(int n){
        int sum =0;
        for(int i=1;i<=n;i++){
            if (i % 2 != 0) {
                sum = sum+i;
            }
        }return sum;
    }
    public static int greater(int a,int b){
        if (a>b){return a;}
        return b;
    }
    public static float circumference(float r){  float ans = (float) (2 * 3.14 * r); return ans ;   }
    public static String valid(int age){ if(age>18){return "Yes!";} return "No!";}
    public static String Count(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number you want to provide : \n You may enter +ve / -ve / zero ");
        int n = sc.nextInt();
        System.out.println("Enter desired numbers :");
        int pos = 0;
        int neg = 0;
        int zero = 0;
        for(int i=1;i<=n;i++){
            int num = sc.nextInt();
            if(num>0){ pos+=1;} else if (num<0) { neg +=1;} else{ zero +=1;}
            } return " Positive : "+pos+" Negative : "+neg+" Zero : "+zero;
        }
    public static int Power(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int x = sc.nextInt();
        System.out.println("Enter power : ");
        int n = sc.nextInt();
        return (int) Math.pow(x,n);
    }

    public static void main(StringsDataType[]args){
        printMyname();
        int r = sum(5,8);
        System.out.println("Sum :"+r);
        System.out.println("Product :"+mul(5,7));
        System.out.println("Factorial of 5 :"+factorial(5));
        System.out.println("Average :"+average(4,5,5));
        System.out.println("Sum od odd :"+sumOdd(3));
        System.out.println("Greater num :"+greater(5,8));
        System.out.println("Circumference:"+circumference(5));
        System.out.println("Are you eligible : "+valid(23));
        System.out.println(valid(23));
//        System.out.println(Count());
        System.out.println(Power());


}
}
