package com.apparel.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.apparel.qa.base.BasePage;

public class ContactUs extends BasePage {

	//Actions
		public void subjectHeadingDropdownClick() {
			WebElement drpSubjectHeading = driver.findElement(By.xpath("//select[@id='id_contact']"));
			drpSubjectHeading.click();
		}

		public void subjectHeadingDropdown(String valueText) {
			Select selectValue = new Select(driver.findElement(By.xpath("//select[@id='id_contact']")));
			selectValue.selectByVisibleText(valueText);
		}

		public void eMailTextbox(String valueText) {
			WebElement txtEmailAddress = driver.findElement(By.xpath("//input[@id='email']"));
			txtEmailAddress.sendKeys(valueText);
		}

		public void orderTextbox(String valueText) {
			WebElement txtIDOrder = driver.findElement(By.xpath("//input[@id='id_order']"));
			txtIDOrder.sendKeys(valueText);
		}

		public void messageTextbox(String valueText) {
			WebElement txtMessage = driver.findElement(By.xpath("//textarea[@id='message']"));
			txtMessage.sendKeys(valueText);
		}

		public void submitBtn() {
			WebElement btnSubmit = driver.findElement(By.xpath("//button[@id='submitMessage']"));
			btnSubmit.click();
		}
	

}
