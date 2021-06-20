public class p3 {
    public static void main(String[] args) {

        System.out.println("FIRST PATTERN\n");

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("\n\n");

        System.out.println("SECOND PATTERN\n");

        for (int i = 1; i <= 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 2; j--) {
                System.out.print(j);
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
