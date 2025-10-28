
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

public class Formato {
    
    /**public static void main(String[] args){
       System.setProperty("webdriver.gecko.driver","C:\\Users\\Duoc\\Documents\\GitHub\\Calidad-de-Software\\Automatizacion\\geckodriver-v0.34.0-win64\\geckodriver.exe");
       //System.setProperty("webdriver.gecko.driver","C:\\Users\\Abelardo\\Documents\\GitHub\\Calidad-de-Software\\Automatizacion\\geckodriver-v0.34.0-win64\\geckodriver.exe");
       WebDriver driver = new FirefoxDriver();      
       try{
           // 1.- Ir al login
           driver.get("http://127.0.0.1:8000/");
           
           // 1.-Iniciar sesion
           WebElement btnlogin= driver.findElement(By.xpath("/html/body/header/div/div[2]/a"));
           btnlogin.click();
       
           //2.- Completar usuario y password
           WebElement userField = driver.findElement(By.id("id_username"));
           //WebElement userField2 = driver.findElement(By.xpath("//*[@id=\"username\"]");
           userField.sendKeys("admin");
           
           
           WebElement passField = driver.findElement(By.id("id_password"));
           passField.sendKeys("admin123");
           
           Thread.sleep(2000);
          // TakesScreenshot(driver,"");
           
           WebElement btnIngresar = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div/button"));
           btnIngresar.click();
           
           Thread.sleep(2000);
           
           
           //------------
           //Lectura de archivo
           //------------
           //String rutaArchivo = "C:\\Users\\Abelardo\\Documents\\GitHub\\Calidad-de-Software\\Automatizacion\\Usuarios\\usuarios.txt";
           String rutaArchivo = "C:\\Users\\Duoc\\Documents\\GitHub\\Calidad-de-Software\\Automatizacion\\Usuarios\\usuarios1.txt";
           List<String[]> usuarios = new ArrayList<>();
           
           try(BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))){
               String linea;
               while ((linea = br.readLine()) != null){
                   String[] datos = linea.split(",");
                   if(datos.length == 5){
                       usuarios.add(datos);
                   } 
               }
           }
           catch(Exception e){
               e.printStackTrace();
           }
           //-----------
           // Registrar Usuarios 
           //------
           for(String[] usuario : usuarios){
                String nombre = usuario[0];
                String email = usuario[1];
                String ciudad = usuario[2];
                String edad = usuario[3];
                String fono = usuario[4];
                
                driver.findElement(By.id("nombre")).clear();
                driver.findElement(By.id("nombre")).sendKeys(nombre);
                
                driver.findElement(By.id("email")).clear();
                driver.findElement(By.id("email")).sendKeys(email);
                
                driver.findElement(By.id("ciudad")).clear();
                driver.findElement(By.id("ciudad")).sendKeys(ciudad);
                
                driver.findElement(By.id("edad")).clear();
                driver.findElement(By.id("edad")).sendKeys(edad);
                
                driver.findElement(By.id("fono")).clear();
                driver.findElement(By.id("fono")).sendKeys(fono);
                
                WebElement btnIngresar3 = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[1]/div/div/form/div[6]/button"));
                btnIngresar3.click();
                //driver.findElement(By.cssSelector("button.btn:nth-child(1)")).click();
                
           }
           
           //Entrar a la administracion
           WebElement btnIngresar2 = driver.findElement(By.xpath("/html/body/header/div/div[2]/a"));
           btnIngresar2.click();
           
           Thread.sleep(2000);
           
           //Editar Usuarios
           WebElement editar = driver.findElement(By.xpath("/html/body/div/div/div/div/div/table/tbody/tr/td[6]/a"));
           editar.click(); 
           
           driver.findElement(By.id("nombre")).clear();
           driver.findElement(By.id("nombre")).sendKeys("Luffy15");
           
           driver.findElement(By.id("email")).clear();
           driver.findElement(By.id("email")).sendKeys("car");
           
           driver.findElement(By.id("ciudad")).clear();
           driver.findElement(By.id("ciudad")).sendKeys("Puente A48lto");
           
           driver.findElement(By.id("edad")).clear();
           driver.findElement(By.id("edad")).sendKeys("25159");
           
           driver.findElement(By.id("fono")).clear();
           driver.findElement(By.id("fono")).sendKeys("93");
           
           driver.findElement(By.cssSelector("html body div.container.mt-5 div.row.justify-content-center div.col-md-8 div.card div.card-body form button.btn.btn-primary")).click();
           
           driver.findElement(By.cssSelector("html body div.container.mt-5 div.row.justify-content-center div.col-md-8 div.card div.card-body form a.btn.btn-secondary")).click();
           
          
       }
       catch(Exception e){
           e.printStackTrace();
       }finally{
           //driver.quit();
       }
    }**/
}
