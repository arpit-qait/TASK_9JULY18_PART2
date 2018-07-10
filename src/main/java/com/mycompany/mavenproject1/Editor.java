/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

/**
 *
 * @author QAIT\arpitagarwal
 */
public class Editor {
    WebDriver driver;
    
    public Editor(WebDriver driver){
        this.driver = driver;
    }
    
    public void Clear(){
        driver.switchTo().frame("mce_0_ifr");
        driver.findElement(By.id("tinymce")).clear();
    }
    
    public void SendText(){
        driver.findElement(By.id("tinymce")).sendKeys("QA Infotech");
    }
    
    public void AllTextSelect(){
        driver.findElement(By.id("tinymce")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
    }
    public void ClickBoldButton(){
        driver.switchTo().parentFrame();
        driver.findElement(By.cssSelector(".mce-ico.mce-i-bold")).click();
    }
    
    public void CheckBoldText(){
        driver.switchTo().frame("mce_0_ifr");
        String text = driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p[1]/strong")).getText();
        Assert.assertTrue(text.contains("QA Infotech"));
    }
}
