package stepDefinitions;


import com.rai.framework.BaseClass;

import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks_StepDefinition extends BaseClass{
	RAI_Desktop_Utility_Functions gl;
	
	@Before
	public void beforeMethod(Scenario scenario) {
		String name_package_class = this.getClass().getName(); 
		int max_branch = 5;
		String[] arrOfStr = new String [max_branch];
		arrOfStr = name_package_class.split("\\.");
		String name_class = arrOfStr[0].toString();
		gl = new RAI_Desktop_Utility_Functions(name_class,scenario.getName());
	}

	@After
	 public void generate_Report_URl() throws Throwable {
		
		try {
			gl.closeAllBrowser();
			gl.fnFinalBlock();
			}catch (Exception e) {
				
			gl.fnCatchBlock(e);
			} 
		
			
	}
	}



