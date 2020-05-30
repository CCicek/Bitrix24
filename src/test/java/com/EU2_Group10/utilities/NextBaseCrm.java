package com.EU2_Group10.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NextBaseCrm {

    public static void loginHelpdesk(WebDriver driver) {

        driver.get("https://login2.nextbasecrm.com/");
        driver.findElement(By.xpath("(//input[@class='login-inp'])[1]")).sendKeys(ConfigurationReader.get("crm_helpdesk_username"));
        driver.findElement(By.xpath("(//input[@class='login-inp'])[2]")).sendKeys(ConfigurationReader.get("crm_password"));
        driver.findElement(By.xpath("//input[@class='login-btn']")).click();

    }
    public static void loginMarketing(WebDriver driver) {

        driver.get("https://login2.nextbasecrm.com/");
        driver.findElement(By.xpath("(//input[@class='login-inp'])[1]")).sendKeys(ConfigurationReader.get("crm_marketing_username"));
        driver.findElement(By.xpath("(//input[@class='login-inp'])[2]")).sendKeys(ConfigurationReader.get("crm_password"));
        driver.findElement(By.xpath("//input[@class='login-btn']")).click();
    }
    public static void loginHr(WebDriver driver) {

        driver.get("https://login2.nextbasecrm.com/");
        driver.findElement(By.xpath("(//input[@class='login-inp'])[1]")).sendKeys(ConfigurationReader.get("crm_hr_username"));
        driver.findElement(By.xpath("(//input[@class='login-inp'])[2]")).sendKeys(ConfigurationReader.get("crm_password"));
        driver.findElement(By.xpath("//input[@class='login-btn']")).click();
    }
}
