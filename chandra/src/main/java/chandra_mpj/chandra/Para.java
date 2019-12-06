package chandra_mpj.chandra;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Para extends Basicstestng {
	/*
	 * WebDriver driver;
	 * 
	 * @Test(priority=0)
	 * 
	 * public void lunch() throws InterruptedException {
	 * System.setProperty("webdriver.chrome.driver",
	 * System.getProperty("user.dir")+"\\drive\\chromedriver.exe"); driver=new
	 * ChromeDriver(); driver.get("http://www.gmail.com"); Thread.sleep(5000); }
	 */

	@Test(priority = 0)
	public static void test1() {
		System.out.println("test 1 is running");
	}

	@Test(priority = 1)
	public static void test2() {
		System.out.println("test 2 is running");
	}

	@Test
	public static void test3() {
		System.out.println("test3 is running");
	}

	/*
	 * @DataProvider(name = "data-provider") public Object[][] dataProviderMethod()
	 * { return new Object[][] { { "data one" }, { "data two" } }; }
	 * 
	 * @Test(description = "hai")
	 * 
	 * public void testMethod() { System.out.println("hello"); }
	 */
}
