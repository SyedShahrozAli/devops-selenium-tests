package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest extends BaseTest {

    @BeforeMethod
    public void start() {
        setup();
    }

    @Test
    public void testHomePageLoads() {

        driver.get("http://ec2-35-174-13-164.compute-1.amazonaws.com:3000/");

        String title = driver.getTitle();

        Assert.assertNotNull(title);
    }

    @Test
    public void testLoginFormExists() {

        driver.get("http://ec2-35-174-13-164.compute-1.amazonaws.com:3000/");

        Assert.assertTrue(
            driver.findElement(By.tagName("form")).isDisplayed()
        );
    }

    @AfterMethod
    public void close() {
        tearDown();
    }
}
