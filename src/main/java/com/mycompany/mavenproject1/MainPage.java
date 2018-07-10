/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author QAIT\arpitagarwal
 */
public class MainPage {
    WebDriver driver;
    
    public MainPage(WebDriver driver){
        this.driver = driver;
    }
    
    public Status_Code OpenStatusCode(){
        driver.findElement(By.linkText("Status Codes")).click();
        return new Status_Code(driver);
    }
    
    public Editor OpenEditor(){
        driver.findElement(By.linkText("WYSIWYG Editor")).click();
        return new Editor(driver);
    }
    
}
