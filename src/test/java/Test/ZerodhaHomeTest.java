package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ZerodhaHomeTest {
	@DataProvider (name= "NameData")
	public Object[][] data()
	{
	return new Object[][] {{"Velocity","Katraj"},{"Katraj","Training"},{"Katraj","Pune"}};
	}
	
	@Test(dataProvider= "NameData")
	public void GoToHomePageTest(String value, String Pass)
	{
		System.out.println(value + Pass);
	}

	//@Test
	//@Parameters({"C"})
	////public void HomePageTest(String d) {
	//	System.out.println(d);
	//}
	//@Test
	//@Parameters({"a","b"})

	//public void add(int a,int b) {
	//	System.out.println(a+b);
	//}
	
}
