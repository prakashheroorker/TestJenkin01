package stepDefinitions_Mobile;


import com.rai.framework.BaseClass;
import com.rai.framework.RAI_Mobile_Utility_Functions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks_StepDefinitionMobile extends BaseClass{
	RAI_Mobile_Utility_Functions rai;
	//RAI_AndroidMobile_Utility_Functions rai;
	@Before
	public void beforeMethod(Scenario scenario) {
		String name_package_class = this.getClass().getName(); 
		int max_branch = 5;
		String[] arrOfStr = new String [max_branch];
		arrOfStr = name_package_class.split("\\.");
		String name_class = arrOfStr[0].toString();
		rai = new 	RAI_Mobile_Utility_Functions(name_class,scenario.getName());
		
	}

	@After
	 public void generate_Report_URl() throws Throwable {
	   
		rai.fnFinalBlock();
	 }

}
