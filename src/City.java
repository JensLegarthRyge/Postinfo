public class City {
    private int zipCode;
    private String cityName;

    public City(int zipCode, String cityName) {
        this.zipCode = zipCode;
        this.cityName = cityName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "City{" +
                "zipCode=" + zipCode +
                ", cityName='" + cityName + '\'' +
                '}';
    }
}
