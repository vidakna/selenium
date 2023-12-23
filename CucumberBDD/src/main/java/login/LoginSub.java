package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginSub extends LoginMain{
public WebDriver driver;
	
	public LoginSub(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement typeUserName()
	{
		By username = By.xpath("//*[@id=\"root\"]/section/div/div/div/div/form/div[1]/input");
		return driver.findElement(username);
		
	}
	
	public WebElement typePassword()
	{
		By pw = By.xpath("//*[@id=\"root\"]/section/div/div/div/div/form/div[3]/input");
		return driver.findElement(pw);
		
	}
	
	public WebElement clicksubmit()
	{
		By login_btn = By.xpath("//*[@id=\"root\"]/section/div/div/div/div/form/div[5]/div/button");
		return driver.findElement(login_btn);
	}
	
	public WebElement banner()
	{
		By banner = By.xpath("//*[@id=\"root\"]/section[3]");
		return driver.findElement(banner);
	}
	
	public WebElement blog()
	{
		By blog = By.xpath("//*[@id=\"root\"]/section[4]");
		return driver.findElement(blog);
	}
	
	public WebElement clickOnProduct()
	{
		By clickOnProduct = By.xpath("//*[@id=\"root\"]/section[4]/div/div[2]/div[1]/div/div[4]/div/button[2]");
		return driver.findElement(clickOnProduct);
	}
	
	public WebElement hoverImage()
	{
		By hoverImage = By.xpath("//*[@id=\"root\"]/section[4]/div/div[2]/div[1]/div/div[2]");
		return driver.findElement(hoverImage);
	}
	
	public WebElement ScrollToUp()
	{
		By ScrollToUp = By.xpath("//*[@id=\"root\"]/section[1]");
		return driver.findElement(ScrollToUp);
	}
	
	public WebElement radioBtn()
	{
		By Var = By.xpath("//*[@id=\"root\"]/section[1]/div/div/div[2]/div/div[3]/div[6]/ul/input");
		return driver.findElement(Var);
	}
	
	public WebElement addToCart()
	{
		By Var = By.xpath("//*[@id=\"root\"]/section[1]/div/div/div[2]/div/div[3]/div[7]/div[2]/button");
		return driver.findElement(Var);
	}
	
	public WebElement goToCart()
	{
		By Var = By.xpath("//*[@id=\"root\"]/section[1]/div/div/div[2]/div/div[3]/div[7]/div[2]/a");
		return driver.findElement(Var);
	}
	
	public WebElement checkoutBtn()
	{
		By Var = By.xpath("//*[@id=\"root\"]/section/div/div[1]/div[2]/div/div/a");
		return driver.findElement(Var);
	}
	
	public WebElement sendFirstName()
	{
		By Var = By.xpath("//*[@id=\"root\"]/section/div/div/div[1]/div/form/div[1]/input");
		return driver.findElement(Var);
	}
	
	public WebElement sendLastName()
	{
		By Var = By.xpath("//*[@id=\"root\"]/section/div/div/div[1]/div/form/div[2]/input");
		return driver.findElement(Var);
	}
	
	public WebElement sendAddress()
	{
		By Var = By.xpath("//*[@id=\"root\"]/section/div/div/div[1]/div/form/div[3]/input");
		return driver.findElement(Var);
	}
	
	public WebElement sendTpNo()
	{
		By Var = By.xpath("//*[@id=\"root\"]/section/div/div/div[1]/div/form/div[4]/input");
		return driver.findElement(Var);
	}
	
	public WebElement sendCity()
	{
		By Var = By.xpath("//*[@id=\"root\"]/section/div/div/div[1]/div/form/div[5]/input");
		return driver.findElement(Var);
	}
	
	public WebElement sendCoupon()
	{
		By Var = By.xpath("//*[@id=\"root\"]/section/div/div/div[1]/div/form/div[6]/div/input");
		return driver.findElement(Var);
	}
	
	public WebElement applyCoupon()
	{
		By Var = By.xpath("//*[@id=\"root\"]/section/div/div/div[1]/div/form/div[6]/div/button");
		return driver.findElement(Var);
	}
	
	public WebElement checkOut()
	{
		By Var = By.xpath("//*[@id=\"root\"]/section/div/div/div[1]/div/form/div[6]/div/button");
		return driver.findElement(Var);
	}
	
}