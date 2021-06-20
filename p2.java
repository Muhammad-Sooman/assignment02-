import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter 2nd Number : ");
        int num2 = sc.nextInt();

        System.out.println("Enter 3rd Number : ");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3)
        {
            System.out.println("\nThe 1st Number is Greater\n");
        }
        else if(num2 > num1 && num2 > num3)
        {
            System.out.println("\nThe 2nd Number is Greater\n");
        }
        else
        {
            System.out.println("\nThe 3rd Number is Greater\n");
        }
    }
}
