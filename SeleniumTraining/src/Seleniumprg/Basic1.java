package Seleniumprg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	
	 System.setProperty("webdriver.chrome.driver", "F:\\AUTOMATION\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver wb= new ChromeDriver();
		 
	 wb.get("https://www.google.com/");
	 System.out.println("browser opened....");
	 
	
	 
	 
	}

}
