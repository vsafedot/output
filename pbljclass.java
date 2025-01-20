import java.util.Scanner;

public class pbljclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        int charcount = 0;
        int digitcount = 0;
        int specialcount = 0;
        int spacecount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                charcount++;
            } else if (Character.isDigit(ch)) {
                digitcount++;
            }
            else if(Character.isWhitespace(ch)){
                spacecount++;
            } 
            else {
                specialcount++;
            }
        }
        System.out.println("Number of characters in the string: " + charcount);
        System.out.println("Number of digits in the string: " + digitcount);
        // System.out.println("Number of spaces in the string: " + spacecount);
        System.out.println("Number of special characters in the string: " + specialcount);

    }
}
