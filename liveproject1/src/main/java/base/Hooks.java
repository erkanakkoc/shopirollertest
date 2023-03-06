package base;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Hooks extends BasePage{

	public Hooks() throws IOException {
		super();
	}
	
	@BeforeTest
	public void setup() throws IOException {
		getDriver().get(getDevStoreUrl());
	}
	
	@AfterTest
	public void tearDown() {
		System.out.println();
		WebDriverInstance.cleanupDriver();
	}

}