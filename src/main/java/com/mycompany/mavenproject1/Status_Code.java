/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

/**
 *
 * @author QAIT\arpitagarwal
 */
public class Status_Code {
    WebDriver driver;
    
    public Status_Code(WebDriver driver){
        this.driver = driver;
        
    }
    
    public void CheckValidity(){
        List<WebElement> links = driver.findElements(By.tagName("a"));
        Assert.assertTrue(links.size() == 7);
        }
    
    
    public Status_Code404 CLICK404(){
        driver.findElement(By.linkText("404")).click();
        return new Status_Code404(driver);
        
        
    }
    
}
