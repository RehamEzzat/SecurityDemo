
public class User{
    private int id;
    private String name;
    public static int counter = 0;
    //public static int myVar;

    public User() {
        System.out.println("in constructor");
        ++counter;
    }

   /* public static void myMethod(){

    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
