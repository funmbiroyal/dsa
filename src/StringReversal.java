import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
//  Method 1
       StringBuilder reversedString = new StringBuilder();
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
       String string = scanner.nextLine();

       reversedString.append(string);
       reversedString.reverse();
        System.out.println(reversedString);
//method 2

        System.out.println("Enter string 2: ");
        String string2 = scanner.nextLine();
        char [] chars = string2.toCharArray();

        for (int i = chars.length-1; i>=0; i--){
            System.out.print(chars[i]);
        }

    }
    }



































//Method 1
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a String: ");
//        String string = scanner.nextLine();
//
//        StringBuilder reversedString = new StringBuilder();
//        reversedString.append(string);
//
//        reversedString.reverse();
//        System.out.println(reversedString);
//      //Method 2
//        System.out.println("Enter second String: ");
//
//        String string2 = scanner.nextLine();
//
//        char[] chars = string2.toCharArray();
//
//        for(int i = chars.length-1; i >=0; i--){
//            System.out.print(chars[i]);