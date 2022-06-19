package ua.ithilel.java;

public class CountryTest {
    public static void main(String[] args) {

        CountryTest firstCountryTest = new CountryTest();
        firstCountryTest.countryNameTest = "Africa";
        firstCountryTest.countryAgeTest = 1000;
        firstCountryTest.countryAreaTest = 4500000;
        firstCountryTest.countryYearTest = 1200;
        firstCountryTest.printInfo();

        CountryTest secondCountryTest = new CountryTest();
        secondCountryTest.countryNameTest = "Romonia";
        secondCountryTest.countryAgeTest = 654;
        secondCountryTest.countryAreaTest = 34321;
        secondCountryTest.countryYearTest = 1443;
        secondCountryTest.printInfo();

        CountryTest thirdCountryTest = new CountryTest();
        thirdCountryTest.countryNameTest = "Belhium";
        thirdCountryTest.countryAgeTest = 1570;
        thirdCountryTest.countryAreaTest = 8888;
        thirdCountryTest.countryYearTest = 1698;
        thirdCountryTest.printInfo();
    }

    String countryNameTest;
    int countryAgeTest;
    int countryAreaTest;
    int countryYearTest;

    public void printInfo(){
        System.out.println("Country Name: " + countryNameTest);
        System.out.println("Age: " + countryAgeTest);
        System.out.println("Area Name: " + countryAreaTest);
        System.out.println("Year: " + countryYearTest);
    }


}
