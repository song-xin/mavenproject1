package com.test.mavenproject;

import static org.junit.Assert.assertTrue;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selenide.*;


/**
 * Unit test for simple App.
 */
public class paperTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void loginTestSelenide() {
        //指定Driver 的存放目录
        System.setProperty("webdriver.chrome.driver", "D:/App/driver/chromedriver.exe");

        //指定需要启动的浏览器类型
        System.setProperty("selenide.browser", "Chrome");
        //cookie
        Cookie cookie = new Cookie("td_cookie", "18446744071495765029");
        open("https://jyptfz.aibeike.com/");
        WebDriver driver = WebDriverRunner.getSelenideDriver().getWebDriver();
        driver.manage().addCookie(cookie);
//        WebDriverRunner.getSelenideDriver().getWebDriver().manage().addCookie(cookie);
        System.out.println(driver.getCurrentUrl());
        open("https://jyptfz.aibeike.com/#/publicCloud/publicFiles");
        sleep(3000);

    }

    @Test
    public void loginTestSelenium(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://jyptfz.aibeike.com/");
        //cookie
        Cookie cookie = new Cookie("td_cookie", "18446744071495765029", "N/A");
        Cookie cookie1 = new Cookie("JSESSIONID", "2FE7E02C3C63AA687A3E3DB63391F09D", "N/A");
        Cookie cookie2 = new Cookie("SERVERID", "b2f3f08ff4884ac32d0cee1d95db919a|1545977893|1545890184", "N/A");
        driver.manage().addCookie(cookie);
        driver.manage().addCookie(cookie1);
        driver.manage().addCookie(cookie2);
        driver.get("https://jyptfz.aibeike.com/#/publicCloud/publicFiles");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException var3) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(var3);
        }
        driver.quit();
    }
}
