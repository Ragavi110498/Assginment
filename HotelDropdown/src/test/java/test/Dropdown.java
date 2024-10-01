package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\JavaMoringbatch\\driver\\chromedriver.exe");

		driver.get("https://adactinhotelapp.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Ragavi98");
		driver.findElement(By.id("password")).sendKeys("61845L");
		driver.findElement(By.id("login")).click();
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByVisibleText("Paris");
		WebElement Hotel = driver.findElement(By.id("hotels"));
		Select h = new Select(Hotel);
		h.selectByIndex(3);
		WebElement Type = driver.findElement(By.id("room_type"));
		Select T = new Select(Type);
		T.selectByValue("Double");
		WebElement RoomNo = driver.findElement(By.id("room_nos"));
		Select n = new Select(RoomNo);
		n.selectByIndex(3);
		WebElement Adult = driver.findElement(By.id("adult_room"));
		Select A = new Select(Adult);
		A.selectByValue("4");
		WebElement Child = driver.findElement(By.id("child_room"));
		Select c = new Select(Child);
		c.selectByVisibleText("1 - One");
		Thread.sleep(1000);
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.xpath("//input[@name= 'radiobutton_0']")).click();
		driver.findElement(By.xpath("//*[@id='continue']")).click();
		Thread.sleep(1000);
		WebElement fristname = driver.findElement(By.xpath("//*[@name='first_name']"));
		fristname.sendKeys("Ragavi");
		WebElement lastname = driver.findElement(By.xpath("//input[@name= 'last_name']"));
		lastname.sendKeys("Selvaraj");
		WebElement bill = driver.findElement(By.xpath("//*[@name= 'address']"));
		bill.sendKeys("Coimbatore");
		WebElement card = driver.findElement(By.xpath("//input[@name= 'cc_num']"));
		card.sendKeys("1234567891011121");
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		Select D = new Select(cardtype);
		D.selectByIndex(2);
		WebElement month = driver.findElement(By.id("cc_exp_month"));
		Select m = new Select(month);
		m.selectByValue("4");
		WebElement year = driver.findElement(By.id("cc_exp_year"));
		Select y = new Select(year);
		y.selectByVisibleText("2022");
		WebElement ccv = driver.findElement(By.id("cc_cvv"));
		ccv.sendKeys("123");
		driver.findElement(By.xpath("//*[@id='book_now']")).click();
		WebElement text = driver.findElement(By.xpath("//*[@id='process_span']"));
		text.getText();
		System.out.println(text.getText());
		Thread.sleep(5000);
		String values = driver.findElement(By.xpath("//input[@name='order_no']")).getAttribute("value");
		System.out.println(values);
//		driver.findElement(By.xpath("//*[@name='logout']")).click();
//		Thread.sleep(2000);
//		driver.quit();
	}

}
