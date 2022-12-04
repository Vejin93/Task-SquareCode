import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input;

        do {
            System.out.println("Enter message(without spaces): ");
            input = sc.nextLine();
            if (input.contains(" ") || input.isEmpty())
                System.out.println("Your message have spaces or is empty, enter message again.\n");
        } while (input.length() > 81 || input.length() <= 0 || input.contains(" ") || input.isEmpty());

        
    }
}
