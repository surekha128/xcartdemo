package shopping;

import basetest.BaseTest;
import org.junit.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class ShoppingTest extends BaseTest {
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
    //    1 - verifyThatUserShouldPlaceOrderSuccessfullyForCupOfMojoBluetooth Speaker()
    public void verifyThatUserShouldPlaceOrderSuccessfullyForCupOfMojoBluetoothSpeaker() throws InterruptedException {
//		1.1 Mouse hover on the “Hot deals” link
        Thread.sleep(5000);
        mouseHoverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"));
//		1.2 Mouse hover on the “Sale”  link and click
        clickonelement(By.linkText("Sale"));

//		1.3 Verify the text “Sale”
        Thread.sleep(3000);
        String expectedMessage = "Sale";
        String actualMessage = gettextfromelemrnt(By.xpath("//h1[@id='page-title']"));
        Assert.assertEquals("cannot verify Sale", expectedMessage, actualMessage);

//		1.4 Mouse hover on “Sort By” and select “Name A-Z”
        Thread.sleep(5000);
        mouseHoverToElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]"));
        clickonelement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]"));

//		1.5 Click on “Add to cart” button of the product “Cup of Mojo Bluetooth
//      Speaker”
        Thread.sleep(3000);
        clickonelement(By.xpath("//a[contains(text(),'JBL Pebbles PC Speakers')]"));
        clickonelement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/form[2]/div[2]/div[1]/div[3]/button[1]"));

//1.6 Verify the message “Product has been added to your cart” display in  green bar

        Thread.sleep(3000);
        String expectedMessage1 = "Product has been added to your cart";
        String actualMessage1 = gettextfromelemrnt(By.xpath("//li[contains(text(),'Product has been added to your cart')]"));
        Assert.assertEquals("cannot added product in to cart", expectedMessage1, actualMessage1);

Thread.sleep(5000);
//1.7 Click on X sign to close the message
        clickonelement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[1]/div[1]/div[1]/a[1]"));

//1.8 Click on “Your cart” icon and Click on “View cart” button
        clickonelement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[4]"));
        clickonelement(By.xpath("//span[contains(text(),'View cart')]"));

//1.9 Verify the text “Your shopping cart - 1 item”

        Thread.sleep(3000);
        String expectedMessage2 = "Your shopping cart - 1 item";
        String actualMessage2 = gettextfromelemrnt(By.xpath("//h1[@id='page-title']"));
        Assert.assertEquals("quantity added wrong", expectedMessage2, actualMessage2);


//1.10 Change the Qty = 2
        driver.findElement(By.xpath("//input[@id='amount32']")).clear();
        sendtexttoelement(By.xpath("//input[@id='amount32']"),"2");

//1.11 Verify the text “Your shopping cart - 2 items”
        Thread.sleep(5000);
        String expectedMessage3 = "Your shopping cart - 2 items";
       String actualMessage3 = gettextfromelemrnt(By.xpath("//h1[@id='page-title']"));
        Assert.assertEquals("quantity total is not equal to 2", expectedMessage3, actualMessage3);


//1.12 Verify the Subtotal $89.98
        Thread.sleep(3000);
        String expectedMessage4 = "Subtotal: $89.98";
        String actualMessage4 = gettextfromelemrnt(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]"));
        Assert.assertEquals("subtotal is not equal to $89.98", expectedMessage4, actualMessage4);

//1.13 Verify the total $97.05
        Thread.sleep(3000);
        String expectedMessage5 = "$97.05";
        String actualMessage5 = gettextfromelemrnt(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[4]"));
        Assert.assertEquals("total value is not equal to $97.05", expectedMessage5, actualMessage5);

//1.14 Click on “Go to checkout” button
        Thread.sleep(500);
        clickonelement(By.xpath("//span[contains(text(),'Go to checkout')]"));

//1.15 Verify the text “Log in to your account”

        Thread.sleep(3000);
        String expectedMessage6 = "Log in to your account";
        String actualMessage6 = gettextfromelemrnt(By.xpath("//h3[contains(text(),'Log in to your account')]"));
        Assert.assertEquals("not verifiy Log in to your account", expectedMessage6, actualMessage6);

//1.16 Enter Email address
        Thread.sleep(3000);
        sendtexttoelement(By.xpath("//input[@id='email']"),"ghost3@cloud.com");
//1.17 Click on “Continue” Button
        clickonelement(By.xpath("//tbody/tr[2]/td[1]/button[1]"));

//1.18 Verify the text “Secure Checkout”
        Thread.sleep(2000);
        String expectedMessage7 = "Secure Checkout";
        String actualMessage7 = gettextfromelemrnt(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]"));
        Assert.assertEquals("not verifiy Secure Checkout", expectedMessage6, actualMessage6);
Thread.sleep(5000);
//1.19 Fill all the mandatory fields
        sendtexttoelement(By.xpath("//input[@id='shippingaddress-firstname']"),"niiki");
        sendtexttoelement(By.xpath("//input[@id='shippingaddress-lastname']"),"minni");
        sendtexttoelement(By.xpath("//input[@id='shippingaddress-street']"),"vote west");
        sendtexttoelement(By.xpath("//input[@id='shippingaddress-city']"),"Paris");
        sendtexttoelement(By.xpath("//input[@id='shippingaddress-city']"),"France");
        sendtexttoelement(By.xpath("//input[@id='shippingaddress-custom-state']"),"cross");
        sendtexttoelement(By.xpath("//input[@id='shippingaddress-zipcode']"),"500101");
        sendtexttoelement(By.xpath("//input[@id='shippingaddress-phone']"),"09862314223");

//1.20 Check the check box “Create an account for later use”
        Thread.sleep(5000);
        clickonelement(By.xpath("//input[@id='create_profile']"));
//1.21 Enter the password
        Thread.sleep(3000);
        sendtexttoelement(By.xpath("//input[@id='password']"),"qse234");
//1.22 Select the Delivery Method to “Local Shipping”
        Thread.sleep(5000);
        mouseHoverToElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]"));
        clickonelement(By.xpath("//input[@id='method128']"));
//1.23 Select Payment Method “COD”
        Thread.sleep(3000);
       mouseHoverToElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]"));
        clickonelement(By.xpath("//input[@id='pmethod6']"));
//1.24 Verify the total $98.14
        Thread.sleep(3000);
        String expectedMessage8 = "$98.14";
        String actualMessage8 = gettextfromelemrnt(By.xpath("        //body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]"));
        Assert.assertEquals("not verifiy Secure Checkout", expectedMessage8, actualMessage8);
//1.25 Click on “Place Order” Button
        clickonelement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/button[1]"));
//1.26 Verify the text “Thank you for your order”

        Thread.sleep(2000);
        String expectedMessage9 = "Thank you for your order";
        String actualMessage9 = gettextfromelemrnt(By.xpath("//h1[@id='page-title']"));
        Assert.assertEquals("not verifiy Thank you for your order", expectedMessage9, actualMessage9);
    }

/*

Invoice #149
May 30, 2021, 23:15
Grand total: $98.14
 */
@Test
//2 - verifyThatUserShouldClearShoppingCartSuccessfully()
public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {
    Thread.sleep(5000);
//		1.1 Mouse hover on the “Hot deals” link
    mouseHoverToElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));
//		1.2 Mouse hover on the “Bestseller”  link and click
    clickonelement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]"));
//		1.3 Verify the text “Bestsellers”
        Thread.sleep(2000);
        String expectedMessage = "Bestsellers";
        String actualMessage = gettextfromelemrnt(By.xpath("//h1[@id='page-title']"));
        Assert.assertEquals("cannot verify Bestsellers", expectedMessage, actualMessage);

//	1.4 Mouse hover on “Sort By” and select “Name A-Z”
    Thread.sleep(1000);
    mouseHoverToElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]"));
           Thread.sleep(1000);
    clickonelement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]\n"));
//  1.5 Click on “Add to cart” button of the product “Vinyl Idolz: Ghostbusters”
    Thread.sleep(4000);
   // mouseHoverToElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[7]/div[1]"));
     clickonelement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[7]/div[1]/div[2]/div[4]/div[1]/button[1]"));
//1.6 Verify the message “Product has been added to your cart” display in  green bar
    Thread.sleep(5000);
    String expectedMessage1 = "Product has been added to your cart";
    String actualMessage1 = gettextfromelemrnt(By.xpath("//li[contains(text(),'Product has been added to your cart')]"));
    Assert.assertEquals("cannot verify Product has been added to your cart", expectedMessage1, actualMessage1);

//1.7 Click on X sign to close the message
    Thread.sleep(3000);
    clickonelement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[1]/div[1]/div[1]/a[1]"));
//1.8 Click on “Your cart” icon and Click on “View cart” button
    Thread.sleep(3000);
    clickonelement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[5]/div[4]"));
    clickonelement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[5]/div[4]/div[3]/div[1]/a[1]"));
//1.9 Verify the text “Your shopping cart - 1 item”
    Thread.sleep(5000);
    String expectedMessage2 = "Your shopping cart - 1 item";
    String actualMessage2 = gettextfromelemrnt(By.xpath("//h1[@id='page-title']"));
    Assert.assertEquals("cannot verify Product has been added to your cart", expectedMessage2, actualMessage2);

//1.10 Click on “Empty your cart” link
    Thread.sleep(3000);
    clickonelement(By.xpath("//a[contains(text(),'Empty your cart')]"));

// 1.11 Verify the text “Are you sure you want to clear your cart?” on alert
    Thread.sleep(5000);
    String expectedMessage3 = "Are you sure you want to clear your cart?";
    String actualMessage3 = "Are you sure you want to clear your cart?";
    Assert.assertEquals("cannot verify Product has been added to your cart", expectedMessage3, actualMessage3);


//1.12 Click “Ok” on alert
        driver.switchTo().alert().accept();

//1.13 Verify the message “Item(s) deleted from your cart”
    Thread.sleep(5000);
    String expectedMessage4 = "Item(s) deleted from your cart";
    String actualMessage4 = gettextfromelemrnt(By.xpath("//li[contains(text(),'Item(s) deleted from your cart')]"));
    Assert.assertEquals("your cart is not empty", expectedMessage4, actualMessage4);

//1.15 Verify the text “Your cart is empty”

    Thread.sleep(5000);
    String expectedMessage5 = "Your cart is empty";
    String actualMessage5 = gettextfromelemrnt(By.xpath("//h1[@id='page-title']"));
    Assert.assertEquals("cannot verify Your cart is empty", expectedMessage5, actualMessage5);


}
}