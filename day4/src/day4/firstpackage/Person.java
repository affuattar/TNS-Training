package day4.firstpackage;

public class Person {

    // data members
    private String pName;
    private String pCity;

    // getter and setter methods
    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpCity() {
        return pCity;
    }

    public void setpCity(String pCity) {
        this.pCity = pCity;
    }

    // default constructor
    public Person() {
    }

    // parameterized constructor
    public Person(String pName, String pCity) {
        this.pName = pName;
        this.pCity = pCity;
    }

    // toString method
    @Override
    public String toString() {
        return "Person [pName=" + pName + ", pCity=" + pCity + "]";
    }
}
