package genricLibraries;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
//this is base class

public class BaseClass {
//@BeforeSuite
	//@BeforeTest
	
	protected PropertiesUtility property;
	protected ExcelUtility excel;
	protected JavaUtility jutil;
	protected WebDriverUtility webUtil;
	protected WebDriver driver;
	
	public static WebDriver sdriver;
	public static JavaUtility Sjutil;
	
	@BeforeClass
	public void nclassConfig() {
		property = new PropertiesUtility();
		excel = new ExcelUtility();
		jutil = new JavaUtility();
		webUtil = new WebDriverUtility();
		
		Property.propertiesInitialization(IConstantPath.PROPERTIES_PATH);
		driver = webUtil.launchBrowser(property)
		
	}
	
}
