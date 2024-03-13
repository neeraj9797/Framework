package Runner;

import org.testng.annotations.Test;

import Generic.basepage;
import POM.pom_facebook;

public class facebook extends basepage
{
@Test
public void login() 
{
	pom_facebook p=new pom_facebook(driver);
	p.passdata("abc");
	p.passdata1("rajni");
	p.passdata2();
}
}
