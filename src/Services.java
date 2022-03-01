import java.util.ArrayList;

public class Services {
    public void getCityFromPostNumber(){
        ArrayList<City> allCitiesAndZipCodesList = FileReader.getCitiesList();
        System.out.print("Please input zip code: ");
        int userInputZipCode = getUserInput.Integer();
        String cityFromZipCode="";
        for (City currentCity:allCitiesAndZipCodesList) {
            if (currentCity.getZipCode()==userInputZipCode){
                cityFromZipCode=currentCity.getCityName();
            }

        }
        System.out.println("Zip "+userInputZipCode+" belongs to "+cityFromZipCode);
    }
}
