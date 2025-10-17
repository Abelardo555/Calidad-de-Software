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
import org.openqa.selenium.TakesScreenshot;

public class Automatizacion {
    /*public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Duoc\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();      
        
        try{
            driver.get("https://fundacion-instituto-profesional-duoc-uc.github.io/ATY1102-Surf/");
            WebElement body = driver.findElement(By.tagName("body"));
            String texto = body.getText();
            System.out.println(texto);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            driver.quit();
        }
    }*/
    public static void main(String[] args){
       System.setProperty("webdriver.gecko.driver","C:\\Users\\Duoc\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
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
           String rutaArchivo = "C:\\Users\\Duoc\\Downloads\\usuarios.txt";
           List<String[]> usuarios = new ArrayList<>();
           
           try(BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))){
               String linea;
               while ((linea = br.readLine()) != null){
                   String[] datos = linea.split(",");
                   if(datos.length == 3){
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
                
                driver.findElement(By.id("nombre")).clear();
                driver.findElement(By.id("nombre")).sendKeys(nombre);
                
                driver.findElement(By.id("email")).clear();
                driver.findElement(By.id("email")).sendKeys(email);
                
                driver.findElement(By.id("ciudad")).clear();
                driver.findElement(By.id("ciudad")).sendKeys(ciudad);
                driver.findElement(By.cssSelector("#dataForm button[type='submit']")).click();
                
           }
           //Editar Usuarios
           WebElement editar = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/table/tbody/tr[1]/td[4]/button[1]"));
           editar.click();
           driver.findElement(By.id("nombre")).clear();
           driver.findElement(By.id("nombre")).sendKeys(" Luffy");
           driver.findElement(By.cssSelector("#dataForm button[type='submit']")).click();
           
           //Eliminar Usuario
           int index = 1;
           while(true){
               try{
                WebElement eliminar = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/table/tbody/tr["+index+"]/td[4]/button[2]"));
                eliminar.click();
                   System.err.println("Registro eliminado con indice"+index);
               }catch(Exception e){
                   System.err.println("No se encontro elemento a eliminar");
                   break;
               }
           }
           
       }
       catch(Exception e){
           e.printStackTrace();
       }finally{
           //driver.quit();
       }
    }
}
