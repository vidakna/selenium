package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.Lists;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Duration;
import login.LoginMain;
import login.LoginSub;



public class LoginStepDef extends LoginMain {
	@Given("I need to navigate Loging page")
	public void i_need_to_navigate_loging_page() throws InterruptedException {
		 driver=inheritanceANYO();
		   driver.get("http://localhost:3001/login");
		   driver.manage().window().maximize();
		   Thread.sleep(2000);
	}
	
	@When("I enter <Username>")
	public void i_enter_username() throws InterruptedException {
		LoginSub var1 = new LoginSub(driver);
        var1.typeUserName().sendKeys("thisurividakna@gmail.com");
        Thread.sleep(2000);
	}
	

	@When("I enter <Password>")
	public void i_enter_password() throws InterruptedException {
		LoginSub var1=new LoginSub(driver);
	    var1.typePassword().sendKeys("Vida");
	    Thread.sleep(2000);
	}

	@When("I click the sign in button")
	public void i_click_the_sign_in_button() throws InterruptedException {
		//WebElement var1  = driver.findElement(By.id("login-button"));
		LoginSub var1=new LoginSub(driver);
		var1.clicksubmit().click();
	    Thread.sleep(3000);
	}
	

	@When("I Scroll to banner")
	public void i_scroll_to_bsnner() throws InterruptedException {
		LoginSub var1=new LoginSub(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
   	 	js.executeScript("arguments[0].scrollIntoView(true);", var1.banner());
	    Thread.sleep(2000);
	}
	
	@When("I Scroll to blog")
	public void i_scroll_to_blog() throws InterruptedException {
		LoginSub var1=new LoginSub(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
   	 	js.executeScript("arguments[0].scrollIntoView(true);", var1.blog());
	    Thread.sleep(2000);
	}
	
	@When("I click on product")
	public void i_click_on_product() throws InterruptedException {
		LoginSub var1=new LoginSub(driver);
		WebElement imageElement = var1.hoverImage();
	    Actions actions = new Actions(driver);
	    actions.moveToElement(imageElement).perform();
		var1.clickOnProduct().click();
	    Thread.sleep(2000);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollToUp());

	}
	
	@When("I add product to cart")
	public void i_add_product_to_cart() throws InterruptedException {
		LoginSub var1=new LoginSub(driver);
	    Thread.sleep(2000);
	    var1.radioBtn().click();
	    Thread.sleep(2000);
	    var1.addToCart().click();
	    Thread.sleep(2000);
	    var1.goToCart().click();
	}
	
	@When("I click on checkout")
	public void i_click_on_checkout() throws InterruptedException {
		LoginSub var1=new LoginSub(driver);
	    Thread.sleep(2000);
	    var1.checkoutBtn().click();
	    Thread.sleep(2000);
	    var1.sendFirstName().sendKeys("Vida");
	    var1.sendLastName().sendKeys("Vida");
	    var1.sendAddress().sendKeys("Vida");
	    var1.sendTpNo().sendKeys("Vida");
	    var1.sendCity().sendKeys("Vida");
	    var1.sendCoupon().sendKeys("EX01");
	    Thread.sleep(2000);
	    var1.applyCoupon().click();
	    Thread.sleep(2000);
	    var1.checkOut().click();
	}
}

	