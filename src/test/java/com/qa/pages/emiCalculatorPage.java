package com.qa.pages;

import com.qa.baseTestClass;
import com.qa.util.AppiumUtil;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class emiCalculatorPage extends baseTestClass {

    @AndroidFindBy(id = "etLoanAmount")
    WebElement etLoanAmount;

    @AndroidFindBy(id = "etInterest")
    WebElement etInterest;

    @AndroidFindBy(id = "etPeriod")
    WebElement etPeriod;

    @AndroidFindBy(id = "etFee")
    WebElement etFee;

    @AndroidFindBy(id = "btnCalculate")
    WebElement btnCalculate;

    @AndroidFindBy(id = "btnReset")
    WebElement btnReset;

    public emiCalculatorPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(AppiumUtil.LOAD_TIME)),this);

    }
    public emiCalculatorPage fillAmount(int amount){
        etLoanAmount.isDisplayed();
        etLoanAmount.sendKeys(String.valueOf(amount));
        return this;
    }

    public emiCalculatorPage fillInterest(int interest){
        etInterest.isDisplayed();
        etInterest.sendKeys(String.valueOf(interest));
        return this;
    }

    public emiCalculatorPage fillPeriod(int period){
        etPeriod.isDisplayed();
        etPeriod.sendKeys(String.valueOf(period));
        return this;
    }

    public emiCalculatorPage fillFee(int fee){
        etFee.isDisplayed();
        etFee.sendKeys(String.valueOf(fee));
        return this;
    }
    public emiCalculatorPage clickResultBtn(){
        btnCalculate.isDisplayed();
        btnCalculate.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }
}
