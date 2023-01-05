package goVype_Properties;

import org.openqa.selenium.By;

public class Vype_FAQs {
//Text 'General Questions'
public static By weTxtGeneralQuestions= By.xpath("(.//*[text()='Submit a request'])[1]");
		// "(.//*[text()='General Questions'])[1]");

//Link to Vype ePod
public static By lnkVypeEpod=By.xpath("(.//*[@href='/faq/what-is-vype-epod-how-to-use-it'])[1]");

//Link to Vype ePen3
public static By lnkVypeEpen3=By.xpath("(.//*[@href='/faq/what-is-vype-epen3-how-to-use-it'])[1]");

//Default FAQs page object locator 
public static By weTxtDefaultFAQsPage= By.xpath("(.//*[@class='Wrapper__Container-sc-1infk6h-0 iCQXKH'])[2]");

//General Question Number 2
public static By lnkDefaultFAQsPageQuestionNumber2= By.xpath("(.//*[@class='Question__Trigger-sc-8gpgll-1 kBDyTl'])[2]");

//General Question Number 3
public static By lnkDefaultFAQsPageQuestionNumber3= By.xpath("(.//*[@class='Question__Trigger-sc-8gpgll-1 kBDyTl'])[3]");

//General Question Number 4
public static By lnkDefaultFAQsPageQuestionNumber4= By.xpath("(.//*[@class='Question__Trigger-sc-8gpgll-1 kBDyTl'])[4]");

//General Question Number 5
public static By lnkDefaultFAQsPageQuestionNumber5= By.xpath("(.//*[@class='Question__Trigger-sc-8gpgll-1 kBDyTl'])[5]");

//General Question Number 6
public static By lnkDefaultFAQsPageQuestionNumber6= By.xpath("(.//*[@class='Question__Trigger-sc-8gpgll-1 kBDyTl'])[6]");

//General Question Number 7
public static By lnkDefaultFAQsPageQuestionNumber7= By.xpath("(.//*[@class='Question__Trigger-sc-8gpgll-1 kBDyTl'])[7]");

//General Question Number 8
public static By lnkDefaultFAQsPageQuestionNumber8= By.xpath("(.//*[@class='Question__Trigger-sc-8gpgll-1 kBDyTl'])[8]");

//
public static By lnkDefaultFAQsPageQuestionNumbern(int n){
//General Question Number n
return By.xpath("(.//*[@class='Question__Trigger-sc-8gpgll-1 kBDyTl'])["+n+"]");

}
//General Question Answer
public static By weTxtFAQsPageAnswer= By.xpath("(.//*[@class='Question__Answer-sc-8gpgll-4 bkzuXd'])[2]");

//"Meet the Vype ePod 'Click here' link"
public static By lnkClickHereEPod=By.xpath("(.//*[@href='/vype-epod-starter-kit'])[2]");

//"Say Hello to the Vype ePen3 'Click here' link"
public static By lnkClickHereEPen3=By.xpath("(.//*[@href='/vype-epen-3-vape-kit'])[2]");

////////////////////////////////////////////////////////////////////////////




//*********************************Vype eStick properties********************************************************
//Link to Vype eStick
public static By lnkVypeeStick = By.xpath(".//a[@href='/faq/how-to-use-vype-estick']");

//Vype eStick QuestionNAns1
public static By weEStickQuestionNAns1 = By.xpath(".//div[@class='Question__Container-sc-8gpgll-0 cJCyZB']");

//Vype eStick Question2
public static By weEStickQuestion2 = By.xpath(".//*[text()='2. Where is the Vype eStick device made?']");

//Vype eStick Answers
public static By weEStickAnswer = By.xpath("(.//*[@class='RichText__Container-sc-1rvf6d4-0 USBji'])[2]");

//Vype eStick Question3
public static By weEStickQuestion3 = By.xpath("(.//h4[@class='typography__H4-vraxd4-3 Question__Title-sc-8gpgll-2 eMyLmP'])[2]");


//Vype eStick Question4
public static By weEStickQuestion4 = By.xpath("(.//h4[@class='typography__H4-vraxd4-3 Question__Title-sc-8gpgll-2 eMyLmP'])[3]");


//Vype eStick Question5
public static By weEStickQuestion5 = By.xpath("(.//h4[@class='typography__H4-vraxd4-3 Question__Title-sc-8gpgll-2 eMyLmP'])[4]");


//Vype eStick Question6
public static By weEStickQuestion6 = By.xpath("(.//h4[@class='typography__H4-vraxd4-3 Question__Title-sc-8gpgll-2 eMyLmP'])[5]");

//Vype eStick Question7
public static By weEStickQuestion7 = By.xpath("(.//h4[@class='typography__H4-vraxd4-3 Question__Title-sc-8gpgll-2 eMyLmP'])[6]");


//Vype eStick Question8
public static By weEStickQuestion8 = By.xpath("(.//h4[@class='typography__H4-vraxd4-3 Question__Title-sc-8gpgll-2 eMyLmP'])[7]");


//Vype eStick Question9
public static By weEStickQuestion9 = By.xpath("(.//h4[@class='typography__H4-vraxd4-3 Question__Title-sc-8gpgll-2 eMyLmP'])[8]");


//Vype eStick Question10
public static By weEStickQuestion10 = By.xpath("(.//h4[@class='typography__H4-vraxd4-3 Question__Title-sc-8gpgll-2 eMyLmP'])[9]");



//Vype eStick Question11
public static By weEStickQuestion11 = By.xpath("(.//h4[@class='typography__H4-vraxd4-3 Question__Title-sc-8gpgll-2 eMyLmP'])[10]");


//Vype eStick Question12
public static By weEStickQuestion12 = By.xpath("(.//h4[@class='typography__H4-vraxd4-3 Question__Title-sc-8gpgll-2 eMyLmP'])[11]");


//Vype eStick Question13
public static By weEStickQuestion13 = By.xpath("(.//h4[@class='typography__H4-vraxd4-3 Question__Title-sc-8gpgll-2 eMyLmP'])[12]");

//**********************************Vype eTank pro2 ************************************************************************


//Link to Vype ETank Pro
public static By lnkVypeETank = By.xpath(".//a[@href='/faq/how-to-use-etank-pro2']");

//Vype ETank QuestionNAns1
public static By weETankQuestionNAns1 = By.xpath(".//*[@class='Question__Container-sc-8gpgll-0 cJCyZB']");

//Vype ETank Question2
public static By weETankQuestion2 = By.xpath(".//*[text()='2. How long does a Vype eTank Pro 2 last? How many puffs?']");

//Vype ETank Answers
public static By weETankAnswer = By.xpath("(.//*[@class='RichText__Container-sc-1rvf6d4-0 USBji'])[2]");

//Vype ETank Question3
public static By weETankQuestion3 = By.xpath("(.//*[@class='typography__H4-vraxd4-3 Question__Title-sc-8gpgll-2 eMyLmP'])[3]");


//Vype ETank Question4
public static By weETankQuestion4 = By.xpath("(.//h4[@class='typography__H4-vraxd4-3 Question__Title-sc-8gpgll-2 eMyLmP'])[3]");


//Vype ETank Question5
public static By weETankQuestion5 = By.xpath("(.//h4[@class='typography__H4-vraxd4-3 Question__Title-sc-8gpgll-2 eMyLmP'])[4]");


//Vype ETank Question6
public static By weETankQuestion6 = By.xpath("(.//h4[@class='typography__H4-vraxd4-3 Question__Title-sc-8gpgll-2 eMyLmP'])[5]");

//Vype ETank Question7
public static By weETankQuestion7 = By.xpath("(.//h4[@class='typography__H4-vraxd4-3 Question__Title-sc-8gpgll-2 eMyLmP'])[6]");


//Vype ETank Question8
public static By weETankQuestion8 = By.xpath("(.//h4[@class='typography__H4-vraxd4-3 Question__Title-sc-8gpgll-2 eMyLmP'])[7]");


//Vype ETank Question9
public static By weETankQuestion9 = By.xpath("(.//h4[@class='typography__H4-vraxd4-3 Question__Title-sc-8gpgll-2 eMyLmP'])[8]");


//Vype ETank Question10
public static By weETankQuestion10 = By.xpath("(.//h4[@class='typography__H4-vraxd4-3 Question__Title-sc-8gpgll-2 eMyLmP'])[9]");



//Vype ETank Question11
public static By weETankQuestion11 = By.xpath("(.//h4[@class='typography__H4-vraxd4-3 Question__Title-sc-8gpgll-2 eMyLmP'])[10]");


//Vype ETank Question12
public static By weETankQuestion12 = By.xpath("(.//h4[@class='typography__H4-vraxd4-3 Question__Title-sc-8gpgll-2 eMyLmP'])[11]");


//Vype ETank Question13
public static By weETankQuestion13 = By.xpath("(.//h4[@class='typography__H4-vraxd4-3 Question__Title-sc-8gpgll-2 eMyLmP'])[12]");


//Vype ETank Question14
public static By weETankQuestion14 = By.xpath("(.//h4[@class='typography__H4-vraxd4-3 Question__Title-sc-8gpgll-2 eMyLmP'])[13]");









}
