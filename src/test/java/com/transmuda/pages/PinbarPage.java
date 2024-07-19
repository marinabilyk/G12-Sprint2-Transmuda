package com.transmuda.pages;

import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinbarPage {

        public PinbarPage() {
            PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(linkText = "Learn how to use this space")
        public WebElement learnHowToUseLink;

        public void clickLearnHowToUseLink() {
            BrowserUtils.waitForVisibility(learnHowToUseLink, 10).click();
        }

        public WebElement getTextElement(String text) {
            return BrowserUtils.waitForVisibility(By.xpath("//h3[text()='How To Use Pinbar']"), 10); // Corrected XPath
        }

    public WebElement getImageElement(String src) {
        return BrowserUtils.waitForVisibility(By.xpath("//img[@src='" + src + "']"), 10); // Corrected XPath
        }


    }

