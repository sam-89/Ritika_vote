import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://timesfreshface.com/votenow/");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, 100);
		
		for(int i = 0 ; i< 10000; i++) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='lb-like-7']/span[1]/span[2]")));
			driver.findElement(By.xpath("//*[@id='lb-like-7']/span[1]/span[2]")).click();
			driver.navigate().refresh();
			System.out.println(i);
			
		}
		}

}
