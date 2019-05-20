package driverScript;

import org.testng.annotations.Test;

public class AppTest {
@Test
public void kickStart() throws Throwable
{
DriverScript ds = new DriverScript();
try
{
	ds.runTest();
}catch(Exception e)
{
	e.printStackTrace();
}
}
}
//button[text()='OK'])[6]