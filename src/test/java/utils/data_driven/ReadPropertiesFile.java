package utils.data_driven;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
    private static ReadPropertiesFile readPropertiesFile;


    public String getReadPropertiesFile(String variable) throws IOException {
        if (readPropertiesFile == null) {
            readPropertiesFile = new ReadPropertiesFile();
            readPropertiesFile.readingPropertiesFile(variable);
        }
        return readPropertiesFile.readingPropertiesFile(variable);
    }

    private String readingPropertiesFile(String variable) throws IOException {
        FileInputStream fileObj = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/values.properties");
        Properties proObj = new Properties();
        proObj.load(fileObj);
        return proObj.getProperty(variable);
    }
}