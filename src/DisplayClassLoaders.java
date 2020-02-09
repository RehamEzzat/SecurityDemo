import com.google.gson.Gson;
import com.sun.javafx.fxml.builder.JavaFXFontBuilder;
import com.sun.javafx.fxml.builder.JavaFXImageBuilder;
import com.sun.javafx.fxml.builder.JavaFXSceneBuilder;
import com.sun.javaws.jnl.JavaFXAppDesc;
import com.sun.javaws.jnl.JavaFXRuntimeDesc;
import javafx.fxml.JavaFXBuilderFactory;

import java.util.ArrayList;

public class DisplayClassLoaders {
    public static void main(String[] args){
        System.out.println("User Class Class Loader: ");
        System.out.println(User.class.getClassLoader());

        System.out.println("\nJavaFX Class Loader: ");
        System.out.println(JavaFXAppDesc.class.getClassLoader());
        System.out.println(JavaFXRuntimeDesc.class.getClassLoader());
        System.out.println(JavaFXSceneBuilder.class.getClassLoader());
        System.out.println(JavaFXFontBuilder.class.getClassLoader());
        System.out.println(JavaFXImageBuilder.class.getClassLoader());
        System.out.println(JavaFXBuilderFactory.class.getClassLoader());

        System.out.println("\nArrayList Class Loader: ");
        System.out.println(ArrayList.class.getClassLoader());

        System.out.println("\nGson Class Loader: ");
        System.out.println(Gson.class.getClassLoader());

        LambdaInterface lambdaInterface = ()->{

        };

        System.out.println("\nFrom Lambda: \n" +lambdaInterface.getClass().getClassLoader());

        try {
            Class customClassLoader =  new CustomClassLoader().findClass("User");
            //Class customClassLoader =  new CustomClassLoader().loadClass("User");

            System.out.println("\nUser Object Using Custom Class Loader: ");
            System.out.println(customClassLoader.newInstance().getClass().getClassLoader());

            System.out.println("\ncounter is: ");
            System.out.println(User.counter);

            System.out.println("\nUser Object Using App Class Loader: ");
            System.out.println(new User().getClass().getClassLoader());

            System.out.println("\ncounter is: ");
            System.out.println(User.counter);

        }  catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }
}
