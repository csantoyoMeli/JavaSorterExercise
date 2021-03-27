import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MiFactory {
    public static Object getInstance(String objName) {


        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(new File("MiFactory.properties")));
            System.out.println(properties.get(objName));
            return Class.forName(properties.get(objName).toString()).newInstance();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
}
