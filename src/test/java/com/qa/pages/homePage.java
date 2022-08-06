package com.qa.pages;

import com.qa.baseTestClass;
import com.qa.util.AppiumUtil;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class homePage extends baseTestClass {

//    pageFactory Design Pattern start

    @AndroidFindBy(id = "layout_emi")
    WebElement layout_emi;

    @AndroidFindBy(id = "ayout_adv_emi")
    WebElement ayout_adv_emi;

    public homePage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(AppiumUtil.LOAD_TIME)),this);
    }
    //    pageFactory Design Patern end
    public emiCalculatorPage tapLayoutEMI(){
        layout_emi.isDisplayed();
        layout_emi.click();
        return new emiCalculatorPage();
    }
//    advance EMI Calculator open
    public advanceEmicalculator tapAdvanceEmi(){
        ayout_adv_emi.isDisplayed();
        ayout_adv_emi.click();
        return new advanceEmicalculator();

    }
 }
