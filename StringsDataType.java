import java.util.Scanner;

public class StringsDataType {public static void main(String[]args){
    String Name1 = "Iron Man";
    Scanner sc = new Scanner(System.in);
    String Name2 = "Iron Man";
//    String name2 = sc.nextLine();
    System.out.println("I am "+Name2);
    System.out.println("Length : "+Name2.length());
    //charAt
//    for (int i =0;i<Name2.length();i++){
//        System.out.println(Name.charAt(i));
//    }
    // to compare two numbers
    // 1. s1<s2 : +ve value
    // 2. s1==s2 : 0 value
    // 3. s1>s2 : -ve value
    if (Name1.compareTo(Name2)==0){
        System.out.println("Strings are equal");
    }else{
        System.out.println("Stings are not equal");
    }
    String sentence = "My name is Tony";
    String name = sentence.substring(11,sentence.length());
    System.out.println(name);
}
}
