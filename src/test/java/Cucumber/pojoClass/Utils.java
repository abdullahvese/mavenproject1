package Cucumber.pojoClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utils {
    public static String getGlobalValue(String key) throws IOException {
        Properties pro = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\Monster1\\Desktop\\workspace\\InarAcademy\\mavenproject\\src\\main\\resources\\global.properties");
        pro.load(fis);
        return pro.getProperty(key);

    }

}