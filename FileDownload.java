package Scenarios;


import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownload
{
	static 
	{
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws Exception
	{
		
		// ChromeOptions options = new ChromeOptions();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://sample-videos.com/download-sample-jpg-image.php");
		 driver.manage().window().maximize();
		 
         //HashMap<String, Object> mapping = new HashMap<>();
         //mapping.put("download.default_directory", System.getProperty("java.io.tmpdir"));
        // options.setExperimentalOption("prefs", mapping);
        
         String folder = System.getProperty("user.home");
         System.out.println(folder);
         String expectedFileName = "\\downloads\\SampleJPGImage_50kbmb.jpg";
         File file = new File(folder + expectedFileName);
         System.out.println(file);
         if (file.exists())
         {
        	 file.delete();
             
         }
         
         driver.findElement(By.xpath("//a[@data='1']")).click();
         System.out.println("File downloaded Now"); 
         
         Thread.sleep(10000);
         if (!file.exists())
         {
        	 throw new Exception("File not dowloaded successfully");
         }
         
         /*File Latestfile = new File(folder + expectedFileName);
         
         Long l=Latestfile.lastModified();
         
         if(l==0)
         {
         System.out.println(Latestfile);
         if (Latestfile.exists())
         {
        	
        	 System.out.println("File downloaded Now"); 
        	 
         }
         }*/
         
         // Do what you need.
      // driver.close();
	}
}
