
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

        String line = "";
        String unparsedFile = "";
        String arrayOfLines[];

        try {
            FileReader reader = new FileReader(nameOfFile);
            BufferedReader buffReader = new BufferedReader(reader);

            while((line = buffReader.readLine()) != null){
                unparsedFile += line;
            }
            buffReader.close();

            arrayOfLines = unparsedFile.split(";");

            for(int i=0; i< arrayOfLines.length; ++i){
                System.out.println("get something");
            }

            return 2;
        }catch (IOException e){
            System.out.println("Something goes wrong during reading file" + e);
        }

        return -1;
    }

}
