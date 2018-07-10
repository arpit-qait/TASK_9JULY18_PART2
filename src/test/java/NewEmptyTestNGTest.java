/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.mavenproject1.MainPage;
import com.mycompany.mavenproject1.*;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author QAIT\arpitagarwal
 */
public class NewEmptyTestNGTest {
    
    WebDriver driver;
    MainPage mnpg;
    PAGE1 page1;
    PAGE_CONGRATS pagecongrats;
    Status_Code sts_cd;
    Status_Code404 sts_cd404;
    public NewEmptyTestNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public void setUpClass() {
        driver = new ChromeDriver();
        driver.get("http://10.0.31.161:9292/");
        mnpg = new MainPage(driver);
        
        
    }
//    @Test
    public void BasicAuth() throws InterruptedException{
        pagecongrats = page1.CLICKBASICAUTH();
        
    }
    @Test
    public void Status_Code() throws IOException{
        sts_cd = mnpg.OpenStatusCode();
        sts_cd.CheckValidity();
        sts_cd404 = sts_cd.CLICK404();
        sts_cd404.CheckValidity();
    }

    
}
