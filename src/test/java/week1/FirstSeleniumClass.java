package week1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstSeleniumClass {
    public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriverManager.edgedriver().setup();

WebDriver driverChrome = new ChromeDriver();

driverChrome.get("https://practice.cydeo.com");

WebDriver driverEdge = new EdgeDriver();
driverEdge.get("https://www.google.com");

        WebElement acceptAll = driverEdge.findElement(By.id("L2AGLb"));
        acceptAll.click();
    }
}
