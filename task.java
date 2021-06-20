import java.util.Scanner;

public class task{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Month Number : ");
        int month = sc.nextInt();
        System.out.println("Enter Year : ");
        int year = sc.nextInt();

        switch(month)
        {
            case 1:
            {
                System.out.println("\nJanuary " + year + " has 31 days\n");
                break;
            }
            case 2:
            {
                if(year % 4 == 0)
                {
                    System.out.println("\nFebruary " + year + " has 29 days\n");
                }
                else
                {
                    System.out.println("\nFebruary " + year + " has 28 days\n");
                }
                break;
            }
            case 3:
            {
                System.out.println("\nMarch " + year + " has 31 days\n");
                break;
            }
            case 4:
            {
                System.out.println("\nApril " + year + " has 30 days\n");
                break;
            }
            case 5:
            {
                System.out.println("\nMay " + year + " has 31 days\n");
                break;
            }
            case 6:
            {
                System.out.println("\nJune " + year + " has 30 days\n");
                break;
            }
            case 7:
            {
                System.out.println("\nJuly " + year + " has 31 days\n");
                break;
            }
            case 8:
            {
                System.out.println("\nAugust " + year + " has 31 days\n");
                break;
            }
            case 9:
            {
                System.out.println("\nSeptember " + year + " has 30 days\n");
                break;
            }
            case 10:
            {
                System.out.println("\nOctober " + year + " has 31 days\n");
                break;
            }
            case 11:
            {
                System.out.println("\nNovember " + year + " has 30 days\n");
                break;
            }
            case 12:
            {
                System.out.println("\nDecember " + year + " has 31 days\n");
                break;
            }
            default : 
            {
                System.out.println("Enter Valid number!");
            }
        }
    }
}