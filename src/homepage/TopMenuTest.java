package homepage;

import basetest.BaseTest;
import com.google.common.base.Verify;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {
    String baseurl = "https://mobile.x-cart.com/";

    @Before
    public void setup() {
        openBrowser(baseurl);
    }


      @After
      public void closebrowser(){
          driver.quit();
      }

    //    1 - verifyUserShouldNavigateToShippingPageSuccessfully()
    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully() throws InterruptedException {
//  1.1 Click on the “Shipping” link
       // clickonelement(By.xpath("//*[@id='header-area']/div[1]/div/div[4]/div/ul/li[3]/a"));
        clickonelement(By.linkText("Shipping"));



//  1.2 Verify the text “Shipping”
        Thread.sleep(2000);
        String expectedMessage3 = "Shipping";
        String actualMessage3 = gettextfromelemrnt(By.xpath("//h1[@id='page-title']"));
        Assert.assertEquals("cannot click on Shipping", expectedMessage3, actualMessage3);

    }

    //  2 - verifyUserShouldNavigateToNewPageSuccessfully()
    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully() throws InterruptedException {
//  2.1 Click on the “New!” link
      //  clickonelement(By.xpath("//*[@id='header-area']/div[1]/div/div[4]/div/ul/li[4]/a"));
        clickonelement(By.linkText("New!"));

//  2.2 Verify the text “New arrivals”
        Thread.sleep(2000);
        String expectedMessage3 = "New arrivals";
        String actualMessage3 = gettextfromelemrnt(By.xpath("//h1[@id='page-title']"));
        Assert.assertEquals("cannot click on New arrivals", expectedMessage3, actualMessage3);

    }

    //  3 - verifyUserShouldNavigateToComingsoonPageSuccessfully()
    @Test
    public void verifyUserShouldNavigateToComingsoonPageSuccessfully() throws InterruptedException {
//  3.1 Click on the “Coming soon” link
       // clickonelement(By.xpath("//*[@id='header-area']/div[1]/div/div[4]/div/ul/li[5]/a"));
        clickonelement(By.linkText("Coming soon"));

//  3.2 Verify the text “Coming soon”
        Thread.sleep(2000);
        String expectedMessage3 = "Coming soon";
        String actualMessage3 = gettextfromelemrnt(By.xpath("//h1[@id='page-title']"));
        Assert.assertEquals("cannot click on Coming soon", expectedMessage3, actualMessage3);


    }
// 4 - verifyUserShouldNavigateToContactUsPageSuccessfully()
    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully() throws InterruptedException {
//                4.1 Click on the “Contact us” link
        clickonelement(By.linkText("Contact us"));

//                4.2 Verify the text “Contact us”
        Thread.sleep(2000);
        String expectedMessage3 = "Contact us";
        String actualMessage3 = gettextfromelemrnt(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[6]/a[1]/span[1]"));
        Assert.assertEquals("cannot click on Contact us", expectedMessage3, actualMessage3);


    }
}