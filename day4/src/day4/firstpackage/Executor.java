package day4.firstpackage;

public class Executor {

    public static void main(String[] args) {
        // Accessing within same package
        Base b1 = new Base();
        b1.methodPublic();
        b1.methodDefault();
        b1.methodProtected();
        // b1.methodPrivate(); // private method cannot be accessed outside its class

        b1.varDefault = 11;
        b1.methodDefault();

        b1.varProtected = 41;
        b1.methodProtected();
    }
}
