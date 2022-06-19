package ua.ithilel.java;

public class Main {

    public static void main(String[] args) {

        IdenityCard firstPerson = new IdenityCard();
        firstPerson.idCode = "111111";
        firstPerson.idName = "Valentyn";
        firstPerson.idSurname = "Borozniuk";
        firstPerson.idSitizenship = "Ukrainian";

        IdenityCard secondPerson = new IdenityCard();
        secondPerson.idCode = "222222";
        secondPerson.idName = "Alexandr";
        secondPerson.idSurname = "Marchenko";
        secondPerson.idSitizenship = "American";

        IdenityCard thirdPerson = new IdenityCard();
        thirdPerson.idCode = "333333";
        thirdPerson.idName = "Mariya";
        thirdPerson.idSurname = "Samoylova";
        thirdPerson.idSitizenship = "Spanish";

        Country firstCountry = new Country();
        firstCountry.countryName = "Austria";
        firstCountry.countryAge = 200;
        firstCountry.countryArea = 11000;
        firstCountry.countryYear = 1765;

        Country secondCountry = new Country();
        secondCountry.countryName = "Gremany";
        secondCountry.countryAge = 500;
        secondCountry.countryArea = 350000;
        secondCountry.countryYear = 1453;

        Country thirdCountry = new Country();
        thirdCountry.countryName = "Brazil";
        thirdCountry.countryAge = 431;
        thirdCountry.countryArea = 754976;
        thirdCountry.countryYear = 430;

        Car firstCar = new Car();
        firstCar.carBrand = "Mersedes";
        firstCar.carColour = "Red";
        firstCar.carWeight = 1500;
        firstCar.carHpower = 325;

        Car secondCar = new Car();
        secondCar.carBrand = "BMW";
        secondCar.carColour = "Blue";
        secondCar.carWeight = 1150;
        secondCar.carHpower = 421;

        Car thirdCar = new Car();
        thirdCar.carBrand = "Audi";
        thirdCar.carColour = "Grey";
        thirdCar.carWeight = 1468;
        thirdCar.carHpower = 345;

        System.out.println("First Person:");
        firstPerson.printInfo();
        System.out.println("Second Person:");
        secondPerson.printInfo();
        System.out.println("Third Person:");
        thirdPerson.printInfo();

        System.out.println("First Country:");
        firstCountry.printInfo();
        System.out.println("Second Country:");
        secondCountry.printInfo();
        System.out.println("Third Country:");
        thirdCountry.printInfo();

        System.out.println("First Car:");
        firstCar.printInfo();
        System.out.println("Second Car:");
        secondCar.printInfo();
        System.out.println("Third Car:");
        thirdCar.printInfo();


    }
}
