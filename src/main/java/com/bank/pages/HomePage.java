package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By bankManagerLogin = By.xpath("//button[contains(text(),'Bank Manager Login')]");

    By customerLogin = By.xpath("//button[contains(text(),'Customer Login')]");




public void clickOnBankManagerLogin()
{
    clickOnElement(bankManagerLogin);
}
public void clickOnCustomerLogin()
{
    clickOnElement(customerLogin);

}

}
