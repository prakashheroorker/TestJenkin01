package goVype_Properties;

import org.openqa.selenium.By;

public class Vype_Registration {

	//User name text field login Modal
	public static By txtEmailAddress=By.xpath("(.//*[@name='email'])[1]");

	//First Name 
	public static By txtFirstName=By.xpath("(.//*[@name='firstName'])[1]");

	//Last Name
	public static By txtLastName=By.xpath("(.//*[@name='lastName'])[1]");

	//Date of Birth
	public static By txtDateOfBirth=By.xpath("(.//*[@name='dob'])[1]");

	//Address
	public static By txtAddress=By.xpath("(.//*[@name='address'])[1]");

	//Phone Number
	public static By txtPhoneNumber=By.xpath("(.//*[@name='phoneNumber'])[1]");

	//Password
	public static By txtPassword=By.xpath("(.//*[@name='password'])[1]");

	//Confirm Password
	public static By txtConfirmPassword=By.xpath("(.//*[@name='passwordConfirm'])[1]");
	
	//Rental Pin
	public static By txtRentalPin = By.name("retailPin");

	//Check box yes i want to receive information
	public static By chkBoxYesIWantToReceiveInformation=By.xpath("(.//*[text()='Yes, I want '])");

	//Check box I Acknowledge that i read
	public static By chkBoxIAcknowledgeThatIRead=By.xpath("(.//*[contains(text(),'By checking this box, I acknowledge that I read')])[1]");
	
	//
	public static By vuserewardsloyaltyprogram = By.xpath(".//*[text()='Yes, I want to join the Vuse Rewards loyalty program! Membership can be cancelled at any time. By joining, you agree that you have read and accepted the Vuse Rewards']");
	//Text 'First Name is required' error message
	public static By weTxtFirstNameIsRequiredErrorMessage=By.xpath("(.//*[text()='First name is required'])[1]");

	//Text 'Last Name is required' error message
	public static By weTxtLastNameIsRequiredErrorMessage=By.xpath("(.//*[text()='Last name is required'])[1]");

	//Text 'Email address is required' error message
	public static By weTxtEmailAddressIsRequiredErrorMessage=By.xpath("(.//*[text()='Email address is required'])[1]");

	//Text 'Date Of Birth is required' error message
	public static By weTxtDateOfBirthIsRequiredErrorMessage=By.xpath("(.//*[text()='Date of birth is required'])[1]");


	//Text 'Address is required' error message
	public static By weTxtAddressIsRequiredErrorMessage=By.xpath("(.//*[text()='Address is required'])[1]");

	//Text 'Password is required' error message
	public static By weTxtPasswordIsRequiredErrorMessage=By.xpath("(.//*[text()='Password is required'])[1]");

	//Text 'Password Confirmation is required' error message
	public static By weTxtPasswordConfirmationIsRequiredErrorMessage=By.xpath("(.//*[text()='Password confirmation is required'])[1]");



	//Text 'Email address is invalid' error message
	public static By weTxtEmailAddressIsInvalidErrorMessage=By.xpath("(.//*[text()='Email address is invalid'])[1]");

	//Text 'Email already exists' error message
	public static By weTxtEmailAlreadyExistsErrorMessage=By.xpath("(.//*[text()='Email already exists'])[1]");

	//Button Register
	public static By btnRegister=By.xpath("(.//*[@type='submit'])[1]");

	//Link Terms and Conditions
	public static By lnkTermsAndConditions=By.xpath("(.//*[text()='terms and conditions'])[1]");

	//Error messages in registration modal
	public static By weTxtErrorMessages = By.xpath(".//*[contains(@class,'Input__ErrorMessage')]");

	//I receive notification : hover over text
	public static By txtHoverOver = By.xpath(".//*[contains(text(),'Hover over here')]");

	//Tooltip @ receive notification
	public static By weSupportInfoToolTip = By.xpath("//*[contains(@class,'Tooltip__Content')]//p");

	//Drop down list under address with limited text search with expandable list
	public static By LstAddressshortlistedWithExtendedViewOption = By.xpath(".//*[contains(@class,'pcaexpandable')]");

	//Selected entry in address dropdown
	public static By SelAddressShortlisted = By.xpath(".//*[contains(@class,'pcaselected')]");

	//ErrorUnderPassword
	public static By weTxtPasswordError = By.xpath("(.//*[text()='Password']/..)//*[contains(@class,'Input__Error')]");

	//Error under confirm password
	public static By weTxtConfirmPasswordError = By.xpath("(.//*[text()='Confirm password']/..)//*[contains(@class,'Input__Error')]");

	//Password Must match Error Message
	public static By weTxtPasswordMatchErrorMessage = By.xpath("(.//*[text()='Confirm password']/..)//*[contains(@class,'Input__Error')][text()='Passwords must match']");

	//length not satisfied error in password
	public static By weTxtPasswordLengthErrorMessage = By.xpath(".//*[contains(text(),'Must be at least')]");



}
