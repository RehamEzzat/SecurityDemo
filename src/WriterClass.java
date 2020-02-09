import java.io.FilePermission;
import java.io.FileWriter;
import java.io.IOException;

public class WriterClass {
    public static void main(String[] args){
        //SecurityManager securityManager = new CustomSecurityManager();
        //System.setSecurityManager(securityManager);

        //System.setSecurityManager(new SecurityManager());

        //securityManager.checkPermission(new FilePermission("file.txt", "write"));

        try {
            FileWriter fileWriter = new FileWriter("file.txt");
            String txt = "hello world";

            for(char ch : txt.toCharArray())
                fileWriter.write(ch);

            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
