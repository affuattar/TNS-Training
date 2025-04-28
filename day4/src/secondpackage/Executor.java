package secondpackage;

import day4.firstpackage.Base;

public class Executor {

    public static void main(String[] args) {
        
        Base b1 = new Base();
        
        b1.methodPublic();     // Call public method
        b1.varPublic = 51;      // Modify public variable
        b1.methodPublic();     // Call again to see updated value
    }
}
