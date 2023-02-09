public class StringBuilders {public static void main(String[]args){
    StringBuilder sb = new StringBuilder("Tony");
    System.out.println(sb);
    //char at index 0
    System.out.println(sb.charAt(0));
    // set char at index 0
    sb.setCharAt(0,'h');
    System.out.println(sb);
    // insert char at index 0
    sb.insert(0,'S');
    System.out.println(sb);
    //delete char from index 1 to 2-1
    sb.delete(1,2);
    System.out.println(sb);
    // appned char/str
    sb.append(" Stark");
    System.out.println(sb);

    // reverse string
    for(int i=0;i<sb.length()/2;i++){
        int front = i;
        int back = sb.length()-i-1;

        char frontchar = sb.charAt(front);
        char backchar = sb.charAt(back);

        sb.setCharAt(front,backchar);
        sb.setCharAt(back,frontchar);
    }
    System.out.println(sb);
}
}
