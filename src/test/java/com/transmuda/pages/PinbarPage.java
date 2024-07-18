package com.transmuda.pages;

import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PinbarPage {

    public PinbarPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Learn how to use this space")
    public WebElement learnHowToUseLink;

    public void clickLearnHowToUseLink() {
        learnHowToUseLink.click();
    }

    public WebElement getTextElement(String text) {
        return Driver.getDriver().findElement(By.xpath("//h3[text()='" + text + "']"));
    }

    public WebElement getImageElement(String src) {
        return Driver.getDriver().findElement(By.xpath("//img[@src='" + src + "']"));
    }


}
