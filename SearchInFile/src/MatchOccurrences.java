
// Here we will compare numbers

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MatchOccurrences {
    private String nameOfFile;
    private double numberToSearch;

    public MatchOccurrences(String nameOfFile, double numberToSearch){
        this.nameOfFile = nameOfFile;
        this.numberToSearch = numberToSearch;


    }


    public int catchOccurrences(){
        try {
            FileReader reader = new FileReader(nameOfFile);
            BufferedReader buffReader = new BufferedReader(reader);



            buffReader.close();
            return 2;
        }catch (IOException e){
            System.out.println("Something goes wrong during reading file" + e);
        }

        return -1;
    }

}
