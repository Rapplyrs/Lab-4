import java.util.Scanner;

public class Monkeys {
    public static void main (String [] args ) {


        Scanner scnr = new Scanner(System.in);

        int bananas = scnr.nextInt();

            bananas = bananas - 1;

            if (bananas > 1)
                System.out.println(" Im a happy monkey with " + bananas + " bananas");
            else
                System.out.println(" Im a mad monkey with  " + bananas + " bananas");

    }
}
