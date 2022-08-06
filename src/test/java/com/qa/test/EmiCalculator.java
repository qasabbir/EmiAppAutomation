package com.qa.test;

import com.qa.baseTestClass;
import com.qa.pages.emiCalculatorPage;
import com.qa.pages.homePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EmiCalculator extends baseTestClass {

    emiCalculatorPage emiCalculatorPage;
    @BeforeClass
    public void setup(){
        mainMethod();
        emiCalculatorPage=new homePage()
                .tapLayoutEMI();
    }
    @Test
    public void calculateEmiShouldSucced(){
        emiCalculatorPage=emiCalculatorPage
                .fillAmount(1100)
                .fillInterest(6)
                .fillPeriod(1)
                .fillFee(3)
                .clickResultBtn();

    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
