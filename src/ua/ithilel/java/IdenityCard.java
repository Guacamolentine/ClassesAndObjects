package ua.ithilel.java;

public class IdenityCard {

    String idCode;
    String idName;
    String idSurname;
    String idSitizenship;

    public void printInfo() {
        System.out.println("Code: " + idCode);
        System.out.println("Name: " + idName);
        System.out.println("Surname: " + idSurname);
        System.out.println("Sitizenship: " + idSitizenship);
    }

}
