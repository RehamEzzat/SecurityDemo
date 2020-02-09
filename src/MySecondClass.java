import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MySecondClass {

    public static void main(String[] args){
        try {
            // Another way to know that the class has been loaded in memory

            Method method = ClassLoader.class.getDeclaredMethod("findLoadedClass", new Class[]{String.class});

            method.setAccessible(true);
            ClassLoader classLoader = ClassLoader.getSystemClassLoader();

            System.out.println("before:\n"+method.invoke(classLoader, "User"));

            User user = new User();

            System.out.println("\nafter:\n"+method.invoke(classLoader, "User"));

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
