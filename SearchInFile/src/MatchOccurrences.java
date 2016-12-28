
// Here we will compare numbers

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.DoubleSummaryStatistics;

public class MatchOccurrences {
    private String nameOfFile;
    private String numberToSearch;

    public MatchOccurrences(String nameOfFile, String numberToSearch) {
        this.nameOfFile = nameOfFile;
        this.numberToSearch = numberToSearch;


    }


    public int catchOccurrences() {

        String line = "";
        String unparsedFile = "";
        String arrayOfLines[];

        try {
            FileReader reader = new FileReader(nameOfFile);
            BufferedReader buffReader = new BufferedReader(reader);

            while ((line = buffReader.readLine()) != null) {
                unparsedFile += line;
            }
            buffReader.close();

            arrayOfLines = unparsedFile.split("\"");

            for(int i=0; i < arrayOfLines.length; ++i){
                try{
                    double temp = Double.parseDouble(arrayOfLines[i]);
                }catch (Exception e){
                    arrayOfLines[i] = "0";
                }
            }

            for (int i = 0; i < arrayOfLines.length; ++i) {
                for(int j = i; j< arrayOfLines.length; ++j){
                    for(int k = j ; k < arrayOfLines.length; ++k) {

                        if (arrayOfLines[i].equals(numberToSearch)) {
                            System.out.println("Catch " + arrayOfLines[i]);
                        }

                        double temp = Double.parseDouble(arrayOfLines[i]) + Double.parseDouble(arrayOfLines[j]);
                        String tempString = String.valueOf(temp);

                        if (tempString.equals(numberToSearch)) {
                            System.out.printf("Catch %s + %s = %s\n", arrayOfLines[i], arrayOfLines[j], numberToSearch);
                        }
                        //System.out.println("get something");

                        double temp3Numbers = Double.parseDouble(arrayOfLines[i]) + Double.parseDouble(arrayOfLines[j]) + Double.parseDouble(arrayOfLines[k]);
                        String temp3NumbersString = String.valueOf(temp3Numbers);

                        if(temp3NumbersString.equals(numberToSearch)){
                            System.out.printf("Catch %s + %s + %s = %s\n", arrayOfLines[i], arrayOfLines[j], arrayOfLines[k], numberToSearch);
                        }

                    }
                }
            }

            return 2;
        } catch (IOException e) {
            System.out.println("Something goes wrong during reading file" + e);
        }

        return -1;
    }

}
