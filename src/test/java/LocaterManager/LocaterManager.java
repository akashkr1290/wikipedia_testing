package LocaterManager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LocaterManager {

    static Properties p = new Properties();

    static {
    	FileInputStream f = null;
    	
    	try {
    		f = new FileInputStream("src\\test\\resources\\Xpath.properties");
    	} catch(FileNotFoundException  e) {
    		e.printStackTrace();
    	}
    	
    	try {
    		p.load(f);
    	}catch(IOException e) {
    		e.printStackTrace();
   
    	}
    }

    public static String getXpath(String key) {
        return p.getProperty(key);
    }
}

