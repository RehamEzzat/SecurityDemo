import java.io.*;

public class MyClass {
    public static void main(String[] args){

        // Line 1
        SecondUser user = new SecondUser();

        // Line 2
        SecondUser.myMethod();
        // OR
        int myVar = SecondUser.myVar;

        // Line 3
        try {
            ClassLoader.getSystemClassLoader().loadClass("SecondUser");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
