import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        char [] charArray = sentence.toCharArray();
        int count = 0;
        for(char c: charArray){
            switch (c){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
                default:

            }
        }
        System.out.printf("The numbers of vowel in the above sentence is%2s", count);

    }
}
