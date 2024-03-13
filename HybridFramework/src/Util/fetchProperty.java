package Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;

public class fetchProperty {
@Test
public static String getpro() throws FileNotFoundException, IOException
{
	Properties p=new Properties();
	p.load(new FileInputStream("./URL.properties"));
	String url = p.getProperty("baseurl");
	return url;
}
}
