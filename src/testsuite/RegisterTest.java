package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        String expectedMessage = "Register";
        WebElement registerLink = driver.findElement(By.linkText("Register"));
        registerLink.click();
        WebElement actualMessageElement = driver.findElement(By.xpath("//div[@class='page-title']"));
        String actualMessage = actualMessageElement.getText();
        Assert.assertEquals("Register tab not matching", expectedMessage, actualMessage);
    }
    @Test
    public void userShouldRegisterAccountSuccessfully() {
        String expectedMessage = "Your registration completed";
        WebElement registerLink = driver.findElement(By.linkText("Register"));
        registerLink.click();
        WebElement radiobutton = driver.findElement(By.id("gender-male"));
        radiobutton.click();
        WebElement firstName = driver.findElement(By.name("First name:"));
        firstName.sendKeys("Viral");
        WebElement lastName = driver.findElement(By.name("Last name"));
        firstName.sendKeys("Kakadiya");
        WebElement dayOfBirthday = driver.findElement(By.name("Date of birth"));
        dayOfBirthday.sendKeys("11");
        WebElement dateOfBirthMonth = driver.findElement(By.name("DateOfBirthMonth"));
        dateOfBirthMonth.sendKeys("MARCH");
        WebElement dateOfBirthYear = driver.findElement(By.name("DateOfBirthYear"));
        dateOfBirthYear.sendKeys("1998");
        WebElement emailID = driver.findElement(By.id("Email:"));
        emailID.sendKeys("viral9725@gmail.com");
        WebElement password = driver.findElement(By.id("Password:"));
        password .sendKeys("Viral1234");
        WebElement confirmPassword = driver.findElement(By.id("Confirm password:"));
        confirmPassword.sendKeys("Viral1234");
        WebElement registerButton = driver.findElement(By.id("Register"));
        registerButton.click();

        WebElement actualMessageElement = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
        String actualMessage = actualMessageElement.getText();
        Assert.assertEquals("Registration not completed",expectedMessage,actualMessage);
    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}
