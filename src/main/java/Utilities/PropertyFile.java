package Utilities;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFile  {


        Properties properties = new Properties();
        InputStream inputStream = PropertyFile.class.getClassLoader().getResourceAsStream("C:\\Users\\Thandeka\\IdeaProjects\\EMM_Fleet\\src\\test\\java\\Config\\config.properties");
        public Properties getProperties () throws IOException {
            properties.load(inputStream);
            /*System.out.println("url:" + " " + properties.getProperty("url"));
            System.out.println("url:" + " " + properties.getProperty("browser"));*/
            return properties;
        }
        public  String getUrl(){
            return properties.getProperty("url");
        }
         
        public String getBrowser(){
            return properties.getProperty("browser");
        }


}


