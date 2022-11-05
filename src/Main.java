import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a palindrome: ");
        int palindrome = scan.nextInt();

        String stringPalindrome = Integer.toString(palindrome);
        String reversedPalindrome = "";

        for (int x = stringPalindrome.length() - 1; x >= 0; x -= 1){
            reversedPalindrome += stringPalindrome.charAt(x);
        }

        if (reversedPalindrome.equals(stringPalindrome)){
            System.out.println(palindrome + " is a palindrome");
        }else{
            System.out.println("Not a palindrome");
        }

    }
}