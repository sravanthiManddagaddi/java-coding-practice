package Coding.Random;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class WindowHandle {
    public static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://seleniumpractise.blogspot.com/2017/");
        By link1 = By.linkText("Click here for Google");
        By link2 = By.linkText("Click here for Facebook");
        By link3 = By.linkText("Click here for Gmail");
        doClick(getElement(link1));
        doClick(getElement(link2));
        doClick(getElement(link3));
        String parentID = driver.getWindowHandle();
        Set<String> windowIDList = driver.getWindowHandles();
        clickSpecficChildWindow(windowIDList,"Facebook");
        driver.switchTo().window(parentID);

    }
    public static WebElement getElement(By locator){
       return driver.findElement(locator);
    }
    public static void doClick(WebElement element){
        element.click();
    }
    public static void clickSpecficChildWindow(Set<String> windowList, String title){
        Iterator its = windowList.iterator();
        while(its.hasNext()){
            String id = (String) its.next();
            String tempTitle = driver.switchTo().window(id).getTitle();
            if(tempTitle.contains(title)){
                 break;
            }
        }
    }

}
