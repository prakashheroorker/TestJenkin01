package goVype_Properties;

import org.openqa.selenium.By;

public class Vype_OrderConfirmation {
//Text 'Page Confirmation'
public static By pgOrderCofirmation= By.xpath("(.//*[text()='Order confirmation'])[1]");
//Text 'Thank you for your order!'
public static By weTxtThankYouForYourOrder= By.xpath("(.//*[text()='Thank you for your order!'])[1]");
//Text 'We are getting started on your order....'
public static By weTxtWeAreGettingStarted=By.xpath("(.//*[text()='We are getting started on your order right away, and you will receive an order confirmation email shortly.'])[1]");

//Order Value
public static By weTxtOrderValue=By.xpath("//*[text()='Order']/..//div//span[1]");


//Discount
public static By weTxtDiscount = By.xpath("//small[text()='Discount']");



}
