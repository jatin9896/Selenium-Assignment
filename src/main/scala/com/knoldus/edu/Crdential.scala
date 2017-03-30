package com.knoldus.edu

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.support.ui.WebDriverWait

trait Credential {

  val BASE_URL = "http://www.flipkart.com/"
  val EMAIl = "email"
  val password = "your password"
  System.setProperty("webdriver.chrome.driver", "/home/knoldus/Downloads/chromedriver")
  val capabilities = DesiredCapabilities.chrome()
  val driver = new ChromeDriver(capabilities)
  val webdriverwait = new WebDriverWait(driver, 10)
}
