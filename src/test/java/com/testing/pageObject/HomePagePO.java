package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePO {

    // Element Locator - Stage 1
    @FindBy(linkText = "Create an Account")
    public static WebElement CreateAccountLink;

    @FindBy(linkText = "Sign In")
    public static WebElement SignInLink;


    // Initialise web elements using selenium webdriver - stage 2
    public HomePagePO(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    // Page Specific Methods - Stage 3
    public void clickCreateAccount(){
        CreateAccountLink.click();
    }

    public void clickSignIn(){
        SignInLink.click();
    }
















}
