// searching occurrences in file (mostly in xls)

import java.util.Scanner;

public class Search {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter name of file");

        String nameOfFile = userInput.nextLine();

        System.out.println("Your file is: " + nameOfFile);
    }
}
