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

        String val = input.toLowerCase();
        List<String> listOfStrings = new ArrayList<String>();

        for (int i = 0; i < val.length(); i += (int) sqrt(val.length())) {
            String retVal;
            if (i + (int) sqrt(val.length() + 1) > val.length()) {
                retVal = val.substring(i);
                listOfStrings.add(retVal);
            } else {
                retVal = val.substring(i, i + (int) sqrt(val.length() + 1));
                listOfStrings.add(retVal);
            }
        }
        System.out.println("\n======================");
        for (String s : listOfStrings) {
            System.out.println(s);
        }
        System.out.println("======================");

        
    }
}
