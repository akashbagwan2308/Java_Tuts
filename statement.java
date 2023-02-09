//conditional statements
// if ,if-else, if-elseif,for,while
import java.util.*;
// -----> Que 1.
//public class statement {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//        if (age>18){
//            System.out.println("Adult");
//        }
//        else{
//            System.out.println("Not Adult");
//        }
//    }
//}

// -----> Que 2.
//public class statement {
//    public static void main(String[] arg) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number : ");
//        int num = sc.nextInt();
//        if (num % 2 == 0) {
//            System.out.println("Number is even");
//        } else {
//            System.out.println("Number is odd");
//        }
//    }
//}

// -----> Que 3.

//public class statement {
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a : ");
//        int a = sc.nextInt();
//        System.out.print("Enter b : ");
//        int b = sc.nextInt();
//        if (a>b) {System.out.println("a is greater than b");}
//        else if (a<b) {System.out.println("a is lesser than b");}
//        else {System.out.println("a is equal to b");}
//    }
//}

// -----> Que 4.
//public class statement {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int Button = sc.nextInt();
//        if (Button == 1) {
//            System.out.println("Hello");
//        } else if (Button==2) {
//            System.out.println("Namaste");
//
//        }else if (Button == 3){
//            System.out.println("Bonjour");
//        }
//        }else{
//            System.out.println("Invalid Button");
//        }
//    }
//}
// -----> Que 5.

public class statement {
    public static void main(StringsDataType[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1/2/3");
        int Button = sc.nextInt();
        switch (Button){
            case 1: System.out.println("Hello"); break;
            case 2: System.out.println("Namste"); break;
            case 3: System.out.println("Bounjour");break;
            default: System.out.println("Invalid Button");break;
        }
    }
}