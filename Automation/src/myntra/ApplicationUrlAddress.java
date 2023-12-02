package myntra;

import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationUrlAddress {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thasleem\\Selenium\\Browsers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		String tsrtcApplicationUrlAddress="https://www.tsrtc.com/";
		driver.get(tsrtcApplicationUrlAddress);
		
		//get app Title
		
		String tsrtcAppTitle=driver.getTitle();
		System.out.println("Myntra app Homepage title is:"+tsrtcAppTitle);
		
		
		
		
		
		
		
		
		
		
		

	}

}
