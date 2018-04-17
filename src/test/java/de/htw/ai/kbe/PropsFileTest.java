package de.htw.ai.kbe;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PropsFileTest {
    @Test
    public void readPropertiesNormal(){
        try {
            assertEquals(PropsFileUtil.readFile("/Users/marvinkruger/PropsFileUtil/src/props.txt").get("sth").toString(), "hello");
        } catch (PropsFileUtilError propsFileUtilError) {
            propsFileUtilError.printStackTrace();
        }
    }

    @Test(expected = PropsFileUtilError.class)
    public void readPropertiesWithWrongPath() throws PropsFileUtilError {
        PropsFileUtil.readFile("/Users/marvinkruger/PropsFileUtil/src/props.txst");
    }

    @Test(expected = PropsFileUtilError.class)
    public void readPropertiesWithNull() throws PropsFileUtilError {
        PropsFileUtil.readFile("");
    }

    @Test(expected = PropsFileUtilError.class)
    public void readPropertiesFromInvalidPropsFile() throws PropsFileUtilError {
        PropsFileUtil.readFile("/Users/marvinkruger/PropsFileUtil/src/propsInvalid.txt");
    }
}
