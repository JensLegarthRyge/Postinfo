import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    public static ArrayList<City> getCitiesList(){
        File zipCodesAndCityNamesList = new File("src/danske-postnumre-byer-1.csv");
        ArrayList<City> allCitiesList = new ArrayList<>();
        try{
            Scanner sc = new Scanner(zipCodesAndCityNamesList);
            sc.nextLine();
            while (sc.hasNext()){
                String currentLine = sc.nextLine();
                String[] currentLineSplit = currentLine.split(";");

                int zipCodeParsed = Integer.parseInt(currentLineSplit[0]);
                String cityName = currentLineSplit[1];

                allCitiesList.add(new City(zipCodeParsed,cityName));

            }
        } catch (FileNotFoundException e){
            System.out.println("Error - File not found...");
        }
        return allCitiesList;
    }


}
