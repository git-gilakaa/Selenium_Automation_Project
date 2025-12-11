package pack.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pack.BaseClass;

public class RegisterTest extends BaseClass {

	@Test
	public void testOne() {
        WebElement nameLabel = driver.findElement(By.xpath("//label[normalize-space()='Full Name*']"));
        String actual = nameLabel.getText().trim();
        String expected = "Full Name*";
        Assert.assertEquals(actual, expected, "Label text mismatch for Full Name");}

	@Test
	public void testTwo() {
        WebElement addressLabel = driver.findElement(By.xpath("//label[normalize-space()='Address']"));
        String actual = addressLabel.getText().trim();
        String expected = "Address";
        Assert.assertEquals(actual, expected, "Label text mismatch for Address");
   }
	
	@Test
	public void test_3() {
        WebElement sex = driver.findElement(By.xpath("//input[@value='Male']"));
        sex.click();
   }
	
	
}
