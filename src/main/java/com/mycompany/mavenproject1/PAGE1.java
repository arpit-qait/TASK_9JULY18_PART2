/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author QAIT\arpitagarwal
 */
public class PAGE1 {
    WebDriver driver;
    
    public PAGE1(WebDriver driver){
        this.driver = driver;
    }
    public PAGE_CONGRATS CLICKBASICAUTH() throws InterruptedException{
        driver.findElement(By.linkText("Basic Auth")).click();
        driver.switchTo().alert();
        new Actions(driver).sendKeys("admin").perform();
  
        return new PAGE_CONGRATS(driver);
    }
    
}
