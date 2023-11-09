package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseListPage {
//Declaration
	@FindBy(xpath = "//h1[normalize-space(text())='Course List']")
	private WebElement pageHeader;
	
	@FindBy(xpath = "//a[text()=' New']")
	private WebElement newButton;
	
	@FindBy(xpath = "//table/tbody/tr/td[1]")
	private List<WebElement> courseList;
	//Initialization
	public CourseListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization
	public String getPageHeader( ) {
		return pageHeader.getText();
		}
	public void clickNewButton() {
		newButton.click();
	}
	public List<WebElement> getCourseList(){
		return courseList;
	}
}
