import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Character : ");
        String word = sc.nextLine();
        
        if(word.length() > 1)
        {
            System.out.println("\nInvalid Input\n");
            return;
        }
        char letter = word.charAt(0);
            if(letter >= 'a' && letter <= 'z' || letter >= 'A' && letter <= 'Z')
            {   
            if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A' || 
            letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')
            {
                System.out.println("\nInput Number is Vowel\n");
            } 
            else if(!(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U'))
            {
                System.out.println("\nInput is Consonant\n");
            }
        }
        else {
            System.out.println("\nInvalid Input\n");
        }
    }
}