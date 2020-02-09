import com.sun.jndi.cosnaming.IiopUrl;

public class SecondUser extends UserParent{

    private int id;
    private String name;

    public static int counter = 0;
    public static int myVar;

    static {
        System.out.println("*************Loading SecondUser Class ...");
    }
    public static UserAddress userAddress;

    public SecondUser() {
        //System.out.println("in constructor");
        ++counter;
    }

    public static void myMethod(){

    }

    public static class UserAddress{

        static {
            System.out.println("*************Loading Address Class ...");
        }
    }
}
