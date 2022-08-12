package 연습문제;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO{

    @Override
    public void readFromFile(String filename) throws IOException {
        load(new FileInputStream("dp_02_Adapter" + File.separator + "연습문제" + File.separator + filename));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        store(new FileOutputStream("dp_02_Adapter" + File.separator + "연습문제" + File.separator + filename), "written by properties");
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return (String) get(key);
    }

}
