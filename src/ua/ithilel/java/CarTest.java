package ua.ithilel.java;

public class CarTest {
    public static void main(String[] args) {

        CarTest firstCarTest = new CarTest();
        firstCarTest.carBrandTest = "Zaporozhets";
        firstCarTest.carColourTest = "White";
        firstCarTest.carHpowerTest = 40;
        firstCarTest.carWeightTest = 700;
        firstCarTest.printInfo();

        CarTest secondCarTest = new CarTest();
        secondCarTest.carBrandTest = "Lotus";
        secondCarTest.carColourTest = "Red";
        secondCarTest.carHpowerTest = 140;
        secondCarTest.carWeightTest = 920;
        secondCarTest.printInfo();

        CarTest thirdCaTest = new CarTest();
        thirdCaTest.carBrandTest = "Saab";
        thirdCaTest.carColourTest = "Green";
        thirdCaTest.carHpowerTest = 210;
        thirdCaTest.carWeightTest = 1120;
        thirdCaTest.printInfo();

    }
    String carColourTest;
    String carBrandTest;
    int carHpowerTest;
    int carWeightTest;

    public void printInfo(){
        System.out.println("Car Brand: " + carBrandTest);
        System.out.println("Car Colour: " + carColourTest);
        System.out.println("Car Horse Power: " + carHpowerTest);
        System.out.println("Car Weight: " + carWeightTest);
    }
}
