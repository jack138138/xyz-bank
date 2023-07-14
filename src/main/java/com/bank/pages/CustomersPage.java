package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class CustomersPage extends Utility {

    By depositTab = By.xpath("//button[normalize-space()='Deposit']");
    By depoitAmount = By.xpath("//input[@placeholder='amount']");

    By depositButton = By.xpath("//button[@type='submit']");

    By verifyDeposit = By.xpath("//span[contains(text(),'Deposit Successful')]");

    By withdrawal = By.xpath("//button[normalize-space()='Withdrawl']");

    By withdrawalAmount = By.xpath("//input[@placeholder='amount']");

    By withdrawalbutton = By.xpath("//button[normalize-space()='Withdraw']");

    By verifywithdraw = By.xpath("//span[contains(text(),'Transaction successful')]");






    public void clickOnDepositTab(){
        clickOnElement(depositTab);

    }

    public void enterAmount(){
        sendTextToElement(depoitAmount,"100");

    }
    public void clickOnDepositButton(){
        clickOnElement(depositButton);
    }

    public void verifyDeposit (){
        String expectedDeposit = "Deposit Successful";
        String actualDeposit = getTextFromElement(verifyDeposit);
        Assert.assertEquals(actualDeposit,expectedDeposit, "Not Matcheing Text");

    }

    public void clickOnWithdrawTab(){
        clickOnElement(withdrawal);
    }

    public void enterWithdrawalAmount(){
        sendTextToElement(withdrawalAmount,"50");
    }

public void clickOnwithdrawalButton(){
        clickOnElement(withdrawalbutton);
}
public void verifywithdrawalText(){
        String expectedWithdrawal = "Transaction Successful";
        String actualWithdral = getTextFromElement(verifywithdraw);
        Assert.assertEquals(actualWithdral, expectedWithdrawal,"Not Matching Withdrawal");
}


}
