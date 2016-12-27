// searching occurrences in file (mostly in xls)

import java.util.Scanner;

public class Search {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Name of file by default: payments.csv ");
        System.out.print("Put file in folder and enter the sum to search: ");

        String sumToSearch = userInput.nextLine();

        MatchOccurrences reestr = new MatchOccurrences("payments.csv", sumToSearch);

        reestr.catchOccurrences();

    }
}


