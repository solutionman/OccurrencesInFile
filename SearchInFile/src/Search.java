// searching occurrences in file (mostly in xls)

import java.util.Scanner;

public class Search {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        System.out.println("Name of file by default: payments.csv ");

        System.out.println("Paste path to file");
        String pathToFolder = userInput.nextLine();
        String pathToFile = pathToFolder + "/payments.csv";

        System.out.print("Enter the sum to search: ");
        String sumToSearch = userInput.nextLine();

        MatchOccurrences reestr = new MatchOccurrences(pathToFile, sumToSearch);

        reestr.catchOccurrences();

    }
}


