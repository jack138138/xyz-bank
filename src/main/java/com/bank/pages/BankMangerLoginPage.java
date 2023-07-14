package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class BankMangerLoginPage extends Utility {
    By addCustomer = By.xpath("//button[normalize-space()='Add Customer']");
    By openAccount = By.xpath("//button[normalize-space()='Open Account']");
    By customerTab = By.xpath("//button[normalize-space()='Customers']");


    public void clickOnAddCustomer() {
        clickOnElement(addCustomer);

    }
    public void clickonOpenAccount()


    {
        clickOnElement(openAccount);
    }
public void clickOnCustomerTab()
{
        clickOnElement(customerTab);
}

}
