import java.io.File;
import java.io.FilePermission;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.Permission;

public class CustomSecurityManager extends SecurityManager {
    /*CustomSecurityManager(){
        File file = new File("MyPermissions.policy");
        System.setProperty("java.security.policy", "file:/"+file.getAbsolutePath());
    }*/

    public static void main(String[] args){

        AccessControlContext accessControlContext = AccessController.getContext();
        //System.setSecurityManager(new CustomSecurityManager());
        File file = new File("NewPermissions.policy");
        System.setProperty("java.security.policy", "file:/" +file.getAbsolutePath());

        CustomSecurityManager customSecurityManager = new CustomSecurityManager();
        System.setSecurityManager(customSecurityManager);
        customSecurityManager.checkPermission(new FilePermission("file.txt", "write"), accessControlContext);

    }
}
