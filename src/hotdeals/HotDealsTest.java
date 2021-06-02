package hotdeals;

import basetest.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Mouse;

public class HotDealsTest extends BaseTest {
    String baseurl = "https://mobile.x-cart.com/";

    @Before
    public void setup() {
        openBrowser(baseurl);
    }


     @After
      public void closebrowser(){
          driver.quit();
      }
    @Test
//    1 - verifySaleProductsArrangeAlphabetically()
    public void verifySaleProductsArrangeAlphabetically() throws InterruptedException {
        Thread.sleep(4000);
//		1.1 Mouse hover on the “Hot deals” link
        mouseHoverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"));
//		1.2 Mouse hover on the “Sale”  link and click
        clickonelement(By.linkText("Sale"));
//		1.3 Verify the text “Sale”
        Thread.sleep(2000);
        String expectedMessage = "Sale";
        String actualMessage = gettextfromelemrnt(By.linkText("Sale"));
        Assert.assertEquals("cannot verify Sale", expectedMessage, actualMessage);

//		1.4 Mouse hover on “Sort By” and select “Name A - Z”
        Thread.sleep(3000);
        mouseHoverToElement(By.xpath("//span[contains(text(),'Recommended')]"));
        clickonelement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]"));

//		1.5 Verify that the product arrange alphabetically
        Thread.sleep(2000);
        String expectedMessage1 = "Name A - Z";
        String actualMessage1 = gettextfromelemrnt(By.xpath("//span[contains(text(),'Name A - Z')]"));
        Assert.assertEquals("cannot verify Sale", expectedMessage1, actualMessage1);
    }

    @Test
//    2 - verifySaleProductsPriceArrangeLowToHigh()
    public void verifySaleProductsPriceArrangeLowToHigh() throws InterruptedException {
        Thread.sleep(3000);
//		2.1 Mouse hover on the “Hot deals” link
        mouseHoverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"));
//		2.2 Mouse hover on the “Sale”  link and click
        clickonelement(By.linkText("Sale"));
//		2.3 Verify the text “Sale”
        Thread.sleep(2000);
        String expectedMessage2 = "Sale";
        String actualMessage2 = gettextfromelemrnt(By.linkText("Sale"));
        Assert.assertEquals("cannot verify Sale", expectedMessage2, actualMessage2);

//		2.4 Mouse hover on “Sort By” and select “Price Low-High”
        mouseHoverToElement(By.xpath("//span[contains(text(),'Recommended')]"));
        clickonelement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]"));
//		2.5 Verify that the product’s price arrange Low to High
        Thread.sleep(2000);
        String expectedMessage3 = "Price Low - High";
        String actualMessage3 = gettextfromelemrnt(By.xpath("//span[contains(text(),'Price Low - High')]"));
        Assert.assertEquals("cannot verify Price Low-High", expectedMessage3, actualMessage3);

    }

    @Test
//3 - verifySaleProductsArrangeByRates()
    public void verifySaleProductsArrangeByRates() throws InterruptedException {
//		3.1 Mouse hover on the “Hot deals” link
        Thread.sleep(5000);
        mouseHoverToElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));
//		3.2 Mouse hover on the “Sale”  link and click
        clickonelement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]"));
//		3.3 Verify the text “Sale”
        Thread.sleep(2000);
        String expectedMessage4 = "Sale";
        String actualMessage4 = gettextfromelemrnt(By.xpath("//h1[@id='page-title']"));
        Assert.assertEquals("cannot verify Sale", expectedMessage4, actualMessage4);
Thread.sleep(5000);
//		3.4 Mouse hover on “Sort By” and select “Rates”
        mouseHoverToElement(By.xpath("//span[contains(text(),'Recommended')]"));
        clickonelement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[7]/a[1]"));
//		3.5 Verify that the product’s arrange Rates
        Thread.sleep(2000);
        String expectedMessage5 = "Rates";
        String actualMessage5 = gettextfromelemrnt(By.xpath("//span[contains(text(),'Rates')]"));
        Assert.assertEquals("cannot verify Rates", expectedMessage5, actualMessage5);

    }

    @Test
//    	4 - verifyBestSellersProductsArrangeByZToA()
    public void verifyBestSellersProductsArrangeByZToA() throws InterruptedException {
        Thread.sleep(5000);
//      1.1 Mouse hover on the “Hot deals” link
        mouseHoverToElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));
//		1.2 Mouse hover on the “Bestsellers”  link and click
        clickonelement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]"));
//		1.3 Verify the text “Bestsellers”
        Thread.sleep(5000);
        String expectedMessage6 = "Bestsellers";
        String actualMessage6 = gettextfromelemrnt(By.xpath("//h1[@id='page-title']"));
        Assert.assertEquals("cannot verify Bestsellers", expectedMessage6, actualMessage6);

//	1.4 Mouse hover on “Sort By” and select “Name Z - A”
        Thread.sleep(5000);
        mouseHoverToElement(By.xpath("//span[contains(text(),'Sort by:')]"));
        clickonelement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]"));
//		1.5 Verify that the product arrange by Z to A
        Thread.sleep(5000);
        String expectedMessage7 = "Name Z - A";
        String actualMessage7 = gettextfromelemrnt(By.xpath("//span[contains(text(),'Name Z - A')]"));
        Assert.assertEquals("cannot verify Name Z - A", expectedMessage7, actualMessage7);

    }

    @Test
//    5 - verifyBestSellersProductsPriceArrangeHighToLow()
    public void verifyBestSellersProductsPriceArrangeHighToLow() throws InterruptedException {
        Thread.sleep(8000);
//		2.1 Mouse hover on the “Hot deals” link
        mouseHoverToElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));
//		2.2 Mouse hover on the “Bestsellers” link and click
        clickonelement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]"));

//		2.3 Verify the text “Bestsellers”
        Thread.sleep(5000);
        String expectedMessage8 = "Bestsellers";
        String actualMessage8 = gettextfromelemrnt(By.xpath("//h1[@id='page-title']"));
        Assert.assertEquals("cannot verify Bestsellers", expectedMessage8, actualMessage8);


//		2.4 Mouse hover on “Sort By” and select “Price High - Low”
        Thread.sleep(5000);
        mouseHoverToElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]"));
        clickonelement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]"));
//		2.5 Verify that the product’s price arrange High to Low
        Thread.sleep(5000);
        String expectedMessage9 = "Price High - Low";
        String actualMessage9 = gettextfromelemrnt(By.xpath("//span[contains(text(),'Price High - Low')]"));
        Assert.assertEquals("cannot verify Bestsellers", expectedMessage9, actualMessage9);

    }

    @Test
//    6 - verifyBestSellersProductsArrangeByRates()
    public void verifyBestSellersProductsArrangeByRates() throws InterruptedException {
//		3.1 Mouse hover on the “Hot deals” link
        Thread.sleep(1000);
        mouseHoverToElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]"));
//		3.2 Mouse hover on the “Bestsellers”  link and click
        clickonelement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]"));
//		3.3 Verify the text “Bestsellers”
        Thread.sleep(5000);
        String expectedMessage9 = "Bestsellers";
        String actualMessage9 = gettextfromelemrnt(By.xpath("//h1[@id='page-title']"));
        Assert.assertEquals("cannot verify Bestsellers", expectedMessage9, actualMessage9);

//		3.4 Mouse hover on “Sort By” and select “Rates”
        Thread.sleep(6000);
        mouseHoverToElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]"));
        clickonelement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[6]/a[1]"));
//		3.5 Verify that the product’s arrange Rates
        Thread.sleep(5000);
        String expectedMessage10 = "Rates";
        String actualMessage10 = gettextfromelemrnt(By.xpath("//span[contains(text(),'Rates')]"));
        Assert.assertEquals("cannot verify Rates", expectedMessage10, actualMessage10);

    }

}