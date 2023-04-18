package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {

    //declare baseUrl
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {


        //Find login link and click on login link
        WebElement computerTab = driver.findElement(By.linkText("Computers"));
        computerTab.click();
        String expectedMessage = "Computers";

        //Make sure with Automation
        WebElement actualTestElement = driver.findElement(By.xpath("//h1[contains(text(),'Computers')]"));
        String actualMessage = actualTestElement.getText();
        Assert.assertEquals("Computer Tab doesn't meet", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {

        //Find login link and click on login link
        WebElement electronicsTab = driver.findElement(By.linkText("Electronics"));
        electronicsTab.click();
        String expectedMessage = "Electronics";

        //Make sure with Automation
        WebElement actualTestElement = driver.findElement(By.xpath("//h1[contains(text(),'Electronics')]"));
        String actualMessage = actualTestElement.getText();
        Assert.assertEquals("Electronics Tab doesn't meet", expectedMessage, actualMessage);

    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfull() {

        //Find login link and click on login link
        WebElement apparelTab = driver.findElement(By.linkText("Apparel"));
        apparelTab.click();
        String expectedMessage = "Apparel";

        //Make sure with Automation
        WebElement actualTestElement = driver.findElement(By.xpath("//h1[contains(text(),'Apparel')]"));
        String actualMessage = actualTestElement.getText();
        Assert.assertEquals("Apparel Tab doesn't meet", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfull() {

        //Find login link and click on login link
        WebElement digitalDownloadsLink = driver.findElement(By.linkText("Digital downloads"));
        digitalDownloadsLink.click();
        String expectedMessage = "Digital downloads";

        //Make sure with Automation
        WebElement actualTestElement = driver.findElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));
        String actualMessage = actualTestElement.getText();
        Assert.assertEquals("Digital downloads Tab doesn't meet", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {

        //Find login link and click on login link
        WebElement booksLink = driver.findElement(By.linkText("Books"));
        booksLink.click();
        String expectedMessage = "Books";

        //Make sure with Automation
        WebElement actualTestElement = driver.findElement(By.xpath("//h1[contains(text(),'Books')]"));
        String actualMessage = actualTestElement.getText();
        Assert.assertEquals("Books Tab doesn't meet", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        //Find login link and click on login link
        WebElement jewelryLink = driver.findElement(By.linkText("Jewelry"));
        jewelryLink.click();
        String expectedMessage = "Jewelry";

        //Make sure with Automation
        WebElement actualTestElement = driver.findElement(By.xpath("//h1[contains(text(),'Jewelry')]"));
        String actualMessage = actualTestElement.getText();
        Assert.assertEquals("Jewelry Tab doesn't meet", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfull() {
        //Find login link and click on login link
        WebElement giftCardsLink = driver.findElement(By.linkText("Gift Cards"));
        giftCardsLink.click();
        String expectedMessage = "Gift Cards";

        //Make sure with Automation
        WebElement actualTestElement = driver.findElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));
        String actualMessage = actualTestElement.getText();
        Assert.assertEquals("Gift Cards Tab doesn't meet", expectedMessage, actualMessage);
    }


    @After
    public void tearDown() {
        closeBrowser();
    }
}
