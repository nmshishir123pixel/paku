package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class MiniTest {
    @Test
    public void simpleTest() {
        // Point to the Linux chromedriver binary
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");

        // Linux servers require headless options to run without a GUI display
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriver driver = new ChromeDriver(options);
        try {
            driver.get("https://google.com");
            System.out.println("Successfully opened: " + driver.getTitle());
        } finally {
            driver.quit();
        }
    }
}
