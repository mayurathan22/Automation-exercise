import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\thava\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				//1.Access the demo site
				driver.get("https://www.saucedemo.com/");
				
				//2.Login to the system 
				driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
				driver.findElement(By.id("password")).sendKeys("secret_sauce");
				driver.findElement(By.id("login-button")).click();
				
				
				//4.Add any two products into the cart
				//
				driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
				
//				5. Click cart icon in the top 
				
				driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
				
				
//				6.Verify if the selected items are in the cart
				
				
				
				
//				7.Click checkout button
				
				driver.findElement(By.id("checkout")).click();
				
//				System.out.println("checkout");
				
//				8.Provide a random firstname , lastname and a zip code in the next page
				
				driver.findElement(By.id("first-name")).sendKeys("Vijay");
				driver.findElement(By.id("last-name")).sendKeys("Kumar");
				driver.findElement(By.id("postal-code")).sendKeys("20000");
//				System.out.println("click continue");
				
//				9.Click continue button
				
				driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
				
//				10.click finish
				
				driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
				
//				System.out.println("finish");
				
				
//				driver.close();
				
				


	}

}
