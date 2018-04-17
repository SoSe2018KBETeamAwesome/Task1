package de.htw.ai.kbe;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropsFileUtil {

    public static Properties readFile(String path) throws PropsFileUtilError{
        Properties props = new Properties();
        if(!(new File(path).exists())){
            throw new PropsFileUtilError("Not a valid path");
        }

        try(InputStream inputStream = new FileInputStream(path)){
            props.load(inputStream);
            return props;
        } catch (IOException e) {
            throw new PropsFileUtilError("Failure while reading the file");
        } catch (IllegalArgumentException e){
            throw new PropsFileUtilError("Not a props file");
        }
    }
}
