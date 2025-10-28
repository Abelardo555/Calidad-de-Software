
package automatizacion;
import java.io.BufferedReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.devtools.v137.fedcm.FedCm;
public class informacion {
    public static void main(String[] args){
       System.setProperty("webdriver.gecko.driver","C:\\Users\\Duoc\\Documents\\GitHub\\Calidad-de-Software\\Automatizacion\\geckodriver-v0.34.0-win64\\geckodriver.exe");
       //System.setProperty("webdriver.gecko.driver","C:\\Users\\Abelardo\\Documents\\GitHub\\Calidad-de-Software\\Automatizacion\\geckodriver-v0.34.0-win64\\geckodriver.exe");
       WebDriver driver = new FirefoxDriver();      
       try{
           // 1.- Ir al login
           driver.get("http://127.0.0.1:8000");
           
           // 1.-Iniciar sesion
           
           /**WebElement btnvideo= driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/ul/li[3]/a/span"));
           btnvideo.click();
           
           WebElement btndebito= driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/ul/li[2]/a/span"));
           btndebito.click();
           
           WebElement btncredito= driver.findElement(By.cssSelector("li.mb-3:nth-child(1) > a:nth-child(1) > span:nth-child(2)"));
           btncredito.click();**/
       
           
       }
       catch(Exception e){
           e.printStackTrace();
       }finally{
           //driver.quit();
       }
    }
}
