package LocaterManager;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class LocaterManager {

    static Properties p = new Properties();

    static {
        try (InputStream in = openProps()) {
            p.load(in);
        } catch (Exception e) {
            throw new RuntimeException("Xpath.properties nahi mili", e);
        }
    }

    private static InputStream openProps() throws Exception {
        InputStream in = LocaterManager.class.getClassLoader().getResourceAsStream("Xpath.properties");
        if (in != null) return in;
        return new FileInputStream("src/test/resources/Xpath.properties");
    }

    public static String getXpath(String key) {
        return p.getProperty(key);
    }
}

