package ua.ithilel.java;

public class IdenityCardTest {
    public static void main(String[] args) {

        IdenityCardTest firstPersonTest = new IdenityCardTest();
        firstPersonTest.idCardTest = 121212;
        firstPersonTest.idNameTest = "Yaroslav";
        firstPersonTest.idSurnameTest = "Sirko";
        firstPersonTest.idSitizenshipTest = "Ukrainian";
        firstPersonTest.printInfo();

        IdenityCardTest secondPersonTest = new IdenityCardTest();
        secondPersonTest.idCardTest = 232323;
        secondPersonTest.idNameTest = "George";
        secondPersonTest.idSurnameTest = "Fiofanov";
        secondPersonTest.idSitizenshipTest = "Georgian";
        secondPersonTest.printInfo();

        IdenityCardTest thirdPersonTest = new IdenityCardTest();
        thirdPersonTest.idCardTest = 313131;
        thirdPersonTest.idNameTest = "Piter";
        thirdPersonTest.idSurnameTest = "Parker";
        thirdPersonTest.idSitizenshipTest = "American";
        thirdPersonTest.printInfo();
    }

    int idCardTest;
    String idNameTest;
    String idSurnameTest;
    String idSitizenshipTest;

    public void printInfo() {
        System.out.println("Card Number: " + idCardTest);
        System.out.println("Name: " + idNameTest);
        System.out.println("Surname: " + idSurnameTest);
        System.out.println("Sitizenship: " + idSitizenshipTest);
    }


}
