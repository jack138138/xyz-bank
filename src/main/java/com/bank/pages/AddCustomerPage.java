package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AddCustomerPage extends Utility {
    By firstName = By.xpath("//input[@placeholder='First Name']");

    By lastName = By.xpath("//input[@placeholder='Last Name']");

    By postCode = By.xpath("//input[@placeholder='Post Code']");

    By addCustomerButton = By.xpath("//button[@type='submit']");








    public void enterFirstName() {
        sendTextToElement(firstName, "Jack");
    }

    public void enterLastName()
    {
        sendTextToElement(lastName, "Sparrow");
    }

    public void enterpostCode()
    {
        sendTextToElement(postCode, "ABC 1CD");
    }


    public void clickOnAddCustomerButton()
    {
        clickOnElement(addCustomerButton);
    }


    public void verifyAlertText() {

        String actual = getAlertText();
        String expected = "Customer added successfully with customer id :6";
        Assert.assertEquals(expected, actual, "incorrect text");
    }


    public void clickOkOnPopUp() {
        acceptAlert();

    }
}