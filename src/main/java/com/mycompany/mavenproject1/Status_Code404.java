/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 *
 * @author QAIT\arpitagarwal
 */
public class Status_Code404 {
    WebDriver driver;
    
    public Status_Code404(WebDriver driver){
        this.driver = driver;
    }
    
    
     public void CheckValidity() throws IOException{
         URL url = new URL("http://10.0.31.161:9292/status_codes/404");
        HttpURLConnection huc = (HttpURLConnection)url.openConnection();
        huc.setRequestMethod("GET");
        huc.connect();
        int code = huc.getResponseCode();
         Assert.assertTrue(code == 404);
         
     } 
    
}
